package com.jane.accounts.service;

import com.jane.accounts.dto.AccountsDto;
import com.jane.accounts.dto.CardsDto;
import com.jane.accounts.dto.CustomerDetailsDto;
import com.jane.accounts.dto.LoansDto;
import com.jane.accounts.entity.Accounts;
import com.jane.accounts.entity.Customer;
import com.jane.accounts.exception.ResourceNotFoundException;
import com.jane.accounts.mapper.AccountsMapper;
import com.jane.accounts.mapper.CustomerMapper;
import com.jane.accounts.repository.AccountsRepository;
import com.jane.accounts.repository.CustomerRepository;
import com.jane.accounts.service.client.CardsFeignClient;
import com.jane.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class ICustomerServiceImpl implements ICustomerService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));

        Accounts account = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Accounts", "customerId", customer.getCustomerId().toString()));

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());


        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(account, new AccountsDto()));

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(mobileNumber);
        customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(mobileNumber);
        customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());

        return customerDetailsDto;


    }
}
