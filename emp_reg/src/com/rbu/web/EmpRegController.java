package com.rbu.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmpRegController {

	@RequestMapping(value = "/emp.rbu",method = RequestMethod.POST)
	public ModelAndView reg(@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("address") String address) throws Exception {
	
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
