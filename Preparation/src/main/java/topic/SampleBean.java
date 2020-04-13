package topic;

public class SampleBean {

	private String name;
	private int id;
	private MutableBean demo;



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MutableBean getDemo() {
		return demo;
	}

	public void setDemo(MutableBean demo) {
		this.demo = demo;
	}

	public SampleBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SampleBean(String name, int id, MutableBean demo) {
		super();
		this.name = name;
		this.id = id;
		this.demo = demo;
	}

	public SampleBean(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	
	}
	
	@Override
	public String toString() {
		return "ImmputableDemo [name=" + name + ", id=" + id + ", demo=" + demo + "]";
	}

}
