package maksudul.projects.accounting.model;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "vwprogrambatchfees")
public class VwProgramBatchFees implements Serializable {

    private static final long serialVersionUID = 1L;
    private int programId;
    @Id
    private int programBatchFeeId;
    private String programName;
    private int batchId;
    private String batchno;
    private int paymentHeadId;
    private String headName;
    private int cgpaSchemeId;
    private BigDecimal amount;
    private int payTimes;
    private int payDurationMonths;

    public int getProgramId() {
        return programId;
    }
    public void setProgramId(int programId) {
        this.programId = programId;
    }
    public int getProgramBatchFeeId() {
        return programBatchFeeId;
    }
    public void setProgramBatchFeeId(int programBatchFeeId) {
        this.programBatchFeeId = programBatchFeeId;
    }
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public int getPaymentHeadId() {
        return paymentHeadId;
    }

    public void setPaymentHeadId(int paymentHeadId) {
        this.paymentHeadId = paymentHeadId;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    public int getCgpaSchemeId() {
        return cgpaSchemeId;
    }

    public void setCgpaSchemeId(int cgpaSchemeId) {
        this.cgpaSchemeId = cgpaSchemeId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getPayTimes() {
        return payTimes;
    }

    public void setPayTimes(int payTimes) {
        this.payTimes = payTimes;
    }

    public int getPayDurationMonths() {
        return payDurationMonths;
    }

    public void setPayDurationMonths(int payDurationMonths) {
        this.payDurationMonths = payDurationMonths;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public VwProgramBatchFees() {
    }

    public VwProgramBatchFees(int programId, int programBatchFeeId, String programName, int batchId, String batchno, int paymentHeadId, String headName, int cgpaSchemeId, BigDecimal amount, int payTimes, int payDurationMonths) {
        this.programId = programId;
        this.programBatchFeeId = programBatchFeeId;
        this.programName = programName;
        this.batchId = batchId;
        this.batchno = batchno;
        this.paymentHeadId = paymentHeadId;
        this.headName = headName;
        this.cgpaSchemeId = cgpaSchemeId;
        this.amount = amount;
        this.payTimes = payTimes;
        this.payDurationMonths = payDurationMonths;
    }
}
