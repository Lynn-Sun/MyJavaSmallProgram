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
		System.out.println("LoginServlet����������321");
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

		// ʹ��UTF-8�ı���ͽ����ʽ��
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println("name:" + name);
		System.out.println("password:" + password);

		//String html = null;
		if ("admin".equals(name) && "admin".equals(password)) {

			//����������ת���������ַ���䡣
			//request.getRequestDispatcher("success.html").forward(request, response);
			response.sendRedirect("success.html");
		}

		else
			response.sendRedirect("fail.html");		
	}

}