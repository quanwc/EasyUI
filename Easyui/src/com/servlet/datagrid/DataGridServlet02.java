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
 * DataGrid的排序功能
 * @author 全文超
 * 2017-08-06 10:57:55
 *
 */
public class DataGridServlet02 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sortName = request.getParameter("sort");
		String sortOrder = request.getParameter("order");
		System.out.println(sortName + " " + sortOrder);
		
		
		EmpDao dao = new EmpDao();
		List<Emp> list = null;
	
			try {
				list = dao.sortSearch(sortName, sortOrder);
				Gson g = new Gson();
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("list", list);
				String jsonStr = g.toJson(map);
				System.out.println(list.size());
				System.out.println("jsonStr: " + jsonStr);
				out.print(jsonStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			out.flush();
			out.close();
	}

}
