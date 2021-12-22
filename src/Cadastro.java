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

    public int buscar(String nome) {

        System.out.println("\nInforme o nome a ser procurado: ");
        nome = teclado.nextLine();

        int indice = 0;

        if (indice < 0) {
            System.out.println("\nA pessoa não foi localizada.");
        } else {
            System.out.println("\nA pessoa foi localizada na posição: " + 
            indice);
        }

        int resultado = -1;

        for(int i = 0; i < listaAlunos.size(); i++) {
                
            if (listaAlunos.get(i) != null) {
                
                if (listaAlunos.get(i).getNome().equals(nome)) {
                    
                    resultado = i;

                    break;
                }
            }
        }

        return resultado;
    }
}
