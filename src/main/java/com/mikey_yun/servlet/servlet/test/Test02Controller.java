package com.mikey_yun.servlet.servlet.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test02")
public class Test02Controller extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println(""
				+ "<html>\n"
				+ "		<head><title>리스트</title></head>\n"
				+ "			<body>\n"
				+ "				<ul>\n");
				
		for (int i = 1; i <= 30; i++) {
				out.println("<li>" +i+"번 리스트</li>\n");
		}
				
				out.println("				</ul>\n"
				+ "			</body>\n"
				+ "		</html>");
	}
}
