package com.revature.GradeManagementSystemapi.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepartmentsTest {
private Departments departments = new Departments();
	
	@Test
	public void testGetId() {
		departments.setId(1);
		assertEquals(1,departments.getId());
	}

	@Test
	public void testGetName() {
		departments.setName("ENGLISH");
		assertEquals("ENGLISH",departments.getName());
	}

	@Test
	public void testDepartments() {
		departments.setId(1);
		departments.setName("ENGLISH");
		assertNotNull(departments);
	}
	@Test
	public void testDepartmentsNull() {
		assertNotNull(departments);
	}

}
