package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "studentinfos")
public class StudentInfos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "fkPersonId")
	private PersonInfos personInfo;

	@Column(name = "studentId")
	private String studentId;

	@Column(name = "ssccgpa")
	private float ssccgpa;

	@Column(name = "hsccgpa")
	private float hsccgpa;

	@Column(name = "fkProgramBatchId")
	private int fkProgramBatchId;

	@Column(name = "activationStatus")
	private int activationStatus;

	@Column(name = "admissionDate")
	private String admissionDate;

	@Column(name = "startingSemesterNo")
	private int startingSemesterNo;

	@Column(name = "efectedFrom")
	private String efectedFrom;

	public StudentInfos() {
	}

	public StudentInfos(@NotNull PersonInfos personInfo, String studentId, float ssccgpa, float hsccgpa, int fkProgramBatchId, int activationStatus, String admissionDate, int startingSemesterNo, String efectedFrom) {
		this.personInfo = personInfo;
		this.studentId = studentId;
		this.ssccgpa = ssccgpa;
		this.hsccgpa = hsccgpa;
		this.fkProgramBatchId = fkProgramBatchId;
		this.activationStatus = activationStatus;
		this.admissionDate = admissionDate;
		this.startingSemesterNo = startingSemesterNo;
		this.efectedFrom = efectedFrom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PersonInfos getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfos personInfo) {
		this.personInfo = personInfo;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public float getSsccgpa() {
		return ssccgpa;
	}

	public void setSsccgpa(float ssccgpa) {
		this.ssccgpa = ssccgpa;
	}

	public float getHsccgpa() {
		return hsccgpa;
	}

	public void setHsccgpa(float hsccgpa) {
		this.hsccgpa = hsccgpa;
	}

	public int getFkProgramBatchId() {
		return fkProgramBatchId;
	}

	public void setFkProgramBatchId(int fkProgramBatchId) {
		this.fkProgramBatchId = fkProgramBatchId;
	}

	public int getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(int activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getStartingSemesterNo() {
		return startingSemesterNo;
	}

	public void setStartingSemesterNo(int startingSemesterNo) {
		this.startingSemesterNo = startingSemesterNo;
	}

	public String getEfectedFrom() {
		return efectedFrom;
	}

	public void setEfectedFrom(String efectedFrom) {
		this.efectedFrom = efectedFrom;
	}

	@Override
	public String toString() {
		return "StudentInfos [id=" + id + ", personInfo=" + personInfo + ", studentId=" + studentId + ", ssccgpa="
				+ ssccgpa + ", hsccgpa=" + hsccgpa + ", fkProgramBatchId=" + fkProgramBatchId + ", activationStatus="
				+ activationStatus + ", admissionDate=" + admissionDate + ", startingSemesterNo=" + startingSemesterNo
				+ "]";
	}

}
