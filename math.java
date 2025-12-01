import java.util.Scanner;
public class maths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER: ");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER: ");
        int b=sc.nextInt();
        int sum = a+b;
        int dif = a-b;
        int pro = a*b;
        int div = a/b;
        double pov = Math.pow(a,b);
        System.out.println("sum: "+sum);
        System.out.println("difference: "+dif);
        System.out.println("product: "+pro);
        System.out.println("division: "+div);
        System.out.println("power: "+pov);

    }
}
