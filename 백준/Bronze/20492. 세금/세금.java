import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println((int)(n*0.78));

        int temp = (int) ((int) (n*0.22)*0.2);
        System.out.println(n - temp);
    }
}