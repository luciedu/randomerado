package com.randomerando.java.controller;

import com.randomerando.java.model.utilisateur;
import com.randomerando.java.service.randoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class randocontroller {

    @Autowired
    private randoservice rservice;


    @RequestMapping("/GetRandoUtilisateur")
    public utilisateur Utilisateur(@RequestParam(value = "Id_utilisateur")Integer Id_utilisateur,@RequestParam(value = "id_r") Integer id_r) throws Exception {
        return rservice.lierRandoUtilisateur(Id_utilisateur, id_r);
    }
}