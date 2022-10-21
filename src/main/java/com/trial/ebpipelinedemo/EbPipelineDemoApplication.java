package com.trial.ebpipelinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EbPipelineDemoApplication {

	@GetMapping("/")
	public String homePage(){
		return "DEPLOYED";
	}


	public static void main(String[] args) {
		SpringApplication.run(EbPipelineDemoApplication.class, args);
	}

}
