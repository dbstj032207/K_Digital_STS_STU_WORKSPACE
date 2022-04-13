import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Student;

public class TestStudent {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx= 
				new GenericXmlApplicationContext("classpath:com/config/student.xml");

		Student stu1 = (Student)ctx.getBean("stu");	// 기본 => singleton
		Student stu2 = (Student)ctx.getBean("stu");
		System.out.println(stu1 == stu2);	// 주소비교 true
		
		Student stu3 = (Student)ctx.getBean("stu2"); // singleton
		Student stu4 = (Student)ctx.getBean("stu2");
		System.out.println(stu3 == stu4); 	// true
		
		Student stu5 = (Student)ctx.getBean("stu3"); // prototype
		Student stu6 = (Student)ctx.getBean("stu3"); 
		System.out.println(stu5 == stu6);	// false

	}

}
