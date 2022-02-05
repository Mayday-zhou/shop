package com.lmonkey.servlet.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lmonkey.entity.LMONKEY_PRODUCT;
import com.lmonkey.service.LMONKEY_PRODUCTDao;

/**
 * Servlet implementation class ToProductUpdate
 */
@WebServlet("/manage/admin_toproductupdate")
public class ToProductUpdate extends HttpServlet {

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		int id = Integer.parseInt(request.getParameter("id"));
		//通过id从数据库里查找
		
		LMONKEY_PRODUCT product = LMONKEY_PRODUCTDao.selectByID(id);
		
		request.setAttribute("product", product);
		request.getRequestDispatcher("/manger/admin_productmodify.jsp").forward(request, response);
		
		
	
	}
}
