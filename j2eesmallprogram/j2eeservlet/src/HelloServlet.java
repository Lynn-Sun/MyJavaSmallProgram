import java.io.IOException;
import java.util.Date;

import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	public HelloServlet() {
		System.out.println("HelloServlet实例化");
	}
	
	public void init(ServletConfig config){
		System.out.println("init()进行初始化");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response){
		
		try {
			response.getWriter().println("<h1>Hello Servlet!</h1>");
			response.getWriter().println(new Date().toLocaleString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
