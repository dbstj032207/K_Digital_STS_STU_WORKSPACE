import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		// 1. 기존방식
		Person p = new Person();
		String m = p.getInfo();
		System.out.println(m);
		
		//src/main/resources폴더및 person.xml <bean id="xxx" class="com.spring.Person"> </bean>
		//마우스오른쪽  spring bean configuration.xml
		
		System.out.println("====================");
		
		// 2. xml에서 객체를 받아오는 방식
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("file:\\c:\\upload\\person.xml");
		
		Person p1 = ctx.getBean("xxx", Person.class);
		System.out.println(p1);
		System.out.println(p1.getInfo());
		
		Person p2 = (Person)ctx.getBean("xxx");
		System.out.println(p2);
		System.out.println(p2.getInfo());

	}

}
