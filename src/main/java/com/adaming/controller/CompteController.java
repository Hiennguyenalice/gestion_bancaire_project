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

import com.adaming.entity.Compte;
import com.adaming.services.CompteService;


@CrossOrigin
@RestController
public class CompteController {
	@Autowired
	CompteService compteService;
	
	@RequestMapping(value="/comptes",method=RequestMethod.POST)
	public Compte saveOrUpdate(@RequestBody Compte compte) {
		return compteService.souCompte(compte);
	}
	
	
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.DELETE)
	public void deleteOneByID(@PathVariable("id") Long id) {
		compteService.deleteCompteById(id);
	}
	

	@RequestMapping(value="/comptes/{id}",method=RequestMethod.GET)
	public Optional<Compte> findOneById(@PathVariable("id") Long id){
		return compteService.findCompteById(id);
	}
	

	@RequestMapping(value="/comptes",method=RequestMethod.GET)
	public List<Compte> findAll(){
		return compteService.findComptes();
	}
	
	@RequestMapping(value="/comptes/{id}",method=RequestMethod.PUT)
	public Compte updateCompte(@PathVariable("id")Long id ,@RequestBody Compte Compte) {
		Compte currentUser=compteService.findCompte(id);
		currentUser.setDateCreation(Compte.getDateCreation());
		currentUser.setSolde(Compte.getSolde());
		return compteService.souCompte(currentUser);
	}
	
}


