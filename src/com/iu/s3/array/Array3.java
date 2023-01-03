package com.iu.s3.array;

public class Array3 {

	public static void main(String[] args) {
		int num = 1;
		String name = "iu";
		
		
		int [] ar1 = {1,2,3};
		int [] ar2 = {5,6,7,8};
		
		ar1=ar2;
		
		
		System.out.println(ar1.length);
		System.out.println(ar2.length);

		for (int i =0; i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}

		for (int i =0; i<ar2.length;i++) {
			System.out.println(ar2[i]);
		}
		
	}

}
