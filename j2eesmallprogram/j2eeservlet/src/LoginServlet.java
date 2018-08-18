import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.PortableInterceptor.SUCCESSFUL;

/**
 * @author Administrator
 *
 */
public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		System.out.println("LoginServlet方法被调用321");
	}

	public void init(ServletConfig config) {
		System.out.println("init(ServletConfig)");
	}

	public void destroy() {
		System.out.println("destroy()");

	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		//浏览器发出的资源名
		System.out.println(request.getRequestURI());
		
		//协议名、主机号、端口（如果有）、浏览器发出的资源名
		System.out.println(request.getRequestURL());
		
		System.out.println("请求行中的参数部分: " + request.getQueryString());
        System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
        System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
        System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
        System.out.println("服务器的IP地址: " + request.getLocalAddr());
        System.out.println("服务器的主机名: " + request.getLocalName());
        System.out.println("得到客户机请求方式: " + request.getMethod());

		// 使用UTF-8的编码和解码格式。
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println("name:" + name);
		System.out.println("password:" + password);

		// String html = null;
		if ("admin".equals(name) && "admin".equals(password)) {

			// 服务器端跳转，浏览器地址不变。
			// request.getRequestDispatcher("success.html").forward(request,
			// response);
			
			//客户端的永久性跳转
			response.setStatus(301);
			response.setHeader("Location","success.html");
			//response.sendRedirect("success.html");
		}

		else
			response.sendRedirect("fail.html");
	}

}