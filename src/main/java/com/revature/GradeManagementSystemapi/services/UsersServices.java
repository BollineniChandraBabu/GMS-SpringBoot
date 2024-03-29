package com.revature.GradeManagementSystemapi.services;

import java.util.List;

import com.revature.GradeManagementSystemapi.exception.ServiceException;
import com.revature.GradeManagementSystemapi.model.Users;

public interface UsersServices {
	public Users login(String email, String password) throws ServiceException ;
	public int insert(Users users) throws ServiceException;
	public boolean checkByMailId(String mailId);
	public boolean activateAccount(int eid, String mail, String password) throws ServiceException;
	public int findIdByMail(String string);
	public  List<Users> viewAllUsers() ;
}
