package com.vti.frontend;

import java.sql.SQLException;

import com.vti.backend.JDBCUtils;

public class Program5 {
	public static void main(String[] args) throws SQLException {
		JDBCUtils jdbcUtils = new JDBCUtils();
		jdbcUtils.isConnectedForTesting();
		jdbcUtils.connect();
		jdbcUtils.disconnect();
	}
}
