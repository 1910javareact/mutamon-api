package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Monster;
import com.revature.repositories.MutamonDao;

@Service
public class MutamonServiceImpl implements MutamonService {

	private MutamonDao md;
	
	@Autowired
	public MutamonServiceImpl(MutamonDao md) {
		this.md = md;
	}
	
	@Override
	public List<Monster> findMonstersByUserIdAndLevel(int id, int level) {
		// TODO Auto-generated method stub
		return md.findMonstersByUserIdAndLevel(id,level);
	}
	
	@Override
	public List<Monster> findAllMonsters() {
		return md.findAll();
	}
	
}
