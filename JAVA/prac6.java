import java.util.*;

public class prac6{
	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		int a,b,c;
		System.out.println("1 Add "+" 2 Sub "+" 3 Mult "+" 4 Div");
		System.out.println("Enter two values: ");
		a=inp.nextInt();
		b=inp.nextInt();
		System.out.println("Enter the value of c");
		switch(c=inp.nextInt()){
			case 1:
			System.out.println(a+b);
			break;
			case 2:
			if(a>b){
				System.out.println(a-b);
				}else{
					System.out.println(b-a);
					}
					break;
			case 3:
			System.out.println(a*b);
			break;
			case 4:
			System.out.println(a/b);
			break;
			default:
			System.out.println("Wrong choice");		
			}
		}
	
}
