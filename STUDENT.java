package Myapp;

public class STUDENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double endterm_mark =60;
		
		String results = endterm_mark>= 60 ? "passed" : "failed";
			
			System.out.println(results);
		
		// for(initialization; condition; update) {
        //code to execute;
	//}
			
			for(int i =1; i<7; i++) {
				System.out.println(i);
				
			}
			
			//do (
			//while();
			
			int i = 1;
			
			do {
				System.out.println(i);
				i++;
			}while(i<=7);
			
			boolean registered = true;
			int marks = 70;
			
			if(registered == true) {
				
				if(marks >=70) {
					System.out.println("passed");
				} else {
					System.out.println("failed");
				}
			} else {
				System.out.println("student is not registered");
			}
			
	        }
}
				
			
			

