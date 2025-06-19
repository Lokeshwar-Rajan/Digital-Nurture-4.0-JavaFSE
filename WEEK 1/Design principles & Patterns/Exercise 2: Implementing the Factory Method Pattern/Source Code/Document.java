
public interface Document {
	 
	void create();

}

class WordDocument implements Document{
	public void create() {
		System.out.println("Word Document has been created");
	}
}

class ExcelDocument implements Document{
	public void create() {
		System.out.println("Excel Document has been created");
	}
}

class PdfDocument implements Document{
	public void create() {
		System.out.println("Pdf Document has been created");
	}
}
