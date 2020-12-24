package br.com.cep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import br.com.cep.endereco.Cep;

@Controller
public class ConsultaCep {

	@GetMapping
	public ResponseEntity<Cep> consumirApi(String cep) {
		
		RestTemplate template = new RestTemplate();

		// https://viacep.com.br/ws/01001000/xml/
		
		return template.getForEntity("https://viacep.com.br/ws/{cep}/json", Cep.class, cep);
	}
}