
public class Main {

	public static void main(String[] args) {
		DocumentFactory obj1 = new WordFactory();
		Document word = obj1.createDocument();
		word.create();
		
		DocumentFactory obj2 = new ExcelFactory();
		Document excel = obj2.createDocument();
		excel.create();
		
		DocumentFactory obj3 = new PdfFactory();
		Document pdf = obj3.createDocument();
		pdf.create();

	}

}
