import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        int[] arr;
        arr = Stream.of(temp.split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(arr).sum());
    }
}
