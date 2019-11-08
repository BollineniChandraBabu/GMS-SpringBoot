package com.revature.GradeManagementSystemapi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.GradeManagementSystemapi.dao.impl.UsersRepository;
import com.revature.GradeManagementSystemapi.model.Users;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GradeManagementSystemApiApplicationTests {
	 @Autowired
	 private UsersRepository usersRepository;
	@Test
	public void contextLoads() {
	}
@Test 
public void loginTest()
{
Users users=usersRepository.login("chandra@gmail.com", "chandra");	
assertNotNull(users);
}
}
