package com.entity;
/**
 * EasyUI练习：
 * 左侧导航树对应的实体类
 * @author 全文超
 * 2017-08-26 17:31:41
 *
 */
public class NavTree {
	private String id;
	private String text;
	private String status;
	private String iconCls;
	private String url;
	private String parentId;
	public NavTree() {
		super();
	}
	public NavTree(String id, String text, String status, String iconCls,
			String url, String parentId) {
		super();
		this.id = id;
		this.text = text;
		this.status = status;
		this.iconCls = iconCls;
		this.url = url;
		this.parentId = parentId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIconCls() {
		return iconCls;
	}
	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	@Override
	public String toString() {
		return "NavTree [id=" + id + ", text=" + text + ", status=" + status
				+ ", iconCls=" + iconCls + ", url=" + url + ", parentId="
				+ parentId + "]";
	}
	
}
