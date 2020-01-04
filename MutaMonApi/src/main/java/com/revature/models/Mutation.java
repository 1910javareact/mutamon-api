package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "mutations", schema = "mutamon")
@Entity
public class Mutation {

	@Id
	@Column(name = "mutation_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mutationId;
	
	@Column(name = "mutation_name")
	private String name;
	
	@Column(name = "mutation_level")
	private int level;
	
	@Column(name = "mutation_speed")
	private int speed;
	
	@Column(name = "mutation_strength")
	private int strength;
	
	@Column(name = "mutation_defence")
	private int defence;

	public Mutation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMutationId() {
		return mutationId;
	}

	public void setMutationId(int mutationId) {
		this.mutationId = mutationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	public Mutation(int mutationId, String name, int level, int speed, int strength, int defence) {
		super();
		this.mutationId = mutationId;
		this.name = name;
		this.level = level;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
	}

	@Override
	public String toString() {
		return "Mutation [mutationId=" + mutationId + ", name=" + name + ", level=" + level + ", speed=" + speed
				+ ", strength=" + strength + ", defence=" + defence + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + defence;
		result = prime * result + level;
		result = prime * result + mutationId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
		result = prime * result + strength;
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
		Mutation other = (Mutation) obj;
		if (defence != other.defence)
			return false;
		if (level != other.level)
			return false;
		if (mutationId != other.mutationId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		if (strength != other.strength)
			return false;
		return true;
	}

	
}