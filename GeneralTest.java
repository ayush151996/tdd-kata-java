package tddkataex;

import static org.junit.Assert.*;

import org.junit.Test;


public class GeneralTest  {
	//General Test
	@Test
	public void test() {
		String str1 = "111,01\n";
		tddkata test =new tddkata();
		int output = test.tddkata(str1);
		assertEquals(112, output);
	}
	//An empty string returns zero
	@Test
	public void test1() {
		String str1 = "";
		tddkata test =new tddkata();
		int output = test.tddkata(str1);
		assertEquals(0, output);
	}
	//Two numbers, comma delimited, returns the sum
	@Test
	public void test11() {
		String str1 = "1,1";
		tddkata test =new tddkata();
		int output = test.tddkata(str1);
		assertEquals(2, output);
	}
	//Two numbers, newline delimited, returns the sum
	@Test
	public void test111() {
		String str1 = "1\n2";
		tddkata test =new tddkata();
		int output = test.tddkata(str1);
		assertEquals(3, output);
	}
	//Three numbers, delimited either way, returns the sum
	@Test
	public void test2() {
		String str1 = "5,0/1\n";
		tddkata test =new tddkata();
		int output = test.tddkata(str1);
		assertEquals(6, output);
	}
	//6-Negative numbers throw an exception
	//7-Numbers greater than 1000 are ignored
	
}
