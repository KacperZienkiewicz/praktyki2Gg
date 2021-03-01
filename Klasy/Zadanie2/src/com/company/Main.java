public class Main {
    public static void main(String[] args) {
        Prostokąt prostokąt=new Prostokąt(5,10);
        System.out.print("Pole prostokąta: ");
        System.out.println(prostokąt.getPole());
        System.out.print("Przekątne prostokąta: ");
        System.out.println(prostokąt.getPrzekątne());
        prostokąt.setBokA(5);
        prostokąt.setBokB(10);
        System.out.print("Pole prostokąta: ");
        System.out.println(prostokąt.getPole());
        System.out.print("Przekątne prostokąta: ");
        System.out.println(prostokąt.getPrzekątne());
    }
}