public class Aeronave {
    boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAsssentosDisponiveis() {
        return  totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numerosAssentos){
        if(ativo) {
            assentosReservados += numerosAssentos;
        } else {
            System.out.println("Aeronave desativada. Assentos não reservados.");
        }

    }
    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
 void atualizar() {
        return;
 }

}
