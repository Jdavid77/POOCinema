import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Velosa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     
     
    public static void main(String[] args) {
        
        Festival principal = new Festival();
        int opcao,edicao_filme;
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        
        EdicaoFestival teste = new EdicaoFestival(2000,1);
        principal.addEdicao(teste);
        EdicaoFestival teste1 = new EdicaoFestival(2002,2);
        principal.addEdicao(teste1);
        
        
        
        System.out.println("### FESTIVAL DE CINEMA ###");
        System.out.println("O que pretende fazer ?");
        System.out.println("(1) Criar Edição");
        System.out.println("(2) Criar filme");
        opcao = scan.nextInt();
        switch(opcao){
            case 1:
                principal.addEdicao(novaEdicao());
                System.out.println("#Final#");
                System.out.println(principal);
                break;
            case 2:
                boolean existe_edicao=false;
                System.out.println(principal);
                System.out.println("A qual edicao pretende adicionar o filme ?");
                edicao_filme = scan.nextInt();
                for(int i =0;i<principal.getEdicoes().size();i++){
                    if(principal.getEdicoes().get(i).getNumEdicao()==edicao_filme){
                        principal.getEdicoes().get(i).addFilme(novoFilme());
                        existe_edicao=true;
                    }
                    
                }
                
                if (existe_edicao){
                    System.out.println("#Final#");
                    System.out.println(principal);
                    break;
                }else
                    System.out.println("Essa Edição não existe!");   
                    break;
            default:
                System.out.println("Opção inválida");       
                break;
        }//while(running);
        
    }
        
    
    public static EdicaoFestival novaEdicao(){
        int ano, edicao;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o ano? \n");
        ano = scan.nextInt();
        System.out.println("Qual é a edição? \n");
        edicao = scan.nextInt();
        EdicaoFestival edFest = new EdicaoFestival(ano,edicao);  
       
        return edFest;
        
    }
    public static Filme novoFilme(){
        String nome, genero, realizador;
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome do filme?");
        nome = scan.next();
        System.out.println("Qual o genero do filme?");
        genero = scan.next();
        System.out.println("Qual é o realizador do filme?");
        realizador = scan.next();        
        Filme novo = new Filme(nome, genero, realizador);
        return novo;
    }
    
}
