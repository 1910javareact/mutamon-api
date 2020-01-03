package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Mutation;
import com.revature.services.MutationService;

@RestController
@RequestMapping("mutation")
public class MutationController {

	private MutationService ms;
	
	@Autowired
	public MutationController(MutationService ms) {
		this.ms = ms;
	}
	
	@GetMapping("/{level}")
	public List<Mutation> findMutationsByLevel(@PathVariable int level) {
		return ms.findMutationsByLevel(level);
	}
}

