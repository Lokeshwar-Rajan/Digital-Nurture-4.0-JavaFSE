
public class Logger {
	
	private static Logger instance;

	private Logger() {
		System.out.println("Instance Created");
		// TODO Auto-generated constructor stub
	}
	
	public static Logger getTheInstance() {
		if(instance == null) {
			instance = new Logger();
		}
		return instance;
	}

}
