package topic;

public class ChildBean extends ParentBean {

	private String designation;
	private String company;

	public String getDesignation() {
		return designation;
	}

	public String getCompany() {
		return company;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "ChildBean [designation=" + designation + ", company=" + company + "]";
	}

}
