package indi.hjk.codemakerexample.entity.common;

import java.io.Serializable;

public class BaseEntity implements Serializable{
	private static final long serialVersionUID = -2285445201985585680L;

	private Long startIndex = 0l;//起始分页索引
	private Long endIndex = 0l;//结束分页索引
	private Integer total = 0;//数据总数
	private Integer page = 0; //当前页数
	private Integer rows = 0; //每页条数
	private String sortname="";//排序字段
	private String sortpattern="ASC";//默认正序
	private String isLeaf;   //是否父节点
	private String expanded; //是否展开
	private String level;     //等级
	private String parent;    //父级

	public String getSortname() {
		return sortname;
	}

	public void setSortname(String sortname) {
		this.sortname = sortname;
	}

	public String getSortpattern() {
		return sortpattern;
	}

	public void setSortpattern(String sortpattern) {
		this.sortpattern = sortpattern;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Long startIndex) {
		this.startIndex = startIndex;
	}

	public Long getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Long endIndex) {
		this.endIndex = endIndex;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public String getIsLeaf() {
		return isLeaf;
	}

	public void setIsLeaf(String isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getExpanded() {
		return expanded;
	}

	public void setExpanded(String expanded) {
		this.expanded = expanded;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
}
