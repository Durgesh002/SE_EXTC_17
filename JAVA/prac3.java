import java.util.*;

public class prac3{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int num1 = inp.nextInt();
		int num2 = inp.nextInt();
		int num3 = inp.nextInt();
		if(num1>num2 && num1>num3){
			System.out.println("The Greatest no.: " +num1);
			}else if(num2>num1 && num2>num3){
				System.out.println("The Greatest no.: " +num2);
				}else{
					System.out.println("The Greatest no.: " +num3);
					}
		}
	}
