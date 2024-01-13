import java.util.*;
public class PrimeNo{
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any no: ");
		int no = scan.nextInt();
		boolean flag = false;
		for(int i = 2;i < no/2; i++){
			if(no % i  == 0){
				flag = true;
				break;
			}
		} 
		if(flag){
			System.out.println("no is not prime");
		}
		else{
			System.out.println("no is prime");	
		}
		scan.close();
	}
}