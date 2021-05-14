package com.vti.FinalExam.backend.repository;

import java.sql.SQLException;
import java.util.List;

import com.vti.FinalExam.entity.User;

public interface IManagerRepository {

	List<User> getUserInProject(int projectId) throws SQLException;

	List<User> getAllManager() throws SQLException;

	User login(String email, String passWord) throws SQLException;

}
