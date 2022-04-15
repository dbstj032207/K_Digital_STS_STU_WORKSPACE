import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.OrderDTO;
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
		
		List<OrderDTO> list2 = service.selectOrder();
		for (OrderDTO dto : list2) {
			System.out.println(dto);
		}
		
		System.out.println("p01 상품 5개 주문합니다");
		try {
			service.addOrder("p01", 5);
		} catch (Exception e) {
			System.out.println("에러가 발생하여 롤백처리.");
		}
		
		List<OrderDTO> list3 = service.selectOrder();
		for (OrderDTO dto : list3) {
			System.out.println(dto);
		}
		
	}

}
