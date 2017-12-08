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
 * 删除数据：
 * DataGrid的前后台交互：load、loading、reload方法的学习
 * @author 全文超
 * 2017-08-09 19:48:12
 *
 */
public class DataGridServlet05 extends HttpServlet {


	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ids = request.getParameter("ids");
		int idsTwo = Integer.parseInt(ids);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		EmpDao dao = new EmpDao();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		try {
			int num = dao.delete(idsTwo);
			Gson g = new Gson();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("data", num);
			String jsonStr = g.toJson(map);
			System.out.println("jsonStr: " + jsonStr);
			out.print(jsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		out.flush();
		out.close();
	}

}
