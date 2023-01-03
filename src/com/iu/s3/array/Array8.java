package com.iu.s3.array;


public class Array8 {

	public static void main(String[] args) {
 int b = 0;
		int [ ]ar = {9,5,8,3,6}; 
	//내림 ,오름 나타내기
    
		for (int i = 0; i < ar.length; i++) {
			for (int a= i+1; a <ar.length;i++) {
		        if (ar[i] < ar[a]) {
		        	b = ar[i];
		        	ar[i] = ar[a];
		        	ar[a] = b;	
			}
			
			}	
		}
		for (int i = 0; i < ar.length; i++) 
        {     
           System.out.println(ar[i]);  
        }
		
	//	Arrays.sort(ar);
		
//	System.out.println(Arrays.toString(ar));	
	}
}

