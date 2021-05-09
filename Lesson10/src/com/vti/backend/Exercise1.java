package com.vti.backend;

import java.sql.*;

public class Exercise1 {
	public Connection conn;

	/*
	 * Question 1: (Sử dụng Database Testing System đã xây dựng ở SQL) Tạo
	 * connection tới database Testing System In ra "Connect success!" khi kết nối
	 * thành công.
	 */
	public void q1() throws SQLException {
		System.out.println("\nQuestion 1=============================");
		String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String user = "root";
		String pass = "root";

		conn = DriverManager.getConnection(dbUrl, user, pass);
		System.out.println("Connect success!");
	}

	/*
	 * Question 2: Tạo method để in ra các thông tin của position gồm có id, name
	 */
	public void q2() throws SQLException {
		System.out.println("\nQuestion 2=============================");
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM Position";
		ResultSet results = statement.executeQuery(sql);

		while (results.next()) {
			System.out.printf("|%5d | %-50s|\n", results.getInt("PositionID"), results.getString("PositionName"));
		}
	}

	/*
	 * Question 3: Tạo method để tạo position, user sẽ nhập vào name
	 */
	public void q3() throws SQLException {
		System.out.println("\nQuestion 3=============================");
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM `Group`";
		ResultSet results = statement.executeQuery(sql);

		while (results.next()) {
			System.out.printf("|%5d | %-50s|\n", results.getInt("CreatorID"), results.getString("GroupName"));
		}
		
		sql = "INSERT INTO `Group` (GroupName, CreatorID) VALUES ('GrJava1', 1)";
		int rowsEffected = statement.executeUpdate(sql);
		System.out.println("Row[s] effected: " + rowsEffected);
	}

	/*
	 * Question 4: Tạo method để update tên của position gồm có id = 5 thành "Dev".
	 */
	public void q4() {
		System.out.println("\nQuestion 4=============================");
	}

	/*
	 * Question 5: Tạo method để delete của position theo id và user sẽ nhập vào id
	 */
	public void q5() {
		System.out.println("\nQuestion 5=============================");
	}
}
