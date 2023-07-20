package de.zeroco.dependencyinjection;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filters
 */
@WebFilter("/servlet")
public class Filters implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if (request.getParameter("password").equals("Praveen12")) {
			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("/Welcome.jsp").include(request, response);
			response.getWriter().print("Invalid Password!");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
