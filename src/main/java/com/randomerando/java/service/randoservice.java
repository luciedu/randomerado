package com.randomerando.java.service;
import com.randomerando.java.model.rando;
import com.randomerando.java.model.utilisateur;
import com.randomerando.java.repository.RandoRepository;
import com.randomerando.java.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class randoservice {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RandoRepository randoRepository;

    public void lierRandoUtilisateur (Integer Id_Utilisateur, Integer id_r) throws Exception {
        if(userRepository.exists(Id_Utilisateur))
        {
            utilisateur u = userRepository.findOne(Id_Utilisateur);

                if (randoRepository.exists(id_r))
                {
                    rando r = randoRepository.findOne(id_r);
                    // instanciation de la classe

                    u.getRandonnees().add(r);

                    //sauvegarde dans la BDD
                    userRepository.save(u);

                } else
                    {
                    throw new Exception("L'identifiant de randonnées n'existe pas : " + id_r);
                    }

        }
        else
        {
            throw new Exception("L'identifiant utilisateur n'existe pas : " + Id_Utilisateur);
        }
    }
}
