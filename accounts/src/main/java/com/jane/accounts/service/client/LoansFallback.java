package com.jane.accounts.service.client;


import com.jane.accounts.dto.LoansDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient{

    private static final Logger log = LoggerFactory.getLogger(LoansFallback.class);

    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String mobileNumber, String correlationId) {
        log.error("Fallback triggered for LoansFeignClient!");
        return null;
    }
}
