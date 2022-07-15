package com.Guider.securityprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class SecurityPro {
	@GetMapping("/url")
	public String secreitymethod() {
		return "your data is secure";
	}

}
