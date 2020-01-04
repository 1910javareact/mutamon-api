package com.revature.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Mutation;
import com.revature.repositories.MutationDao;

@Service
public class MutationServiceImpl implements MutationService {

	private MutationDao md;
	
	@Autowired
	public MutationServiceImpl(MutationDao md) {
		this.md = md;
	}
	
	@Override
	public List<Mutation> findMutationsByLevel(int level) {
		List<Mutation> mutations = md.findMutationsByLevel(level);
		List<Mutation> choices= new ArrayList<Mutation>();
		Random rand = new Random();
		for(int i = 0; i < 3; i++) {
			int choice = rand.nextInt(mutations.size());
			choices.add(mutations.get(choice));
		}
		return choices;
	}
}
