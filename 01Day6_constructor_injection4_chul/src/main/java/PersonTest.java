import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Cat;
import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		// 1. 일반 java코드
		Cat c = new Cat("나비", 10);
		Person p = new Person("홍길동", 20, c);
		System.out.println(p);
		
		System.out.println("==========================================");
		
		// 2. xml 사용
		GenericXmlApplicationContext ctx = new
				GenericXmlApplicationContext("classpath:com/spring/person.xml");
		  
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		
		Cat yyy = p1.getCat();
		System.out.println(yyy);
		
	}
}
