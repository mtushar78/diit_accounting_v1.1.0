package maksudul.projects.accounting.model;

import java.io.Serializable;

public class VwStudentCollection implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fkStudentId;

	private String paidDate;
	private Integer collectedBy;
	private Long fkRefPayable;
	private Float paidAmount;
	private Float discountedAmount;

	private Integer payableHead;
	private String headName;
	private Float payableAmount;

	public VwStudentCollection() {
	}

	public VwStudentCollection(String fkStudentId, String paidDate, Integer collectedBy, Long fkRefPayable, Float paidAmount, Float discountedAmount, Integer payableHead, String headName, Float payableAmount) {
		this.fkStudentId = fkStudentId;
		this.paidDate = paidDate;
		this.collectedBy = collectedBy;
		this.fkRefPayable = fkRefPayable;
		this.paidAmount = paidAmount;
		this.discountedAmount = discountedAmount;
		this.payableHead = payableHead;
		this.headName = headName;
		this.payableAmount = payableAmount;
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

	public Long getFkRefPayable() {
		return fkRefPayable;
	}

	public void setFkRefPayable(Long fkRefPayable) {
		this.fkRefPayable = fkRefPayable;
	}

	public Float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Float getDiscountedAmount() {
		return discountedAmount;
	}

	public void setDiscountedAmount(Float discountedAmount) {
		this.discountedAmount = discountedAmount;
	}

	public Integer getPayableHead() {
		return payableHead;
	}

	public void setPayableHead(Integer payableHead) {
		this.payableHead = payableHead;
	}

	public String getHeadName() {
		return headName;
	}

	public void setHeadName(String headName) {
		this.headName = headName;
	}

	public Float getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(Float payableAmount) {
		this.payableAmount = payableAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
