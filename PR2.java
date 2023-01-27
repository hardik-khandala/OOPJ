import java.util.Scanner;

class PR2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A");
        float a = sc.nextFloat();
        System.out.println("Enter Value of B");
        float b = sc.nextFloat();
        float c = a+b;
        float d = a-b;
        float e = a*b;
        float f = a/b;
        float g = a%b;

        System.out.println("Addision of A and B is: " + c);
        System.out.println("Subtraction of A and B is: " + d);
        System.out.println("Multiplication of A and B is: " + e);
        System.out.println("Division of A and B is: " + f);
        System.out.print("Modulo of A and B is: " + g);
    }
}
