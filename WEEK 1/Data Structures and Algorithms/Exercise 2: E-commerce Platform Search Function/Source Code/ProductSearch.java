
public class ProductSearch {
	
	public static Product linearSearch(Product[] products, int targetId) {
		for(Product p : products) {
			if(p.getPrdtId()==targetId) {
				return p;
			}
		}
		return null;
	}
	
	public static Product binarySearch(Product[] products, int targetId) {
		int left=0;
		int right=products.length-1;
		while(left<=right) {
            int middle=left+(right-left)/2;
            Product midProduct=products[middle];

            if(midProduct.getPrdtId()==targetId) {
                return midProduct;
            }
            else if(midProduct.getPrdtId()<targetId) {
                left=middle+1;
            }
            else {
                right=middle-1;
            }
        }
		return null;
	}
}

