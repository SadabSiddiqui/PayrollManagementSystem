package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public static Connection getConnection(){
	Connection con = null;	
		try{
//			Class.forName("oracle.jdbc.driver.OracleDriver");          OracleDB
			Class.forName("com.mysql.jdbc.Driver");
			
//			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","sadabsiddiqui");
			con = DriverManager.getConnection("jdbc:mysql://localhost/payroll", "root", "sadabsiddiqui");

			return con;
		}catch(Exception e){
			return con;
		}
		
		
	}
	
}
