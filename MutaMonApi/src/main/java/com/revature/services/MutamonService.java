package com.revature.services;

import java.util.List;

import com.revature.models.Monster;

public interface MutamonService {

	public List<Monster> findMonstersByUserIdAndLevel(int id, int level);
	
	public List<Monster> findAllMonsters();

	public Monster findMonsterByUserId(int id);
	
}
