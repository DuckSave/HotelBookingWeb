package com.poly.controller;

import jakarta.persistence.EntityManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.poly.Entity.Account;
import com.poly.JPAConfig.JpaConfig;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		EntityManager em = JpaConfig.getEntityManager();
//
//		try {
//			Account result = em.find(Account.class, 1);
//		    if (result != null) {
//		        System.out.println("Kết nối thành công và tìm thấy bản ghi.");
//		    } else {
//		        System.out.println("Kết nối thành công nhưng không tìm thấy bản ghi.");
//		    }
//		} catch (Exception e) {
//		    e.printStackTrace();
//		    System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
//		} finally {
//		    em.close();
//		}
//		response.getWriter().println("<h1>Hello world</h1>");
		request.getRequestDispatcher("/views/index.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
