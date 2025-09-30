public class Carro {
static  final int ANO_USO_VEICULO = 20;

   String  fabricante;
   String modelo;
   String cor ;
   int anoFabricacao;
   double precoCompra;
   Pessoa proprietario;

   void imprimirResumoDepreciacao() {

       double valorRevenda = calcularValorRevenda();
       int tempoUsoMeuCarro = calcularTempoDeUsoEmAnos();

       System.out.printf("Tempo de uso (anos): %d%n", tempoUsoMeuCarro );
       System.out.printf("Valor de revenda: %6.2f%n", valorRevenda);
       System.out.println();
       System.out.printf("Calculo do IPVA: %s%n", calcularIPVA());
   }

   double calcularIPVA() {
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();


       if (tempoDeUsoEmAnos >= 10 ){
           return  0;

       }
       return  calcularValorRevenda() * 0.04;
   }

   int calcularTempoDeUsoEmAnos(){
       return 2025 - anoFabricacao;
   }


   double calcularValorRevenda() {
       int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();

       double valorRevenda = (precoCompra / ANO_USO_VEICULO) * (ANO_USO_VEICULO - tempoDeUsoEmAnos);

       if(valorRevenda < 0) {
           valorRevenda = 0;
       }

       return valorRevenda;
   }
}
