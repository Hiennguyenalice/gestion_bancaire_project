package com.adaming.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entity.Compte;
import com.adaming.entity.Utilisateur;
import com.adaming.repository.CompteRepository;
import com.adaming.repository.UtilisateurRepository;
import com.adaming.services.CompteService;

@Service
public class CompteServiceImp implements CompteService {
	@Autowired
	CompteRepository compteRepo;
	
	@Override
	public Compte souCompte(Compte compte) {
		// TODO Auto-generated method stub
		return compteRepo.save(compte);
	}

	//@Override
	//public void deleteCompteById(Long id) {
		// TODO Auto-generated method stub
		//compteRepo.deleteById(id);
	//}

	@Override
	public void deleteCompteById(Long id) {
		// TODO Auto-generated method stub
		compteRepo.deleteById(id);

	}
	@Override
	public Optional<Compte> findCompteById(Long id) {
		// TODO Auto-generated method stub
		return compteRepo.findById(id);
	}
	
	@Override
	public Compte findCompte(Long id) {
		// TODO Auto-generated method stub
		return compteRepo.getOne(id);
	}

	@Override
	public List<Compte> findComptes() {
		// TODO Auto-generated method stub
		return compteRepo.findAll();
	}
}
