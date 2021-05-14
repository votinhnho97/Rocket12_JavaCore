package com.vti.FinalExam.backend.service;

import java.util.List;

import com.vti.FinalExam.entity.User;

public interface IManagerService {

	List<User> getUserInProject(int projectId);

	List<User> getAllManager();

	User login(String email, String passWord);

}
