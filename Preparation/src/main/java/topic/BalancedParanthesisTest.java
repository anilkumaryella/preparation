package topic;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class BalancedParanthesisTest {

	/*
	 * @Mock public Scanner scanner;
	 */
	@Before
	public void setUp() throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put(")", "(");
		map.put("}", "{");
		map.put("]", "[");

	}

	@Test
	public void testMatching() {

		// pass("Not yet implemented");
	}

}
