package _02.expression.language.dot;

import java.io.IOException;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/expressionBracketServlet")
public class ExpressionBracketServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Map<String, String> map=new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		List<String> myList=new ArrayList<String>();
		myList.add("eleman1");
		myList.add("eleman2");
		myList.add("eleman3");
		myList.add("eleman4");
		req.setAttribute("myMap", map);
		req.setAttribute("myList", myList);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("expressionLanguageBracket.jsp");
		dispatcher.forward(req, resp);
		
	}
}