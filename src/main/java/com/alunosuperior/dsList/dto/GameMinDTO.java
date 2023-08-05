package com.alunosuperior.dsList.dto;

import com.alunosuperior.dsList.entities.Game;
import com.alunosuperior.dsList.projections.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Double score;
	private String imgUrl;
	private String shortDescription; 

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		score = entity.getScore();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getLongDescription();
	}
	
	
	public GameMinDTO(GameMinProjection projection ) {
		id = projection.getId();
		title = projection.getTitle();
		score = projection.getScore();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
	
	

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

}
