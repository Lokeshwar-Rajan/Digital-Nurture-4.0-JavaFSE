
public class Main {
	public static void main(String[] args) {
		double presentVal = 1257.3;
        	double rate = 0.15;
        	int years = 8;

        	double futureVal = Financialforecast.predictFutureVal(presentVal, rate, years);
        	System.out.printf("FutureValue after %d yrs will be ₹%.2f\n", years, futureVal);
    	}

}
