package com.springjwt.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springjwt.api.config.util.JwtUtil;
import com.springjwt.api.request.AuthenticationRequest;
import com.springjwt.api.response.AuthenticationResponse;
import com.springjwt.api.service.MyUserDetailsService;


@RestController
public class DistrictController {
	
	

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}




}
