package maksudul.projects.accounting.model;

import javax.persistence.*;

@Entity
//@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "programs")
public class Programs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "programName")
	private String programName;

	@Column(name = "semesters")
	private int semesters;

	@Column(name = "durationMonths")
	private int durationMonths;

	public Programs() {
	}

	public Programs(String programName, int semesters, int durationMonths) {
		this.programName = programName;
		this.semesters = semesters;
		this.durationMonths = durationMonths;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public int getSemesters() {
		return semesters;
	}

	public void setSemesters(int semesters) {
		this.semesters = semesters;
	}

	public int getDurationMonths() {
		return durationMonths;
	}

	public void setDurationMonths(int durationMonths) {
		this.durationMonths = durationMonths;
	}

	@Override
	public String toString() {
		return "Programs [id=" + id + ", programName=" + programName + ", semesters=" + semesters + ", durationMonths="
				+ durationMonths + "]";
	}
	
}
