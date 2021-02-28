import java.util.Random;
public class przykład7 {
    public static void main(String[] args) {
        double[] power={-56,-2.22,23.45,-34.8,45.90,67.45,234.11,90.4,-77};
        Random random = new Random();
        int w,z;
        w = random.nextInt(9);
        z = random.nextInt(9);
        if (power[w]==power[z]){
            System.out.println("liczba "+power[w]+ " jest równa "+power[z]);
        }
        else if (power[w]>power[z]){
            System.out.println("liczba "+power[w]+ " jest wieksza od "+power[z]);
        }
        else{
            System.out.println("liczba "+power[z]+ " jest wieksza od "+power[w]);
        }
    }
}