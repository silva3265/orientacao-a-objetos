package companhia_aerea;

public class Aeronave {
	
	boolean ativo = true;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) { // se estiver ativo
            assentosReservados += numeroAssentos; // Vai acumular os numeros de assentos
        } else {
            // existe uma forma melhor de fazer isso (exceções)
            // mas ainda não estudamos sobre isso
            System.out.println("Aeronave desativada. Assentos não reservados.");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }

}
