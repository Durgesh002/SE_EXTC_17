import java.util.*;

public class prac7{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int sum=0;
		int n = inp.nextInt();
		int ar[] = new int[n];
		for(int i=0;i<n;i++){
			ar[i] = inp.nextInt();
			sum = sum + ar[i];
			}
			System.out.println("Sum: " +sum);
		}
	}
