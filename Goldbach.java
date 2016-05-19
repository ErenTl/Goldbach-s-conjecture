import java.util.Scanner;
import java.util.ArrayList;

public class main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long num;
		
		ArrayList<Long> prime = new ArrayList<Long>();
		
		do {
			System.out.println("Enter a number. (even number)");
			num=input.nextLong();
		} while (num%2==1 || num<3);
		
		
		for (long i = 2; i < num; i++) {
			
			if (primebool(i)) {
				prime.add(i);
			}
			
		}
		
		for (int i = 0; i < prime.size(); i++) {
			for (int j = i; j < prime.size(); j++) {
				//System.out.println("i= "+i+", "+"j= "+j);
				
				long temp = prime.get(i) + prime.get(j);
				//System.out.println(asal.get(i) + "+" + asal.get(j));

				
				if(temp == num) {
					System.out.println(Math.max(prime.get(i), prime.get(j)) + " + " + Math.min(prime.get(i), prime.get(j))+" = "+temp);
				}
			}
		}
		
		
		
		
	}
	
	static boolean primebool(long sayi) {
		boolean x=true;
		for (long i = 2; i < sayi; i++) {
			if ( (sayi/i)*i == sayi ) {
				x=false;
				break;
			}
		}
		
		return x;
	}

}
