package Session5.Week5;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Interest
{
		//Yesu Prabhu and Mary Matha and Joseph
		private static final Logger LOGGER = Logger.getLogger(Interest.class.getName());
		public void simpleinterest(double p,double t,double r)
		{
			double si;
			si=(p*t*r)/100.0;
			LOGGER.info("Simple Interest: "+si);
		}
		public void compoundinterest(double p,double t,double r)
		{
			double ci;
			ci=p*Math.pow(1.0+r/100.0,t)-p;
			LOGGER.info("Compound Interest: "+ci);
		}
}
