import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		DeptService service = new DeptService(dao);
		
		System.out.println(service.getList());
		
		System.out.println("===============================");
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		
		DeptService service2 = ctx.getBean("deptService", DeptService.class);
		
		System.out.println(service2.getList());
	}

}
