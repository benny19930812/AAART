package _35_productMaintain.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import _35_init.util.GlobalService;
import _35_listActs.model.BookBean;
import _35_listActs.model.MainTableBean;
import _35_listActs.service.BookService;
import _35_listActs.service.impl.BookServiceImpl;
import _35_listActs.service.impl.MainTableServiceImpl;
import _35_register.model.MemberBean;

@WebServlet("/_35_productMaintain/DisplayActs")
public class DisplayActs extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		// 先取出session物件
//		HttpSession session = request.getSession(false);
//		// 紀錄目前請求的RequestURI,以便使用者登入成功後能夠回到原本的畫面
//		String requestURI = request.getRequestURI();
//		// System.out.println("requestURI=" + requestURI);
//		// 如果session物件不存在
//		if (session == null || session.isNew()) {
//			// 請使用者登入
//			response.sendRedirect(response.encodeRedirectURL("../_35_login/login.jsp"));
//			return;
//		}
//		session.setAttribute("requestURI", requestURI);
//		// 此時session物件存在，讀取session物件內的LoginOK
//		// 以檢查使用者是否登入。
//		MemberBean mb = (MemberBean) session.getAttribute("LoginOK");
//		if (mb == null) {
//			response.sendRedirect(response.encodeRedirectURL("../_35_login/login.jsp"));
//			return;
//		}
		MainTableServiceImpl service = new MainTableServiceImpl();
		List<MainTableBean> list = service.selectDBtoMT();
		
		request.setAttribute("act", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("ActMaintainList.jsp");
		rd.forward(request, response);
		return;
	}
}