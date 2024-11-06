package in.quastech.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private int stdId;
	private String stdname;
	@Autowired
	private Address add;
	@Autowired
	private Subject subjects;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
//	public Address getAdd() {
//		return add;
//	}
//	public void setAdd(Address add) {
//		this.add = add;
//	}
//	public Subject getSubjects() {
//		return subjects;
//	}
//	public void setSubjects(Subject subjects) {
//		this.subjects = subjects;
//	}
	
	public void display() {
		System.out.println("Id:"+stdId);
		System.out.println("Name:"+stdname);
		System.out.println("Address:"+add);
		System.out.println("Subjects:"+subjects);
	}

}
