import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Liczba[" + i + "] = " + array.get(i));
        }
        try {
            for (int j = 0; j < 5; j++) {
                System.out.println("Podaj indeks:");
                array.remove(scanner.nextInt());
            }
        } catch (java.util.InputMismatchException InputMismatchException) {
            System.out.println("Niepoprawne dane");
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Przekroczono wartość");
        }
    }