package com.alunosuperior.dsList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alunosuperior.dsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> { 

}
