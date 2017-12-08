package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.DBUtil;

import com.entity.Emp;
import com.entity.Emp2;
import com.entity.NavTree;

/**
 * EasyUI练习的dao层
 * @author 全文超
 * 2017-08-26 14:38:32
 *
 */
public class DemoDao {

	//用户登录：
	public Emp2 findEmpById(Emp2 e){

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT * FROM emp1 WHERE manager=? and pwd=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, e.getManager());
			ps.setString(2, e.getPwd());
			rs = ps.executeQuery();
			Emp2 emp = new Emp2();
			if(rs.next()){
				String id = rs.getString("id");
				String manager = rs.getString("manager");
				String pwd = rs.getString("pwd");
				Date createDate = rs.getDate("createDate");
				emp.setId(id);
				emp.setManager(manager);
				emp.setPwd(pwd);
				emp.setCreateDate(createDate+"");
			}
			return emp;
		} catch (Exception ex) {
			ex.printStackTrace();
			try {
				throw ex;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} finally{
			DBUtil.close(conn);
		}
		return null;
	}
	
	//查询左侧导航树
	public List<NavTree> findNavTree(String parentIdParam) throws Exception{
		List<NavTree> list = new ArrayList<NavTree>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			parentIdParam = (parentIdParam==null) ? "0" : parentIdParam;
			String sql = "SELECT * FROM nav_tree WHERE parentId=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, parentIdParam);
			rs = ps.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String text = rs.getString("text");
				String status = rs.getString("status");
				String iconCls = rs.getString("iconCls");
				String url = rs.getString("url");
				String parentId = rs.getString("parentId");
				NavTree tree = new NavTree();
				tree.setId(id);
				tree.setText(text);
				tree.setStatus(status);
				tree.setIconCls(iconCls);
				tree.setUrl(url);
				tree.setParentId(parentId);
				list.add(tree);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
		return list;
	}
	
}
