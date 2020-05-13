import java.util.Scanner;
import java.util.*;


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
        int opcao = 0;
        int num_edicao,opcao2,ator_p;
        int selecionada = 0;
        String nome_filme, nome_ator;
        Scanner scan = new Scanner(System.in, "cp1252");
        boolean running = true;
        
        
        
        
        do{
            boolean ok = false;
            while (!ok){
            System.out.println("### FESTIVAL DE CINEMA ###");
            System.out.println("O que pretende fazer ?");
            System.out.println("(1) Criar Nova Edição" );
            System.out.println("(2) Edição Existente");
            try{
                opcao = scan.nextInt();
                ok = true;
            }
            catch (InputMismatchException e){
                System.out.println ("Input inválido!");
                scan.nextLine();
            }
            }
            
            switch(opcao){
                case 1:
                    principal.addEdicao(novaEdicao());
                    System.out.println("Edição Criada!");
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
                            System.out.println("(1) Criar filme||(2) Criar ator/atriz || (3) Listar os filmes participantes");
                            System.out.println("(4) Listar os filmes de um Ator  || (5) Adcionar ator existente a um filme existente ");
                           
                            opcao2 = scan.nextInt();
                            switch(opcao2){
                                case 1:
                                    principal.getEdicoes().get(selecionada).addFilme(novoFilme());
                                    System.out.println("Filme Adicionado!");
                                    break;
                                case 2:
                                    principal.getEdicoes().get(selecionada).getAtores().add(criaAtor());
                                    break;
                                case 3:
                                    System.out.println(principal.getEdicoes().get(selecionada));
                                    break;
                                case 4:
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                                        
                                        System.out.println(principal.getEdicoes().get(selecionada).getAtores().get(i).atorFilmes());                                            
                                    }
                                    break;
                                case 5:
                                    System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    System.out.println("A qual filme pretende adicionar?");
                                    nome_filme = scan.next();
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                                        
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator)) {
                                            for(int j=0; j<principal.getEdicoes().get(selecionada).getFilmes().size();j++){
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(j).getNome().equals(nome_filme)){
                                                    System.out.println("Que papel tem o ator no filme? ");
                                                    System.out.println("(1) Principal || (2) Secundário");
                                                    ator_p = scan.nextInt();
                                                    if (ator_p==1)
                                                        principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), true);
                                                    else
                                                        principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), false);
                                                    principal.getEdicoes().get(selecionada).getAtores().get(i).setFilme(nome_filme);
                                                    System.out.println("Ator adicionado");
                                                    
                                            
                                        }
                                    }
                                        }                                            
                                    }
                                    
                                    
                                        
                                    
                                    break;
                                    
                                case 10:
                                    System.exit(0);
                                            
                                default:
                                    System.out.println("Opção inválida");       
                                    break;
                            }
                        }while(running == true);
                    }
                
                default:
                    System.out.println("Opção inválida");       
                    break;
            }
        }while(running == true);
    }
    
        
    
    public static EdicaoFestival novaEdicao(){
        int ano = 0;
        int edicao = 0;
        boolean ok = false;
        boolean ok2 = false;
        Scanner scan = new Scanner(System.in, "cp1252");
        while(!ok){
        System.out.println("Qual o ano? \n");
        try{
            ano = scan.nextInt();
            ok = true;}
        catch(InputMismatchException e){
            System.out.println("Input inválido");
            scan.nextLine();
        }
        }
        while (!ok2){
            System.out.println("Qual é a edição? \n");
            try{
                edicao = scan.nextInt();
                ok2 = true;
            }
            catch(InputMismatchException e){
                System.out.println("Input inválido");
                scan.nextLine();
            }
        }
        EdicaoFestival edFest = new EdicaoFestival(ano,edicao);  
       
        return edFest;
        
    }
    public static Filme novoFilme(){
        String nome, genero, realizador;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o nome do filme?");
        nome = scan.next();
        System.out.println("Qual o genero do filme?");
        genero = scan.next();
        System.out.println("Qual é o realizador do filme?");
        realizador = scan.next();        
        Filme novo = new Filme(nome, genero, realizador);
        return novo;
    }
    public static Ator criaAtor(){
        String nome;
        int principal,anoscarreira,genero; 
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual é o primeiro nome?");
        nome = scan.next();
        System.out.println("Qual é o sobrenome?");
        nome = nome + " "+ scan.next();
        System.out.println("Quantos anos de carreira este ator possui?");
        anoscarreira = scan.nextInt();
        Ator novoator = new Ator(nome,anoscarreira,false,false);        
        System.out.println("É um Ator ou uma Atriz");
        System.out.println("(1) Ator || (2) Atriz");
        genero = scan.nextInt();
        if(genero ==1)          
            novoator.setGenero(true);                 
        else if (genero ==0)            
            novoator.setGenero(false);        
        /*System.out.println("Que papel tem o ator no filme? ");
        System.out.println("(1) Principal || (2) Secundário");
        principal = scan.nextInt();
        if(principal ==1)
            novoator.setPrincipal(true);
        else
            novoator.setPrincipal(false);*/
        return novoator;
    }
    
   
}

