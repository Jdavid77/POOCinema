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
        int num_edicao = 0;
        int opcao2=0;
        int ator_p;
        int selecionada = 0;
        String nome_filme, nome_ator;
        String[] categorias = {"Melhor Ator" , "Melhor Atriz","Melhor Ator/Atriz Principal","Melhor Ator Secundário", "Melhor Filme", "Melhor realizador","Prémio Carreira"};
        
        Scanner scan = new Scanner(System.in, "cp1252");
        boolean running = true;
        
        
        EdicaoFestival teste= new EdicaoFestival(2000,1);
        principal.addEdicao(teste);
        Filme TESTE = new Filme("Teste","T","D");
        principal.getEdicoes().get(0).addFilme(TESTE);
        Filme TESTE1 = new Filme("Teste1","D","E");
        principal.getEdicoes().get(0).addFilme(TESTE1);
        Filme TESTE2 = new Filme("Teste2","Y","S");
        principal.getEdicoes().get(0).addFilme(TESTE2);
        Ator Ateste = new Ator("João V",2,true);
        Ator Ateste2 = new Ator("Miguel V",2,true);
        Ator Ateste3 = new Ator("Dinarte V",2,true);
        Ator Ateste4 = new Ator("Filipe V",2,true);
        Ator Ateste5 = new Ator("Ana W",2,false);
        Ator Ateste6= new Ator("Joana R",2,false);
        Ator Ateste7 = new Ator("Maria E",2,false);
        Ator Ateste8 = new Ator("Sara Y",2,false);
        Ator Ateste9 = new Ator("Marco2"
                + " V",2,true);
        principal.getEdicoes().get(0).addAtor(Ateste);
        principal.getEdicoes().get(0).addAtor(Ateste2);
        principal.getEdicoes().get(0).addAtor(Ateste3);
        principal.getEdicoes().get(0).addAtor(Ateste4);
        principal.getEdicoes().get(0).addAtor(Ateste5);
        principal.getEdicoes().get(0).addAtor(Ateste6);
        principal.getEdicoes().get(0).addAtor(Ateste7);
        principal.getEdicoes().get(0).addAtor(Ateste8);
        principal.getEdicoes().get(0).addAtor(Ateste9);
        
        
        
        
        
        
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
                    boolean existeedicao=false;
                    System.out.println("Qual o numero de edição?");
                    num_edicao = scan.nextInt();
                    for(int i =0;i< principal.getEdicoes().size();i++){
                        if (principal.getEdicoes().get(i).getNumEdicao()==num_edicao)
                            existeedicao = true;
                     }
                    if(existeedicao)
                        System.out.println("Essa edição já existe!");
                    else{
                        principal.addEdicao(novaEdicao(num_edicao));
                         System.out.println("Edição Criada!");}
                    break;
                case 2:
                    boolean existe_edicao= false;
                    boolean ok2 = false;
                    while (!ok2){
                        System.out.println("Qual o numero de edição?");
                        try{
                            num_edicao = scan.nextInt();
                            ok2 = true;
                        }
                        catch(InputMismatchException e){
                            System.out.println("Input Inválido!!");
                            scan.nextLine();
                        }
                        }
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
                            boolean ok3 = false;
                            while(!ok3){
                            System.out.println("### FESTIVAL DE CINEMA ###");
                            System.out.println("O que pretende fazer ?");
                            System.out.println("(1) Criar filme");
                            System.out.println("(2) Criar ator/atriz"); 
                            System.out.println("(3) Listar os filmes participantes");
                            System.out.println("(4) Listar Atores participantes");
                            System.out.println("(5) Adcionar ator existente a um filme existente ");
                            System.out.println("(6) Categorias que irão ser premiadas");
                            System.out.println("(7) Criar painel de pertios");
                            System.out.println("(8) Selecionar atores para categorias");
                            System.out.println("(9) Atribuir pontuação a Ator");
                            System.out.println("(10) Sair da aplicação!!");
                            try{
                                opcao2 = scan.nextInt();
                                ok3 = true;
                            }
                            catch(InputMismatchException e){
                                System.out.println("Input Inválido!!");
                                scan.nextLine();
                                
                            }
                            }
                            switch(opcao2){
                                case 1:
                                    String nome;
                                    System.out.println("Qual o nome do filme?");
                                    nome = scan.next();
                                    boolean filmeexiste = false;
                                    for(int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size(); i++){
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(nome)){
                                            filmeexiste = true;                                            
                                        }                                        
                                    }
                                    if (filmeexiste)
                                        System.out.println("Filme já inserido previamente!");
                                    else{
                                        principal.getEdicoes().get(selecionada).addFilme(novoFilme(nome));
                                        System.out.println("Filme Adicionado!");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    boolean nome_existe = false;
                                    for(int i = 0;i<principal.getEdicoes().get(selecionada).getAtores().size();i++ ){
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator))
                                            nome_existe = true;                                     
                                    }
                                    if(nome_existe)
                                        System.out.println("Esse ator já existe!");
                                    else if(!nome_existe)
                                        principal.getEdicoes().get(selecionada).getAtores().add(criaAtor(nome_ator));
                                    
                                    break;
                                case 3:
                                    if(principal.getEdicoes().get(selecionada).getFilmes().isEmpty()){
                                        System.out.println("Por favor insire primeiro alguns filmes!!");
                                        break;
                                    }
                                    else{
                                        System.out.println(principal.getEdicoes().get(selecionada));
                                        break;
                                    }
                                    
                                case 4:
                                    if (principal.getEdicoes().get(selecionada).getAtores().isEmpty()){
                                        System.out.println("Nenhum ator ainda inserido!!");
                                        break;
                                    }
                                    else{
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                                        
                                        System.out.println(principal.getEdicoes().get(selecionada).getAtores().get(i).atorFilmes());                                            
                                    }
                                    break;
                                    }
                                case 5:
                                    boolean adicionado=false;
                                    boolean ator_existe = false;
                                    System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    System.out.println("A qual filme pretende adicionar?");
                                    nome_filme = scan.next();
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                                        
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator)) {
                                            ator_existe = true;
                                            if(principal.getEdicoes().get(selecionada).getAtores().get(i).getFilmes()[1]!=null){
                                                System.out.println("O Ator já participa em 2 filmes!");
                                                break;
                                            }
                                            for(int j=0; j<principal.getEdicoes().get(selecionada).getFilmes().size();j++){
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(j).getNome().equals(nome_filme)){
                                                    System.out.println("Que papel tem o ator no filme? ");
                                                    System.out.println("(1) Principal || (2) Secundário");
                                                    ator_p = scan.nextInt();
                                                    if (ator_p==1){
                                                        adicionado = principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), true);
                                                        if(adicionado){                                                            
                                                            principal.getEdicoes().get(selecionada).getAtores().get(i).setFilme(nome_filme);
                                                        }
                                                    }                                                        
                                                    else{
                                                        adicionado = principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), false);
                                                        if(adicionado)
                                                            principal.getEdicoes().get(selecionada).getAtores().get(i).setFilme(nome_filme);
                                                            
                                                        }
                                                        
                                                    
                                                    
                                                    
                                        }
                                    }
                            }                                            
                        }
                                    if(ator_existe==false)
                                        System.out.println("Esse ator não existe!");
                
                                    break;
                                case 6:
                                    for (String categoria : categorias) {
                                        System.out.println(categoria + "\n");
                                }
                                    break;
                                case 7:
                                    int num_peritos=0;
                                    String nomep;
                                    System.out.println("Quantos peritos terá o painel?");
                                    num_peritos = scan.nextInt();
                                    for(int i=0;i<num_peritos;i++){                                       
                                        System.out.println("Qual o nome do perito?");
                                        nomep = scan.next();
                                        Peritos p = new Peritos(nomep);
                                        principal.getEdicoes().get(selecionada).addPerito(p);
                                        System.out.println("Perito "+(i+1)+ " adicionado");
                                    }
                                    
                                    break;
                                case 8:
                                    if(principal.getEdicoes().get(selecionada).getAtores().size() <4){
                                        System.out.println("É preciso pelo menos 4 atores para selecionar");
                                        break;
                                    }
                                    int num_atores = 0;
                                    int num_atrizes=0;
                                    int opcao3;
                                    for(int i =0;i<principal.getEdicoes().get(selecionada).getAtores().size();i++){
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getGenero())
                                            num_atores=num_atores +1;
                                        else
                                            num_atrizes = num_atrizes+1;
                                    }
                                    System.out.println("Deseja selecionar os participantes para qual categoria?: ");
                                    System.out.println("(1) Melhor ator ");
                                    System.out.println("(2) Melhor atriz");
                                    opcao3 = scan.nextInt();
                                    switch(opcao3){
                                        case 1:
                                            if(num_atores <4){
                                                System.out.println("É preciso pelo menos 4 atores para selecionar");
                                                break;
                                            }
                                            int selecionados =0;
                                            while(selecionados <4){
                                            int pos_ator=0;
                                            boolean homem = false;
                                            boolean existeAtor = false;
                                            boolean AtorMA = false;
                                            String nomeator;
                                            System.out.println("Qual o nome do ator");
                                            nomeator = scan.next();
                                            System.out.println("Qual o sobrenome do ator");
                                            nomeator = nomeator + " " + scan.next();
                                            for(int i =0;i<principal.getEdicoes().get(selecionada).getAtores().size();i++){
                                                if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nomeator)){
                                                    existeAtor=true;
                                                    pos_ator = i;
                                                    if(principal.getEdicoes().get(selecionada).getAtores().get(i).getGenero())
                                                        homem = true;
                                                }
                                            }
                                            
                                            if(existeAtor){
                                                if(homem){
                                                    for(int k = 0; k < principal.getEdicoes().get(selecionada).getMAtores().getAtores().size(); k++){
                                                         if (principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(k).getNome().equals(nomeator))
                                                             AtorMA = true;
                                                    }
                                                    if(!AtorMA){
                                                        principal.getEdicoes().get(selecionada).getMAtores().addAtor(principal.getEdicoes().get(selecionada).getAtores().get(pos_ator));
                                                        selecionados = selecionados +1;
                                                        System.out.println("Ator " +(selecionados)+" selecionado!");
                                                    
                                                    
                                                    }else{
                                                        System.out.println("Ator já participa nesta categoria!");
                                                    }
                                                
                                                }
                                                else {
                                                    System.out.println("Ator do sexo feminino!");
                                                }
                                            }else{
                                                System.out.println("Ator inexistente ou não participa em nenhum filme!");
                                            }
                                            }
                                            break;
                                        case 2:
                                            if(num_atrizes <4){
                                                System.out.println("É preciso pelo menos 4 atrizes para selecionar");
                                                break;
                                            }
                                            int selecionadas = 0;
                                            while(selecionadas <4){
                                            int pos_atriz=0;
                                            boolean mulher = false;
                                            boolean existeAtriz = false;
                                            boolean AtrizMA = false;
                                            String nomeatriz;
                                            System.out.println("Qual o nome da atriz");
                                            nomeatriz = scan.next();
                                            System.out.println("Qual o sobrenome da atriz");
                                            nomeatriz = nomeatriz + " " + scan.next();
                                            for(int i =0;i<principal.getEdicoes().get(selecionada).getAtores().size();i++){
                                                if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nomeatriz)){
                                                    existeAtriz=true;
                                                    pos_atriz=i;
                                                    if(!principal.getEdicoes().get(selecionada).getAtores().get(i).getGenero())
                                                        mulher = true;
                                                }
                                                
                                            }
                                            if (existeAtriz){
                                                if(mulher){
                                                    for(int k = 0; k < principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size(); k++){
                                                         if (principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(k).getNome().equals(nomeatriz))
                                                             AtrizMA = true;
                                                        }
                                                    if(!AtrizMA){
                                                        principal.getEdicoes().get(selecionada).getMAtores().addAtor(principal.getEdicoes().get(selecionada).getAtores().get(pos_atriz));
                                                        selecionadas = selecionadas +1;
                                                        System.out.println("Atriz " +(selecionadas)+" selecionada!");
                                                    }
                                                }else{
                                                    System.out.println("Ator do sexo masculino!");
                                                }
                                            }else{
                                                System.out.println("Atriz inexistente ou não participa em nenhum filme!");
                                            }
                                            
                                            break;
                                            
                                    }
                                    }
                                    break;
                                            
                                case 9:
                                    System.out.println(principal.getEdicoes().get(selecionada).getMAtores().toString());//Só para ver se adicionava slet
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
    
        
    
    public static EdicaoFestival novaEdicao(int f){
        int ano = 0;  
        boolean ok = false;
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
        EdicaoFestival edFest = new EdicaoFestival(ano,f);  
        return edFest;
    }
    
 public static Filme novoFilme(String nome){
        String genero, realizador;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o genero do filme?");
        genero = scan.next();
        System.out.println("Qual é o realizador do filme?");
        realizador = scan.next();        
        Filme novo = new Filme(nome, genero, realizador);
        return novo;
    }
    public static Ator criaAtor(String nome){        
        int anoscarreira,genero; 
        Scanner scan = new Scanner(System.in, "cp1252");        
        System.out.println("Quantos anos de carreira este ator possui?");
        anoscarreira = scan.nextInt();
        Ator novoator = new Ator(nome,anoscarreira,false);        
        System.out.println("É um Ator ou uma Atriz");
        System.out.println("(1) Ator || (2) Atriz");
        genero = scan.nextInt();
        if(genero ==1)          
            novoator.setGenero(true);                 
        else if (genero ==0)            
            novoator.setGenero(false);        
        return novoator;
    }
    
    public static double Pontuacao(EdicaoFestival f){
        int pontos=0;
        double media;
        for(int i = 0; i< f.getPeritos().size();i++){
            pontos = pontos + f.getPeritos().get(i).geraPontos();
        }
        media = pontos/f.getPeritos().size();
        return media;
    }
    
   
}


        
 /*System.out.println("Qual o nome do filme?");
                                    nome_filme = scan.next();
                                    for(int j=0; j<principal.getEdicoes().get(selecionada).getFilmes().size();j++){
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(j).getNome().equals(nome_filme)){
                                                    principal.getEdicoes().get(selecionada).getFilmes().get(j).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                    System.out.println(principal.getEdicoes().get(selecionada).getFilmes().get(j).MostraP());
                                                }
                                    }
                                    break;*/       
        
        
  
/*System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator)) {
                                            principal.getEdicoes().get(selecionada).getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                            System.out.println(principal.getEdicoes().get(selecionada).getAtores().get(i).MostraP());
                                        }
                                        
                                    }
                                    break;*/