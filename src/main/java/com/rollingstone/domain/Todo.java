package com.rollingstone.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rollingstone_aws_sqs_demo_todo")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "short_description", nullable = false)
	String shortDescription;
	
	@Column(name = "long_description", nullable = false)
	String longDescription;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public Todo(long id, String shortDescription, String longDescription) {
		super();
		this.id = id;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Todo() {
		super();
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", shortDescription=" + shortDescription + ", longDescription=" + longDescription
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((longDescription == null) ? 0 : longDescription.hashCode());
		result = prime * result + ((shortDescription == null) ? 0 : shortDescription.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		if (longDescription == null) {
			if (other.longDescription != null)
				return false;
		} else if (!longDescription.equals(other.longDescription))
			return false;
		if (shortDescription == null) {
			if (other.shortDescription != null)
				return false;
		} else if (!shortDescription.equals(other.shortDescription))
			return false;
		return true;
	}
	
	
}
