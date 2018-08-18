import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		//request.setCharacterEncoding("UTF-8");
		// ʹ��UTF-8�ı���ͽ����ʽ��
		request.setCharacterEncoding("UTF-8");
		System.out.println("��õ�ֵ����:" + request.getParameter("name"));
		String[] hobits = request.getParameterValues("hobits");
		List<String> list = Arrays.asList(hobits);
		System.out.println("��ȡ��ֵ������" + list);
		
		
		//ͨ�� getParameterMap �������еĲ���
		Map<String, String[]> Parameter = request.getParameterMap();
		Set<String> paramNames = Parameter.keySet();
		for(String p:paramNames){
			String[] value = Parameter.get(p);
			//System.out.println("����Map��key��" + p);
			System.out.println("��ʱMap��ֵ��" + Arrays.asList(value));
		}
		
		
	}
	
}
