package com.mikey_yun.servlet.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request,
						HttpServletResponse response)
							throws IOException {
		
//		Set the information about the result.
//		Response Header
//		character set : utf-8
		response.setCharacterEncoding("utf-8");
//		Data type
//		MIME
//		text/plain : just character
		response.setContentType("text/plain");
		
//		The result
//		Response Body
		PrintWriter out = response.getWriter();
		
		out.println("Here's the example of URL Mapping!");
		
//		Taking the information of current date and time
		Date now = new Date();
		out.println(now);
		
//		want to express by character the shape of current date and time
//		2024년 07월 15일 17시 44분 13
	    SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
	    String dateTimeString = formatter.format(now);
	    
	    out.println(dateTimeString);
	}
}