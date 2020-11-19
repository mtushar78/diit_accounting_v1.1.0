package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "personinfos")
public class PersonInfos {

	// Attributes
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "fathersName")
	private String fathersName;

	@Column(name = "mothersName")
	private String mothersName;

	@Column(name = "dateOfBirth")
	private String dateOfBirth;

	@Column(name = "nid")
	private String nid;

	@Column(name = "picture")
	private String picture;

	@Column(name = "bloodGroup")
	private String bloodGroup = null;

	@Column(name = "contactNo")
	private String contactNo;

	@OneToMany(mappedBy = "personInfo", fetch = FetchType.EAGER)
	private List<StudentInfos> studentInfos;

	public PersonInfos() {
	}

	public PersonInfos(String name, String fathersName, String mothersName, String dateOfBirth, String nid, String picture, String bloodGroup, String contactNo, List<StudentInfos> studentInfos) {
		this.name = name;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.dateOfBirth = dateOfBirth;
		this.nid = nid;
		this.picture = picture;
		this.bloodGroup = bloodGroup;
		this.contactNo = contactNo;
		this.studentInfos = studentInfos;
	}

	// Methods
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

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public List<StudentInfos> getStudentInfos() {
		return studentInfos;
	}

	public void setStudentInfos(List<StudentInfos> studentInfos) {
		this.studentInfos = studentInfos;
	}

}
