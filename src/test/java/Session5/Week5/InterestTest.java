package Session5.Week5;

import org.junit.Test;

import junit.framework.TestCase;

public class InterestTest extends TestCase 
{
	@Test
	public void test1() 
	{
		Interest interest = new Interest();
		interest.simpleinterest(500,2,2);
	    interest.compoundinterest(500,2,2);
	}
	@Test
	public void test2() 
	{
		Interest interest = new Interest();
		interest.simpleinterest(1500,3,4);
		interest.compoundinterest(1500,3,4);
	}
	@Test
	public void test3()
	{
		Interest interest = new Interest();
		interest.simpleinterest(10000,4,8);
		interest.compoundinterest(10000,4,8);
	}
	@Test
	public void test4() 
	{
		Interest interest = new Interest();
		interest.simpleinterest(40000,2,3);
		interest.compoundinterest(40000,2,3);
	}
}
