package com.starter.cliente.reto.controllers;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {

	private RestTemplate template = new RestTemplate();
	private String url = "http://localhost:8080/";

	
}