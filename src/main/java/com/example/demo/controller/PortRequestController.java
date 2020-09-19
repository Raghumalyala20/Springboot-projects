package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.PortRequestrepo;
import com.example.demo.entity.PortRequest;

@RestController
public class PortRequestController {
	
	private final PortRequestrepo repo;

	public PortRequestController(PortRequestrepo repo) {
		super();
		this.repo = repo;
	}
	
	@PostMapping("/portRequest")
	String portRequest(@Valid @RequestBody PortRequest req) {
		repo.save(req);
		return "Port Requet Successfully received";
		
	}

}
