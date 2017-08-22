package _01.hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//iki þekilde servlet tanýmlanýyor.1)extends 2)Annotation 
//aþaðýda ilk yöntem ile tanýmlanmýþtýr.
//1)HttpServlet class'ýný extend ettik
//2)doGet metodunu override ettik.

public class FirstServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.print("Hello Servlet");
		
	}

}
