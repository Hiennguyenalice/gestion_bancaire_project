package com.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
