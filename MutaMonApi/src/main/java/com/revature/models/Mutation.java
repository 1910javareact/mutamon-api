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
	private String level;
	
	@Column(name = "mutation_speed")
	private String speed;
	
	@Column(name = "mutation_strength")
	private String strength;
	
	@Column(name = "mutation_defence")
	private String defence;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defence == null) ? 0 : defence.hashCode());
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + mutationId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((speed == null) ? 0 : speed.hashCode());
		result = prime * result + ((strength == null) ? 0 : strength.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Mutation)) {
			return false;
		}
		Mutation other = (Mutation) obj;
		if (defence == null) {
			if (other.defence != null) {
				return false;
			}
		} else if (!defence.equals(other.defence)) {
			return false;
		}
		if (level == null) {
			if (other.level != null) {
				return false;
			}
		} else if (!level.equals(other.level)) {
			return false;
		}
		if (mutationId != other.mutationId) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (speed == null) {
			if (other.speed != null) {
				return false;
			}
		} else if (!speed.equals(other.speed)) {
			return false;
		}
		if (strength == null) {
			if (other.strength != null) {
				return false;
			}
		} else if (!strength.equals(other.strength)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Mutation [mutationId=" + mutationId + ", name=" + name + ", level=" + level + ", speed=" + speed
				+ ", strength=" + strength + ", defence=" + defence + "]";
	}

	public Mutation(int mutationId, String name, String level, String speed, String strength, String defence) {
		super();
		this.mutationId = mutationId;
		this.name = name;
		this.level = level;
		this.speed = speed;
		this.strength = strength;
		this.defence = defence;
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

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getDefence() {
		return defence;
	}

	public void setDefence(String defence) {
		this.defence = defence;
	}

	public Mutation() {
		super();
		// TODO Auto-generated constructor stub
	}
}
