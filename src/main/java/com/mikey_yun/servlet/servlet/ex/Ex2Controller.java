package com.mikey_yun.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex2")
public class Ex2Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 1~10 까지의 합 구하고 이름 html을 통해서 결과를 표현한다.
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			System.out.println(i);
		}
		out.println("<html>"
				+ "<head><title>합계</title></head>"
				+ "<body> "
					+ "<h2>"+ sum +"</h2>"
				+ "</body>"
				+ "</html>");
	}
	

}
