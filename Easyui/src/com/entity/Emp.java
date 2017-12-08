package com.entity;
/**
 * 数据库中表emp1对应的实体类Emp
 * @author 全文超
 * 2017-07-24 23:56:45
 *
 */
public class Emp {
	private String id;
	private String name;
	private Integer age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
