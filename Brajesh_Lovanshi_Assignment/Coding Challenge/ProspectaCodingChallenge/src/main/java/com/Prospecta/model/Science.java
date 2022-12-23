package com.Prospecta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Science {

	
	@Id
	private Integer id;
	private String title;
	private String description;
	
	
	public Science() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Science(Integer id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	
	
}
