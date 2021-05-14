package com.vti.FinalExam.backend.controller;

import java.util.List;

import com.vti.FinalExam.backend.service.IManagerService;
import com.vti.FinalExam.backend.service.ManagerService;
import com.vti.FinalExam.entity.User;

public class ManagerController {
	private IManagerService managerService;

	public ManagerController() {
		managerService = new ManagerService();
	}

	public List<User> getUserInProject(int projectId) {
		return managerService.getUserInProject(projectId);
	}

	public List<User> getAllManager() {
		return managerService.getAllManager();
	}

	public User login(String email, String passWord) {
		return managerService.login(email, passWord);
	}

}
