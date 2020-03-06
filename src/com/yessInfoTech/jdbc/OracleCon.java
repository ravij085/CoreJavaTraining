package com.yessInfoTech.jdbc;

import java.sql.*;

class OracleCon {
	public static void main(String args[]) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");

		/*	Statement stmt = con.createStatement();

			// ResultSet rs = stmt.executeQuery("select * from employee");
			// int rs1 = stmt.executeUpdate("delete from employee where empId = 102");
			int status = stmt.executeUpdate("insert into employee values(104 , 'jay' , 32)");
			ResultSet rs = stmt.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));*/

			
			
			
			
			//Prepared statement 
			
			PreparedStatement preStatement = con.prepareStatement("insert into employee values(?,?,?)");
			
			preStatement.setInt(1, 105);
			preStatement.setString(2, "Dave");
			preStatement.setInt(3, 22);
			
			int a = preStatement.executeUpdate();
			
			
			Statement stmt = con.createStatement();
			ResultSet rs2 = stmt.executeQuery("select * from employee");
			while (rs2.next())
				System.out.println(rs2.getInt(1) + "  " + rs2.getString(2) + "  " + rs2.getInt(3));
			
			
			
			
			
			
			
			
			
			/*ResultSetMetaData metaData = rs.getMetaData();

			System.out.println("total number of columns : " + metaData.getColumnCount());
			System.out.println("number 1 column name : " + metaData.getColumnName(1));
			System.out.println("number 1 column type : " + metaData.getColumnTypeName(1));

			DatabaseMetaData dbMetadata = con.getMetaData();
			
			System.out.println("driver name : "+dbMetadata.getDriverName());
			System.out.println("url name : "+dbMetadata.getURL());
			System.out.println("user name : "+dbMetadata.getUserName());*/
			

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
