package workshop;

public class shopnames {

	public static void main(String[] args) {
		
		// declare array
		String shopNames[] = {"coffeeshop","teashop","icecreamshop"};
		for (int index = 0; index < shopNames.length; index++) {
			System.out.println(shopNames[index]);
		}
		System.out.println("reverse array elements");
		for(int index = shopNames.length-1; index>=0;index--) {
			System.out.println(shopNames[index]);
		}
		// local variables
		boolean isGood = true;
		if(isGood == true) {
			System.err.println("is good is:"+isGood);
		
		}
			
	}

}
