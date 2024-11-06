package in.quastech.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.quastech.bean.Address;
import in.quastech.bean.Student;
import in.quastech.bean.Subject;

@Configuration
public class SpringConfigFile {
	
	@Bean
	Subject subObj() {
		Subject sub=new Subject();
		List<String> list=new ArrayList();
		list.add("Electronics");
		list.add("Java");
		list.add("Mechanical");
		sub.setSubjects(list);
		return sub;
	}
	
	@Bean
	Address addObj(){
		Address add=new Address();
		add.setName("Kurla");
		add.setPin(421306);
		return add;
	}
	
		
		
	
	@Bean
	Student stdObj() {
		Student std=new Student();
		std.setStdId(101);
		std.setStdname("Yuvraj");
//		std.setAdd(addObj());
//		std.setSubjects(subObj());
		return std;
		
	}
	
	

}
