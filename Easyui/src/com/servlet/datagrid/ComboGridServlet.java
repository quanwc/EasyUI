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
 * 组合表格 - ComboGrid
 * @author 全文超
 * 2017-08-13 23:16:37
 *
 */
public class ComboGridServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		EmpDao dao = new EmpDao();
		List<Emp> list = null;
		try {
			list = dao.findAll();
			
			Gson g = new Gson();
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
