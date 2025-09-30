public class Principal {
    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "Rodnelson";
        novoVisitante.idade = 10;

        CadastroPortaria cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante,1);

    }
}
