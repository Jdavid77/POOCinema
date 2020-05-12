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
        int opcao,num_edicao,opcao2;
        int selecionada = 0;
        String nome_filme;
        Scanner scan = new Scanner(System.in, "cp1252");
        boolean running = true;
        
        EdicaoFestival teste = new EdicaoFestival(2000,1);
        principal.addEdicao(teste);
        EdicaoFestival teste2 = new EdicaoFestival(2030,2);
        principal.addEdicao(teste2);
        Filme filme_teste = new Filme("Teste","Comedia","Joao","Manel","Joana");
        principal.getEdicoes().get(1).addFilme(filme_teste);
        
        
        do{
        
            System.out.println("### FESTIVAL DE CINEMA ###");
            System.out.println("O que pretende fazer ?");
            System.out.println("(1) Criar Nova Edição");
            System.out.println("(2) Edição Existente");
            opcao = scan.nextInt();
            switch(opcao){
                case 1:
                    principal.addEdicao(novaEdicao());
                    System.out.println("#Final#");
                    System.out.println(principal);
                    break;
                case 2:
                    boolean existe_edicao= false;
                    System.out.println("Qual o numero de edição?");
                    num_edicao = scan.nextInt();
                    for(int i =0;i<principal.getEdicoes().size();i++){
                        if(principal.getEdicoes().get(i).getNumEdicao()==num_edicao){
                           existe_edicao=true;
                            
                        }else
                            selecionada++;
                        
                    }if(!existe_edicao){
                        System.out.println("Essa Edição não existe!");   
                        break;
                    }else{
                        do
                        {
                            System.out.println("### FESTIVAL DE CINEMA ###");
                            System.out.println("O que pretende fazer ?");
                            System.out.println("(1) Criar filme");
                            System.out.println("(2) Criar ator/atriz secundário");
                            System.out.println("(3) Listar os filmes participantes");
                            System.out.println("(10) Sair do programa");
                            opcao2 = scan.nextInt();
                            switch(opcao2){
                                case 1:
                                    principal.getEdicoes().get(selecionada).addFilme(novoFilme());
                                    System.out.println("Filme Adicionado!");
                                    break;
                                case 2:
                                    System.out.println("Qual o nome do filme ?");
                                    nome_filme = scan.next();
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(nome_filme)){
                                            principal.getEdicoes().get(selecionada).getFilmes().get(i).addAtorSecundario(novoAtor());
                                            System.out.println("Ator secundário adicionado");
                                            
                                        }
                                    }
                                    break;
                                case 3:
                                    System.out.println(principal.getEdicoes().get(selecionada));
                                    break;
                                case 10:
                                    System.exit(0);
                                default:
                                    System.out.println("Opção inválida");       
                                    break;
                            }
                        }while(running == true);
                    }
                case 3:
                    System.out.println(principal);
                default:
                    System.out.println("Opção inválida");       
                    break;
            }
        }while(running == true);
    }
    
        
    
    public static EdicaoFestival novaEdicao(){
        int ano, edicao;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o ano? \n");
        ano = scan.nextInt();
        System.out.println("Qual é a edição? \n");
        edicao = scan.nextInt();
        EdicaoFestival edFest = new EdicaoFestival(ano,edicao);  
       
        return edFest;
        
    }
    public static Filme novoFilme(){
        String nome, genero, realizador,nome_ator,nome_atriz;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o nome do filme?");
        nome = scan.next();
        System.out.println("Qual o genero do filme?");
        genero = scan.next();
        System.out.println("Qual é o realizador do filme?");
        realizador = scan.next();
        System.out.println("Qual é o ator principal do filme?");
        nome_ator = scan.next(); 
        System.out.println("Qual é a atriz principal do filme?");
        nome_atriz = scan.next();         
        Filme novo = new Filme(nome, genero, realizador,nome_ator,nome_atriz);
        return novo;
    }
    public static Ator novoAtor(){
        String nome, sobrenome;
        int anoscarreira;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o primeiro nome do autor?");
        nome = scan.next();
        System.out.println("Qual o sobrenome do autor?");
        sobrenome = scan.next();
        System.out.println("Quantos anos de carreira este ator possui?");
        anoscarreira = scan.nextInt();
        Ator novoator = new Ator(nome,sobrenome,anoscarreira);
        return novoator;
    }
}

