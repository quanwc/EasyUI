package com.entity;

import java.util.List;

/**
 * 该实体类的作用：
 * 		服务端封装json串，返回给客户端
 * @author 全文超
 * 2017-08-18 21:53:20
 *
 */
public class PageResult {
	private int total;
	private List<Emp> rows;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List<Emp> getRows() {
		return rows;
	}
	public void setRows(List<Emp> rows) {
		this.rows = rows;
	}
	
	@Override
	public String toString() {
		return "PageResult [total=" + total + ", rows=" + rows + "]";
	}
	
}
