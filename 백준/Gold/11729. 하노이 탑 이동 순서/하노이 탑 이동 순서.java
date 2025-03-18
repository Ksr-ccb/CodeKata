import java.io.*;

public class Main {
    
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void hanoi(int n, int from, int to, int temp) throws IOException {
        if (n == 1) {
            bw.write(from + " " + to + "\n");
        } else {
            hanoi(n-1, from, temp, to);
            bw.write(from + " " + to + "\n");
            hanoi(n-1, temp, to, from);
        }
    }
    
    public static void main(String[] args) throws IOException {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        if(number >= 1 && number <= 20) {
            bw.write((int) (Math.pow(2, number) - 1) + "\n"); // 이동 횟수 출력
            hanoi(number, 1, 3, 2);
        }

        bw.flush(); // 버퍼 비우기 (출력 속도 개선)
        bw.close(); // 스트림 닫기
    }
}
