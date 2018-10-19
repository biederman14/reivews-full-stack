package org.wecancodeit.reviewsfullstack.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String stateName;

	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	public Category() {
	}

	public Category(String stateName) {
		this.stateName = stateName;
	}

	public Long getId() {
		return id;
	}

	public String getStateName() {
		return stateName;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return stateName;
	}
}
