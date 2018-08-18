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
		// 使用UTF-8的编码和解码格式。
		request.setCharacterEncoding("UTF-8");
		System.out.println("获得单值参数:" + request.getParameter("name"));
		String[] hobits = request.getParameterValues("hobits");
		List<String> list = Arrays.asList(hobits);
		System.out.println("获取多值参数：" + list);
		
		
		//通过 getParameterMap 遍历所有的参数
		Map<String, String[]> Parameter = request.getParameterMap();
		Set<String> paramNames = Parameter.keySet();
		for(String p:paramNames){
			String[] value = Parameter.get(p);
			//System.out.println("这是Map的key：" + p);
			System.out.println("这时Map的值：" + Arrays.asList(value));
		}
		
		
	}
	
}
