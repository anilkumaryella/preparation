package topic;

//String , All primitive wrapper classes (Integer, Byte, Long, Float, Double, Character, Boolean and Short) are immutable in Java.

//class final so that it can't be extended
//all mutable fields should be final
//all fields should be private
//If the instance fields include references to mutable objects return a copy rather than reference
public final class ImmputableDemo {

	private final String name;
	private final int id;
	private final MutableBean demo;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public MutableBean getDemo() throws CloneNotSupportedException {
		// either clone or create new object
		/*
		 * MutableBean d = new MutableBean();
		 * d.setCompany(this.demo.getCompany());
		 */
		return (MutableBean) demo.clone();

	}

	public ImmputableDemo(String name, int id, MutableBean demo) {
		super();
		MutableBean d = new MutableBean();
		this.name = name;
		this.id = id;
		this.demo = d;
		d.setCompany(demo.getCompany());
	}

	@Override
	public String toString() {
		return "ImmputableDemo [name=" + name + ", id=" + id + ", demo=" + demo + "]";
	}

}
