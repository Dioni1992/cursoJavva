import java.util.Arrays;
import java.util.Comparator;

public class Principal2 {
    public static void main(String[] args) {
        Integer[] notas = {8, 5, 4, 9, 10};

        String notasEmString = Arrays.toString(notas);
        Arrays.sort(notas);
        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println(notasEmString);

        System.out.println("Ordenando os numeros crescentes: " +Arrays.toString(notas));
        System.out.println("Ordenando numeros decrescente: " +Arrays.toString(notas));
    }
}