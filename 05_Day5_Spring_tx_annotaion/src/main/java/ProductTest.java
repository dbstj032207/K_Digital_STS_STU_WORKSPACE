import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.ProductDTO;
import com.service.ProductService;

public class ProductTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new
				ClassPathXmlApplicationContext("dept.xml");
		
		ProductService service = ctx.getBean("deptService", ProductService.class);
		List<ProductDTO> list = service.selectProduct();
		for (ProductDTO dto : list) {
			System.out.println(dto);
		}

	}

}
