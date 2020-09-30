import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Encode_Decode {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("decode or encode?");
        String choice = scanner.nextLine();
        // choice.trim().toLowerCase().charAt(0)
        if (choice.trim().toLowerCase().equals("decode")) {
            decode_text();
        } else if (choice.trim().toLowerCase().equals("encode")) {
            encode_text();
        } else {
            System.out.println("wat");
        }
    }

    private static void encode_text() {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        for(char ch: text.toCharArray()) {
            str = sb.append((int) ch).append(" ").toString();
        }
        System.out.println("your message: " + str);
    }

    private static void decode_text() throws IOException {
        String str = null;
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter numbers: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int one: arr) {
            str = sb.append((char) one).toString();
        }
        System.out.println("the message: " + str);
    }
}
