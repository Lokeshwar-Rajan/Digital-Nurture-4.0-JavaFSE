
public class Product {
	
    private int productId;
    private String productName;
    private String productCategory;

    public Product(int productId, String productName, String productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public int getPrdtId(){return productId;}
    public String getPrdtName(){return productName;}
    public String getPrdtCategory(){return productCategory;}

    @Override
    public String toString(){
        return "[" + productId + "] " + productName + " (" + productCategory + ")";
    }
}
