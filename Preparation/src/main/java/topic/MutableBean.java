package topic;

public class MutableBean implements Cloneable{

	protected String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public MutableBean clone() throws CloneNotSupportedException {
		return (MutableBean) super.clone();
	}

	public MutableBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MutableBean(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "MutableBean [company=" + company + "]";
	}

}
