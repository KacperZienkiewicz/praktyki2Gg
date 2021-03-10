import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String x = scanner.nextLine();
            boolean z = false;
            for (String s : array) {
                if (s.equals(x)) {
                    z = true;
                    break;
                }
            }
        }
    }
}
