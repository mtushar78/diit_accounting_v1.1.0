package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "studentpayablemaster")
public class StudentPayableMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	private String fkStudentId;
	private String payMonth;
	@Nullable
	@Column(name = "fkPaymentHead")
	private Integer fkPaymentHead;
	private Float amount;

	@ColumnDefault("1")
	private int status = 1;
	@ColumnDefault("0")
	private int createdBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFkStudentId() {
		return fkStudentId;
	}
	public void setFkStudentId(String fkStudentId) {
		this.fkStudentId = fkStudentId;
	}
	public String getPayMonth() {
		return payMonth;
	}
	public void setPayMonth(String payMonth) {
		this.payMonth = payMonth;
	}
	public Integer getFkPaymentHead() {
		return fkPaymentHead;
	}
	public void setFkPaymentHead(Integer fkPaymentHead) {
		this.fkPaymentHead = fkPaymentHead;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "StudentPayableMaster [id=" + id + ", fkStudentId=" + fkStudentId + ", payMonth=" + payMonth
				+ ", fkPaymentHead=" + fkPaymentHead + ", amount=" + amount + ", status=" + status + ", createdBy="
				+ createdBy + "]";
	}

	public StudentPayableMaster() {
	}

	public StudentPayableMaster(String fkStudentId, String payMonth, @Nullable Integer fkPaymentHead, Float amount, int status, int createdBy) {
		this.fkStudentId = fkStudentId;
		this.payMonth = payMonth;
		this.fkPaymentHead = fkPaymentHead;
		this.amount = amount;
		this.status = status;
		this.createdBy = createdBy;
	}
}
