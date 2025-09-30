public class Produto {

     static double custoEmbalagem;
     double precoCusto;
    double precoVenda;

   static double calcularCustoTotais(Produto produto) {
        return produto.precoCusto + Produto.custoEmbalagem;
    }

    void alterarPrecoCusto(final double precoCusto) {
       this.precoCusto = precoCusto;
    }

    static void  alterarCustoEmbalagem(final double custoEmbalagem) {
        Produto.custoEmbalagem = custoEmbalagem;
    }

   static void imprimirCustoEmbalagem() {
        System.out.printf("Custo com embalagem: %.2f%n", Produto.custoEmbalagem);

    }


}
