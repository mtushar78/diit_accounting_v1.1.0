package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "programbatchs")
public class ProgramBatchs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "fkProgramId")
	private Programs programs;

	@Column(name = "batchno")
	private String batchno;

	@Column(name = "startFrom")
	private String startFrom;

	@OneToMany(mappedBy = "programBatchs", fetch = FetchType.EAGER)
	private List<ProgramBatchFees> programBatchFees;

	@Transient
	protected int programIdTmp;

	public ProgramBatchs() {
	}

	public ProgramBatchs(@NotNull Programs programs, String batchno, String startFrom, List<ProgramBatchFees> programBatchFees, int programIdTmp) {
		this.programs = programs;
		this.batchno = batchno;
		this.startFrom = startFrom;
		this.programBatchFees = programBatchFees;
		this.programIdTmp = programIdTmp;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Programs getPrograms() {
		return programs;
	}

	public void setPrograms(Programs programs) {
		this.programs = programs;
	}

	public String getBatchno() {
		return batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public String getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}

	public List<ProgramBatchFees> getProgramBatchFees() {
		return programBatchFees;
	}

	public void setProgramBatchFees(List<ProgramBatchFees> programBatchFees) {
		this.programBatchFees = programBatchFees;
	}

	public int getProgramIdTmp() {
		return programIdTmp;
	}

	public void setProgramIdTmp(int programIdTmp) {
		this.programIdTmp = programIdTmp;
	}

	@Override
	public String toString() {
		return "ProgramBatchs [id=" + id + ", batchno=" + batchno + ", startFrom=" + startFrom + ", programIdTmp="
				+ programIdTmp + "]";
	}

	
}
