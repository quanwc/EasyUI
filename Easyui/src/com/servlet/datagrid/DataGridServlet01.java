package com.servlet.datagrid;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDao;
import com.entity.Emp;
import com.entity.PageResult;
import com.google.gson.Gson;
/**
 * easyui的学习
 * 	datagrid的使用：数据表格的加载和分页功能
 * 
 * 分页：
 * 	1.前台会传递两个参数：
 * 		page：当前第几页
 * 		rows：每页的个数，也就是pageSize
 *  2.服务端给前台返回一个json格式的字符串：
 *  	格式：{"rows":[],"total":10}
 *  	rows：是一个list集合，或者数组，封装的是分页查询的结果集
 *  	total：数据库中的记录个数
 * @author 全文超
 * 2017-08-05 20:16:32
 *
 */
public class DataGridServlet01 extends HttpServlet {
	
	private EmpDao dao = new EmpDao();

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		//请教师父：pageSize的值、pageList的数组值必须一致吗？
		String page1 = (String)request.getParameter("page");  //当前第几页，相当于前台页面的pageNumber
		String rows1 = (String)request.getParameter("rows");  //pageSize：每页显示的记录数，相当于前台的pageSize
												//rows：就是pageSize、也是pageList数组中的参数值

		int page = Integer.parseInt(page1);
		int pageSize = Integer.parseInt(rows1);
		
		PrintWriter out = response.getWriter();
		Gson gson = new Gson(); 
		
		try { 
			List<Emp> list = dao.pageSearch(page, pageSize); //第几页，每页的个数
			int count = dao.countEmp();

			PageResult result = new PageResult();
			result.setRows(list);
			result.setTotal(count);
			
			String jsonStr = gson.toJson(result);  //将PageResult对象封装为一个json串
			System.out.println("jsonStr: " + jsonStr);
			out.print(jsonStr);
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
