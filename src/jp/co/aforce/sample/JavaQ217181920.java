package jp.co.aforce.sample;

public class JavaQ217181920 {
	public static void main(String[] args) {
		        boolean a = true;
		        boolean b = false;
		        boolean c = (a && b) || (!a && !b);
		        System.out.println(c);
		        
		        boolean x = true;
		        boolean y = false;
		        boolean z = x || y && !x;
		        System.out.println(z);
		        
		        boolean p = false;
		        boolean q = true;
		        boolean r = !(p || q) && (p && !q);
		        System.out.println(r);
		        
		        int age = 20;
		        boolean hasStudentID = false;
		        
		        if ((age < 25 && hasStudentID) || age == 20) {
		            System.out.println("割引対象です");
		        } else {
		            System.out.println("通常料金です");
		        		}
				}
}


