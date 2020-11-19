package maksudul.projects.accounting.model;

import javax.persistence.*;

@Entity
@Table(name = "studenttransactiondetails")
public class StudentTransactionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@ManyToOne
	@JoinColumn(name = "fkMasterId")
	private StudentTransactionMaster studentTransactionMaster;

	private long fkRefPayable;
	private int fkPaymentHeadId;
	private float paidAmount;
	private float discountedAmount = 0;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public StudentTransactionMaster getStudentTransactionMaster() {
		return studentTransactionMaster;
	}

	public StudentTransactionDetails() {
	}

	public StudentTransactionDetails(StudentTransactionMaster studentTransactionMaster, long fkRefPayable, int fkPaymentHeadId, float paidAmount, float discountedAmount) {
		this.studentTransactionMaster = studentTransactionMaster;
		this.fkRefPayable = fkRefPayable;
		this.fkPaymentHeadId = fkPaymentHeadId;
		this.paidAmount = paidAmount;
		this.discountedAmount = discountedAmount;
	}

	public void setStudentTransactionMaster(StudentTransactionMaster studentTransactionMaster) {
		this.studentTransactionMaster = studentTransactionMaster;
	}

	public long getFkRefPayable() {
		return fkRefPayable;
	}

	public void setFkRefPayable(long fkRefPayable) {
		this.fkRefPayable = fkRefPayable;
	}

	public int getFkPaymentHeadId() {
		return fkPaymentHeadId;
	}

	public void setFkPaymentHeadId(int fkPaymentHeadId) {
		this.fkPaymentHeadId = fkPaymentHeadId;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public float getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(float discountedAmount) {
		this.discountedAmount = discountedAmount;
	}
}
