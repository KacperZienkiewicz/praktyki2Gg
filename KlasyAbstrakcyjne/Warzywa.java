package KlasyAbstrakcyjne;

abstract public class Warzywa {
    abstract public void zielony();
    abstract public void zolty();
    public void korzeniowe()
    {
        System.out.println("Warzywo małe");
    }
    public void owocowe()
    {
        System.out.println("Warzywo duże");
    }
}
