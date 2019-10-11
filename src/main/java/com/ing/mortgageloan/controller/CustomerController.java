package com.ing.mortgageloan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.mortgageloan.dto.CustomerRequestDto;
import com.ing.mortgageloan.dto.CustomerResponseDto;
import com.ing.mortgageloan.service.CustomerService;

@RestController
@RequestMapping("/mortgage")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class CustomerController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@PostMapping("/register")
	public ResponseEntity<CustomerResponseDto> register(@RequestBody CustomerRequestDto customerRequestDto)
			throws Exception {
		LOGGER.info("Inside MORTGAGELOAN Registration");
		return new ResponseEntity<>(customerService.register(customerRequestDto), HttpStatus.CREATED);

	}

}
