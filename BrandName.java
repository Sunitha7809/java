package workshop;

public class BrandName {

	public static void main(String[] args) {
		
		// declare array
		String brandName[] = {"Bata","hp"};
		for (int index = 0; index < brandName.length; index++) {
			System.out.println(brandName[index]);
		}
		
		System.out.println("reverse array elements");
		for (int index = brandName.length-1; index>=0;index--) {
			System.out.println(brandName[index]);
		}

	}

}
