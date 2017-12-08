package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Emp;


import util.DBUtil;

public class EmpDao {
	
	//查询所有员工
	public List<Emp> findAll() throws Exception{
		List<Emp> list = new ArrayList<Emp>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT * FROM emp1";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Emp e = new Emp();
				e.setId(id);
				e.setName(name);
				e.setAge(age);
				
				list.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
		return list;
	}
	
	
	//增加员工
	public void insertEmp(Emp emp) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = " insert into EMP1 (id,  name, age) " +
					"values(seq_emp1.nextval, ?, ?) ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getAge());
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
	}
	
	//查询总的记录数
	public int countEmp() throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select distinct count(*) cnt from emp1";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			int num = 0;
			if(rs.next()){
				num = rs.getInt("cnt");
			}
			System.out.println("num: " + num);
			return num;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
	}
	
	//分页查询：
	public List<Emp> pageSearch(int page, int pageSize) throws Exception{
		List<Emp> list = new ArrayList<Emp>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT * " +
						 "FROM (" +
						 	"SELECT ROWNUM rn, t.* " +
						 	"FROM ( " +
						 	"SELECT id, name, age " +
						 	"FROM emp1 " +
						 	")t " +
						 	") " +
						 "WHERE rn BETWEEN ? AND ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, (page-1)*pageSize + 1);  //page：第几页
			ps.setInt(2, page*pageSize);    //pageSize：每页显示的个数
			rs = ps.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Emp e = new Emp();
				e.setId(id);
				e.setName(name);
				e.setAge(age);
				
				list.add(e);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
		return list;
	}
	
	
	
	//排序
	public List<Emp> sortSearch(String sortName, String sortOrder) throws Exception{
		List<Emp> list = new ArrayList<Emp>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "SELECT * from emp1 order by " + sortName + " "+ sortOrder;
						 
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				Emp e = new Emp();
				e.setId(id);
				e.setName(name);
				e.setAge(age);
				list.add(e);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
	}
	
	
	//删除员工信息
	public int delete(int id) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "DELETE FROM emp1 " +
					"WHERE id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			int num = ps.executeUpdate();
			return num;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally{
			DBUtil.close(conn);
		}
	}
	
}
