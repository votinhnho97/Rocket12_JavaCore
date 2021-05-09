package com.vti.frontend;

import java.sql.SQLException;

import com.vti.backend.Exercise1;

public class Program1 {
	public static void main(String[] args) throws SQLException {
		Exercise1 e = new Exercise1();
		e.q1();
		
		e.q2();
		
		e.q3();
//		
//		e.q4();
//		
//		e.q5();
		
		e.conn.close();
	}
}
