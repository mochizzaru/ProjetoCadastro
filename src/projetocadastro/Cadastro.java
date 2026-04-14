
package projetocadastro;
import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {
    Scanner s = new Scanner(System.in);
    
    ArrayList<Pessoa> lista = new ArrayList<>();
    
    Pessoa novo = new Pessoa();

    public void cadastroPessoas(){
        System.out.println("Nome: ");
        novo.setNome(s.nextLine());
        System.out.println("Idade: ");
        novo.setIdade(s.nextInt());
        System.out.println("Cpf: ");
        novo.setCpf(s.nextInt());
        s.nextLine();
        
        lista.add(novo);
        
        System.out.println("Pessoa cadastrada!");
    }
    public void listarPessoas() {
        
        for(Pessoa p : lista){
            System.out.println("");
            p.impressao();
        } 
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cadastro c = new Cadastro();
        int selecionar;
        
        do {    
            System.out.println("\n1- Cadastrar pessoas");
            System.out.println("\n2- Listar pessoas");
            System.out.println("\n0- Sair");
            System.out.println("Digite a opção: ");
            selecionar = s.nextInt();s.nextLine();
            
            Pessoa p = new Pessoa();
            
            if (selecionar == 1) {
                c.cadastroPessoas(); 
            }else if(selecionar == 2) {
                c.listarPessoas(); 
            }
        } while (selecionar != 0);
    }
}


