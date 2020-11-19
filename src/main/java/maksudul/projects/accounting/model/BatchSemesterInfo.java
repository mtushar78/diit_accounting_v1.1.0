package maksudul.projects.accounting.model;

import org.hibernate.annotations.Columns;

import javax.persistence.*;

@Entity
@Table(name = "batchsemesterinfo")
public class BatchSemesterInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "fkProgramBatchId")
	private int fkProgramBatchId;
	@Column(name = "semesterNo")
	private int semesterNo;
	@Column(name = "startDate")
	private String startDate;
	@Column(name = "endDate")
	private String endDate;

	public BatchSemesterInfo() {
	}

	public BatchSemesterInfo(int fkProgramBatchId, int semesterNo, String startDate, String endDate) {
		this.fkProgramBatchId = fkProgramBatchId;
		this.semesterNo = semesterNo;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFkProgramBatchId() {
		return fkProgramBatchId;
	}

	public void setFkProgramBatchId(int fkProgramBatchId) {
		this.fkProgramBatchId = fkProgramBatchId;
	}

	public int getSemesterNo() {
		return semesterNo;
	}

	public void setSemesterNo(int semesterNo) {
		this.semesterNo = semesterNo;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
