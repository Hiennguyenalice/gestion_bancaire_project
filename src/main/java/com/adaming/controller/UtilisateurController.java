package com.adaming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.adaming.entity.Utilisateur;
import com.adaming.services.UtilisateurService;


@CrossOrigin
@RestController
public class UtilisateurController {
	@Autowired
	UtilisateurService utilisateurService;
	

	@RequestMapping(value="/utilisateurs",method=RequestMethod.POST)
	public Utilisateur saveOrUpdate(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.souUtilisateur(utilisateur);
	}
	
	
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		utilisateurService.deleteUtilisateurById(id);
	}
	

	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.GET)
	public Optional<Utilisateur> findOneById(@PathVariable("id") Long id){
		return utilisateurService.findUtilisateurById(id);
	}
	

	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> findAll(){
		return utilisateurService.findUtilisateurs();
	}
	
	@RequestMapping(value="/utilisateurs/{id}",method=RequestMethod.PUT)
	public Utilisateur updateUtilisateur(@PathVariable("id")Long id ,@RequestBody Utilisateur utilisateur) {
		Utilisateur currentUser=utilisateurService.findUtilisateur(id);
		currentUser.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUser.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		return utilisateurService.souUtilisateur(currentUser);
	}
	

}
