
public class P10 {

	public static void main(String[] args) {

// 문1:	
//		*
//		**
//		***
//		****
//		*****
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j <= i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
//문2:
//		*****
//		****
//		***
//		**
//		*
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 5 ; j > i ; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		
//문3:
//	     *
//	    **
//	   ***
//	  ****
//	 *****
//		
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 4 ; j > i ; j--) {
//				System.out.print(" ");
//			}	
//			for(int a = i ; a >= 0 ; a--) {
//			System.out.print("*");
//			}
//			System.out.println();
//		}	
//문4:
//	 *****
//	  ****
//	   ***
//	    **
//	     *
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int a = i ; a >= 0 ; a--) {
//				System.out.print(" ");
//			}
//			for(int j = 5 ; j > i ; j--) {
//				System.out.print("*");
//			}		
//			System.out.println();
//		}
//		
//문5:
//	        *     
//           ***    
//          *****   
//         *******  
//        ********* 
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 10 ; j++) {
//				if((i+j>=4)&&(j-i<=4)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//문6:
//		********* 
//		 *******  
//		  *****   
//		   ***    
//		    * 
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 10 ; j++) {
//				if((i <= j)&&(i + j <= 8)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
////문7:	
//	     *    
//	    ***   
//	   *****  
//	  ******* 
//	 *********
//	  ******* 
//	   *****  
//	    ***   
//	     * 
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 10 ; j++) {
//				if((i+j>=4)&&(j-i<=4)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		for(int i = 1 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 10 ; j++) {
//				if((i <= j)&&(i + j <= 8)) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		
//조건 4개!, for 2
		for(int i = 1; i < 10 ; i++) {
			for(int j = 1 ; j < 10 ; j++) {	
				if((i + j >= 6)&&(j-i <= 4)&&(i-j <= 4)&&(i+j <= 14)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		}

	}

}
