public class Visitante {
    static final int IDADE_MINIMA_PARA_VISITANTES = 18;
    String nome;
    int idade;

    boolean possuiAcessoRestritoPorIdade() {
        return idade < IDADE_MINIMA_PARA_VISITANTES;
    }
}
