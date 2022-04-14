import org.springframework.context.support.GenericXmlApplicationContext;

import com.dao.DeptDAO;
import com.service.DeptService;

public class DeptMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:com/spring/config.xml");
		
		DeptService service = ctx.getBean("deptService", DeptService.class);
		
		System.out.println(service);

	}

}
