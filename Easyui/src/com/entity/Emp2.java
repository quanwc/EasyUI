package com.entity;
/**
 * EasyUI练习对应的实体类
 * @author 全文超
 * 2017-08-26 14:46:12
 *
 */
public class Emp2 {
	private String id;
	private String manager;  //管理员账号
	private String pwd;  //管理员密码
	private String createDate;
	
	public Emp2() {
		super();
	}
	public Emp2(String id, String manager, String pwd, String createDate) {
		super();
		this.id = id;
		this.manager = manager;
		this.pwd = pwd;
		this.createDate = createDate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Emp2 [id=" + id + ", manager=" + manager + ", pwd=" + pwd
				+ ", createDate=" + createDate + "]";
	}
	
}
