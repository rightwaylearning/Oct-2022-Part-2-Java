package patil.vaibhav4_10_2022;

import java.util.Iterator;

public class IntarrayDemoExample {
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=67;
		a[1]=89;
		a[2]=45;
		a[3]=32;
		a[4]=65;
		
		//a[5]=89; setOutBounds exception error yeil
		
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}

}
