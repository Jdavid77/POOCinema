import java.util.Scanner;
import java.util.*;
import java.util.LinkedHashMap;


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
        boolean running2 = false;
        boolean running3 = false;
        
        
        
        EdicaoFestival teste= new EdicaoFestival(2000,1);
        principal.addEdicao(teste);
        Filme TESTE = new Filme("Teste","T","D");
        principal.getEdicoes().get(0).addFilme(TESTE);
        Filme TESTE1 = new Filme("Teste1","D","E");
        principal.getEdicoes().get(0).addFilme(TESTE1);
        Filme TESTE2 = new Filme("Teste2","Y","S");
        principal.getEdicoes().get(0).addFilme(TESTE2);
        Filme TESTE3 = new Filme("Teste3","G","S");
        principal.getEdicoes().get(0).addFilme(TESTE3);
        Filme TESTE4 = new Filme("Teste4","U","T");
        principal.getEdicoes().get(0).addFilme(TESTE4);
        
        Ator Ateste = new Ator("João V",2,true);
        Ator Ateste2 = new Ator("Miguel V",2,true);
        Ator Ateste3 = new Ator("Dinarte V",2,true);
        Ator Ateste4 = new Ator("Filipe V",2,true);
        Ator Ateste5 = new Ator("Ana W",2,false);
        Ator Ateste6= new Ator("Joana R",21,false);
        Ator Ateste7 = new Ator("Maria E",21,false);
        Ator Ateste8 = new Ator("Sara Y",21,false);
        Ator Ateste9 = new Ator("Marco V",21,true);
        Ator Ateste10 = new Ator("Johny W",21,true);
        Ator Ateste11 = new Ator("Big V",21,true);
        Ator Ateste12 = new Ator("Luana P",21,false);
        Ator Ateste13 = new Ator("Manuela V",2,false);
        Ator Ateste14 = new Ator("Pedro V",2,true);
        
        principal.getEdicoes().get(0).addAtor(Ateste);
        principal.getEdicoes().get(0).addAtor(Ateste2);
        principal.getEdicoes().get(0).addAtor(Ateste3);
        principal.getEdicoes().get(0).addAtor(Ateste4);
        principal.getEdicoes().get(0).addAtor(Ateste5);
        principal.getEdicoes().get(0).addAtor(Ateste6);
        principal.getEdicoes().get(0).addAtor(Ateste7);
        principal.getEdicoes().get(0).addAtor(Ateste8);
        principal.getEdicoes().get(0).addAtor(Ateste9);
        
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste, true); // João 0 prin
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste2, true);// Miguel 1 prin
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste3, true);// Dinarte 2 prin
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste4, false); // Filipe 0
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste5, true); // Ana 0 prin
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste6, true); // Joana 1 prin
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste7, true); // Maria 2 prin
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste8, false); // Sara 1
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste9, false); // Marco 2
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste9, false); // Marco 0
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste8, false); // Sara 0
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste, false); // João 1
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste5, false); // Ana 1
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste3, false); // Dinarte 2
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste6, false); // Joana 2
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste2, true); // Miguel 3 prin
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste7, true); // Maria 3 prin
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste10, false); // Johny 3
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste12, false); // Luana 3
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste11, false); // Big 3
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste10,true); // Johny 4 prin
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste12,true); // Luana 4 prin
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste11,false); // Big 4
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste13,false); // Manuela 4
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste14,false); // Pedro 4
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
                            System.out.println("(7) Criar painel de peritos");
                            System.out.println("(8) Informação sobre atribuição de prémios");
                            System.out.println("(9) Selecionar atores para categorias");
                            System.out.println("(10) Atribuir pontuação a Ator");
                            System.out.println("(11) Sair da aplicação!!");
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
                                    int numero = 0;
                                    int contador = 0;
                                    System.out.println("Quantos atores quer adicionar");
                                    numero = scan.nextInt();
                                    while (contador < numero){
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
                                    else if(!nome_existe){
                                        principal.getEdicoes().get(selecionada).getAtores().add(criaAtor(nome_ator));
                                        contador++;
                                    }
                                    }
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
                                    boolean participa_filme=false;
                                    boolean adicionado=false;
                                    boolean ator_existe = false;
                                    System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    System.out.println("A qual filme pretende adicionar?");
                                    nome_filme = scan.next();
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                         //Percorre a lista de Atores               
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator)) {        //Verifica se o ator com indice i tem o nome inserido
                                            ator_existe = true;                                                                             //Caso tenha o valor de ator_existe muda para true
                                            if(principal.getEdicoes().get(selecionada).getAtores().get(i).getFilmes()[1]!=null){            //Verifica se o ator participa em 2 filmes
                                                System.out.println("O Ator já participa em 2 filmes!");                                     // Caso participe aparece mensagem de erro e acontece um break
                                                break;
                                            }
                                            
                                            for(int j=0; j<principal.getEdicoes().get(selecionada).getFilmes().size();j++){             //Percorre a lista de filmes
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(j).getNome().equals(nome_filme)){ //Verifica se o filme com indice j é o filme pretendido
                                                    for(int k =0;k< principal.getEdicoes().get(selecionada).getFilmes().get(j).getAtores().size();k++){ //Se for o filme pretendido percorre a lista de atores desse filme
                                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(j).getAtores().get(k).getNome().equals(nome_ator)){ // Para verificar se o ator já participa no mesmo
                                                           System.out.println("O ator já participa no filme!");                         // Caso o ator já participe aparece mensagem de erro
                                                           participa_filme=true;
                                                        }
                                                }
                                                    if(!participa_filme){                                               //Se o ator não participar no filme continuamos com a adição ao mesmo
                                                    System.out.println("Que papel tem o ator no filme? ");
                                                    System.out.println("(1) Principal || (2) Secundário");
                                                    ator_p = scan.nextInt();                                        //Pergunta se o ator é principal ou secundário no filme
                                                    if (ator_p==1){                                                 //Se o ator tiver papel principal no filme é adicionado chamando a função addNovoAtor com valor true
                                                        adicionado = principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), true);
                                                        if(adicionado){                 // A função addNovoAtor tem como retorno um bool, se for verdadeiro, significa que o ator foi adicionado corretamente ao filme                                           
                                                            principal.getEdicoes().get(selecionada).getAtores().get(i).setFilme(nome_filme); // Como o ator foi bem adicionado é colocado o nome do filme na lista de filmes que o ator participa
                                                        }
                                                    }                                                        
                                                    else{                                                               // Caso tenha papel secundário é adicionado chamando a função addNovoAtor com valor false
                                                        adicionado = principal.getEdicoes().get(selecionada).getFilmes().get(j).addNovoAtor(principal.getEdicoes().get(selecionada).getAtores().get(i), false);
                                                        if(adicionado)
                                                            principal.getEdicoes().get(selecionada).getAtores().get(i).setFilme(nome_filme);
                                                            
                                                        }
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
                                    System.out.println("Requesitos para atribuição de prémios:");
                                    System.out.println("Necessários:");
                                    System.out.println("- Pelo menos 4 atores diferentes");
                                    System.out.println("- Pelo menos 4 atrizes diferentes");
                                    System.out.println("- Pelo menos 4 atores principais diferentes");
                                    System.out.println("- Pelo menos 4 atrizes principais diferentes");
                                    System.out.println("- Pelo menos 4 atores/atrizes com mais 20 anos de carreira");
                                    System.out.println("- Pelo menos 4 filmes( Cada um com pelo menos um ator/atriz principal e dois atores secundários");
                                    System.out.println("- Pelo menos 4 realizadores diferentes!!");
                                    break;
                                case 9:
                                    
                                    int opcao3;
                                    
                                    
                                    //Verificação do numero de atores
                                    
                                    
                                    int num_atores = 0;
                                    int num_atrizes=0;
                                    boolean existe;
                                    boolean existe2;
                                    boolean masculino;
                                    boolean feminino;
                                    boolean masculino2;
                                    boolean feminino2;
                                    int filme = 0;
                                    int ator = 0;
                                    for(int i =0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                        existe = false;
                                        existe2 = false;
                                        if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome().equals("")){
                                            for(int k = 0;k < principal.getEdicoes().get(selecionada).getMasculinos().size(); k++){
                                                if(principal.getEdicoes().get(selecionada).getMasculinos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome()))
                                                    existe = true;
                                            }
                                            if(existe){
                                                num_atores = num_atores + 0;
                                            }
                                            else{
                                                principal.getEdicoes().get(selecionada).getMasculinos().add(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0));
                                                num_atores++;
                                            }
                                        }
                                    
                                        if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome().equals("")){
                                            for(int k = 0; k < principal.getEdicoes().get(selecionada).getFemininos().size(); k++){
                                                if(principal.getEdicoes().get(selecionada).getFemininos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome()))
                                                    existe2 = true;
                                            }
                                        if(existe2){
                                            num_atrizes = num_atrizes + 0;
                                        }
                                        else{
                                            principal.getEdicoes().get(selecionada).getFemininos().add(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1));
                                            num_atrizes++;
                                        }
                                        }
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size() > 2){
                                        for(int j = 2; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size(); j++){
                                            masculino = false;
                                            masculino2 = false;
                                            feminino = false;
                                            feminino2 = false;
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(j).getGenero()){
                                                masculino = true;
                                                filme = i;
                                                ator = j;
                                            }
                                            else{
                                                feminino = true;
                                                filme = i;
                                                ator = j;
                                            }
                                            if(masculino){
                                                for(int k = 0 ; k < principal.getEdicoes().get(selecionada).getMasculinos().size();k++){
                                                    if(principal.getEdicoes().get(selecionada).getMasculinos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator).getNome()))
                                                        masculino2 = true;
                                                }
                                                if(masculino2){
                                                    num_atores = num_atores + 0;
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMasculinos().add(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator));
                                                    num_atores++;
                                                }
                                            }
                                            if(feminino){
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getFemininos().size(); k++){
                                                    if(principal.getEdicoes().get(selecionada).getFemininos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator).getNome()))
                                                        feminino2 = true;
                                                }
                                                if(feminino2){
                                                    num_atrizes = num_atrizes + 0;
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getFemininos().add(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator));
                                                    num_atrizes++;
                                                }
                                            } 
                                                        
                                        }
                                        }
                                        
                                        
                                    }
                                        
                                        
                                    System.out.println("Numero de atores: " + num_atores);
                                    System.out.println("Numero de atrizes: " + num_atrizes);
                                    
                                    // Verificação do numero de atores principais
                                    
                                    int atoresprincipais = 0;
                                    int principais = 0;
                                    int pos_filme = 0;
                                    boolean quebrou;
                                    boolean atprincipais;
                                    while(atoresprincipais < principal.getEdicoes().get(selecionada).getFilmes().size()){
                                        for (int i = 0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                            atprincipais = false;
                                            quebrou = false;
                                            if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome().equals("")){
                                                atprincipais = true;
                                                pos_filme = i;
                                            }
                                            if(atprincipais){
                                                
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getPrincipais().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getPrincipais().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme).getAtores().get(0).getNome())){
                                                       quebrou = true;
                                                    }
                                                }
                                                if(quebrou == true){
                                                    atoresprincipais++;
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getPrincipais().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme).getAtores().get(0));
                                                    principais++;
                                                    atoresprincipais++; 
                                                }
                                            }
 
                                            else{
                                                
                                                atoresprincipais++;
                                            }
                                                
                                        }
                                    }
                                    
                                    System.out.println("Numero de atores principais: " + principais);
                                    
                                    // Verificação do numero de atrizes principais 
                                    
                                    int atrizesprincipais = 0;
                                    int principaisf = 0;
                                    int pos_filme2 = 0;
                                    boolean quebrou2 = false;
                                    boolean atzprincipais = false;
                                    while(atrizesprincipais < principal.getEdicoes().get(selecionada).getFilmes().size()){
                                        for (int i = 0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                            atzprincipais = false;
                                            quebrou2 = false;
                                            if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome().equals("")){
                                                atzprincipais = true;
                                                pos_filme2 = i;
                                            }
                                            if(atzprincipais){
                                                
                                                    for(int j = 0; j < principal.getEdicoes().get(selecionada).getAtzPrincipais().size(); j++){
                                                        if(principal.getEdicoes().get(selecionada).getAtzPrincipais().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme2).getAtores().get(1).getNome())){
                                                            quebrou2 = true;
                                                        }
                                                    }
                                                    if(quebrou2 == true){
                                                        atrizesprincipais++;
                                                    }
                                                    else{
                                                        principal.getEdicoes().get(selecionada).getAtzPrincipais().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme2).getAtores().get(1));
                                                        principaisf++;
                                                        atrizesprincipais++; 
                                                    }
                                            }
                                            else{
                                                
                                                atrizesprincipais++;
                                            }
                                                
                                        }
                                    }
                                    
                                    System.out.println("Numero de atrizes principais: " + principaisf);
                                    //Verificação de Atores secundários
                                    
                                    int num_secundários = 0;
                                    int pos_filme3 = 0;
                                    int pos_ator2 = 0;
                                    boolean secundário = false;
                                    boolean quebrou3 = false;
                                    for (int i = 0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                        
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size()>2){
                                        for(int j = 2; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size(); j++){                                            
                                            quebrou3 = false;
                                            secundário = true;
                                            pos_filme3 = i;
                                            pos_ator2 = j;                         
                                            if(secundário){// O stress está a partir daqui nestas verificações mas não percebo onde Xd // porque o migo esqueceu de por as variaveis a false outra vez
                                                
                                                for (int k = 0; k < principal.getEdicoes().get(selecionada).getSecundarios().size(); k++){
                                                    if (principal.getEdicoes().get(selecionada).getSecundarios().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme3).getAtores().get(pos_ator2).getNome())){
                                                        quebrou3 = true;
                                                    }
                                                }
                                                if(quebrou3){
                                                    num_secundários += 0;
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getSecundarios().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme3).getAtores().get(pos_ator2));
                                                    num_secundários++;
                                                }
                                            }
                                            else{
                                                num_secundários += 0;
                                            }
                                        }
                                        
                                    }
                                    }
                                    
                                    System.out.println(" Numero de atores secundários:" + num_secundários);
                                    // Verificação de filmes
                                    
                                    int num_filmes = 0;
                                    int num_secundarios2 = 0;
                                    if(principal.getEdicoes().get(selecionada).getFilmes().isEmpty())
                                        num_filmes = 0;
                                    else{
                                        for(int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size();i++){
                                            num_secundarios2 = 0;
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtorPrincipal().getNome().equals("") && principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtrizPrincipal().getNome().equals(""))
                                                num_filmes += 0;
                                            else{
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size()>2){
                                                    for (int j = 2; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size();j++){
                                                        num_secundarios2++;
                                                    }
                                                }
                                                if(num_secundarios2 >= 2){
                                                    principal.getEdicoes().get(selecionada).getVerificaFilmes().add(principal.getEdicoes().get(selecionada).getFilmes().get(i));
                                                    num_filmes++;
                                                    
                                                }
                                                
                                                        
                                            }
                                            
                                        }
                                    }
                                    
                                    System.out.println("Numero de filmes: " + num_filmes);
                                    //Verificação de realizadores
                                    
                                    int num_realizadores = 0;
                                    int pos_filme4 = 0;
                                    boolean quebrou4 = false;
                                    boolean realizador = false;
                                    for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size(); i++){
                                        quebrou4 = false;
                                        realizador = false;
                                        if(!principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getRealizador().equals("")){
                                            realizador = true;
                                            pos_filme4 = i;
                                        }
                                        if(realizador){
                                            for (int j = 0; j < principal.getEdicoes().get(selecionada).getRealizadores().size();j++){
                                                if(principal.getEdicoes().get(selecionada).getRealizadores().get(j).equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(pos_filme4).getRealizador()))
                                                    quebrou4 = true;
                                            }
                                            if(!quebrou4){
                                                
                                            
                                                principal.getEdicoes().get(selecionada).getRealizadores().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(pos_filme4).getRealizador());
                                                num_realizadores++;
                                            }
                                            
                                            
                                        }
                                        
                                    }
                                    
                                    System.out.println("Numero de realizadores: " + num_realizadores);
                                        
                                    // Verificação prémio carreira
                                    
                                    int num_carreira = 0;
                                    int pos_ator3 = 0;
                                    int pos_filme5 = 0;
                                    boolean excedeu;
                                    boolean equivalente;
                                    for (int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size(); i++){
                                        for (int j = 0; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size(); j++){
                                            excedeu = false;
                                            equivalente = false;
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(j).getAnosCarreira() > 20){
                                                excedeu = true;
                                                pos_ator3 = j;
                                                pos_filme5 = i;
                                            }
                                            if(excedeu){
                                               for(int k = 0; k < principal.getEdicoes().get(selecionada).getCarreira().size(); k++){
                                                   if(principal.getEdicoes().get(selecionada).getCarreira().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme5).getAtores().get(pos_ator3).getNome()))
                                                       equivalente = true;
                                               }
                                               if(!equivalente){
                                                   
                                               
                                                   principal.getEdicoes().get(selecionada).getCarreira().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme5).getAtores().get(pos_ator3));
                                                   num_carreira++;
                                               
                                               }
                                            }
                                            
                                            
                                        }
                                    }
                                    
                                    System.out.println("Numero de atores aptos para o premio Carreira: " + num_carreira);
                                       
                                    do{
                                    System.out.println("Deseja selecionar os participantes para qual categoria?: ");
                                    System.out.println("(1) Melhor ator ");
                                    System.out.println("(2) Melhor atriz");
                                    System.out.println("(3) Melhor Ator/Atriz Principal");
                                    System.out.println("(4) Melhor Ator/Atriz Secundário");
                                    System.out.println("(5) Prémio Carreira");
                                    System.out.println("(6) Melhor filme");
                                    System.out.println("(7) Melhor Realizador");
                                    System.out.println("(8) Voltar ao menu principal");
                                    opcao3 = scan.nextInt();
                                    switch(opcao3){
                                        case 1:
                                            if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size() == 4)
                                                System.out.println("Atores já previamente selecionados");
                                            else{
                                            
                                            int selecionados =0;
                                            
                                            int selecionado = 0;
                                            while(selecionados <4){
                                            boolean mator = false;
                                            boolean mator2 = false;
                                            String nomeator;
                                            System.out.println("Qual o nome do ator");
                                            nomeator = scan.next();
                                            System.out.println("Qual o sobrenome do ator");
                                            nomeator = nomeator + " " + scan.next();
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getMasculinos().size();i++){
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getMasculinos().get(i).getNome())){
                                                    mator=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mator){
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMAtores().getAtores().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getMasculinos().get(selecionado).getNome()))
                                                       mator2 = true;
                                                }
                                                if(mator2){
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMAtores().getAtores().add(principal.getEdicoes().get(selecionada).getMasculinos().get(selecionado));
                                                    selecionados++;
                                                }
                                            }
                                            else{
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                            
                                        case 2:
                                            
                                            if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size() == 4)
                                                System.out.println("Atrizes já previamente selecionados");
                                            else{
                                            
                                            int selecionados =0;
                                            boolean matriz = false;
                                            boolean matriz2 = false;
                                            int selecionado = 0;
                                            while(selecionados <4){
                                            String nomeatriz;
                                            System.out.println("Qual o nome do ator");
                                            nomeatriz = scan.next();
                                            System.out.println("Qual o sobrenome do ator");
                                            nomeatriz = nomeatriz + " " + scan.next();
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getFemininos().size();i++){
                                                if(nomeatriz.equals(principal.getEdicoes().get(selecionada).getFemininos().get(i).getNome())){
                                                    matriz=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(matriz){
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFemininos().get(selecionado).getNome()))
                                                       matriz2 = true;
                                                }
                                                if(matriz2){
                                                    System.out.println("Atriz já selecionado!");
                                                    
                                                }
                                                else{
                                                    
                                                    principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().add(principal.getEdicoes().get(selecionada).getFemininos().get(selecionado));
                                                    selecionados++;
                                                }
                                            }
                                            else{
                                                System.out.println("Atriz inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                            
                                        case 3:
                                            int selecionados = 0;
                                            if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size() == 4)
                                                System.out.println("Atores já previamente selecionados!");
                                            else{
                                            while(selecionados < 4){
                                            boolean homem = false;
                                            boolean mulher = false;
                                            int pos_ator = 0;
                                            String nomeatorprincipal;
                                            System.out.println("Qual o nome do ator/atriz");
                                            nomeatorprincipal = scan.next();
                                            System.out.println("Qual o sobrenome do ator/atriz");
                                            nomeatorprincipal = nomeatorprincipal + " " + scan.next();
                                            for(int i = 0; i < principal.getEdicoes().get(selecionada).getPrincipais().size(); i++){
                                                if(nomeatorprincipal.equals(principal.getEdicoes().get(selecionada).getPrincipais().get(i).getNome())){
                                                    homem = true;
                                                    pos_ator = i;
                                                }
                                                    
                                            }
                                            for(int j = 0; j < principal.getEdicoes().get(selecionada).getAtzPrincipais().size(); j++){
                                                if(nomeatorprincipal.equals(principal.getEdicoes().get(selecionada).getAtzPrincipais().get(j).getNome())){
                                                    mulher = true;
                                                    pos_ator = j;
                                                }
                                            }
                                            if(homem){
                                                homem = false;
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size(); k++){
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator).getNome()))
                                                        homem = true;
                                                }
                                                if(homem)
                                                    System.out.println("Ator já selecionado!");
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().add(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator));
                                                    selecionados++;
                                                }
                                                
                                            }
                                            else if(mulher){
                                                mulher = false;
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size(); k++){
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator).getNome()))
                                                        mulher = true;
                                                }
                                                if(mulher)
                                                    System.out.println("Atriz já selecionada");
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().add(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator));
                                                    selecionados++;
                                                }
                                            }
                                            else{
                                                System.out.println("Ator inexistente ou não apto para esta categoria!");
                                            }
                                            }
                                            }
                                                
                                            break;
                                        case 4:
                                            if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size() == 4)
                                                System.out.println("Atores já previamente selecionados");
                                            else{
                                            
                                            int selecionados2 =0;
                                            
                                            int selecionado = 0;
                                            while(selecionados2 <4){
                                            boolean msecundario = false;
                                            boolean msecundario2 = false;
                                            String nomeator;
                                            System.out.println("Qual o nome do ator/atriz");
                                            nomeator = scan.next();
                                            System.out.println("Qual o sobrenome do ator/atriz");
                                            nomeator = nomeator + " " + scan.next();
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getSecundarios().size();i++){
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getSecundarios().get(i).getNome())){
                                                    msecundario=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(msecundario){
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getSecundarios().get(selecionado).getNome()))
                                                       msecundario2 = true;
                                                }
                                                if(msecundario2){
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMSecundario().getAtores().add(principal.getEdicoes().get(selecionada).getSecundarios().get(selecionado));
                                                    selecionados2++;
                                                }
                                            }
                                            else{
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                         
                                            break;
                                        case 5:
                                            if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size() == 4)
                                                System.out.println("Atores já previamente selecionados");
                                            else{
                                            
                                            int selecionados2 =0;
                                            
                                            int selecionado = 0;
                                            while(selecionados2 <4){
                                            boolean pcarreira = false;
                                            boolean pcarreira2 = false;
                                            String nomeator;
                                            System.out.println("Qual o nome do ator/atriz");
                                            nomeator = scan.next();
                                            System.out.println("Qual o sobrenome do ator/atriz");
                                            nomeator = nomeator + " " + scan.next();
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getCarreira().size();i++){
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getCarreira().get(i).getNome())){
                                                    pcarreira =true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(pcarreira){
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getCarreira().get(selecionado).getNome()))
                                                       pcarreira2 = true;
                                                }
                                                if(pcarreira2){
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getPCarreira().getAtores().add(principal.getEdicoes().get(selecionada).getCarreira().get(selecionado));
                                                    selecionados2++;
                                                }
                                            }
                                            else{
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                          
                                            break;
                                            
                                            
                                            
                                        case 6:
                                            if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size() == 4)
                                                System.out.println("Filmes já previamente selecionados");
                                            else{
                                            int selecionados2 =0;
                                            
                                            int selecionado = 0;
                                            while(selecionados2 <4){
                                            boolean mfilme = false;
                                            boolean mfilme2 = false;
                                            String nomefilme;
                                            System.out.println("Qual o nome do filme");
                                            nomefilme = scan.next();
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size(); j++){
                                                    if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{
                                                    principal.getEdicoes().get(selecionada).getMFilme().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++;
                                                }
                                            }
                                            else{
                                                System.out.println("Filme inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                                
                                                
                                                
                                             break;   
                                        case 7:
                                            
                                            if(principal.getEdicoes().get(selecionada).getMap().size() ==4){
                                                System.out.println("Realizadores já previemente selecionados");
                                                break;
                                            }
                                            String nome_realizador;
                                            boolean rel = false;
                                            int realizadores=0;
                                            int pos_rel=0;
                                            boolean rel_adi = false;
                                            while(realizadores<4){
                                                System.out.println("Qual o nome do realizador?");
                                                nome_realizador = scan.next();  
                                                for(int i =0;i< principal.getEdicoes().get(selecionada).getRealizadores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getRealizadores().get(i).equals(nome_realizador)){
                                                        rel = true;
                                                        pos_rel = i;
                                                    }
                                                }
                                                if(rel){
                                                    for(int k =0; k< principal.getEdicoes().get(selecionada).getMap().size();k++){
                                                        if(principal.getEdicoes().get(selecionada).getMap().containsKey(nome_realizador)){
                                                            rel_adi = true;
                                                        }
                                                    }
                                                    if(rel_adi)
                                                        System.out.println("Realizador já selecionado");
                                                    else{
                                                        
                                                        principal.getEdicoes().get(selecionada).getMap().put(nome_realizador,Pontuacao(principal.getEdicoes().get(selecionada)));
                                                        realizadores++;
                                                    }
                                                }else
                                                    System.out.println("Realizador não existe ou não é apto para esta categoria!");
                                                
                                            }                                 
                                            
                                        case 8:
                                            running2 = false;
                                            
                                            
                                            
                                        }
                                    }while(running2 == true);
                                    //}
                                    break;
                                            
                                case 10:
                                    
                                    do{
                                    int opcao4;
                                    
                                    System.out.println("Deseja atribuir a pontuação em qual categoria?: ");
                                    System.out.println("(1) Melhor ator ");
                                    System.out.println("(2) Melhor atriz");
                                    System.out.println("(3) Melhor Ator/Atriz Principal");
                                    System.out.println("(4) Melhor Ator/Atriz Secundário");
                                    System.out.println("(5) Prémio Carreira");
                                    System.out.println("(6) Melhor filme");
                                    System.out.println("(7) Melhor Realizador");
                                    System.out.println("(8) Voltar ao menu principal");
                                    opcao4 = scan.nextInt();
                                    switch(opcao4){
                                        case 1:
                                            boolean existe_concorrente = false;
                                            int p;
                                            double pontuacao;
                                            int indice_concorrente=0;
                                            String concorrente;
                                            if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMAtores().getAtores().size();i++){
                                                principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            p = scan.nextInt();
                                            if(p == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");
                                                concorrente = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente = concorrente +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMAtores().getAtores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).getNome().equals(concorrente)){
                                                        existe_concorrente = true;
                                                        indice_concorrente = i;
                                                    }
                                                    if(existe_concorrente){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(indice_concorrente).setPontos(pontuacao);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            
                                        case 2:
                                            boolean existe_concorrente1 = false;
                                            int p1;
                                            double pontuacao1;
                                            int indice_concorrente1=0;
                                            String concorrente1;
                                            if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size();i++){
                                                principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            p1 = scan.nextInt();
                                            if(p1 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");
                                                concorrente1 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente1 = concorrente1 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).getNome().equals(concorrente1)){
                                                        existe_concorrente1 = true;
                                                        indice_concorrente1 = i;
                                                    }
                                                    if(existe_concorrente1){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao1 = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(indice_concorrente1).setPontos(pontuacao1);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                        case 3:
                                            boolean existe_concorrente2 = false;
                                            int p2;
                                            double pontuacao2;
                                            int indice_concorrente2=0;
                                            String concorrente2;
                                            if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size();i++){
                                                principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            p2 = scan.nextInt();
                                            if(p2 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");
                                                concorrente2 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente2 = concorrente2 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).getNome().equals(concorrente2)){
                                                        existe_concorrente2 = true;
                                                        indice_concorrente2 = i;
                                                    }
                                                    if(existe_concorrente2){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao2 = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(indice_concorrente2).setPontos(pontuacao2);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                        case 4:
                                            boolean existe_concorrente3 = false;
                                            int p3;
                                            double pontuacao3;
                                            int indice_concorrente3=0;
                                            String concorrente3;
                                            if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size();i++){
                                                principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            p3 = scan.nextInt();
                                            if(p3 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");
                                                concorrente3 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente3 = concorrente3 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).getNome().equals(concorrente3)){
                                                        existe_concorrente3 = true;
                                                        indice_concorrente3 = i;
                                                    }
                                                    if(existe_concorrente3){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao3 = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(indice_concorrente3).setPontos(pontuacao3);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                        case 5:
                                            boolean existe_concorrente4 = false;
                                            int p4;
                                            double pontuacao4;
                                            int indice_concorrente4=0;
                                            String concorrente4;
                                            if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size();i++){
                                                principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            p4 = scan.nextInt();
                                            if(p4 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");
                                                concorrente4 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente4 = concorrente4 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).getNome().equals(concorrente4)){
                                                        existe_concorrente4 = true;
                                                        indice_concorrente4 = i;
                                                    }
                                                    if(existe_concorrente4){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao4 = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(indice_concorrente4).setPontos(pontuacao4);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                        case 6:
                                            boolean existe_filme = false;
                                            int q;
                                            double pontuacao6;
                                            int indice_filme=0;
                                            String nome_filme1;
                                            if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size()<4){
                                                System.out.println("Selecione primeiro os participantes!");
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size();i++){
                                                principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).setPontos(Pontuacao(principal.getEdicoes().get(selecionada)));
                                                System.out.println(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).MostraP());
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");
                                            System.out.println("(1) Sim || (0) Não ");
                                            q = scan.nextInt();
                                            if(q == 1){
                                                System.out.println("Qual o nome do filme que deseja alterar a pontuação?");
                                                nome_filme1 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size();i++){
                                                    if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).getNome().equals(nome_filme1)){
                                                        existe_filme = true;
                                                        indice_filme = i;
                                                    }
                                                    if(existe_filme){
                                                        System.out.println("Qual a nova pontuação?");
                                                        pontuacao6 = scan.nextDouble();
                                                        principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(indice_filme).setPontos(pontuacao6);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                        case 7:
                                            System.out.println(principal.getEdicoes().get(selecionada).getMap());
                                            break;
                                        case 8:
                                            running3=false;
                                    }
                                    }while(running3==true);
                                    
                                    
                                    
                                        
                                    
                                    break;
                                    
                                    
                                    
                                    
                                    
                                    

                                case 11:
                                    System.exit(0);
                                case 12:
                                    System.out.println(principal.getEdicoes().get(selecionada).getMAtores());
                                    
                                    BubbleSort(principal.getEdicoes().get(selecionada).getMAtores().getAtores());
                                    break;
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
    
    public static double Pontuacao(EdicaoFestival f){ // Gera um valor aleatório para cade perito e devolve a média do mesmo
        int pontos=0;
        double media;
        for(int i = 0; i< f.getPeritos().size();i++){
            pontos = pontos + f.getPeritos().get(i).geraPontos();
        }
        media = pontos/f.getPeritos().size();
        return media;
    }
    
public static void BubbleSort(ArrayList<Ator> a){ //Organiza a lista com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos()<a.get(j+1).getPontos()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getPontos()+" pontos!");
   }
}


        
  
