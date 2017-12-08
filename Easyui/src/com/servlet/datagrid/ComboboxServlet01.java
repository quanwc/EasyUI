package com.servlet.datagrid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
/**
 * combobox的使用
 * @author 全文超
 * 2017-08-10 20:02:04
 *
 */
public class ComboboxServlet01 extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//后台向combobox返回json格式的数据
		/*
		//在后台封装json格式的数据：
		//step1：
		JsonObject json = new JsonObject();
		JsonArray array = new JsonArray();
		//step2：两个数据
		JsonObject temp1 = new JsonObject();
		JsonObject temp2 = new JsonObject();
		//step3：
		temp1.addProperty("id", 1);
        temp1.addProperty("name", "张三");
        temp1.addProperty("age", "23");
        array.add(temp1);
        //step4：返回json
        json.add("data", array);
        System.out.println(array); //[{"id":1,"name":"张三","age":"23"}]

        out.println(array);
        out.close();
        */
		
		//后台向combobox返回从数据库中查询到的数据
		EmpDao dao = new EmpDao();
		List<Emp> list = null;
		try {
			list = dao.findAll();
			Gson g = new Gson();
			String jsonStr = g.toJson(list);
			System.out.println("jsonStr: " + jsonStr);
			out.print(jsonStr);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
