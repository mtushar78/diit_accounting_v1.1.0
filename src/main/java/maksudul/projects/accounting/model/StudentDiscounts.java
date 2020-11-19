package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "studentdiscounts")
public class StudentDiscounts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fkStudentId;
	private Integer fkPaymentHeadId;
	private Float discountAmount;
	private Integer discountTimes;
	private Integer fromSemester;
	private String fromMonths;
	private String toMonths;
	private Integer status = 1;

	public StudentDiscounts() {
	}

	public StudentDiscounts(String fkStudentId, Integer fkPaymentHeadId, Float discountAmount, Integer discountTimes, Integer fromSemester, String fromMonths, String toMonths, Integer status) {
		this.fkStudentId = fkStudentId;
		this.fkPaymentHeadId = fkPaymentHeadId;
		this.discountAmount = discountAmount;
		this.discountTimes = discountTimes;
		this.fromSemester = fromSemester;
		this.fromMonths = fromMonths;
		this.toMonths = toMonths;
		this.status = status;
	}

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

	public Integer getFkPaymentHeadId() {
		return fkPaymentHeadId;
	}

	public void setFkPaymentHeadId(Integer fkPaymentHeadId) {
		this.fkPaymentHeadId = fkPaymentHeadId;
	}

	public Float getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Float discountAmount) {
		this.discountAmount = discountAmount;
	}

	public Integer getDiscountTimes() {
		return discountTimes;
	}

	public void setDiscountTimes(Integer discountTimes) {
		this.discountTimes = discountTimes;
	}

	public Integer getFromSemester() {
		return fromSemester;
	}

	public void setFromSemester(Integer fromSemester) {
		this.fromSemester = fromSemester;
	}

	public String getFromMonths() {
		return fromMonths;
	}

	public void setFromMonths(String fromMonths) {
		this.fromMonths = fromMonths;
	}

	public String getToMonths() {
		return toMonths;
	}

	public void setToMonths(String toMonths) {
		this.toMonths = toMonths;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
