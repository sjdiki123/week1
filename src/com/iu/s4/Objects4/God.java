package com.iu.s4.Objects4;

public class God {

             private String name; 	
             private static God god ; 	
             
             
             private God() {}

             
             
             
             public static God getInstance() {
            	 if(God.god ==null) {
            		God. god =new God();
            	 }
            	
            	 return God. god ; //new god 
             }
             
             
             
             
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

	
}
