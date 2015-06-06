package action;

import java.util.List;

public class User {
	private String name;
	private String password;
	private double salary;
	private boolean sex;
	private List<String> favs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getFavs() {
		return favs;
	}
	public void setFavs(List<String> favs) {
		this.favs = favs;
	}
	public boolean getSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}




}
