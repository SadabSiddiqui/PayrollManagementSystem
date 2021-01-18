package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.LoginDao;
import com.bean.Employee;
import com.services.EmpServices;
import com.services.EmpServices;
import com.util.DbUtil;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String action = request.getParameter("action");
		
		if(action.equals("logout")){
			HttpSession sn= request.getSession();
			sn.invalidate();
			response.sendRedirect("index.html");
		}
		
		if(action.equals("signup"))
		{
			int empid=Integer.parseInt(request.getParameter("Empid"));
			String fname=request.getParameter("First_name");
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			String dob= request.getParameter("birthday");
			java.util.Date udob=null;
			try {
				udob=sdf.parse(dob);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			String gender= request.getParameter("Gender");
			String email= request.getParameter("email_id");
			String mno=request.getParameter("Contact");
			String add= request.getParameter("Address_Line_1");
			String dgn= request.getParameter("Designation");
			String doj= request.getParameter("Date_Hired");
			java.util.Date udoj=null;
			try {
				udoj=sdf.parse(dob);
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			double esal=Integer.parseInt(request.getParameter("Basic_Salary"));
			Employee emp=new Employee(empid,fname,udob,gender,email,mno,add,dgn,udoj,esal);
			//ArrayList<Employee> emp1=new ArrayList<Employee>();
			EmpServices s = new EmpServices();
			try {
				if(s.sGetEmployee(emp))
				{
					System.out.println("Added succesfully");
					
					request.setAttribute("alertMsg1", "Emloyeee Added Succcessfully");
					RequestDispatcher rd=request.getRequestDispatcher("index2.jsp");  
					rd.include(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}


	private Employee add(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}
}