import java.util.*;

public class prac4{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int sum=0, i=1;
		do{
			if (i%2==0){
				sum+=i;
			    i++;
			}else{i++; continue;}
		}while(i<=10);
		System.out.println("Sum: "+sum);
		}
	}
