import java.util.Scanner;
public class Bai5 {
	public static void main (String[] args) {
	    float sum = 0, number;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("nhap vao cac so nguyen :");
	        number = scanner.nextFloat();
	        sum += number;
	        if (sum > 100)
	            break;
	    } while (number > 0);
	         
	    System.out.println("Tong cac so da nhap = " + sum);
	}
}
