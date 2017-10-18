
public class netbalance implements NetPay {
	netbalance Add;

		public long add(long... ls) {
			long result = 0;
			
			for (long temp: ls) {
				result += temp;
			}
			return result;
		}			
		
			public long multiply(int x,int m){
			  long  result = x*m;
			  return result;
				 }
  public long multiply1(int e,int g, int ni) {
	   long result = e*g*ni/100;
   return result;
     }

 
public long tax(int federalincometax_Pay,int taxRate) {
	long result = federalincometax_Pay-taxRate;
	return result;
	
	
}
}


			