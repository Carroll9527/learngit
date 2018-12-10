package com.yiya.utils;

public class Page {			
	int page=1;
	int rows =10;
	int last = 0;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getLast() {
		return last;
	}
	public void setLast(int last) {
		this.last = last;
	}	
	//计算最后一页的起始值
	public void caculaterLast(int total){
		//假设总数是50,是能够被5整除的,那么最后一页的开始就是45
		if(0==total % rows)
			last = total - rows;
		else 
		  last = total- total%rows;	
	}
}
