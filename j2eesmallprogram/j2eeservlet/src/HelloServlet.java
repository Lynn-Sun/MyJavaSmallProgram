import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

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

		
		String host = request.getHeader("host");
		System.out.println("这是主机地址" + host + "\n");
		Enumeration<String> headerNames= request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			String value = request.getHeader(header);
			System.out.printf("%s"+"这是间隔"+"%s%n",header,value);
		}
		
		//放到println前面。
		response.setContentType("text/html; charset=UTF-8");

		try {
			
			//设置不使用缓存。
			response.setDateHeader("Expires", 0);
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("pragma", "no-cache");
			
			response.getWriter().println("<h1>你好 Servlet!</h1>");
			response.getWriter().println(new Date().toLocaleString());
			//response.setContentType("text/lol; charset=UTF-8");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
