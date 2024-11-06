package in.quastech.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.quastech.bean.Student;
import in.quastech.resource.SpringConfigFile;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student std=context.getBean(Student.class);
		std.display();

	}

}
