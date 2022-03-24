package learning.springjdbc.springjdbc.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private Integer id;
	private String name;
	private String location;
	private Date birthDate;
	
	public Person() {
		
	}
	public Person(Integer id, String name, String location, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date date) {
		this.birthDate = date;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	
	
}
