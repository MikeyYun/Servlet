package com.mikey_yun.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test01")
public class Test01Controller extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html><head><h1>[단독] 고양이가 야옹해</h1>\n"
				+ "<h5>기사 입력시간 : 2021/03/27 06:07:04</h5>\n"
				+ "<hr>\n"
				+ "<h5>끝</h5></head></html>");
	}
}
