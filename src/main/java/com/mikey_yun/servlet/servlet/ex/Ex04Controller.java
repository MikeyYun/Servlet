package com.mikey_yun.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex04")
public class Ex04Controller extends HttpServlet{
	
	@Override	
	public void doGet (HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		response.setContentType("application/json");
		
		PrintWriter out = response.getWriter();
		
		// receive a name and birth
		// put together the name and birth of organized HTML
		
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday"); // 20240812
		
		String birthYear = birthday.substring(0,4);
		
		int year = Integer.parseInt(birthYear);
		int age = 2024 - year;
//		{"name" : "엄시윤", "age" : "22"}
//		out.println("{\"name\ ":\"" + name + "\",\"age\":" + age + "}");
		
//		out.println("<html>\n"
//				+ "		<head><title>Information</title></head>\n"
//				+ "			<body>\n"
//				+ "				<h3>Name : " + name + "</h3>\n"
//				+ "				<h3>Age : " + age + "</h3>\n"
//				+ "			</body>\n"
//				+ "		</html>");
	}
}