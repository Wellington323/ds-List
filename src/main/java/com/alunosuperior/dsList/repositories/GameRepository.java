package com.alunosuperior.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.alunosuperior.dsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> { 

}
