package de.zeroco.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

//	@Autowired
//	Service service;

	@RequestMapping("save")
	public ResponseEntity<String> save(@ModelAttribute Company company) {
		System.out.println(company);
		return ResponseEntity.ok("hello world");
	}

}
