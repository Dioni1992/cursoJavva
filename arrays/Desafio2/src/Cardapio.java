public class Cardapio {
    public Cardapio() {
        itens = new ItemCardapio[0];
    }
    ItemCardapio[] itens;

    void adicionarItem(ItemCardapio item) {
        ItemCardapio[] novoArray = new ItemCardapio[itens.length + 1];

        for (int i = 0; i < itens.length; i++) {

            novoArray[i] = itens[i];

        }
        novoArray[novoArray.length - 1] = item;
        itens = novoArray;
    }

    void removerItem(int indice) {
     ItemCardapio[] novoItem = new ItemCardapio[itens.length - 1];

     int j = 0;
     for(int i = 0; i < itens.length; i++) {
     if(i != indice){
         novoItem[j] = itens[i];
         j++;
     }
     }
     itens = novoItem;
    }

    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
        for(int i = 0; i < itens.length; i++){
            if(precoMinimo <= itens[i].preco && itens[i].preco <= precoMaximo ) {
                System.out.println(itens[i].descricao + " - R$" + itens[i].preco);

            }
        }
    }

}
