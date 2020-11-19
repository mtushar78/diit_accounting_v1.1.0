package maksudul.projects.accounting.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "programbatchfees")
public class ProgramBatchFees {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "fkProgramBatchId")
	private ProgramBatchs programBatchs;

	@Column(name = "fkPaymentHeadId")
	private int fkPaymentHeadId;

	@Column(name = "fkCgpaScheme")
	private int fkCgpaScheme;

	@Column(name = "amount")
	private float amount;

	@Column(name = "payTimes")
	private int payTimes;

	@Column(name = "payDurationMonths")
	private int payDurationMonths;

	public ProgramBatchFees() {
	}

	public ProgramBatchFees(@NotNull ProgramBatchs programBatchs, int fkPaymentHeadId, int fkCgpaScheme, float amount, int payTimes, int payDurationMonths) {
		this.programBatchs = programBatchs;
		this.fkPaymentHeadId = fkPaymentHeadId;
		this.fkCgpaScheme = fkCgpaScheme;
		this.amount = amount;
		this.payTimes = payTimes;
		this.payDurationMonths = payDurationMonths;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProgramBatchs getProgramBatchs() {
		return programBatchs;
	}

	public void setProgramBatchs(ProgramBatchs programBatchs) {
		this.programBatchs = programBatchs;
	}

	public int getFkPaymentHeadId() {
		return fkPaymentHeadId;
	}

	public void setFkPaymentHeadId(int fkPaymentHeadId) {
		this.fkPaymentHeadId = fkPaymentHeadId;
	}

	public int getFkCgpaScheme() {
		return fkCgpaScheme;
	}

	public void setFkCgpaScheme(int fkCgpaScheme) {
		this.fkCgpaScheme = fkCgpaScheme;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
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

	@Override
	public String toString() {
		return "ProgramBatchFees [id=" + id + ", programBatchs=" + programBatchs + ", fkPaymentHeadId="
				+ fkPaymentHeadId + ", fkCgpaScheme=" + fkCgpaScheme + ", amount=" + amount + ", payTimes=" + payTimes
				+ ", payDurationMonths=" + payDurationMonths + "]";
	}

}
