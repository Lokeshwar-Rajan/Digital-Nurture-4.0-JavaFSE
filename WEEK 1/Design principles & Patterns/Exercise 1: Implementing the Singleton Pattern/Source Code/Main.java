
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger object1 = Logger.getTheInstance();
		Logger object2 = Logger.getTheInstance();
		
		if(object1==object2) {
			System.out.println("Obj1 and Obj2 are same");
		}else {
			System.out.println("Obj1 and Obj2 are not same");
		}
	}

}
