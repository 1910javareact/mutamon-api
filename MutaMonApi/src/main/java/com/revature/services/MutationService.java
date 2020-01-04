package com.revature.services;

import java.util.List;

import com.revature.models.Mutation;

public interface MutationService {

	List<Mutation> findMutationsByLevel(int level);

}
