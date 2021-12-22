import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        Cadastro cadastro = new Cadastro();

        while (true) {
            
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Exibir Agenda");
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
            
                default:
                    System.out.println("\nOpção inválida\n");
                    break;
            }
        }
    }
}
