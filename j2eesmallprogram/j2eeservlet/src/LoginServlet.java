import java.awt.Color;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	 protected void service(HttpServletRequest request, HttpServletResponse
	 response)
	 throws ServletException, IOException {
	
	 // 使用UTF-8的编码和解码格式。
	 request.setCharacterEncoding("UTF-8");
	 String name = request.getParameter("name");
	 String password = request.getParameter("password");
	
	 System.out.println("name:" + name);
	 System.out.println("password:" + password);
	
	 String html = null;
	 if ("admin".equals(name) && "admin".equals(password)) {
	
	 html = "<div style='color:green'>登录成功!!!</div>";
	
	 }
	
	 else
	
	 html = "<div style='color:red'>登录失败!!!</div>";
	
	 // 加上这句话，返回中文的响应。
	 response.setContentType("text/html; charset=UTF-8");
	 PrintWriter pw = response.getWriter();
	 pw.println(html);
	 }

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		String name = request.getParameter("name");
//		String password = request.getParameter("password");
//
//		System.out.println("name:" + name);
//		System.out.println("password:" + password);
//		String html = null;
//		PrintWriter pw = response.getWriter();
//		if ("admin".equals(name) && "admin".equals(password)) {
//			html = "<div style='color:green'>success</div>";
//
//		}
//
//		else {
//
//			html = "<div style = 'color:red'>fail</div>";
//
//		}
//
//		pw.println(html);
//	}

}