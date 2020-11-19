package maksudul.projects.accounting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VwStudentCollection_new {
    private Float paidAmount;
    private Float discountedAmount;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer payableHead;
    private String headName;
    private Float payableAmount;

    public VwStudentCollection_new() {
    }

    public VwStudentCollection_new(Float paidAmount, Float discountedAmount, Integer payableHead, String headName, Float payableAmount) {
        this.paidAmount = paidAmount;
        this.discountedAmount = discountedAmount;
        this.payableHead = payableHead;
        this.headName = headName;
        this.payableAmount = payableAmount;
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

    @Override
    public String toString() {
        return "vwStudentCollection_new{" +
                "paidAmount=" + paidAmount +
                ", discountedAmount=" + discountedAmount +
                ", payableHead=" + payableHead +
                ", headName='" + headName + '\'' +
                ", payableAmount=" + payableAmount +
                '}';
    }
}
