package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adaming.entity.Compte;


@Service
public interface CompteService {
	//Save & Update
			public Compte souCompte(Compte compte);
			//Delete
			public void deleteCompteById(Long id);
			//Find One By Id
			public Optional<Compte> findCompteById(Long id);
			//Get One
			public Compte findCompte(Long id);
			//Find All
			public List<Compte> findComptes();
		
}
