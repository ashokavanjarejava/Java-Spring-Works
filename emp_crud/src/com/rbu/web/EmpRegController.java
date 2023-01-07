package com.rbu.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class EmpRegController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");
			Statement statement=con.createStatement();
			statement.executeUpdate("INSERT INTO RBU_EMP VALUES('"+name+"','"+email+"','"+address+"')");
			} catch (Exception e) {
			e.printStackTrace();
		}
			Map<String, String> map=new HashMap<String, String>();
			map.put("msg", "Hellooo.."+name+"; your data created");
		return new ModelAndView("success", map);
	}

}
