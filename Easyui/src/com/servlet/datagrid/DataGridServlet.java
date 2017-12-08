package com.servlet.datagrid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.entity.Emp;
import com.google.gson.Gson;

/**
 * easyui的前后台环境搭建
 * 		前台：直接通过url向后台发送请求
 * 		后台：向前台返回json格式的数据
 * @author 全文超
 * 2017-08-01 23:12:45
 *
 */
public class DataGridServlet extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		EmpDao dao = new EmpDao();
		List<Emp> list = null;
		try {
			list = dao.findAll();
			
			Gson g = new Gson();
			Map<String, Object> map = new HashMap<String, Object>();
			String jsonStr = g.toJson(list);
			System.out.println(list.size());
			System.out.println("jsonStr: " + jsonStr);
			out.print(jsonStr);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
