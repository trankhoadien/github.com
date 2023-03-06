import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
	Scanner dc = new Scanner(System.in);
	System.out.println("Nhap vao so nguyen e = ");
	int e = dc.nextInt();
	if ( e % 2 == 0) {
		System.out.println("e la so chan");
	} else {
			System.out.println("e la so le");
		}
	}
}
