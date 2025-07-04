package com.gn.controller;

import java.io.IOException;
import java.net.URLEncoder;

import com.gn.dto.Attach;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FileDownloadServlet
 */
@WebServlet("/FileDownload")
public class FileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDownloadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int attachNo = Integer.parseInt(request.getParameter("no"));
		Attach attach = service.selectAttachByBoardNo(boardNo);
		
		// 4. 다운로드용 응답 헤더 설정
		response.setContentType("application/octet-stream");
		response.setContentLength((int)file.length());
		
		// 5. 파일명 인코딩
		String encodeName = URLEncoder.encode(attach.getOriName(),"utf-8").replaceAll("//+", "%20");
		response.setHeader("Content-Disposition", "attachment; filename=\""+encodedName);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
