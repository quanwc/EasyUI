package com.servlet.datagrid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.entity.Emp;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
/**
 * 属性表格propertyGrid
 * @author 全文超
 * 2017-08-11 00:05:13
 *
 */
public class PropertyGridServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		List<JsonObject> list = new ArrayList<JsonObject>();
		
		//在后台封装json格式的数据：
		//step1：
		JsonObject json = new JsonObject();
		JsonArray array = new JsonArray();
		//step2：两个数据
		JsonObject temp1 = new JsonObject();
		JsonObject temp2 = new JsonObject();
		//step3：
		temp1.addProperty("name", "PHP本本");
        temp1.addProperty("value", "5.4");
        temp1.addProperty("group", "系统信息");
        temp1.addProperty("editor", "text");
        array.add(temp1);
  
        //step4：返回json
        out.println(array);
        out.close();
        
        
        
        
	}

}
