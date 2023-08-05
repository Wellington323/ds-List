package com.alunosuperior.dsList.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alunosuperior.dsList.dto.GameListDTO;
import com.alunosuperior.dsList.dto.GameMinDTO;
import com.alunosuperior.dsList.services.GameListService;
import com.alunosuperior.dsList.services.GameService;

@RestController
@RequestMapping(value = "/games/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}

	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable  Long listId) {
		List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
}
