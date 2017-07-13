package indi.hjk.codemakerexample.entity.common;

import java.util.List;

/**
 * 分页属性
 * 
 * @author zhzhj
 * @date 2015-5-13 上午8:23:00
 * @版本 V1.0
 * @comment
 */
public class PageBean<T> {

	// 当前页
	private Integer pageIndex;
	// 总页数
	private Integer totalPage;
	// 总记录数
	private Integer total;
	// 每页条数
	private Integer pageSize;
	// 当前页数据
	private List<T> data;
	// Easy UI 当前页数据
	private List<T> rows;

	private String[] titles;
	
	private Integer records;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotal() {
		return total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public String[] getTitles() {
		return titles;
	}

	public void setTitles(String[] titles) {
		this.titles = titles;
	}
}
