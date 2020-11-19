package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "studenttransactionmaster")
public class StudentTransactionMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	private String fkStudentId;
	private String paidDate;
	private Integer collectedBy;
	private String entryIp;
	private Integer status = 0;
	
	@OneToMany(mappedBy = "studentTransactionMaster", fetch = FetchType.EAGER)
	private List<StudentTransactionDetails> transactionDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFkStudentId() {
		return fkStudentId;
	}

	public void setFkStudentId(String fkStudentId) {
		this.fkStudentId = fkStudentId;
	}

	public String getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(String paidDate) {
		this.paidDate = paidDate;
	}

	public Integer getCollectedBy() {
		return collectedBy;
	}

	public void setCollectedBy(Integer collectedBy) {
		this.collectedBy = collectedBy;
	}

	public String getEntryIp() {
		return entryIp;
	}

	public void setEntryIp(String entryIp) {
		this.entryIp = entryIp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<StudentTransactionDetails> getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(List<StudentTransactionDetails> transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	public StudentTransactionMaster() {
	}

	public StudentTransactionMaster(String fkStudentId, String paidDate, Integer collectedBy, String entryIp, Integer status, List<StudentTransactionDetails> transactionDetails) {
		this.fkStudentId = fkStudentId;
		this.paidDate = paidDate;
		this.collectedBy = collectedBy;
		this.entryIp = entryIp;
		this.status = status;
		this.transactionDetails = transactionDetails;
	}
}
