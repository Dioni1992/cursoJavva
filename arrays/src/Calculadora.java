public class Calculadora {

    static double CalcularMedia(int[] numeros) {
        int total = 0;

        for (int numero : numeros) {
            total += numero;
        }

//        for (int i = 0; i < numeros.length; i++) {
//            total += numeros[i];
//        }
     return  (double) total / numeros.length;
    }

}
