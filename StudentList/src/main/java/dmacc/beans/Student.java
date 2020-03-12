package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String major;
	private double GPA;
	@Autowired
	private Section section;
	
	public Student() {
		super();
		this.GPA = 4.0;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(String name, String major, double gPA) {
		super();
		this.name = name;
		this.major = major;
		GPA = gPA;
	}
	public Student(int id, String name, String major, double gPA) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		GPA = gPA;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}
	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	/**
	 * @return the gPA
	 */
	public double getGPA() {
		return GPA;
	}
	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	
	/**
	 * @return the section
	 */
	public Section getSection() {
		return section;
	}
	/**
	 * @param section the section to set
	 */
	public void setSection(Section section) {
		this.section = section;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", major=" + major + ", GPA=" + GPA + ", section=" + section
				+ "]";
	}

	
	

}
