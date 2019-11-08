package com.revature.GradeManagementSystemapi.model;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class UsersTest {
	private Users user = new Users();
	@Test
	public void testGetId() {	
		user.setId(1);
		assertEquals(user.getId(), 1);
	}

	@Test
	public void testGetName() {
		user.setName("chandra");
		assertEquals(user.getName(), "chandra");
	}

	@Test
	public void testGetFatherName() {
		user.setFatherName("chandra");
		assertEquals(user.getFatherName(), "chandra");
	}

	@Test
	public void testGetEmail() {
		user.setEmail("chandra@gmail.com");
		assertEquals(user.getEmail(), "chandra@gmail.com");
	}

	@Test
	public void testGetPassword() {
		user.setPassword("password@123");
		assertEquals(user.getPassword(), "password@123");
	}

	@Test
	public void testIsRoles() {
		user.setRoles(true);
		assertEquals(user.isRoles(), true);
	}

	@Test
	public void testGetDateOfJoining() {
		LocalDate d=LocalDate.now();
		user.setDateOfJoining(d);
		assertEquals(user.getDateOfJoining(), d);
	}

	@Test
	public void testGetDepartment() {
		Departments departments=new Departments();
		departments.setId(1);
		user.setDepartment(departments);
		assertEquals(user.getDepartment(), departments);
	}

	@Test
	public void testIsActive() {
		user.setActive(true);
		assertEquals(user.isActive(), true);
	}

	@Test
	public void testIsActiveAccount() {
		user.setActiveAccount(true);
		assertEquals(user.isActiveAccount(), true);
	}
	@Test
	public void testUsers() {
		assertNotNull(user);
	}
}
