package com.servlet.datagrid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.google.gson.Gson;
/**
 * DataGrid：
 * 		冻结列、格式化、右击弹出菜单
 * @author 全文超
 * 2017-08-09 21:02:59
 *
 */
public class DataGridServlet06 extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String ids = request.getParameter("ids");
		int idsTwo = Integer.parseInt(ids);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		EmpDao dao = new EmpDao();
	
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
