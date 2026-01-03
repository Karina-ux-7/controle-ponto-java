public class Funcionario {

    // Atributos do funcionário
    String nome;
    int horaEntrada;
    int horaSaida;

    // Construtor: cria um funcionário com nome, entrada e saída
    public Funcionario(String nome, int horaEntrada, int horaSaida) {
        this.nome = nome;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    // Método que calcula as horas trabalhadas
    public int calcularHorasTrabalhadas() {
        return horaSaida - horaEntrada;
    }

    // Método que analisa a situação do funcionário
    public String analisarSituacao() {
        int horasTrabalhadas = calcularHorasTrabalhadas();

        if (horasTrabalhadas > 8) {
            return "Fez hora extra";
        } else if (horasTrabalhadas < 8) {
            return "Saiu mais cedo";
        } else {
            return "Jornada completa";
        }
    }

    // Método que verifica atraso
    public boolean chegouAtrasado() {
        return horaEntrada > 8;
    }

    // Método que imprime o resumo do funcionário
    public void exibirResumo() {
        System.out.println("Funcionário: " + nome);
        System.out.println("Entrada: " + horaEntrada + "h");
        System.out.println("Saída: " + horaSaida + "h");
        System.out.println("Horas trabalhadas: " + calcularHorasTrabalhadas() + "h");

        if (chegouAtrasado()) {
            System.out.println("Situação adicional: Chegou atrasado");
        }

        System.out.println("Situação final: " + analisarSituacao());
        System.out.println("----------------------------------");
    }
}