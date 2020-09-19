package io.raghu.api;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PortRequestController {

	@Autowired
	PortRequestRepo repo;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello";
	}

	@PostMapping("/portrequest")
	public String portRequest(@Valid @RequestBody PortRequest pr) {
		repo.save(pr);
		return "Port Request Created Successfully";
	}

	@GetMapping("/getPort/{portid}")
	public PortRequest getPort(@PathVariable String portid) {
		return repo.getPort(portid);

	}
}
