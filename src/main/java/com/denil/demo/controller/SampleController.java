package com.denil.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	 @GetMapping(value = "/data")
	 String sample () {
		 return "Hellowss";
	 }
}
