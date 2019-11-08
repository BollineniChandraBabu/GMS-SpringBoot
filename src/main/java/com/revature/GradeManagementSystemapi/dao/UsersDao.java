package com.revature.GradeManagementSystemapi.dao;

import java.util.List;

import com.revature.GradeManagementSystemapi.model.Users;

public interface UsersDao {
	public List<Users> viewAllUsers();
	public Users login(String email,String password);
	public int insert(Users users);
	public boolean checkByMailId(String mailId);
	public boolean activateAccount(String email, int id, String password);
	public Users findById(int id);
	public int findIdByMail(String mailId);
}
