public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Controle de Ponto iniciado\n");

        // Funcionário A - fez hora extra
        Funcionario funcionarioA = new Funcionario("Funcionario A", 8, 18);

        // Funcionário B - saiu mais cedo
        Funcionario funcionarioB = new Funcionario("Funcionario B", 8, 15);

        // Funcionário C - chegou atrasado
        Funcionario funcionarioC = new Funcionario("Funcionario C", 9, 17);

        // Exibindo resumo de cada funcionário
        funcionarioA.exibirResumo();
        funcionarioB.exibirResumo();
        funcionarioC.exibirResumo();

        System.out.println("Encerrando sistema...");
    }
}
