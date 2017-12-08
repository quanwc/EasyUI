package com.servlet.testDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import com.dao.DemoDao;
import com.entity.NavTree;
import com.google.gson.Gson;
/**
 * EasyUI练习
 * 左侧导航树对应的Servlet
 * @author 全文超
 * 2017-08-26 17:30:00
 *
 */
public class NavTreeServlet extends HttpServlet {

	
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String parentId = request.getParameter("parentId");
		
		DemoDao dao = new DemoDao();
		try {
			List<NavTree> navTreeList = dao.findNavTree(parentId);
			for(int i=0; i<navTreeList.size(); ++i){
				System.out.println(navTreeList.get(i));
			}
			Gson gson = new Gson();
			String gsonStr = gson.toJson(navTreeList);
			System.out.println(gsonStr);
			out.print(gsonStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		out.close();
	}

}
