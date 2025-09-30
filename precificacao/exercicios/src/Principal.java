public class Principal {

    public static void main(String[] args) {

        double calcularAreaQuadrado = FormulasGeometricas.calculoAreaQuadrado(5.2);
        double calcularCirculo = FormulasGeometricas.calculoCirculo(10.5);

        System.out.printf("Calculando lados de um quadrado: %.2f%n", calcularAreaQuadrado);
        System.out.printf("Calcular formula de um circulo: %.2f%n", calcularCirculo);
    }
}
