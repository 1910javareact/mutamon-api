package com.revature.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Monster;
import com.revature.models.Mutation;
import com.revature.repositories.MutamonDao;

@Service
public class MutamonServiceImpl implements MutamonService {

	private MutamonDao md;
	
	@Autowired
	public MutamonServiceImpl(MutamonDao md) {
		this.md = md;
	}
	
	public Monster mutamonStatsPopulation(Monster m) {
		m.setStrength(m.getLevel());
		m.setSpeed(m.getLevel());
		m.setDefence(m.getLevel());
		for(Mutation mut: m.getMutations()) {
			m.setStrength(m.getStrength()+mut.getStrength());
			m.setSpeed(m.getSpeed()+mut.getSpeed());
			m.setDefence(m.getDefence()+mut.getDefence());
		}
		
		return m;
	}
	
	@Override
	public List<Monster> findMonstersByUserIdAndLevel(int id, int level) {
		List<Monster> monsters = md.findMonstersByUserIdAndLevel(id,level);
		for(Monster monster: monsters) {
			monster = this.mutamonStatsPopulation(monster);
		}
		return monsters;
	}
	
	@Override
	public List<Monster> findAllMonsters() {
		List<Monster> monsters = md.findAll();
		for(Monster monster: monsters) {
			monster = this.mutamonStatsPopulation(monster);
		}
		return monsters;
	}

	@Override
	public Monster findMonsterByUserId(int id) {
		return md.getOne(id);
	}
	
}
