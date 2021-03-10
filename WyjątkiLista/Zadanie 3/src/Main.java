import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int h = 0; h < 2; h++) {
            System.out.println("Podaj indeks który chcesz zmienić:");
            int x1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Co zmienić? " + array.get(x1));
            String y1 = scanner.nextLine();
            array.set(x1, y1);
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Liczba[" + i + "] = " + array.get(i));
        }
    }
}

