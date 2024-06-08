package com.swing.jdbc;


	

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.ArrayList;
	import javax.swing.JOptionPane;
	
	public class DataBaseHelper {


	
			private final String DB_URL = "jdbc:mysql://localhost:3306/college_db";
			private final String USER = "root";
			private final String PASS = "";

			private Connection conn;
			private PreparedStatement pstmt;
			private Statement stmt;

			Connection getConnection() throws SQLException {

				return DriverManager.getConnection(DB_URL, USER, PASS);
			}

			void insertRecord(Student student) {
				try {
					conn = getConnection();

					String sql = "INSERT INTO students(name,gender,address,contact)VALUES(?,?,?,?)";

					pstmt = conn.prepareStatement(sql);

					// pstmt.setInt(1, student.getId());
					pstmt.setString(1, student.getName());
					pstmt.setString(2, student.getGender());
					pstmt.setString(3, student.getAddress());
					pstmt.setString(4, student.getContact());
					
					pstmt.executeUpdate();
					
					System.out.println("Record inserted successfully");

				} catch (SQLException e) {
					System.out.println("Error creating Record:" + e.getMessage());
				} finally {

				}
				try {
					if (pstmt != null) {
						pstmt.close();
					}
					if (conn != null) {
						pstmt.close();
					}
				} catch (Exception e) {

				}
			}

			ArrayList<Student> readAllRecords() {
				ArrayList<Student> studentList = new ArrayList<Student>();
				try {
					conn = getConnection();

					String sql = "SELECT* FROM students";
					stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {

						// int sNo=rs.getInt("sno");

						Student student = new Student();

						
						student.setId(rs.getInt("id"));
						student.setName(rs.getString("name"));
						student.setGender(rs.getString("gender"));
						student.setAddress(rs.getString("address"));
						student.setContact(rs.getString("contact"));

						studentList.add(student);

					}
				} catch (SQLException e) {
					System.out.println("Error Reading Record:" + e.getMessage());
				} finally {
					try {
						if (stmt != null) {
							pstmt.close();
						}
						if (conn != null) {
							pstmt.close();
						}
					} catch (Exception e) {

					}
				}
				return studentList;
			}

			int deleteRecord(int id) {
				int status = 0;

				try {

					conn = getConnection();

					String sql = "DELETE FROM  students WHERE id=?";

					pstmt = conn.prepareStatement(sql);

					pstmt.setInt(1, id);

					status = pstmt.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return status;
			}

			void updateRecord(Student student) {

				try {

					conn = getConnection();

					String sql = "UPDATE students SET name = ?,gender = ?, address =?,contact=? WHERE id =?";

					pstmt = conn.prepareStatement(sql);

					pstmt.setString(1, student.getName());
					pstmt.setString(2, student.getGender());
					pstmt.setString(3, student.getAddress());
					pstmt.setString(4, student.getContact());
					pstmt.setInt(5, student.getId());

					pstmt.executeUpdate();

					System.out.println("Record updated successfully..");
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
			}





