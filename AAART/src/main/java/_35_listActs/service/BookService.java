package _35_listActs.service;

import java.util.List;

import _35_listActs.model.BookBean;

public interface BookService {
	// 依bookID來刪除單筆記錄
	int deleteBook(int no);
	
	// 依bookID來查詢單筆記錄
	BookBean getBook(int bookID);

	// 取出所有的類型
	List<String> getCategory();
	
	String getCategoryTag();
	
	List<BookBean> getPageBooks();
	
	int getPageNo();
	
	int getRecordsPerPage();

	long getRecordCounts();
	
	int getTotalPages();
	
	// 新增一筆記錄
	int saveBook(BookBean bean);

	void setPageNo(int pageNo);

	void setRecordsPerPage(int recordsPerPage);

	void setSelected(String category);
	// 計算紀錄總筆數
	int updateBook(BookBean bean, long sizeInBytes) ;

}
