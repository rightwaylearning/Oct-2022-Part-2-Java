package utility.classes;

public class ArrayComp {

	public static void main(String[] args) {
		
		int[] arr1 = {9,6,8,3,4};   //50  //1,2,3,,4.....99,100
		int[] arr2 = {9,6,5,3,2};   //50  /1,2,3,4,,.....0,100		
		
		System.out.println(comp(arr1, arr2));
		
		
	}
	
	static boolean  comp(int[] arr1,int[] arr2) {
		
		if(arr1 != null && arr2 != null && arr1.length == arr2.length) {
			
			for(int i=0;i<arr1.length;i++) {
				System.out.println("iteration " + (i+1));
				Integer obj1 = arr1[i];
				Integer obj2 = arr2[i];
				if(!obj1.equals(obj2)) {
					return false;
				}
			}
			
			return true;
			
		}
			
		return false;
	}
}
