import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        int max = sc.nextInt();

        int score = sc.nextInt();
        int bound = sc.nextInt();

        sc.close();

        if(score+bound < min || score-bound > max){
            System.out.println("IMPOSSIBLE" );
        }else{
            if(score-bound >= min){
                min = score-bound;
            }
            if(score+bound <= max) {
                max = score + bound;
            }

            System.out.println((int)(max-min +1));
        }
    }
}