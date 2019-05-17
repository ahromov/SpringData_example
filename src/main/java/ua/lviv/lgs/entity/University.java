package ua.lviv.lgs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String name;

	@Column
	private String acreditation;

	@Column
	private Integer instCount;

	@Column
	private int studentsCount;

	@Column
	private String address;

	public University() {
	}

	public University(String name, String acreditation, Integer instCount, int studentsCount, String address) {
		this.name = name;
		this.acreditation = acreditation;
		this.instCount = instCount;
		this.studentsCount = studentsCount;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAcreditation() {
		return acreditation;
	}

	public void setAcreditation(String acreditation) {
		this.acreditation = acreditation;
	}

	public Integer getInstCount() {
		return instCount;
	}

	public void setInstCount(Integer instCount) {
		this.instCount = instCount;
	}

	public int getStudentsCount() {
		return studentsCount;
	}

	public void setStudentsCount(int studentsCount) {
		this.studentsCount = studentsCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [name=" + name + ", acreditation=" + acreditation + ", instCount=" + instCount
				+ ", studentsCount=" + studentsCount + ", address=" + address + "]";
	}

}
