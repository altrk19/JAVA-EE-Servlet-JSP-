package _02.ajax.json.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import _02.ajax.json.model.Person;
import _02.ajax.json.model.ResultClass;
@WebServlet("/person.servlet")
public class PersonServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		BufferedReader br=new BufferedReader(new InputStreamReader(req.getInputStream()));
		
		StringBuffer jsonData=new StringBuffer();
		String line="";
		while((line=br.readLine())!=null) {
			jsonData.append(line);                   //Datayý aldýk
		}
		
		Gson gson=new Gson();
		Person person=gson.fromJson(jsonData.toString(), Person.class);

		System.out.println(person);
		
	
		
		//
		ResultClass result=new ResultClass();
		result.setVarResult1("Basarili: "+person.getName());
		result.setVarResult2("200");
		
		String resultJSON=gson.toJson(result);
		System.out.println(resultJSON);
		
		PrintWriter pw=resp.getWriter();         //ekrana birþey yazdýrmazsak ajax'ýn success metodu çalýþmýyor
		pw.write(resultJSON);
		pw.close();
		
	}
	
}
