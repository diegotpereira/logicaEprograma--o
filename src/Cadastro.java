import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();

    

    Scanner teclado =  new Scanner(System.in);

    public void listar() {

        for(Aluno alunos : listaAlunos){

            System.out.println("CPF: " + alunos.getCpf());
            System.out.println("Nome: " + alunos.getNome());

        }

    }

    public void cadastrar() {

        Aluno aluno = new Aluno();

        System.out.println("\nDigite o cpf: ");
        aluno.setCpf(Integer.parseInt(teclado.nextLine()));

        System.out.println("\nDigite o nome: ");
        aluno.setNome(teclado.nextLine());

        listaAlunos.add(aluno);
    }
}
