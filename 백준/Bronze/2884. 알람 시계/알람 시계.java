import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        sc.nextLine();
        sc.close();

        if( min >= 45){
            System.out.println(hour+" "+ (min-45));
        }else{
            if(hour == 0){
                hour = 24;
            }
            int temp = hour*60 + min;
            temp -= 45;
            hour = temp/60;
            min = temp%60;
            System.out.println(hour+" "+ (min));
        }
    }
}