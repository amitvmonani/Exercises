package StringExercise;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.Properties;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MainTest {

	public BigInteger exp;
	public static Properties prop;
	public static String UserDir;


	@BeforeAll
	static void Setup() throws Exception {

		UserDir = System.getProperty("user.dir");
		String FilePath = UserDir+"/src/StringExercise/MainTest.properties";
		FileInputStream fis = new FileInputStream(FilePath);  
		prop =new Properties();  
		prop.load(fis);  
	}

	@Test
	void testMaxNumber() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("testMaxNumberExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("testMaxNumberInput")));
	}
	
	@Test
	void testAlphanumericStartingWithNumericInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("AlphanumericStartingWithNumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("AlphanumericStartingWithNumericInput")));
	}
	
	@Test
	void testAlphanumericEndingWithNumericInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("AlphanumericEndingWithNumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("AlphanumericEndingWithNumericInput")));
	}
	
	@Test
	void testNonAlphanumericInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("NonAlphanumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("NonAlphanumericInput")));
	}
	
	
	@Test
	void testEqualNumericValuesWithLeadingZeroInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("EqualNumericValuesWithLeadingZeroExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("EqualNumericValuesWithLeadingZeroInput")));
	}

	@Test
	void testNullInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("NullInputExpected")));
		assertEquals(exp, Main.maxNumber(null));
	}

	@Test
	void testOnlyAlphaInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("OnlyAlphaExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("OnlyAlphaInput")));
	}

	@Test
	void testOnlyNumericInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("OnlyNumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("OnlyNumericInput")));
	}

	
	@Test
	void testMaxLengthAlphanumericInput() throws Exception {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("MaxLengthAlphanumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("MaxLengthAlphanumericInput")));
	}

	@Test
	void testMinLengthAlphanumericInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("MinLengthAlphanumericExpected")));
		assertEquals(exp, Main.maxNumber(prop.getProperty("MinLengthAlphanumericInput")));
		
	}
	
	@Test
	void TestMoreThanMaxLenghtInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("MoreThanMaxLenghtExpected")));
				assertEquals(exp,Main.maxNumber(prop.getProperty("MoreThanMaxLenghtInput")));
	}
	
	@Test
	void TestLessThanMinLengthInput() {
		exp = BigInteger.valueOf(Long.parseLong(prop.getProperty("LessThanMinLengthExpected")));
		assertEquals(exp,Main.maxNumber(prop.getProperty("LessThanMinLengthInput")));
	}
	
}
