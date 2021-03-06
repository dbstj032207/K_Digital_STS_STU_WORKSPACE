import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new 
				GenericXmlApplicationContext("classpath:com/spring/person.xml");

		// 기본생성자
		Person test = ctx.getBean("test", Person.class);
		System.out.println(test);
		System.out.println(test.getInfo());
		
		// String 멤버변수가 1개 포함된 생성자
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		System.out.println(p1.getInfo());
		
		// String 멤버변수가 2개 포함된 생성자
		Person p2 = ctx.getBean("xxx2", Person.class);
		System.out.println(p2);
		System.out.println(p2.getInfo());
		
		// String 멤버변수와 int 멤버변수가 포함된 생성자
		Person p3 = ctx.getBean("xxx3", Person.class);
		System.out.println(p3);
		System.out.println(p3.getInfo());

	}

}
