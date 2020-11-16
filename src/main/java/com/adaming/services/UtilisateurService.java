package com.adaming.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adaming.entity.Utilisateur;

@Service
public interface UtilisateurService {
	//Save & Update
		public Utilisateur souUtilisateur(Utilisateur utilisateur);
		//Delete
		public void deleteUtilisateurById(Long id);
		//Find One By Id
		public Optional<Utilisateur> findUtilisateurById(Long id);
		//Get One
		public Utilisateur findUtilisateur(Long id);
		//Find All
		public List<Utilisateur> findUtilisateurs();
	
}
