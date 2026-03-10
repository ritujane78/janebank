package com.jane.accounts.controller;

import com.jane.accounts.dto.CustomerDetailsDto;
import com.jane.accounts.dto.ErrorResponseDto;
import com.jane.accounts.service.ICustomerService;
import com.netflix.discovery.converters.Auto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(
        name = "APIs for Customers in JaneBank",
        description = "CRUD REST APIs in JaneBank to FETCH customer details"
)
@RestController
@RequiredArgsConstructor
public class CustomerController {

    private Logger log = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private ICustomerService customerService;

    @Operation(
            summary = "Fetch Customer Details REST API",
            description = "REST API to fetch Customer details based on a mobile number"
    )
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "HTTP Status OK"
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "HTTP Status Internal Server Error",
                    content = @Content(
                            schema = @Schema(implementation = ErrorResponseDto.class)
                    )
            )
    }
    )
    @GetMapping("/api/fetchCustomerDetails")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails( @RequestHeader("janebank-correlation-id") String correlationId,
                                                                @RequestParam("mobileNumber") @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits long.")
                                                                   String mobileNumber) {

        log.debug("fetchCustomersDetails method start");
        CustomerDetailsDto customerDetailsDto = customerService.fetchCustomerDetails(mobileNumber, correlationId);
        log.debug("fetchCustomersDetails method end");

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(customerDetailsDto);
    }
}
