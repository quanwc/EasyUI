package com.servlet.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
/**
 * form组件对应的servlet
 * @author 全文超
 * 2017-08-04 00:21:24
 *
 */
public class FormServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("======================");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "zhangsan");
		map.put("email", "zhangsan@merit.com");
		
		Gson json = new Gson();
		String jsonStr = json.toJson(map);
		out.print(jsonStr);
		
		out.flush();
		out.close();
	}

}
