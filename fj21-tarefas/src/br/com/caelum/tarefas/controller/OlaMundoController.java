package br.com.caelum.tarefas.controller;

import org.springframework.web.bind.annotation.RequestMapping;


public class OlaMundoController {
	
	@RequestMapping("/olaMundoSpring")
	public String execute(){
		System.out.println("Executando a logica com spring mvc");
		return "ok";
	}

}