package dto;

import javax.persistence.*;


@Entity
public class Department {
	@Id
	private int id;
	private String name;
	private String loc;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", loc=" + loc + "]";
	}
	
	
	

}
