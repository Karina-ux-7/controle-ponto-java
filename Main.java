public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de Controle de Ponto iniciado\n");

        // Funcionário 1 - fez hora extra
        Funcionario karina = new Funcionario("Karina", 8, 18);

        // Funcionário 2 - saiu mais cedo
        Funcionario eduardo = new Funcionario("Eduardo", 8, 15);

        // Funcionário 3 - chegou atrasado
        Funcionario rodrigo = new Funcionario("Rodrigo", 9, 17);

        // Exibindo resumo de cada funcionário
        karina.exibirResumo();
        eduardo.exibirResumo();
        rodrigo.exibirResumo();

        System.out.println("Encerrando sistema...");
    }
}