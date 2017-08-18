package listener;

public class UserDetail {
	
	private String name;
	private String age;

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetail [name=" + name + ", age=" + age + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("user Details :"+ name + age );
	}

}
