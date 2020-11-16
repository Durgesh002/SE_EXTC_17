import java.util.*;

class prac11{
	static int area;
	float Area(int l,int b){
		return area=l*b;
		}
	float Area(int r){
		return area=r*r;
		}
		void display(){
			System.out.println("Area: " +area);
			}
public static void main(String[] args){
		prac11 obj = new prac11();
		obj.Area(3, 4);
		obj.display();
		obj.Area(3);
		obj.display();
	}
}
