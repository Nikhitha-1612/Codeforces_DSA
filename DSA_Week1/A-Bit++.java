import java.util.*;
public class Solution_1_172_div2 {

	public static void main(String[]  args) {
		Scanner sc=new Scanner(System.in);
		int X=0;
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			String s=sc.next();
			if(s.charAt(0)=='X') {
				if(s.charAt(1)=='+') {
					X++;
				}
				if(s.charAt(1)=='-') {
					X--;
				}
			}
			else if(s.charAt(0)=='-') {
				--X;
			}
			else {
				++X;
			}
		}
				System.out.println(X);
	}

}
