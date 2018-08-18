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
		System.out.println("HelloServletʵ����");
	}

	public void init(ServletConfig config){
		System.out.println("init()���г�ʼ��");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response){

		
		String host = request.getHeader("host");
		System.out.println("����������ַ" + host + "\n");
		Enumeration<String> headerNames= request.getHeaderNames();
		while(headerNames.hasMoreElements()){
			String header = headerNames.nextElement();
			String value = request.getHeader(header);
			System.out.printf("%s"+"���Ǽ��"+"%s%n",header,value);
		}
		
		//�ŵ�printlnǰ�档
		response.setContentType("text/html; charset=UTF-8");

		try {
			
			//���ò�ʹ�û��档
			response.setDateHeader("Expires", 0);
			response.setHeader("Cache-Control", "no-cache");
			response.setHeader("pragma", "no-cache");
			
			response.getWriter().println("<h1>��� Servlet!</h1>");
			response.getWriter().println(new Date().toLocaleString());
			//response.setContentType("text/lol; charset=UTF-8");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
