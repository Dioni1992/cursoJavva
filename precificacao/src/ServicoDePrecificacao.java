public class ServicoDePrecificacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {


      double precoVendaCalculado =  Matematica.calcularValor(produto.precoCusto, percentualMargemLucro);
      precoVendaCalculado += Produto.custoEmbalagem;

      produto.precoVenda = precoVendaCalculado;
    }

}
