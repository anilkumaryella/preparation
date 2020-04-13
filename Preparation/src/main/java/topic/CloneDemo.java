package topic;

public class CloneDemo implements Cloneable {

	// Object.clone() supports only shallow copying but we will need to override
	// it if we need deep cloning.
	// no control over constroctor

	// Shallow copy is preferred if an object has only primitive fields.
	// Deep copy is preferred if an object has references to other objects as
	// fields

	private String name;

	// this is not mandatory to be clonable for shallow copy
		MutableBean bean;
		
	public MutableBean getBean() {
		return bean;
	}

	public void setBean(MutableBean bean) {
		this.bean = bean;
	}

	

	@Override
	public String toString() {
		return "CloneDemo [name=" + name + ", bean=" + bean + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		CloneDemo idemo = new CloneDemo();
		idemo.setName("anil");
		MutableBean mdemo = new MutableBean("alti");
		idemo.setBean(mdemo);

		CloneDemo idemo2 = null;

		try {
			idemo2 = (CloneDemo) idemo.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(idemo);
		System.out.println(idemo2);

		idemo.setName("kumar");
		idemo.getBean().setCompany("fujit"); // this will change the value in
												// new cloned object also

		System.out.println("-----------------------------");
		System.out.println(idemo);
		System.out.println(idemo2);

	}

	public void copyByEqual() {
		SampleBean idemo = new SampleBean();
		idemo.setName("anil");
		MutableBean mdemo = new MutableBean("alti");
		idemo.setDemo(mdemo);

		SampleBean idemo1 = idemo;

		System.out.println(idemo);
		System.out.println(idemo1);
		idemo.getDemo().setCompany("fis");
		idemo1.setName("aaa");
		System.out.println("-----------------------------");
		System.out.println(idemo);
		System.out.println(idemo1);

	}

}
