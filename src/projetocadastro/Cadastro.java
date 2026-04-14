
package projetocadastro;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Pessoa> lista = new ArrayList<>();
    
    Pessoa novo = new Pessoa();

    public void cadastroPessoas(Pessoa novo){
        System.out.println("Nome: ");
        novo.setNome(s.nextLine());
        System.out.println("Idade: ");
        novo.setIdade(s.nextInt());
        System.out.println("Cpf: ");
        novo.setCpf(s.nextInt());
        
        lista.add(novo);
    }
    public void listarPessoas() {
        
        for(Pessoa p : lista){
            System.out.println("");
            p.impressao();
        } 
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int selecionar = 6;
        
        do {    
            System.out.println("\n1- Cadastrar pessoa");
            System.out.println("\n2- Litar pessoa");
            System.out.println("\n0- Sair");
            System.out.println("Digite a opção: ");
            selecionar = s.nextInt();
            
            Pessoa p = new Pessoa();
            
            if (selecionar == 1) {
                cadastroPessoas(p);
            }else if(selecionar == 2) {
                listarPessoas();
            }
        } while (selecionar != 0);
    }



    

}


