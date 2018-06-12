package com.webjam.www.taglib;

import org.springframework.web.servlet.tags.RequestContextAwareTag;

public class PagenationTag extends RequestContextAwareTag {

	private static final long serialVersionUID = 8598500057387007257L;

	private int totalCount = 0;

	private int currentPage = 1;

	private int maxPageCnt = 10;

	private int maxRows = 10;
	
	private int prevPage = 0;

	private int nextPage = 0;

	private int totalPage = 0;

	private int count = 0;
	
	@Override
	protected int doStartTagInternal() throws Exception {

		System.out.println("aaa");
		return 0;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getMaxPageCnt() {
		return maxPageCnt;
	}

	public void setMaxPageCnt(int maxPageCnt) {
		this.maxPageCnt = maxPageCnt;
	}

	public int getMaxRows() {
		return maxRows;
	}

	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
	}

}
