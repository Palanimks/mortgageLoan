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

import com.ing.mortgageloan.dto.LoginRequestDto;
import com.ing.mortgageloan.dto.LoginResponseDto;
import com.ing.mortgageloan.service.LoginService;

@RestController
@RequestMapping("/mortgage")
@CrossOrigin(allowedHeaders = { "*", "/" }, origins = { "*", "/" })
public class LoginController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) throws Exception {
		LOGGER.info("Inside MORTGAGELOAN Login");
		return new ResponseEntity<>(loginService.login(loginRequestDto), HttpStatus.ACCEPTED);
	}
}
