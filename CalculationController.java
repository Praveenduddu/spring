package de.zeroco.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculationController {
	
	@RequestMapping("/add")
	public String addToNumbers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int firstNumber = Integer.parseInt(request.getParameter("first"));
		int secondNumber = Integer.parseInt(request.getParameter("second"));
		request.setAttribute("number", Service.add(firstNumber, secondNumber));
//		request.getRequestDispatcher("/square").forward(request, response);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("Display.jsp");
//		modelAndView.addObject("result", Service.add(firstNumber, secondNumber));
		return "forward:/square";
	}

	@RequestMapping("/square")
	public ModelAndView squareTheNumber(HttpServletRequest request, HttpServletResponse response) {
		int number = (int) request.getAttribute("number");
		ModelAndView modelAndView = new ModelAndView("Display.jsp");
		modelAndView.addObject("result", (number * number));
		return modelAndView;
	}
	
}
