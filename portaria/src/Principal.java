public class Principal {
    public static void main(String[] args) {
        var novoVisitante = new Visitante();
        novoVisitante.nome = "Rodnelson";
        novoVisitante.idade = 10;

        var cadastroPortaria = new CadastroPortaria();
        cadastroPortaria.cadastrar(novoVisitante,1);

    }
}
