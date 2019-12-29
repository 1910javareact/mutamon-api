package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "monsters", schema = "mutamon")
@Entity
public class Monster {
	@Id
	@Column(name = "monster_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int monsterId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	private User userId;
	
	@Column(name = "monster_level")
	private String level;
	
	@Column(name = "monster_name")
	private String name;
	
	@Column(name = "monster_wins")
	private String wins;
	
	@Column(name = "is_current_monster")
	private boolean isCurrent;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "monsters_mutations", schema = "mutamon",
				joinColumns = @JoinColumn(name = "monster_id", referencedColumnName = "monster_id"),
				inverseJoinColumns = @JoinColumn(name = "mutation_id", referencedColumnName = "mutation_id"))
	private Set<Mutation> mutations;

	public Monster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMonsterId() {
		return monsterId;
	}

	public void setMonsterId(int monsterId) {
		this.monsterId = monsterId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWins() {
		return wins;
	}

	public void setWins(String wins) {
		this.wins = wins;
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public Set<Mutation> getMutations() {
		return mutations;
	}

	public void setMutations(Set<Mutation> mutations) {
		this.mutations = mutations;
	}

	public Monster(int monsterId, User userId, String level, String name, String wins, boolean isCurrent,
			Set<Mutation> mutations) {
		super();
		this.monsterId = monsterId;
		this.userId = userId;
		this.level = level;
		this.name = name;
		this.wins = wins;
		this.isCurrent = isCurrent;
		this.mutations = mutations;
	}

	@Override
	public String toString() {
		return "Monster [monsterId=" + monsterId + ", userId=" + userId + ", level=" + level + ", name=" + name
				+ ", wins=" + wins + ", isCurrent=" + isCurrent + ", mutations=" + mutations + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isCurrent ? 1231 : 1237);
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + monsterId;
		result = prime * result + ((mutations == null) ? 0 : mutations.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((wins == null) ? 0 : wins.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Monster)) {
			return false;
		}
		Monster other = (Monster) obj;
		if (isCurrent != other.isCurrent) {
			return false;
		}
		if (level == null) {
			if (other.level != null) {
				return false;
			}
		} else if (!level.equals(other.level)) {
			return false;
		}
		if (monsterId != other.monsterId) {
			return false;
		}
		if (mutations == null) {
			if (other.mutations != null) {
				return false;
			}
		} else if (!mutations.equals(other.mutations)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		if (wins == null) {
			if (other.wins != null) {
				return false;
			}
		} else if (!wins.equals(other.wins)) {
			return false;
		}
		return true;
	}
	
	
}
