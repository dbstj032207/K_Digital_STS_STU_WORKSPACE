import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new 
				GenericXmlApplicationContext("classpath:com/spring/person.xml");
		

		// 기본생성자
		Person test = ctx.getBean("test", Person.class);
		System.out.println(test);
		
		// 멤버변수가 포함된 생성자
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);


	}

}
