import java.util.Scanner;

public class PR4 {
    public static void one(){
        System.out.println("This is method without parameter");
    }
    public static int Additions(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        one();
        System.out.println("Enter value of X and Y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("This is method with parameter for Addition: " + Additions(x,y));
    }
}
