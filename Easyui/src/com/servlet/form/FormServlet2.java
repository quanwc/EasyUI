package com.servlet.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.entity.Emp;

/**
 * 将页面的form数据插入到数据库，并将所有数据查询出来显示到数据库
 * @author 全文超
 * 2017-08-05 15:11:16
 *
 */
public class FormServlet2 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = (String)request.getParameter("name");
		Integer age = Integer.parseInt(request.getParameter("age"));
		String code = (String)request.getParameter("code");
		System.out.println("code: " + code);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Emp emp = new Emp();
		emp.setName(name);
		emp.setAge(age);
		
		EmpDao dao = new EmpDao();
		try {
			dao.insertEmp(emp);
			//response.sendRedirect("DataGridServlet"); //重定向到另一个servlet
			response.sendRedirect("/M_Easyui/datagrid/demo01.jsp"); 
			//RequestDispatcher rd = request.getRequestDispatcher("/datagrid/demo01.jsp");
			//rd.forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		out.flush();
		out.close();
	}

}
