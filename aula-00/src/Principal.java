public class Principal {
    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Dioni";
        eu.cpf = "22358982522";
        eu.anoNascimento = 1992;


        Pessoa voce = new Pessoa();
        voce.nome = "Fernando";
        voce.cpf = "22359568522";
        voce.anoNascimento = 1995;

        Carro meuCarro = new Carro();

        meuCarro.fabricante = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.cor = "Preto";
        meuCarro.anoFabricacao = 2022;
        meuCarro.proprietario = eu;
        meuCarro.precoCompra = 120000;

        Carro seuCarro = new Carro();

        seuCarro.fabricante = "Chevrolete";
        seuCarro.modelo = "F150 shelb";
        seuCarro.cor = "Preto";
        seuCarro.anoFabricacao = 2025;
        seuCarro.proprietario = voce;
        seuCarro.precoCompra = 980000;

        meuCarro.imprimirResumoDepreciacao();
        seuCarro.imprimirResumoDepreciacao();
        meuCarro.calcularIPVA();
        seuCarro.calcularIPVA();

        eu.proprietario();
        voce.proprietario();
    }
}
