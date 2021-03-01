import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        prostykalkulator prostykalkulator=new prostykalkulator(3,4);
        Scanner sc = new Scanner(System.in);
        boolean programdziała=true;
        while(programdziała)
        {
            System.out.println("Podaj liczbę odpowiedzialną za: dodawanie1 odejmowanie2 mnozenie3 dzielenie4 wyłącz5");
            System.out.println("Podaj liczbę: ");
            String userInput = sc.next();
            System.out.println("podaj pierwszą liczbę ");
            double licz1 = sc.nextDouble();
            System.out.println("podaj drugą liczbę ");
            double licz2 = sc.nextDouble();
            prostykalkulator.setA(licz1);
            prostykalkulator.setB(licz2);
            switch (userInput)
            {
                case "1": {
                    prostykalkulator.dodawanie();
                    break;
                }
                case "2": {
                    prostykalkulator.odejmowanie();
                    break;
                }
                case "3": {
                    prostykalkulator.mnożenie();
                    break;
                }
                case "4": {
                    prostykalkulator.dzielenie();
                    break;
                }
                case "5": {
                    programdziała = false;
                    break;
                }
                default: {
                    System.out.println("zła liczba");
                }
            }
        }
    }
}