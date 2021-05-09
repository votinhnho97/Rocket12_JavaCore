package JDBCDemo;

import java.sql.*;

public class JDBCDemo {
	public static void main(String[] args) {
		getDepartment(5);
		updateDepartmentNameByID(5, "IT");
	}

	static Connection connect() {
		String dbUrl = "jdbc:mysql://localhost:3306/TestingSystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String dbUser = "root";
		String dbPassword = "root";
		Connection connection = null;
		try {
			// Tạo kết nối tới database
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("Connect success!");
		} catch (SQLException e) {
			System.out.println("Something wrong when connect to database.");
		}
		return connection;
	}

	static void disconnect(Connection connection) {
		try {
			connection.close();
			System.out.println("Disconnected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	static void getDepartment(int id) {
		Connection connection = connect();
		try {
			// Query
			String sql = "SELECT * FROM Department " + "WHERE DepartmentID < ? ORDER BY DepartmentID";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setInt(1, id);
			// Chạy câu Query và hứng kết quả vào ResultSet
			ResultSet resultSet = preStatement.executeQuery();
			// results.next():
			// kiểm tra xem dòng tiếp theo có dữ liệu không, nếu có trả về true
			while (resultSet.next()) {
				System.out.printf("|%5d | %-50s|\n", resultSet.getInt("DepartmentID"),
						resultSet.getString("DepartmentName"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something wrong when query to database.");
		} finally {
			disconnect(connection);
		}
	}

	static void updateDepartmentNameByID(int id, String name) {
		Connection connection = connect();
		try {
			String sql = "UPDATE Department SET DepartmentName = ? WHERE DepartmentID = ?";
			PreparedStatement preStatement = connection.prepareStatement(sql);
			preStatement.setString(1, name);
			preStatement.setInt(2, id);
			int rowsEffect = preStatement.executeUpdate();
			System.out.println("Row[s] effected: " + rowsEffect);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something wrong when query to database.");
		} finally {
			disconnect(connection);
		}
	}
}
