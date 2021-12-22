import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);
    private static String nome;
    public static void main(String[] args) throws Exception {

        Cadastro cadastro = new Cadastro();

        while (true) {
            
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Exibir Agenda");
            System.out.println("3 - Buscar na Agenda");
            System.out.println("6 - Sair");
            System.out.println("Escolha sua opção: ");

            int opcao = Integer.parseInt(teclado.nextLine());

            switch (opcao) {
                case 1:
                    cadastro.cadastrar();
                    break;

                case 2:
                    cadastro.listar();
                    break;

                case 3:
                cadastro.buscar(nome);
            
                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
        }
    }
}
