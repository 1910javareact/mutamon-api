package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Monster;

public interface MutamonDao extends JpaRepository<Monster, Integer>{

	public Monster findMonsterByLevel(int level);

	public List<Monster> findMonstersByUserIdAndLevel(int id, int level);
	
	public Monster findMonsterByUserIdAndActiveMonster(int id, boolean isCurrent);
		
}
