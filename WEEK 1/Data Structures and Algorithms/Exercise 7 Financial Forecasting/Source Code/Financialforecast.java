
public class Financialforecast {

	public static double predictFutureVal(double presentVal,double rate,int periods) {
		if(periods==0) {
            return presentVal;
        }

        return (1+rate)*predictFutureVal(presentVal,rate,periods-1);
	}
}
