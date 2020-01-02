package com.revature.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Mutation;

public interface MutationDao extends JpaRepository<Mutation, Integer> {
	public List<Mutation> findMutationsByLevel(int level);
}
