package maksudul.projects.accounting.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "id")
@Table(name = "cgpascheme")
public class CgpaScheme {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "lowestValue")
	private String lowestValue;

	@Column(name = "hieghtValue")
	private String hieghtValue;

	public CgpaScheme() {
	}

	public CgpaScheme(String lowestValue, String hieghtValue) {
		this.lowestValue = lowestValue;
		this.hieghtValue = hieghtValue;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLowestValue() {
		return lowestValue;
	}

	public void setLowestValue(String lowestValue) {
		this.lowestValue = lowestValue;
	}

	public String getHieghtValue() {
		return hieghtValue;
	}

	public void setHieghtValue(String hieghtValue) {
		this.hieghtValue = hieghtValue;
	}

}
