
 
import java.util.Scanner;
 
public class Bai3 {
 
    public static void main(String[] args) {
        int age;
        int year;
        String name;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhap vao ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap vao nam sinh: ");
        year = scanner.nextInt();
         
        age = 2023 - year;   
        if (age < 16) {
        	System.out.println("Ban " + name + "  o do tuoi vi thanh nien.");
        } else if (age >= 16 || age < 18) {
        	System.out.println("Ban " + name + "  o do tuoi truong thanh.");
        } else {
        	System.out.println("Ban " + name + " dai mat lol da gia.");    
        }
    }
 
}