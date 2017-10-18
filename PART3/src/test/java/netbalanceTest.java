import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class netbalanceTest {
	private netbalance obj;

	@Before
	public void setUp() throws Exception {
		obj = new netbalance();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	@Test
	public void testAdd() {
		long ans=15+(-6)+13+(-20);
	assertEquals(ans,obj.add(15,-6,13,-20));
	  ans=25+(-9)+37;
	assertEquals(ans,obj.add(25,-9,37));
	ans=25+19;
	assertEquals(ans,obj.add(25,19));
	}
	@Test
	public void calculatenettestpay()
	{
		int salaryhrs=35;
		int hourlyrate=19;
		int Pay;
		int x=35;
		int m=19;
		Pay=salaryhrs*hourlyrate;
		assertEquals(Pay,obj.multiply(x,m));
	}
	@Test
	public void calculatetestInterest(){
	
		int export=2500;
		int goods=20;
		int netincome=3;
		int interest;
		int e=2500;
		int g=20;
		int ni=3;
		interest=(export*goods*netincome)/100;
		assertEquals(interest,obj.multiply1(e,g,ni));
	}


	@Test
	public void testTax()
	{
		int hrs=40;
		int hourlyrate=25;
		int Pay=hrs*hourlyrate;
		int TaxableWages_dedRate=(7*Pay)/100;
		int federalincometax_Pay=Pay-TaxableWages_dedRate;
		int taxRate=(10*federalincometax_Pay)/100;
		int tax=federalincometax_Pay-taxRate;
		
		assertEquals(tax,obj.tax(federalincometax_Pay,taxRate));
	}
}
