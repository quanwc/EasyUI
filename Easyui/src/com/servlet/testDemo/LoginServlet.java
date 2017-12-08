package com.servlet.testDemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DemoDao;
import com.entity.Emp2;
/**
 * easyui的Demo练习：
 * 用户登录对应的servlet
 * @author 全文超
 * 2017-08-25 23:00:54
 *
 */
public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String manager = request.getParameter("manager");
		String pwd = request.getParameter("pwd");
		Emp2 e = new Emp2();
		e.setManager(manager);
		e.setPwd(pwd);
		DemoDao dao = new DemoDao();
		Emp2 emp = dao.findEmpById(e);

		HttpSession session = request.getSession();
		
		
		if(emp!=null){ //该用户存在
			session.setAttribute("manager", emp.getManager());
			out.print("true");
		}else{
			out.print("false");
		}
		out.close();
	}

}
