/**
*	Author: zihua
**/
import java.util.*;

public class Pro12 {
	public static Scanner input = new Scanner(System.in);

	public static <E> void print(E e) {
		System.out.print(e);
	}

	public static <E> void println(E e) {
		System.out.println(e);
	}

	public static void main(String []args) {
		while (input.hasNext()) {
			String s = input.nextLine();
			String []t = s.split("[ ]+");
			for (int i = t.length - 1; i >= 0; i--) {
				print(t[i] + " ");
			}
		}

	}
}