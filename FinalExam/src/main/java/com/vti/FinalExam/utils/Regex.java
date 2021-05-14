package com.vti.FinalExam.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	/**
	 * Kiểm tra chuỗi đầu vào có phải là định dạng ngày không? Chấp nhận định dạng
	 * dd/MM/yyyy hoặc dd-MM-yyyy.
	 * 
	 * @param date
	 * @return true: chuỗi str có định dạng dd/MM/yyyy
	 */
	public static boolean isDateFormat(String date) {
		Pattern pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
		return pattern.matcher(date).matches();
	}

	/**
	 * Kiểm tra ngày nhập vào có đúng định dạng quy định ở pattern không?
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static boolean isDateFormat(String date, String pattern) {
		return Pattern.matches(pattern, date);
	}

	/**
	 * Kiểm tra chuỗi đầu vào có phải là định dạng email không? Chuỗi hợp lệ phải
	 * bắt đầu bằng chữ [a-zA-Z], có ký tự @, có domain sau ký tự @
	 * 
	 * @param email
	 * @return
	 */
	public static boolean isEmailFormat(String email) {
		String emailPattern = "^[a-zA-Z][\\w]+@([\\w]+\\.[\\w]+|[\\w]{2,}\\.[\\w]{2,}\\.[\\w]{2,})$";
		return Pattern.matches(emailPattern, email);
	}

	/**
	 * Kiểm tra email đầu vào có đúng định dạng pattern không?
	 * 
	 * @param email
	 * @param pattern
	 * @return
	 */
	public static boolean isEmailFormat(String email, String pattern) {
		return Pattern.matches(pattern, email);
	}

	/**
	 * Kiểm tra chuỗi đầu vào có phải định dạng password cần tìm không? Định dạng
	 * password yêu cầu (chữ hoa, chữ thường, 6 - 12 ký tự)
	 * 
	 * @param password
	 * @return
	 */
	public static boolean isPasswordFormat(String password) {
		String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z]).{6,12}$";
		return Pattern.matches(passwordPattern, password);
	}

	/**
	 * Kiểm tra định dạng password hợp lệ với pattern không?
	 * 
	 * @param password
	 * @param pattern
	 * @return
	 */
	public static boolean isPasswordFormat(String password, String pattern) {
		return Pattern.matches(pattern, password);
	}

	/**
	 * Tìm tất cả các chuỗi con hợp với pattern trong chuỗi str.
	 * 
	 * @param str
	 * @param pattern
	 * @return List<String>: danh sách các chuỗi con hợp lệ.
	 */
	public static List<String> findAll(String str, String pattern) {
		List<String> results = new ArrayList<String>();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		while (m.find()) {
			String s = str.substring(m.start(), m.end());
			results.add(s);
		}
		return results;
	}
}
