
public class Main {

	public static void main(String[] args) {
		double presentVal = 1000.0;
        double rate = 0.10;
        int years = 5;

        double futureVal = Financialforecast.predictFutureVal(presentVal, rate, years);
        System.out.printf("FutureValue after %d yrs will be ₹%.2f\n", years, futureVal);
    }

}
