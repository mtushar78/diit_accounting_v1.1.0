package maksudul.projects.accounting.model;

public class StudentPayableShort {
	
	private Long payableId;
	private Integer payableHead;
	private String headName;
	private String payableMonth;
	//private String max_month;
	private String payableStudent;
	private String studentName;
	private Float payable;
	private Float paidAmount;
	private Float waiver;
	private Float dueAmount;
	
	public Long getPayableId() {
		return payableId;
	}
	public void setPayableId(Long payableId) {
		this.payableId = payableId;
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
	public String getPayableMonth() {
		return payableMonth;
	}
	public void setPayableMonth(String payableMonth) {
		this.payableMonth = payableMonth;
	}

	public String getPayableStudent() {
		return payableStudent;
	}
	public void setPayableStudent(String payableStudent) {
		this.payableStudent = payableStudent;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Float getPayable() {
		return payable;
	}
	public void setPayable(Float payable) {
		this.payable = payable;
	}
	public Float getWaiver() {
		return waiver;
	}
	public void setWaiver(Float waiver) {
		this.waiver = waiver;
	}
	public Float getDueAmount() {
		return dueAmount;
	}
	public void setDueAmount(Float dueAmount) {
		this.dueAmount = dueAmount;
	}
	public Float getPaidAmount() {
		return paidAmount;
	}
	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public StudentPayableShort() {
	}

	public StudentPayableShort(Long payableId, Integer payableHead, String headName, String payableMonth, String payableStudent, String studentName, Float payable, Float paidAmount, Float waiver, Float dueAmount) {
		this.payableId = payableId;
		this.payableHead = payableHead;
		this.headName = headName;
		this.payableMonth = payableMonth;
		this.payableStudent = payableStudent;
		this.studentName = studentName;
		this.payable = payable;
		this.paidAmount = paidAmount;
		this.waiver = waiver;
		this.dueAmount = dueAmount;
	}
}
