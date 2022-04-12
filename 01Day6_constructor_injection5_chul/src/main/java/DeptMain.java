import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;


public class DeptMain {

	public static void main(String[] args) {
		
		// 1. 일반 java 코드
		DeptDAO d = new DeptDAO();
		DeptService s = new DeptService(d);
		System.out.println(s.getList());

		System.out.println("===================================");
		
		// 2. xml 사용
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/spring/config.xml");
		
		System.out.println("===================================");
		
		DeptService s1 = ctx.getBean("deptService", DeptService.class);
		System.out.println(s1.getList());
		
	}

}
