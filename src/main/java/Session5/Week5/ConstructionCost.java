package Session5.Week5;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ConstructionCost 
{
	//Yesu Prabhu and Mary Matha and Joseph
		private static final Logger LOGGER = Logger.getLogger(ConstructionCost.class.getName());
			public void cost(double standard,double area)
			{
				double a=area;
				if(standard==1)
				{
					a=a*1200;
				}
				else if(standard==2)
				{
					a=a*1500;
				}
				else if(standard==3)
				{
					a=a*1800;
				}
				else if(standard==4)
				{
					a=a*2500;
				}
				LOGGER.info("Cost of the house:"+a);
			}
}
