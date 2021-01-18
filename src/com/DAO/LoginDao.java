package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.Employee;
import com.services.EmpServices;
import com.util.DbUtil;

public class LoginDao {

	
	public boolean getEmployee(Employee e)throws Exception {
		// TODO Auto-generated method stub
		//Employee e=new Employee();
		try{
			Connection con = DbUtil.getConnection();
//			String cmd="insert into Employee_DB values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//			PreparedStatement pt= con.prepareStatement(cmd);
			PreparedStatement pt=con.prepareStatement("insert into Employee_DB values(?,?,?,?,?,?,?,?,?,?)");
			
			pt.setInt(1,e.getEmpid());
			pt.setString(2,e.getFname());
			java.sql.Date sqlD=new java.sql.Date(e.getDob().getTime());
			pt.setDate(3,sqlD);
			pt.setString(4,e.getGender());
			pt.setString(5,e.getEmail());
			pt.setString(6,e.getMno());
			pt.setString(7,e.getAdd());
			pt.setString(8,e.getDgn());
			java.sql.Date sqlDate=new java.sql.Date(e.getDoj().getTime());
			pt.setDate(9,sqlDate);
			pt.setDouble(10,e.getBsal());
			int n=pt.executeUpdate();
			if(n>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception g)
		{
			g.printStackTrace();
			return false;
		}
		
	}
}

	

