package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categorie;
import com.example.demo.repository.CategorieRepository;
import com.example.demo.response.Succes;

@RestController
@CrossOrigin("*")
public class CategorieController {
    @Autowired
    CategorieRepository categorieRepository;

    @GetMapping("/categories")
    public ResponseEntity ListerCategorie() throws Exception {

        List<Categorie> liste = (List<Categorie>) categorieRepository.findAll();
        
        ResponseEntity responseentity = null;

        Succes succes = new Succes();
        succes.setData(liste);

        responseentity = new ResponseEntity(succes, HttpStatus.CREATED);

        return responseentity;
    }

}
