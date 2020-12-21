package maksudul.projects.accounting.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Immutable
@Table(name = "vwstudentinformation")
public class VwStudentInformation implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private Integer fkPersonId;
	@Id
	private String studentId;
	private Float ssccgpa;
	private Float hsccgpa;
	private int cgpaSchemeId;
	private Integer fkProgramBatchId;
	private Integer fkProgramId;
	private String programName;
	private String batchno;
	private Integer activationStatus;
	private String admissionDate;
	private Integer startingSemesterNo;
	private String name;
	private String fathersName;
	private String mothersName;
	private String dateOfBirth;
	private String contactNo;
	private String nid;
	private String bloodGroup;

	public VwStudentInformation() {
	}

	public VwStudentInformation(Integer id, Integer fkPersonId, String studentId, Float ssccgpa, Float hsccgpa, int cgpaSchemeId, Integer fkProgramBatchId, Integer fkProgramId, String programName, String batchno, Integer activationStatus, String admissionDate, Integer startingSemesterNo, String name, String fathersName, String mothersName, String dateOfBirth, String contactNo, String nid, String bloodGroup) {
		this.id = id;
		this.fkPersonId = fkPersonId;
		this.studentId = studentId;
		this.ssccgpa = ssccgpa;
		this.hsccgpa = hsccgpa;
		this.cgpaSchemeId = cgpaSchemeId;
		this.fkProgramBatchId = fkProgramBatchId;
		this.fkProgramId = fkProgramId;
		this.programName = programName;
		this.batchno = batchno;
		this.activationStatus = activationStatus;
		this.admissionDate = admissionDate;
		this.startingSemesterNo = startingSemesterNo;
		this.name = name;
		this.fathersName = fathersName;
		this.mothersName = mothersName;
		this.dateOfBirth = dateOfBirth;
		this.contactNo = contactNo;
		this.nid = nid;
		this.bloodGroup = bloodGroup;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFkPersonId() {
		return fkPersonId;
	}

	public void setFkPersonId(Integer fkPersonId) {
		this.fkPersonId = fkPersonId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Float getSsccgpa() {
		return ssccgpa;
	}

	public void setSsccgpa(Float ssccgpa) {
		this.ssccgpa = ssccgpa;
	}

	public Float getHsccgpa() {
		return hsccgpa;
	}

	public void setHsccgpa(Float hsccgpa) {
		this.hsccgpa = hsccgpa;
	}

	public int getCgpaSchemeId() {
		return cgpaSchemeId;
	}

	public void setCgpaSchemeId(int cgpaSchemeId) {
		this.cgpaSchemeId = cgpaSchemeId;
	}

	public Integer getFkProgramBatchId() {
		return fkProgramBatchId;
	}

	public void setFkProgramBatchId(Integer fkProgramBatchId) {
		this.fkProgramBatchId = fkProgramBatchId;
	}

	public Integer getFkProgramId() {
		return fkProgramId;
	}

	public void setFkProgramId(Integer fkProgramId) {
		this.fkProgramId = fkProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public Integer getActivationStatus() {
		return activationStatus;
	}

	public void setActivationStatus(Integer activationStatus) {
		this.activationStatus = activationStatus;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Integer getStartingSemesterNo() {
		return startingSemesterNo;
	}

	public void setStartingSemesterNo(Integer startingSemesterNo) {
		this.startingSemesterNo = startingSemesterNo;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNid() {
		return nid;
	}

	public void setNid(String nid) {
		this.nid = nid;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	@Override
	public String toString() {
		return "VwStudentInformation{" +
				"id=" + id +
				", fkPersonId=" + fkPersonId +
				", studentId='" + studentId + '\'' +
				", ssccgpa=" + ssccgpa +
				", hsccgpa=" + hsccgpa +
				", cgpaSchemeId=" + cgpaSchemeId +
				", fkProgramBatchId=" + fkProgramBatchId +
				", fkProgramId=" + fkProgramId +
				", programName='" + programName + '\'' +
				", batchno='" + batchno + '\'' +
				", activationStatus=" + activationStatus +
				", admissionDate='" + admissionDate + '\'' +
				", startingSemesterNo=" + startingSemesterNo +
				", name='" + name + '\'' +
				", fathersName='" + fathersName + '\'' +
				", mothersName='" + mothersName + '\'' +
				", dateOfBirth='" + dateOfBirth + '\'' +
				", contactNo='" + contactNo + '\'' +
				", nid='" + nid + '\'' +
				", bloodGroup='" + bloodGroup + '\'' +
				'}';
	}
}
