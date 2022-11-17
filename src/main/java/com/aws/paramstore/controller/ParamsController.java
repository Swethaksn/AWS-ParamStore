package com.aws.paramstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamsController {

	@Value("${testparam}")
	private String testParam;

	@Value("${testsecure}")
	private String secureParam;

	@GetMapping(value = "/params")
	public ResponseEntity<?> getParams(HttpServletRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body("Testparam: " + testParam + " \nSecureparam: " + secureParam);
	}
}