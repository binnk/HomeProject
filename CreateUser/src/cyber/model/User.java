package cyber.model;

public class User {
	private String username;
	private String password;
	private String fullName;
	private Integer age;
	
	/*-===Constructor===-*/
	
	public User() {
			
	}
	
	public User(String username, String password, String fullName, int age) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.age = age;
	}

	/*---=Getter/Setter=---*/
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
}
