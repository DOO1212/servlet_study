package com.gn.mapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class SendPostServlet
 */
@WebServlet("/loginMember")
public class SendPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		// 1. 응답 형식 지정
		response.setContentType("text/html; charset=UTF-8");
		
		// 2. 응답하고자 하는 사용자와의 연결통로 생성
		PrintWriter out = response.getWriter();
		
		// 3. HTML 구문 한줄씩 쌓기
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<meta charset='UTF-8'>");
//		out.println("<meta name='viewport' content='width=device-width, initial-scale=1.0'>");
//		out.println("<title>회원가입 결과화면</title>");
//		out.println("</head>");
//		
//		out.println("<body>");
//		out.println("<h1>" + "반가워요" + id +"님</h1>");
//		out.println("<h2>"+ "비밀번호가" + pw + "이시네요" + "</h2>");
//		out.println("</body>");
//		out.println("</html>");
		
		RequestDispatcher view = request.getRequestDispatcher("views/joinSuccess.jsp");
		
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
