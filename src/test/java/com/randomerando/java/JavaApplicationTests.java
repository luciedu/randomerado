package com.randomerando.java;

import com.randomerando.java.model.rando;
import com.randomerando.java.model.utilisateur;
import com.randomerando.java.repository.RandoRepository;
import com.randomerando.java.repository.UserRepository;
import com.randomerando.java.service.randoservice;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RandoRepository randoRepository;

	@Autowired
    private randoservice RandoService;

	@Test
	public void testConnexionBdd() {
		//Given : données d'entrée
		//When : appel unitaire
		//Then : assertions
		Assert.assertTrue(userRepository.count()>0);
	}

	@Test
	public void test(){
		utilisateur u = userRepository.findOne(1);
		String r = u.getNom_Utilisateur();
		Assert.assertTrue(r.equals("Guenzi"));

        u.getRandonnees().size();
        Assert.assertEquals(1,u.getRandonnees().size());
	}

	@Test
	public void ajoututilisateur(){
		utilisateur u2 = userRepository.save(new utilisateur("test","test", "test","test@test.test", 29,true,new Date(), false, false, 1234 ) );
    }


    @Test//(expected = Exception.class)
    public void Liaison()throws Exception {
        RandoService.lierRandoUtilisateur(8,8);

    }

	/*@Test
    public void supprutilisateur(){
	    userRepository.delete(21);
    }*/
}

