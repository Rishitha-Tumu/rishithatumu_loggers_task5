package Session5.Week5;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionCostTest 
{

	//Yesu Prabhu and Mary Matha and Joseph
			@Test
			public void test1() 
			{
				ConstructionCost costclass = new ConstructionCost();
				costclass.cost(1,2512);
			}
			@Test
			public void test2()
			{
				ConstructionCost costclass = new ConstructionCost();
				costclass.cost(2,2512);
			}
			@Test
			public void test3()
			{
				ConstructionCost costclass = new ConstructionCost();
				costclass.cost(3,2512);
			}
			@Test
			public void test4()
			{
				ConstructionCost costclass = new ConstructionCost();
				costclass.cost(4,2512);
			}

}
