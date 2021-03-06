package _35_productMaintain.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import _35_listActs.model.BookBean;
import _35_listActs.service.BookService;
import _35_listActs.service.CompanyService;
import _35_listActs.service.impl.BookServiceImpl;
import _35_listActs.service.impl.CompanyServiceImpl;

@WebServlet("/_35_productMaintain/BookPreUpdate.do")
public class BookPreUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null) {
		     response.sendRedirect(request.getContextPath() + "/index.jsp");
		     return;
		}
		int bookId = 0;
		String strBookId = request.getParameter("BOOKID");
		
		if (strBookId != null) {
			bookId = Integer.parseInt(strBookId);
		}
		
		BookService bookService = new BookServiceImpl();
		BookBean bean = bookService.getBook(bookId);
		session.setAttribute("bean", bean);

		bookService.setSelected(bean.getCategory());
		String categoryTag = bookService.getCategoryTag();
		request.setAttribute("SelectCategoryTag", categoryTag);
		CompanyService cs = new CompanyServiceImpl();
		cs.setSelected(bean.getCompanyId());
		cs.setTagName("companyID");
		String companyTag = cs.getSelectTag();
		request.setAttribute("SelectCompanyTag", companyTag);

		RequestDispatcher rd = request.getRequestDispatcher("/_20_productMaintain/BookUpdate.jsp");
		rd.forward(request, response);
		return;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}
