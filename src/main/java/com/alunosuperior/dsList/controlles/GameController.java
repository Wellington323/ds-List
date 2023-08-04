package com.alunosuperior.dsList.controlles;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alunosuperior.dsList.dto.GameMinDTO;
import com.alunosuperior.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games") 
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result; 
	}
	
}
