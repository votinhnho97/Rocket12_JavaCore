package com.vti.FinalExam.backend.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.FinalExam.backend.repository.IManagerRepository;
import com.vti.FinalExam.backend.repository.ManagerRepository;
import com.vti.FinalExam.entity.Manager;
import com.vti.FinalExam.entity.User;
import com.vti.FinalExam.utils.Properties.MessageProperties;

public class ManagerService implements IManagerService {
	private IManagerRepository managerRepository;
	private MessageProperties msgProperties;

	public ManagerService() {
		try {
			managerRepository = new ManagerRepository();
			msgProperties = new MessageProperties();
		} catch (FileNotFoundException e) {
			System.out.println(msgProperties.getValue("jdbcUtils.Properties.filenotfound"));
		} catch (IOException e) {
			System.out.println(msgProperties.getValue("jdbcUtils.Properties.notpermission"));
		}
	}

	public List<User> getUserInProject(int projectId) {
		try {
			return managerRepository.getUserInProject(projectId);
		} catch (SQLException e) {
			System.out.println(msgProperties.getValue("getUserInProject.error"));
		}
		return new ArrayList<User>();
	}

	public List<User> getAllManager() {
		try {
			return managerRepository.getAllManager();
		} catch (SQLException e) {
			System.out.println(msgProperties.getValue("getAllManager.error"));
		}
		return new ArrayList<User>();
	}

	public User login(String email, String passWord) {
		User user = null;
		try {
			user = managerRepository.login(email, passWord);
		} catch (SQLException e) {
			System.out.println(msgProperties.getValue("login.error"));
		}
		return user;
	}

}
