package KlasyAbstrakcyjne;

public class Main {
    public static void main(String[] args) {
        //Zadanie 1
        Kot kot = new Kot();
        kot.wiek();
        kot.nazwa();
        kot.SprawdzCzyDajeGlos();
        kot.sprawdzCzySpi();
        System.out.println();
        //Zadanie 2
        Samochod samochod = new Samochod();
        samochod.skrecwlewo();
        samochod.skrecwprawo();
        System.out.println();
        //Zadanie 3
        KolorWarzywa KolorWarzywa =new KolorWarzywa();
        KolorWarzywa.zielony();
        KolorWarzywa.zolty();
        KolorWarzywa.małe();
        KolorWarzywa.duże();
        System.out.println();
        //Zadanie 4
            Pies pies=new Pies();
            pies.badzGrzeczny();
            pies.bawSie();
        System.out.println();
        //Zadanie 5
        Kwadrat kwadrat=new Kwadrat(12);
        kwadrat.obliczpole();
        kwadrat.obliczobw();
        }
    }