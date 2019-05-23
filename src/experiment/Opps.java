package experiment;


interface Mutable{
	
	String getName();
	int getAge();
	String getUserId();
	void setName(String name);
	void setAge(int age);
	void setUserId(String userId);
	
}

class People implements Mutable{
	
	private int age;
	private String userId;
	private String name;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String getUserId() {
		return this.userId;
	}
	
	@Override
	public int getAge() {
		return this.age;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public static void getDetails(People peoples[]) {
		System.out.printf("%-15s\t%s\t%s\n\n","Name","Age","userId");
		for(People people : peoples) {
			System.out.printf("%-15s\t%03d\t%s\n",
				people.getName(),
				people.getAge(),
				people.getUserId()
					);
		}
	}
	
}

class Teacher extends People{}

class Student extends People{}

public class Opps {
	
	public static void main(String args[]) {
	
		String names[] = {"Name1","Name2","Name3"};
		int ages[] = {25,24,25};
		String uids[] = {"15BCS1148","5888325","5240895"};
		Student students[] = new Student[3];
		
		
		for(int idx=0 ; idx<3 ; idx++) {
			students[idx] = new Student();
			students[idx].setName(names[idx]);
			students[idx].setAge(ages[idx]);
			students[idx].setUserId(uids[idx]);
		}
		
		Student.getDetails(students);
	}

}
