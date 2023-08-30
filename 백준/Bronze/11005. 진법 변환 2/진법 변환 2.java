import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringBuilder result = new StringBuilder();
        while (N > 0) {
            int remainder = N % B;
            char digit;
            if (remainder < 10) {
                digit = (char) ('0' + remainder);
            } else {
                digit = (char) ('A' + remainder - 10);
            }
            result.insert(0, digit);
            N /= B;
        }

        System.out.println(result);
    }
}
