package p1;
import java.util.Scanner;

public class read {
	public static void main(String[] args) {
		Scanner brr = new Scanner(System.in);
		Student st = new Student();
		st.readN(3);
		for(int i=0;i<3;i++) {
			st.readDetailsOfStudent(i,brr.nextInt(), brr.next(), brr.next());
		}
		st.sortedNamewise();
	}
}
