package erick.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
public class ControlerEncarte {

	@GetMapping(value   = { "/teste"} , produces  = {"application/json" })
	public ResponseEntity testeHelloRestApi(){
		return new ResponseEntity("Ola Rest Api" , HttpStatus.OK);
	}
}
