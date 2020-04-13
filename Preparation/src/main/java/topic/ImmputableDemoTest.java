package topic;
import org.junit.Before;
import org.junit.Test;

public class ImmputableDemoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MutableBean bean = new MutableBean();
		bean.setCompany("fis");
		ImmputableDemo iDemo = new ImmputableDemo("anil", 123, bean);

		System.out.println(iDemo);
		try {
			iDemo.getDemo().setCompany("alt");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(iDemo);
	}

}
