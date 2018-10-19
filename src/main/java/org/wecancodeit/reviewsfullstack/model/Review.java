package org.wecancodeit.reviewsfullstack.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	private String cragName;
	private String location;
	private int numberOfRoutes;
	private String description;

	@ManyToOne
	private Category category;

	public Review() {
	}

	public Review(String cragName, String location, int numberOfRoutes, String description, Category category) {
		this.cragName = cragName;
		this.location = location;
		this.numberOfRoutes = numberOfRoutes;
		this.description = description;
		this.category = category;
	}

	public Long getId() {

		return id;
	}

	public String getCragName() {
		return cragName;
	}

	public String getLocation() {
		return location;
	}

	public int getNumberOfRoutes() {
		return numberOfRoutes;
	}

	public String getDescription() {
		return description;
	}

	public Category getCategory() {
		return category;
	}

}