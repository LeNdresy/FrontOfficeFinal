package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.EnchereView;

public interface EnchereViewRepository extends JpaRepository<EnchereView,Long>{
    List<EnchereView> findByIdetat(Long idetat);

    //@Query(value="e.*,c.type as typecategorie,cl.nom from enchere e,categorie c, client cl where e.idcategorie=c.id and e.idclient=cl.id")
    List<EnchereView> findAll();
}
