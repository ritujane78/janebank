package com.jane.accounts.service;


import com.jane.accounts.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestParam;

public interface IAccountsService {
    /**
     *
     * @param customerDto - CustomerDto Object
     */
    void createAccount(CustomerDto customerDto);
    CustomerDto getAccount(@RequestParam String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);


    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);
}
