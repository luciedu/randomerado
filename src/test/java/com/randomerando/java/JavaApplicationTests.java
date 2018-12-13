package com.randomerando.java;

import com.randomerando.java.model.rando;
import com.randomerando.java.model.utilisateur;
import com.randomerando.java.repository.RandoRepository;
import com.randomerando.java.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaApplicationTests {

	@Autowired
	private UserRepository userRepository;
	private RandoRepository randoRepository;

	@Test
	public void testConnexionBdd() {
		//Given
		//When
		//Then
		Assert.assertTrue(userRepository.count()>0);
	}

	@Test
	public void test(){
		utilisateur u = userRepository.findOne(1);
		String r = u.getNom_Utilisateur();
		Assert.assertTrue(r.equals("Guenzi"));
	}


}

