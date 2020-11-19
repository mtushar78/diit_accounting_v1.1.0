package maksudul.projects.accounting.model;


public class Vwstudentpaymentinfo_new {

    private String studentId;
    private String headName;
    private String payableMonth;
    private String paidDate;
    private Double paidAmount;
    private Double discountedAmount;
    private Double payableWaiver;
    private Double payable;
    private Double dueAmount;

    public Vwstudentpaymentinfo_new() {
    }

    public Vwstudentpaymentinfo_new(String studentId, Double payable, String headName, String payableMonth, Double paidAmount, Double discountedAmount, Double payableWaiver, Double dueAmount, String paidDate) {
        this.studentId = studentId;
        this.headName = headName;
        this.payableMonth = payableMonth;
        this.paidAmount = paidAmount;
        this.discountedAmount = discountedAmount;
        this.payableWaiver = payableWaiver;
        this.dueAmount = dueAmount;
        this.payable = payable;
        this.paidDate = paidDate;
    }

    public Double getPayable() {
        return payable;
    }

    public void setPayable(Double payable) {
        this.payable = payable;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public Double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Double paidAmount) {
        this.paidAmount = paidAmount;
    }

    public Double getDiscountedAmount() {
        return discountedAmount;
    }

    public void setDiscountedAmount(Double discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public Double getPayableWaiver() {
        return payableWaiver;
    }

    public void setPayableWaiver(Double payableWaiver) {
        this.payableWaiver = payableWaiver;
    }

    public Double getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(Double dueAmount) {
        this.dueAmount = dueAmount;
    }

    public String getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(String paidDate) {
        this.paidDate = paidDate;
    }

    @Override
    public String toString() {
        return "Vwstudentpaymentinfo_new_db{" +
                "studentId=" + studentId +
                ", headName='" + headName + '\'' +
                ", payableMonth='" + payableMonth + '\'' +
                ", paidAmount=" + paidAmount +
                ", discountedAmount=" + discountedAmount +
                ", payableWaiver=" + payableWaiver +
                ", dueAmount=" + dueAmount +
                '}';
    }
}
