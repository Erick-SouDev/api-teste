package erick.br.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste", method = RequestMethod.GET)
public class ControlerTesteApi {

	@GetMapping(value   = { "/hello"} , produces  = {"application/json" })
	public ResponseEntity testeHelloRestApi(){
		return new ResponseEntity("Teste Api" , HttpStatus.OK);
	}
}
