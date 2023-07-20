package de.zeroco.dependencyinjection;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/servlet")
public class Filter implements javax.servlet.Filter {

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		if (request.getParameter("username").equals("praveen")) {
			chain.doFilter(request, response);
		} else {
			request.getRequestDispatcher("/Welcome.jsp").include(request, response);
			response.getWriter().print("Invalid user name");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
