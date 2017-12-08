package com.servlet.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.entity.Emp;
import com.google.gson.Gson;

/**
 * 表单的提交
 * 2017-08-05 18:22:06
 *
 */
public class FormServlet3 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");//保证表单提交时中文能够正常处理
		System.out.println("===========servlet3==========");
		

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name1 = (String)request.getParameter("name");
		String email1 = (String)request.getParameter("email");
		String code = (String)request.getParameter("code");
		System.out.println("name: " + name1 + ", email: " + email1 + ", code: " + code);
		
		Gson g = new Gson();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "千寻2");
		map.put("email", "qianxun2@163.com");
		map.put("code", code);
		String jsonStr = g.toJson(map);
		out.print(jsonStr);
		
		out.flush();
		out.close();
	}

}
