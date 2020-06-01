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
        String[] categorias = {"Melhor Ator" , "Melhor Atriz","Melhor Ator/Atriz Principal","Melhor Ator Secundário", "Melhor Filme", "Melhor realizador","Prémio Carreira","Melhor Banda Sonora","Melhores Cenários","Melhores efeitos visuais","Melhor história"};
        
        
        Scanner scan = new Scanner(System.in, "cp1252");
        boolean running = true;
        boolean running2 = true;
        boolean running3 = true;
        boolean running4 = true;
        
        
        
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
        Ator Ateste10 = new Ator("Joquim W",21,true);
        Ator Ateste11 = new Ator("Bernardo V",21,true);
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
        principal.getEdicoes().get(0).addAtor(Ateste10);
        principal.getEdicoes().get(0).addAtor(Ateste11);
        principal.getEdicoes().get(0).addAtor(Ateste12);
        principal.getEdicoes().get(0).addAtor(Ateste13);
        principal.getEdicoes().get(0).addAtor(Ateste14);
        
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste, true); // João 0 prin
        Ateste.setFilme("Teste");
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste2, true);// Miguel 1 prin
        Ateste2.setFilme("Teste1");
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste3, true);// Dinarte 2 prin
        Ateste3.setFilme("Teste2");
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste4, false); // Filipe 0--
        Ateste4.setFilme("Teste");
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste5, true); // Ana 0 prin
        Ateste5.setFilme("Teste");
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste6, true); // Joana 1 prin
        Ateste6.setFilme("Teste1");
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste7, true); // Maria 2 prin
        Ateste7.setFilme("Teste2");
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste8, false); // Sara 1
        Ateste8.setFilme("Teste1");
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste9, false); // Marco 2
        Ateste9.setFilme("Teste2");
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste9, false); // Marco 0
        Ateste9.setFilme("Teste");
        principal.getEdicoes().get(0).getFilmes().get(0).addNovoAtor(Ateste8, false); // Sara 0
        Ateste8.setFilme("Teste");
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste, false); // João 1
        Ateste.setFilme("Teste1");
        principal.getEdicoes().get(0).getFilmes().get(1).addNovoAtor(Ateste5, false); // Ana 1
        Ateste5.setFilme("Teste1");
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste3, false); // Dinarte 2
        Ateste3.setFilme("Teste2");
        principal.getEdicoes().get(0).getFilmes().get(2).addNovoAtor(Ateste6, false); // Joana 2
        Ateste6.setFilme("Teste2");
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste2, true); // Miguel 3 prin
        Ateste2.setFilme("Teste3");
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste7, true); // Maria 3 prin
        Ateste7.setFilme("Teste3");
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste10, false); // Johny 3
        Ateste10.setFilme("Teste3");
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste12, false); // Luana 3
        Ateste12.setFilme("Teste3");
        principal.getEdicoes().get(0).getFilmes().get(3).addNovoAtor(Ateste11, false); // Big 3
        Ateste11.setFilme("Teste3");
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste10,true); // Johny 4 prin
        Ateste10.setFilme("Teste4");
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste12,true); // Luana 4 prin
        Ateste12.setFilme("Teste4");
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste11,false); // Big 4
        Ateste11.setFilme("Teste4");
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste13,false); // Manuela 4
        Ateste13.setFilme("Teste4");
        principal.getEdicoes().get(0).getFilmes().get(4).addNovoAtor(Ateste14,false); // Pedro 4
        Ateste14.setFilme("Teste4");
        do{
            boolean ok = false;
            while (!ok){
            System.out.println("### FESTIVAL DE CINEMA ###");
            System.out.println("O que pretende fazer ?");
            System.out.println("(1) Criar Nova Edição" );
            System.out.println("(2) Edição Existente");
            System.out.println("(3) Fechar programa!");
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
                case 1: // criar edição
                    boolean existeedicao=false;
                    boolean ok4 = false;
                    while(!ok4){
                        System.out.println("Qual o numero de edição?");
                        try{
                        num_edicao = scan.nextInt();
                        ok4 = true;
                        }
                        catch(InputMismatchException e){
                          System.out.println("Input Inválido!!");
                          scan.nextLine(); 
                        }
                    }
                    for(int i =0;i< principal.getEdicoes().size();i++){ // percorre o array edicoes
                        if (principal.getEdicoes().get(i).getNumEdicao()==num_edicao) // verifica se existe o numero de edicao
                            existeedicao = true;
                     }
                    if(existeedicao) // se já existir - mensagem de erro
                        System.out.println("Essa edição já existe!");
                    else{ // caso contrário cria a edição!!
                        principal.addEdicao(novaEdicao(num_edicao));
                         System.out.println("Edição Criada!");}
                    break;
                case 2: // aceder edição existente
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
                    for(int i =0;i<principal.getEdicoes().size();i++){ // percorre o array edições
                        if(principal.getEdicoes().get(i).getNumEdicao()==num_edicao){ // verifica se existe
                           existe_edicao=true;                            
                        }else // se não existir avançamos para a próxima
                            selecionada++;                        
                    }if(!existe_edicao){ // se não existir esta edição - mensagem de erro
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
                            System.out.println("(9) Selecionar os participantes para as categorias");
                            System.out.println("(10) Atribuir pontuação aos participantes");
                            System.out.println("(11) Listar os candidatos ordenados pela avaliação!");
                            System.out.println("(12) Listar os vencedores de cada categoria!");
                            System.out.println("(13) Voltar menu inicial!");
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
                                case 1: // cria filme
                                    String nome;
                                    System.out.println("Qual o nome do filme?");
                                    nome = scan.next();
                                    boolean filmeexiste = false;
                                    for(int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size(); i++){ // percorre o array filmes
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(nome)){ // verifica se existe o filme
                                            filmeexiste = true;                                            
                                        }                                        
                                    }
                                    if (filmeexiste) // se já existir  - mensagem de erro
                                        System.out.println("Filme já inserido previamente!");
                                    else{ // caso contrário o filme é adicionado ao array filmes
                                        principal.getEdicoes().get(selecionada).addFilme(novoFilme(nome));
                                        System.out.println("Filme Adicionado!");
                                    }
                                    break;
                                case 2: // criação de atores
                                    int numero = 0;
                                    int contador = 0; // contador auxiliar
                                    System.out.println("Quantos atores quer adicionar");
                                    numero = scan.nextInt();
                                    while (contador < numero){ // enquanto o contador for menor que o numero de atores que o utilizador pretende inserir
                                    System.out.println("Qual o nome do ator ?");
                                    nome_ator = scan.next();
                                    System.out.println("Qual o sobrenome do ator?");
                                    nome_ator = nome_ator + " "+ scan.next();
                                    boolean nome_existe = false;
                                    for(int i = 0;i<principal.getEdicoes().get(selecionada).getAtores().size();i++ ){ // percorre o array atores
                                        if(principal.getEdicoes().get(selecionada).getAtores().get(i).getNome().equals(nome_ator)) // verifica se o ator existe
                                            nome_existe = true;                                     
                                    }
                                    if(nome_existe) // se ator já existir - mensagem de erro
                                        System.out.println("Esse ator já existe!");
                                    else if(!nome_existe){ // caso contrário é adicionado ao array atores
                                        principal.getEdicoes().get(selecionada).getAtores().add(criaAtor(nome_ator)); // chamada à função criaAtor(localizada no fim do main)
                                        contador++; // incrementa o contador
                                    }
                                    }
                                    break;
                                case 3: // Lista os filmes 
                                    if(principal.getEdicoes().get(selecionada).getFilmes().isEmpty()){
                                        System.out.println("Por favor insire primeiro alguns filmes!!");
                                        break;
                                    }
                                    else{
                                        System.out.println(principal.getEdicoes().get(selecionada));
                                        break;
                                    }
                                    
                                case 4: // Lista os atores
                                    if (principal.getEdicoes().get(selecionada).getAtores().isEmpty()){
                                        System.out.println("Nenhum ator ainda inserido!!");
                                        break;
                                    }
                                    else{
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getAtores().size();i++){                                        
                                        System.out.println(principal.getEdicoes().get(selecionada).getAtores().get(i).atorFilmes()); // lista os atores e os filmes em que participam                                           
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
                                case 6: // imprime as categorias
                                    for (String categoria : categorias) {
                                        System.out.println(categoria + "\n");
                                }
                                    break;
                                case 7: // criação de peritos
                                    int num_peritos=0;
                                    String nomep;
                                    boolean ok5 = false;
                                    while(!ok5){
                                        System.out.println("Quantos peritos terá o painel?");
                                        try{
                                        num_peritos = scan.nextInt();
                                        ok5 = true;
                                        }
                                        catch(InputMismatchException e){
                                            System.out.println("Input Inválido!!");
                                            scan.nextLine();
                                        }
                                    }
                                    for(int i=0;i<num_peritos;i++){ // percorre o array peritos                                  
                                        System.out.println("Qual o nome do perito?");
                                        nomep = scan.next();
                                        Peritos p = new Peritos(nomep); // instancia um novo perito
                                        principal.getEdicoes().get(selecionada).addPerito(p); // adiciona o perito
                                        System.out.println("Perito "+(i+1)+ " adicionado"); // mensagem de sucesso
                                    }
                                    
                                    break;
                                case 8:
                                    // Requesitos para atribuição de premios!!
                                    System.out.println("Requesitos para atribuição de prémios:");
                                    System.out.println("Necessários:");
                                    System.out.println("- Pelo menos 4 atores diferentes");
                                    System.out.println("- Pelo menos 4 atrizes diferentes");
                                    System.out.println("- Pelo menos 4 atores/atrizes principais diferentes");
                                    System.out.println("- Pelo menos 4 atores/atrizes com mais 20 anos de carreira");
                                    System.out.println("- Pelo menos 4 filmes( Cada um com pelo menos um ator/atriz principal e dois atores secundários");
                                    System.out.println("- Pelo menos 4 realizadores diferentes!!");
                                    break;
                                case 9:
                                    
                                    int opcao3;
                                    
                                    
                                    //Verificação do numero de atores
                                    
                                    
                                    int num_atores = principal.getEdicoes().get(selecionada).getMasculinos().size();
                                    int num_atrizes=principal.getEdicoes().get(selecionada).getFemininos().size();
                                    boolean existe;
                                    boolean existe2;
                                    boolean masculino;
                                    boolean feminino;
                                    boolean masculino2;
                                    boolean feminino2;
                                    int filme = 0;
                                    int ator = 0;
                                    for(int i =0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){ // percorre o array filmes
                                        existe = false;
                                        existe2 = false;
                                        if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome().equals("")){ // verifica se existe ator principal
                                            for(int k = 0;k < principal.getEdicoes().get(selecionada).getMasculinos().size(); k++){ // percorre o array de atores masculinos
                                                if(principal.getEdicoes().get(selecionada).getMasculinos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome())) // verifica se já existe o ator principal do filme de indice i no array
                                                    existe = true;
                                            }
                                            if(existe){ // se ja existir não faz nada
                                                num_atores = num_atores + 0;
                                            }
                                            else{ // caso contrário adiciona ao array de atores masculinos
                                                principal.getEdicoes().get(selecionada).getMasculinos().add(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0));
                                                num_atores++; // incrementa o contador
                                            }
                                        }
                                    
                                        if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome().equals("")){ // verifica se existe atriz principal
                                            for(int k = 0; k < principal.getEdicoes().get(selecionada).getFemininos().size(); k++){ // percorre o array de atrizes
                                                if(principal.getEdicoes().get(selecionada).getFemininos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome())) // verifica se já existe a atriz principal do filme de indice i no array
                                                    existe2 = true;
                                            }
                                        if(existe2){ // se já existir não faz nada
                                            num_atrizes = num_atrizes + 0;
                                        }
                                        else{ //  caso contrário adiciona ao array de atrizes 
                                            principal.getEdicoes().get(selecionada).getFemininos().add(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1));
                                            num_atrizes++; // incrementa o contador;
                                        }
                                        }
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size() > 2){ // se o filme de indice i tiver atores secundarios
                                        for(int j = 2; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size(); j++){ // percorre o array de atores do filme a partir da posição 2( visto que a posição 0 e 1 correspondem aos atores principais)
                                            masculino = false;
                                            masculino2 = false;
                                            feminino = false;
                                            feminino2 = false;
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(j).getGenero()){ //verifica o genero do ator
                                                masculino = true;
                                                filme = i;
                                                ator = j;
                                            }
                                            else{
                                                feminino = true;
                                                filme = i;
                                                ator = j;
                                            }
                                            if(masculino){ // se for masculino
                                                for(int k = 0 ; k < principal.getEdicoes().get(selecionada).getMasculinos().size();k++){ // percorre o array de atores masculinos
                                                     // verifica se já existe o ator de indice j do filme i no array
                                                    if(principal.getEdicoes().get(selecionada).getMasculinos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator).getNome())) 
                                                        masculino2 = true;
                                                }
                                                if(masculino2){ // se já existir nada acontece
                                                    num_atores = num_atores + 0;
                                                }
                                                else{ // caso contrário adiciona ao array de atores masculinos
                                                    principal.getEdicoes().get(selecionada).getMasculinos().add(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator));
                                                    num_atores++; // incrementa o contador
                                                }
                                            }
                                            if(feminino){ // se for feminino
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getFemininos().size(); k++){ // percorre o array de atrizes
                                                    // verifica se já existe a atriz de indice j do filme de indice i no array
                                                    if(principal.getEdicoes().get(selecionada).getFemininos().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(filme).getAtores().get(ator).getNome()))
                                                        feminino2 = true;
                                                }
                                                if(feminino2){ // se já existir nada acontece
                                                    num_atrizes = num_atrizes + 0;
                                                }
                                                else{ // caso contrário adiciona ao array de atrizes
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
                                    
                                    int atoresprincipais = 0; // contador auxiliar
                                    int principais = principal.getEdicoes().get(selecionada).getPrincipais().size();
                                    int pos_filme = 0;
                                    boolean quebrou;
                                    boolean atprincipais; 
                                    while(atoresprincipais < principal.getEdicoes().get(selecionada).getFilmes().size()){
                                        for (int i = 0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){ // percorre o array filmes
                                            atprincipais = false;
                                            quebrou = false;
                                            if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(0).getNome().equals("")){ // verifica se existe ator principal
                                                atprincipais = true;
                                                pos_filme = i;
                                            }
                                            if(atprincipais){ // se existir
                                                
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getPrincipais().size(); j++){ // percorre o array de atores principais
                                                    // verifica se já existe o ator principal do filme de indice i no array
                                                    if(principal.getEdicoes().get(selecionada).getPrincipais().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme).getAtores().get(0).getNome())){
                                                       quebrou = true;
                                                    }
                                                }
                                                if(quebrou == true){ // se ja existir nada acontece
                                                    atoresprincipais++; //  incrementa o contador auxiliar
                                                }
                                                else{ // caso contrário adiciona ao array de atores masculinos
                                                    principal.getEdicoes().get(selecionada).getPrincipais().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme).getAtores().get(0));
                                                    principais++; // incrementa o contador
                                                    atoresprincipais++; // incrementa o contador auxiliar
                                                }
                                            }
 
                                            else{ // se não existir incrementa o contador auxiliar
                                                
                                                atoresprincipais++; 
                                            }
                                                
                                        }
                                    }
                                    
                                    System.out.println("Numero de atores principais: " + principais);
                                    
                                    // Verificação do numero de atrizes principais 
                                    
                                    int atrizesprincipais = 0;
                                    int principaisf = principal.getEdicoes().get(selecionada).getAtzPrincipais().size();
                                    int pos_filme2 = 0;
                                    boolean quebrou2 = false;
                                    boolean atzprincipais = false;
                                    while(atrizesprincipais < principal.getEdicoes().get(selecionada).getFilmes().size()){
                                        for (int i = 0;i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){ // percorre o array filmes
                                            atzprincipais = false;
                                            quebrou2 = false;
                                            if(!principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(1).getNome().equals("")){ // verifica se existe atriz principal
                                                atzprincipais = true;
                                                pos_filme2 = i;
                                            }
                                            if(atzprincipais){ // se existir
                                                
                                                    for(int j = 0; j < principal.getEdicoes().get(selecionada).getAtzPrincipais().size(); j++){
                                                        // verifica se já existe atriz principal do filme de indice i no array
                                                        if(principal.getEdicoes().get(selecionada).getAtzPrincipais().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme2).getAtores().get(1).getNome())){
                                                            quebrou2 = true;
                                                        }
                                                    }
                                                    if(quebrou2 == true){ // se já existir
                                                        atrizesprincipais++; // incrementa o contador auxiliar
                                                    }
                                                    else{ // caso contrário adicona ao array de atrizes principais 
                                                        principal.getEdicoes().get(selecionada).getAtzPrincipais().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme2).getAtores().get(1));
                                                        principaisf++; // incrementa o contador
                                                        atrizesprincipais++; // incrementa o contador auxiliar
                                                    }
                                            }
                                            else{ // se não existir apenas incrementa o contador auxiliar
                                                
                                                atrizesprincipais++;
                                            }
                                                
                                        }
                                    }
                                    
                                    System.out.println("Numero de atrizes principais: " + principaisf);
                                    
                                    
                                    //Verificação de Atores secundários
                                    
                                    
                                    boolean existe_secundário=false;
                                    int num_secundários = principal.getEdicoes().get(selecionada).getSecundarios().size();
                                    int pos_filme3 = 0;
                                    int pos_ator2 = 0;
                                    boolean secundário_adc = false;
                                    boolean quebrou3 = false;
                                    int ifilme =0;
                                    while(ifilme<principal.getEdicoes().get(selecionada).getFilmes().size()){
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(ifilme).getAtores().size()>2) // verifica se existe atores secundários
                                            existe_secundário = true;
                                        if(existe_secundário){ // se existir
                                            for(int i =2;i<principal.getEdicoes().get(selecionada).getFilmes().get(ifilme).getAtores().size();i++){ // percorre o array de atores do filme
                                                secundário_adc = false;
                                                pos_ator2 = i;
                                                pos_filme3 =ifilme;
                                                for(int k = 0; k<principal.getEdicoes().get(selecionada).getSecundarios().size();k++){ // percorre o array de atores secundários
                                                    // verifica se existe o ator de indice i do filme de indice ifilme no array
                                                    if(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme3).getAtores().get(pos_ator2).getNome().equals(principal.getEdicoes().get(selecionada).getSecundarios().get(k).getNome()))
                                                        secundário_adc = true;
                                                }
                                                if(secundário_adc){ // se ja existir nada acontece
                                                }
                                                else if(!secundário_adc){ // caso contrário adiciona
                                                    principal.getEdicoes().get(selecionada).getSecundarios().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme3).getAtores().get(pos_ator2));
                                                    num_secundários++; // incrementa contador
                                                }
                                            }   
                                        } else{
                                        }
                                        ifilme++; // passa para o proximo filme
                                    }									
                                    
                                    
                                    System.out.println(" Numero de atores secundários:" + num_secundários);
                                    // Verificação de filmes
                                    
                                    int num_filmes = 0;
                                    int num_secundarios2 = 0;
                                    if(principal.getEdicoes().get(selecionada).getFilmes().isEmpty()) // verifica se existe filmes
                                        num_filmes = 0;
                                    else{ // se existir
                                        for(int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size();i++){ // percorre o array filmes
                                            num_secundarios2 = 0;
                                            // verifica se existe pelo um ator/atriz principal
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtorPrincipal().getNome().equals("") && principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtrizPrincipal().getNome().equals(""))
                                                // se não existir nada acontece
                                                num_filmes += 0;
                                            else{ // caso contrário
                                                if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size()>2){ // verifica se existe atores secundários
                                                    for (int j = 2; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size();j++){ // percorre o array de atores do filme
                                                        num_secundarios2++; // incrementa o contador de secundarios
                                                    }
                                                }
                                                if(num_secundarios2 >= 2){ // se houver mais de 2 atores secundarios o filme é adicionado ao array de filmes selecionados
                                                    principal.getEdicoes().get(selecionada).getVerificaFilmes().add(principal.getEdicoes().get(selecionada).getFilmes().get(i));
                                                    num_filmes++; // incrementa o contador de filmes
                                                    
                                                }
                                                
                                                        
                                            }
                                            
                                        }
                                    }
                                    
                                    System.out.println("Numero de filmes: " + num_filmes);
                                    
                                    //Verificação de realizadores
                                    
                                    int num_realizadores = principal.getEdicoes().get(selecionada).getRealizadores().size();
                                    int pos_filme4 = 0;
                                    boolean quebrou4 = false;
                                    boolean realizador = false;
                                    for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size(); i++){ // percorre o array de filmes selecionados
                                        quebrou4 = false;
                                        realizador = false;
                                        if(!principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getRealizador().equals("")){ // verifica se existe realizador
                                            realizador = true;
                                            pos_filme4 = i;
                                        }
                                        if(realizador){
                                            for (int j = 0; j < principal.getEdicoes().get(selecionada).getRealizadores().size();j++){ // percorre o array de realizadores
                                                // verifica se existe o realizador do filme de indice i no array
                                                if(principal.getEdicoes().get(selecionada).getRealizadores().get(j).equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(pos_filme4).getRealizador()))
                                                    quebrou4 = true;
                                            }
                                            if(quebrou4){ // se existir nada acontece
                                            }
                                            else{ // caso contrário adiciona ao array de realizadores
                                                principal.getEdicoes().get(selecionada).getRealizadores().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(pos_filme4).getRealizador());
                                                num_realizadores++; // incrementa o contador
                                            }
                                            
                                            
                                        }
                                        
                                    }
                                    
                                    System.out.println("Numero de realizadores: " + num_realizadores);
                                        
                                    // Verificação prémio carreira
                                    
                                    int num_carreira = principal.getEdicoes().get(selecionada).getCarreira().size();
                                    int pos_ator3 = 0;
                                    int pos_filme5 = 0;
                                    boolean excedeu;
                                    boolean equivalente;
                                    for (int i = 0; i < principal.getEdicoes().get(selecionada).getFilmes().size(); i++){ // percorre o array filmes
                                        for (int j = 0; j < principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().size(); j++){ // percorre o array de atores do filme 
                                            excedeu = false;
                                            equivalente = false;
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getAtores().get(j).getAnosCarreira() > 20){ // verifica se o ator ja tem 20 ou mais anos de carreira
                                                excedeu = true;
                                                pos_ator3 = j;
                                                pos_filme5 = i;
                                            }
                                            if(excedeu){ // se tiver mais de 20 anos
                                               for(int k = 0; k < principal.getEdicoes().get(selecionada).getCarreira().size(); k++){ // percorre o array carreira
                                                   // verifica se existe o ator de indice j do filme de indice i no array
                                                   if(principal.getEdicoes().get(selecionada).getCarreira().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme5).getAtores().get(pos_ator3).getNome()))
                                                       equivalente = true;
                                               }
                                               if(equivalente){ // se já existir nada acontece
                                               }
                                               else{   // caso contrário adiciona ao array carreira
                                               
                                                   principal.getEdicoes().get(selecionada).getCarreira().add(principal.getEdicoes().get(selecionada).getFilmes().get(pos_filme5).getAtores().get(pos_ator3));
                                                   num_carreira++; // incrementa o contador
                                               
                                               }
                                            }
                                            
                                            
                                        }
                                    }
                                    
                                    System.out.println("Numero de atores aptos para o premio Carreira: " + num_carreira);
                                    
                                    if(num_atores < 4 || num_atrizes < 4 || principais + principaisf < 4 || num_secundários < 4 || num_carreira < 4 || num_filmes < 4 || num_realizadores < 4){
                                        System.out.println("Atores insuficientes para começar processo de seleção");
                                        num_atores = 0;
                                        num_atrizes = 0;
                                        principais = 0;
                                        principais = 0;
                                        num_secundários = 0;
                                        num_carreira = 0;
                                        num_filmes = 0;
                                        num_realizadores = 0;
                                        principal.getEdicoes().get(selecionada).getMasculinos().clear();
                                        principal.getEdicoes().get(selecionada).getFemininos().clear();
                                        principal.getEdicoes().get(selecionada).getPrincipais().clear();
                                        principal.getEdicoes().get(selecionada).getAtzPrincipais().clear();
                                        principal.getEdicoes().get(selecionada).getCarreira().clear();
                                        principal.getEdicoes().get(selecionada).getVerificaFilmes().clear();
                                        principal.getEdicoes().get(selecionada).getRealizadores().clear();
                                        principal.getEdicoes().get(selecionada).getSecundarios().clear();
                                    }
                                    else{
                                    do{
                                    
                                    System.out.println("Deseja selecionar os participantes para qual categoria?: ");
                                    System.out.println("(1) Melhor ator ");
                                    System.out.println("(2) Melhor atriz");
                                    System.out.println("(3) Melhor Ator/Atriz Principal");
                                    System.out.println("(4) Melhor Ator/Atriz Secundário");
                                    System.out.println("(5) Prémio Carreira");
                                    System.out.println("(6) Melhor filme");
                                    System.out.println("(7) Melhor Realizador");
                                    System.out.println("(8) Melhor Banda Sonora");
                                    System.out.println("(9) Melhores Cenários");
                                    System.out.println("(10) Melhores efeitos visuais");
                                    System.out.println("(11) Melhor história");
                                    System.out.println("(12) Voltar ao menu principal");
                                    opcao3 = scan.nextInt();
                                    switch(opcao3){
                                        case 1:
                                            if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size() == 4) // se já tiverem sido escolhidos os 4 atores
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getMasculinos().size();i++){ // percorre o array de atores masculinos
                                                // verifica se existe o ator inserido pelo utilizador
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getMasculinos().get(i).getNome())){ 
                                                    mator=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mator){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMAtores().getAtores().size(); j++){ // percorre o array atores da categoria melhor ator
                                                    // verifica se já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getMasculinos().get(selecionado).getNome()))
                                                       mator2 = true;
                                                }
                                                if(mator2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de atores da categoria melhores atores
                                                    principal.getEdicoes().get(selecionada).getMAtores().getAtores().add(principal.getEdicoes().get(selecionada).getMasculinos().get(selecionado));
                                                    selecionados++; // incrementa contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                            
                                        case 2:
                                            
                                            if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size() == 4) // se já tiverem sido escolhidos as 4 atrizes
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getFemininos().size();i++){ // percorre o array de atrizes
                                                // verifica se existe a atriz inserido pelo utilizador
                                                if(nomeatriz.equals(principal.getEdicoes().get(selecionada).getFemininos().get(i).getNome())){
                                                    matriz=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(matriz){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size(); j++){ // percorre o array de melhores atrizes
                                                    // verifica se já foi selecionada
                                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getFemininos().get(selecionado).getNome()))
                                                       matriz2 = true;
                                                }
                                                if(matriz2){ // se já tiver sido selecionada - mensagem de erro
                                                    System.out.println("Atriz já selecionado!"); 
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de atores da categoria melhores atrizes
                                                    
                                                    principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().add(principal.getEdicoes().get(selecionada).getFemininos().get(selecionado));
                                                    selecionados++; // incrementa contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Atriz inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                            
                                        case 3:
                                            int selecionados = 0;
                                            if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size() == 4) // se já tiverem sido escolhidos
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
                                            for(int i = 0; i < principal.getEdicoes().get(selecionada).getPrincipais().size(); i++){ // percorre o array de atores principais
                                                // verifica se o ator inserido pelo utilizador é ator principal 
                                                if(nomeatorprincipal.equals(principal.getEdicoes().get(selecionada).getPrincipais().get(i).getNome())){
                                                    homem = true;
                                                    pos_ator = i;
                                                }
                                                    
                                            }
                                            for(int j = 0; j < principal.getEdicoes().get(selecionada).getAtzPrincipais().size(); j++){ // percorre o array de atrizes principais
                                                // verifica se o ator inserido pelo utilizador é atriz principal 
                                                if(nomeatorprincipal.equals(principal.getEdicoes().get(selecionada).getAtzPrincipais().get(j).getNome())){
                                                    mulher = true;
                                                    pos_ator = j;
                                                }
                                            }
                                            if(homem){ // se for ator principal
                                                homem = false;
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size(); k++){ // percorre o array de atores da categoria melhor ator/atriz principal
                                                    // verifica se o ator já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator).getNome()))
                                                        homem = true;
                                                }
                                                if(homem) // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Ator já selecionado!");
                                                else{ // caso contrário adiciona ao array de atores da categoria melhor ator/atriz principal
                                                    principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().add(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator));
                                                    selecionados++;
                                                }
                                                
                                            }
                                            else if(mulher){ // se for atriz principal
                                                mulher = false;
                                                for(int k = 0; k < principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size(); k++){ // percorre o array de atores da categoria melhor ator/atriz principal
                                                    // verifica se a atriz já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(k).getNome().equals(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator).getNome()))
                                                        mulher = true;
                                                }
                                                if(mulher) // se já tiver sido selecionada -  mensagem de erro
                                                    System.out.println("Atriz já selecionada");
                                                else{ // caso contrário adiciona ao array de atores da categoria melhor ator/atriz principal
                                                    principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().add(principal.getEdicoes().get(selecionada).getPrincipais().get(pos_ator));
                                                    selecionados++;
                                                }
                                            }
                                            else{ // se nao existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Ator inexistente ou não apto para esta categoria!");
                                            }
                                            }
                                            }
                                                
                                            break;
                                        case 4:
                                            if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getSecundarios().size();i++){ // percorre o array de atores secundários
                                                // verifica se existe o ator inserido pelo utilizador
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getSecundarios().get(i).getNome())){
                                                    msecundario=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(msecundario){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size(); j++){ // percorre o array de atores da categoria melhor ator secundário
                                                    // verifica se este ator já foi selecionad0
                                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getSecundarios().get(selecionado).getNome()))
                                                       msecundario2 = true;
                                                }
                                                if(msecundario2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário é adicionado ao array de atores da categoria melhor ator secundario
                                                    principal.getEdicoes().get(selecionada).getMSecundario().getAtores().add(principal.getEdicoes().get(selecionada).getSecundarios().get(selecionado));
                                                    selecionados2++; // incrementa o contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria -  mensagem de erro
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                         
                                            break;
                                        case 5:
                                            if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size() == 4) //  se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getCarreira().size();i++){ // percorre o array carreira
                                                // verifica se existe o ator inserido pelo utilizador
                                                if(nomeator.equals(principal.getEdicoes().get(selecionada).getCarreira().get(i).getNome())){
                                                    pcarreira =true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(pcarreira){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size(); j++){ // percorre o array de atores da categoria premio carreira
                                                    // verifica se o ator já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getCarreira().get(selecionado).getNome()))
                                                       pcarreira2 = true;
                                                }
                                                if(pcarreira2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Ator já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de atores da categoria premio carreira
                                                    principal.getEdicoes().get(selecionada).getPCarreira().getAtores().add(principal.getEdicoes().get(selecionada).getCarreira().get(selecionado));
                                                    selecionados2++; // incrementa contador
                                                }
                                            }
                                            else{ // se não exitir ou não estiver apto para esta categoria- mensagem de erro
                                                System.out.println("Ator inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                          
                                            break;
                                            
                                            
                                            
                                        case 6:
                                            if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){ // percorre o array de filmes selecionados
                                                // verifica se existe o filme inserido pelo utilizador
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size(); j++){ // percorre o array de filmes da categoria melhor filme
                                                    // verifica se o filme inserido já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de filmes da categoria melhor filme
                                                    principal.getEdicoes().get(selecionada).getMFilme().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++; // incrementa contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria -  mensagem de erro
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
                                            while(realizadores<4){//Enquanto o num de realizadores for menor que 4
                                                System.out.println("Qual o nome do realizador?"); // Pergunta pelo nome do realizador
                                                nome_realizador = scan.next();  
                                                for(int i =0;i< principal.getEdicoes().get(selecionada).getRealizadores().size();i++){//Percorre a lista que contem os realizadores aptos
                                                    if(principal.getEdicoes().get(selecionada).getRealizadores().get(i).equals(nome_realizador)){
                                                        rel = true;//Caso o realizador existe a variável é colocada a true
                                                        pos_rel = i;// E guardado a posição do mesmo
                                                    }
                                                }
                                                if(rel){//Caso o realizador exista
                                                    for(int k =0; k< principal.getEdicoes().get(selecionada).getMap().size();k++){ // Percorre o mapa onde serão guardados os realizadores a concorrer
                                                        if(principal.getEdicoes().get(selecionada).getMap().containsKey(nome_realizador)){ // //Verifica se já existe esse realizador no mapa é feito constainsKey pq o realizador é a chave e a pontuação o valor
                                                            rel_adi = true;//SE já estiver adicionado coloca a true a variavel
                                                        }
                                                    }
                                                    if(rel_adi) // se já tenha sido adicionado
                                                        System.out.println("Realizador já selecionado");//aparece mensagem dizendo o mesmo
                                                    else{//Caso não tenha sido adicionado
                                                        principal.getEdicoes().get(selecionada).getAux().add(nome_realizador);//Coloca o nome do realizador num ArrayList Auxilar que virá a ser usado para ordenar a pontuação
                                                        principal.getEdicoes().get(selecionada).getMap().put(nome_realizador,Pontuacao(principal.getEdicoes().get(selecionada)));//Coloca no mapa o realizador já com a sua pontuação
                                                        realizadores++;
                                                    }
                                                }else// Caso o realizador não exista é apresentado mensagem com erro
                                                    System.out.println("Realizador não existe ou não é apto para esta categoria!");
                                                
                                            }
                                            break;
                                           
                                        case 8:
                                            if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){ // percorre o array de filmes selecionados
                                                // verifica se existe o filme inserido pelo utilizador
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size(); j++){ // percorre o array de filmes da categoria banda sonoroa
                                                    // verifica se o filme já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de filmes da categoria melhor banda sonora
                                                    principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++; // incrementa contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Filme inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                                
                                                
                                                
                                             break; 
                                        case 9:
                                            if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){ // percorre o array de filmes selecionados
                                                // verifica se existe o filme inserido pelo utilizador
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size(); j++){ // percorre o array de filmes da categoria melhor cenario
                                                    // verifica se o filme inserido já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de filmes da categoria melhor cenário
                                                    principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++;
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Filme inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                        case 10:
                                            if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){ // percorre o array de filmes selecionados
                                                // veririca se existe o filme inserido pelo utilizador
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size(); j++){ // percorre o array de filmes da categoria Melhor Efeitos Visuais
                                                    // verifica se o filme inserido já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário é adicionado ao array de filmes da categoria Melhores Efeitos Visuais
                                                    principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++; // incrementa o contador
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto para esta categoria - mensagem de erro
                                                System.out.println("Filme inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                        case 11:
                                            if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size() == 4) // se já tiverem sido escolhidos
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
                                            for (int i = 0; i < principal.getEdicoes().get(selecionada).getVerificaFilmes().size();i++){ // percorre o array de filmes selecionados
                                                // verifica se o filme inserido pelo utlizador existe
                                                if(nomefilme.equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(i).getNome())){
                                                    mfilme=true;
                                                    selecionado = i;
                                                }
                                            }
                                            
                                            if(mfilme){ // se existir
                                                for(int j = 0; j < principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size(); j++){ // percorre o array de filmes ca categoria Melhor Historia
                                                    // verifica se o filme inserido já foi selecionado
                                                    if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().get(j).getNome().equals(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado).getNome()))
                                                       mfilme2 = true;
                                                }
                                                if(mfilme2){ // se já tiver sido selecionado - mensagem de erro
                                                    System.out.println("Filme já selecionado!");
                                                    
                                                }
                                                else{ // caso contrário adiciona ao array de filmes da categoria Melhor História
                                                    principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().add(principal.getEdicoes().get(selecionada).getVerificaFilmes().get(selecionado));
                                                    selecionados2++;
                                                }
                                            }
                                            else{ // se não existir ou não estiver apto paa esta categoria
                                                System.out.println("Filme inexistente ou não apto para esta categoria!!");
                                            }
                                            }
                                            }
                                            break;
                                        case 12:
                                            running2 = false;// Volta menu principal
                                       
                                            
                                            
                                            
                                        }
                                    }while(running2 == true);
                                    }
                                    break;
                                            
                                case 10:
                                    if(principal.getEdicoes().get(selecionada).getPeritos().isEmpty()){ // se não tiver sido criado o painel de peritos não pode passar para o processo de pontuação
                                        System.out.println("É necessário criar os peritos antes!");
                                        break;
                                    }
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
                                    System.out.println("(8) Melhor Banda Sonora");
                                    System.out.println("(9) Melhores Cenários");
                                    System.out.println("(10) Melhores efeitos visuais");
                                    System.out.println("(11) Melhor história");
                                    System.out.println("(12) Voltar ao menu principal");
                                    opcao4 = scan.nextInt();
                                    switch(opcao4){
                                        case 1:
                                            boolean existe_concorrente = false;
                                            int p;
                                            double pontuacao;
                                            int indice_concorrente=0;
                                            String concorrente;
                                            if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size()<4){ //Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!"); // Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMAtores().getAtores().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).setPontos_MAtor_MAtriz(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).MostraPontos_MAtor_MAtriz());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            p = scan.nextInt();
                                            if(p == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?"); //É perguntado o nome do concorrente
                                                concorrente = scan.next();
                                                System.out.println("Qual o sobrenome ?"); // o Sobrenome
                                                concorrente = concorrente +" "+ scan.next(); // E é tudo junto na variável concorrente
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMAtores().getAtores().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(i).getNome().equals(concorrente)){ // e comparado o nome inserido com os nomes no array
                                                        existe_concorrente = true; // Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_concorrente = i; // e é guardado o indice do concorrente
                                                    }
                                                    if(existe_concorrente){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");  // é perguntado pela nova pontuação
                                                        pontuacao = scan.nextDouble(); // e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMAtores().getAtores().get(indice_concorrente).setPontos_MAtor_MAtriz(pontuacao);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 2:
                                            boolean existe_concorrente1 = false;
                                            int p1;
                                            double pontuacao1;
                                            int indice_concorrente1=0;
                                            String concorrente1;
                                            if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).setPontos_MAtor_MAtriz(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).MostraPontos_MAtor_MAtriz());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            p1 = scan.nextInt();
                                            if(p1 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                concorrente1 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente1 = concorrente1 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(i).getNome().equals(concorrente1)){// e comparado o nome inserido com os nomes no array
                                                        existe_concorrente1 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_concorrente1 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_concorrente1){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao1 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().get(indice_concorrente1).setPontos_MAtor_MAtriz(pontuacao1);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 3:
                                            boolean existe_concorrente2 = false;
                                            int p2;
                                            double pontuacao2;
                                            int indice_concorrente2=0;
                                            String concorrente2;
                                            if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).setPontos_Melhor_P(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).MostraPontos_Melhor_P());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            p2 = scan.nextInt();
                                            if(p2 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                concorrente2 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente2 = concorrente2 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(i).getNome().equals(concorrente2)){// e comparado o nome inserido com os nomes no array
                                                        existe_concorrente2 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_concorrente2 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_concorrente2){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao2 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().get(indice_concorrente2).setPontos_Melhor_P(pontuacao2);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 4:
                                            boolean existe_concorrente3 = false;
                                            int p3;
                                            double pontuacao3;
                                            int indice_concorrente3=0;
                                            String concorrente3;
                                            if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).setPontos_Melhor_S(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).MostraPontos_Melhor_S());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            p3 = scan.nextInt();
                                            if(p3 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                concorrente3 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente3 = concorrente3 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(i).getNome().equals(concorrente3)){// e comparado o nome inserido com os nomes no array
                                                        existe_concorrente3 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_concorrente3 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_concorrente3){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao3 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMSecundario().getAtores().get(indice_concorrente3).setPontos_Melhor_S(pontuacao3);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 5:
                                            boolean existe_concorrente4 = false;
                                            int p4;
                                            double pontuacao4;
                                            int indice_concorrente4=0;
                                            String concorrente4;
                                            if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).setPontos_Premio_C(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).MostraPontos_Premio_C());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            p4 = scan.nextInt();
                                            if(p4 == 1){
                                                System.out.println("Qual o nome do concorrente que deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                concorrente4 = scan.next();
                                                System.out.println("Qual o sobrenome ?");
                                                concorrente4 = concorrente4 +" "+ scan.next();
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(i).getNome().equals(concorrente4)){// e comparado o nome inserido com os nomes no array
                                                        existe_concorrente4 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_concorrente4 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_concorrente4){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao4 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getPCarreira().getAtores().get(indice_concorrente4).setPontos_Premio_C(pontuacao4);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 6:
                                            boolean existe_filme = false;
                                            int q;
                                            double pontuacao6;
                                            int indice_filme=0;
                                            String nome_filme1;
                                            if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).setP_MFilme(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).MostraP_MFilme());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            q = scan.nextInt();
                                            if(q == 1){
                                                System.out.println("Qual o nome do filme que deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                nome_filme1 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(i).getNome().equals(nome_filme1)){// e comparado o nome inserido com os nomes no array
                                                        existe_filme = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_filme = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_filme){// Caso exista esse concorrente
                                                        System.out.println("Qual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao6 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMFilme().getFilmes().get(indice_filme).setP_MFilme(pontuacao6);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 7:
                                            System.out.println(principal.getEdicoes().get(selecionada).getMap()); // A pontuação é atribuida logo quando são escolhidos os realizadores, aqui só será mostrado os valores
                                            break;
                                        case 8:
                                            boolean existe_filme2 = false;
                                            int q2;
                                            double pontuacao62;
                                            int indice_filme2=0;
                                            String nome_filme2;
                                            if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().get(i).setP_MBandaSonora(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().get(i).MostraP_MBandaSonora());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            q2 = scan.nextInt();
                                            if(q2 == 1){
                                                System.out.println("q2ual o nome do filme q2ue deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                nome_filme2 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().get(i).getNome().equals(nome_filme2)){// e comparado o nome inserido com os nomes no array
                                                        existe_filme2 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_filme2 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_filme2){// Caso exista esse concorrente
                                                        System.out.println("q2ual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao62 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().get(indice_filme2).setP_MBandaSonora(pontuacao62);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 9:
                                            boolean existe_filme3 = false;
                                            int q3;
                                            double pontuacao63;
                                            int indice_filme3=0;
                                            String nome_filme3;
                                            if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().get(i).setP_MelhorHistoria(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().get(i).MostraP_MelhorHistoria());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            q3 = scan.nextInt();
                                            if(q3 == 1){
                                                System.out.println("q3ual o nome do filme q3ue deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                nome_filme2 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().get(i).getNome().equals(nome_filme2)){// e comparado o nome inserido com os nomes no array
                                                        existe_filme3 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_filme3 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_filme3){// Caso exista esse concorrente
                                                        System.out.println("q3ual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao63 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().get(indice_filme3).setP_MelhorHistoria(pontuacao63);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 10:
                                            boolean existe_filme4 = false;
                                            int q4;
                                            double pontuacao64;
                                            int indice_filme4=0;
                                            String nome_filme4;
                                            if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().get(i).setP_MelhorEfeitosVisuais(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().get(i).MostraP_MelhorEfeitosVisuais());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            q4 = scan.nextInt();
                                            if(q4 == 1){
                                                System.out.println("q4ual o nome do filme q4ue deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                nome_filme2 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().get(i).getNome().equals(nome_filme2)){// e comparado o nome inserido com os nomes no array
                                                        existe_filme4 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_filme4 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_filme4){// Caso exista esse concorrente
                                                        System.out.println("q4ual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao64 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().get(indice_filme4).setP_MelhorEfeitosVisuais(pontuacao64);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 11:
                                            boolean existe_filme5 = false;
                                            int q5;
                                            double pontuacao65;
                                            int indice_filme5=0;
                                            String nome_filme5;
                                            if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size()<4){//Verifica se já foram selecionados os participantes
                                                System.out.println("Selecione primeiro os participantes!");// Caso não tenham sido selecionados apresenta mensagem de erro e não permite dar pontuação
                                                break;
                                            }
                                            for(int i=0; i<principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size();i++){// Caso os candidatos já tenham sido escolhidos o programa percorre a lista dos mesmos
                                                principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().get(i).setP_MelhorCenarios(Pontuacao(principal.getEdicoes().get(selecionada)));//atribuindo uma pontuação a cada um
                                                System.out.println(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().get(i).MostraP_MelhorHistoria());//Após a atribuição apresenta os valores ao utilizadores
                                        }
                                            System.out.println("Deseja alterar alguma pontuação?");//É dada a opção de mudar as pontuações manualmente
                                            System.out.println("(1) Sim || (0) Não ");
                                            q5 = scan.nextInt();
                                            if(q5 == 1){
                                                System.out.println("q5ual o nome do filme q5ue deseja alterar a pontuação?");//É perguntado o nome do concorrente
                                                nome_filme2 = scan.next();                                                
                                                for(int i =0;i<principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size();i++){// É percorrido o arraylist com os concorrentes
                                                    if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().get(i).getNome().equals(nome_filme2)){// e comparado o nome inserido com os nomes no array
                                                        existe_filme5 = true;// Se alguma for igual o valor da variavél existe_concorrente é colocado a true
                                                        indice_filme5 = i;// e é guardado o indice do concorrente
                                                    }
                                                    if(existe_filme5){// Caso exista esse concorrente
                                                        System.out.println("q5ual a nova pontuação?");// é perguntado pela nova pontuação
                                                        pontuacao65 = scan.nextDouble();// e substituida a mesma
                                                        principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().get(indice_filme5).setP_MelhorCenarios(pontuacao65);
                                                        System.out.println("Pontuação atualizada!");
                                                    }
                                                        
                                                }
                                                
                                            }
                                            break;
                                        case 12:
                                            running3 = false; // Volta ao menu principal
                                    }
                                    }while(running3==true);
                                    
                                    
                                    
                                        
                                    
                                    break;
                                    
                                    
                                    
                                    
                                    
                                    

                                case 11://Verifica se já foram escolhidos os candidatos às categorias, se sim, apresenta-os ordenados pela pontuação
                                    if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor ator ");
                                        BubbleSort_MAtor_MAtriz(principal.getEdicoes().get(selecionada).getMAtores().getAtores());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor atriz");
                                        BubbleSort_MAtor_MAtriz(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Ator/Atriz Principal");
                                        BubbleSort_Melhor_P(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Ator/Atriz Secundário");
                                        BubbleSort_Melhor_S(principal.getEdicoes().get(selecionada).getMSecundario().getAtores());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Prémio Carreira");
                                        BubbleSort_Premio_C(principal.getEdicoes().get(selecionada).getPCarreira().getAtores());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor filme");
                                        BubbleSort_MFilme(principal.getEdicoes().get(selecionada).getMFilme().getFilmes());//apresenta ordenados pela pontuação
                                    }
                                    
                                    if(principal.getEdicoes().get(selecionada).getMap().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Realizador");
                                        OrdenaMapa(principal.getEdicoes().get(selecionada).getMap(),principal.getEdicoes().get(selecionada).getAux());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Banda Sonora");
                                        BubbleSortF_MBandaSonora(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhores Cenários");
                                        BubbleSortF_MelhorCenarios(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor História");
                                        BubbleSortF_MelhorHistoria(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes());//apresenta ordenados pela pontuação
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhores Efeitos Visuais");
                                        BubbleSortF_MelhorEfeitosVisuais(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes());//apresenta ordenados pela pontuação
                                    }
                                    
                                    
                                              
                                    break;
                                    
                                case 12:
                                    String vencedor,vencedor1,vencedor2,vencedor3,vencedor4;
                                    int opcao10;
                                    System.out.println("Quais categorias pretende ver os vencedores?");
                                    System.out.println("(1) Atores || (2) Filmes");
                                    opcao10 = scan.nextInt();
                                    if(opcao10==1){
                                        if(principal.getEdicoes().get(selecionada).getMAtores().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                            System.out.println();
                                        System.out.println("Melhor ator ");
                                        Vencedor_MAtor_MAtriz(principal.getEdicoes().get(selecionada).getMAtores().getAtores());//Imprime o vencedor da categoria
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor atriz");
                                        Vencedor_MAtor_MAtriz(principal.getEdicoes().get(selecionada).getMAtrizes().getAtores());//Imprime o vencedor da categoria
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Ator/Atriz Principal");
                                        Vencedor_Melhor_P(principal.getEdicoes().get(selecionada).getMPrincipal().getAtores());//Imprime o vencedor da categoria
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMSecundario().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Ator/Atriz Secundário");
                                        Vencedor_Melhor_S(principal.getEdicoes().get(selecionada).getMSecundario().getAtores());//Imprime o vencedor da categoria
                                    }
                                    if(principal.getEdicoes().get(selecionada).getPCarreira().getAtores().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Prémio Carreira");
                                        Vencedor_Premio_C(principal.getEdicoes().get(selecionada).getPCarreira().getAtores());//Imprime o vencedor da categoria
                                    }
                                    }
                                    else if(opcao10 ==2){
                                        if(principal.getEdicoes().get(selecionada).getMap().size()==4){//Caso tenham sido selecionados os participantes
                                            System.out.println();
                                        System.out.println("Melhor Realizador");
                                        VencedorRealizador(principal.getEdicoes().get(selecionada).getMap(),principal.getEdicoes().get(selecionada).getAux());
                                    }
                                        if(principal.getEdicoes().get(selecionada).getMFilme().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                            System.out.println();
                                        System.out.println("Melhor filme");
                                        vencedor4 = Vencedor_MFilme(principal.getEdicoes().get(selecionada).getMFilme().getFilmes());//Imprime o vencedor da categoria
                                        for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Percorre a lista de filmes para encontrar o vencedor e incrementer 1 nos premios
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(vencedor4))
                                                principal.getEdicoes().get(selecionada).getFilmes().get(i).addPremio();
                                        }
                                    }
                                    if(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor Banda Sonora");
                                        vencedor = Vencedor_MBandaSonora(principal.getEdicoes().get(selecionada).getBandaSonora().getFilmes());//Imprime o vencedor da categoria
                                        for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Percorre a lista de filmes para encontrar o vencedor e incrementer 1 nos premios
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(vencedor))
                                                principal.getEdicoes().get(selecionada).getFilmes().get(i).addPremio();
                                        }
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhores Cenários");
                                        vencedor2 = Vencedor_MelhorCenarios(principal.getEdicoes().get(selecionada).getMelhorCenarios().getFilmes());//Imprime o vencedor da categoria
                                        for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Percorre a lista de filmes para encontrar o vencedor e incrementer 1 nos premios
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(vencedor2))
                                                principal.getEdicoes().get(selecionada).getFilmes().get(i).addPremio();
                                        }
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhor História");
                                        vencedor1 =Vencedor_MelhorHistoria(principal.getEdicoes().get(selecionada).getMelhorHistoria().getFilmes());//Imprime o vencedor da categoria
                                        for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Percorre a lista de filmes para encontrar o vencedor e incrementer 1 nos premios
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(vencedor1))
                                                principal.getEdicoes().get(selecionada).getFilmes().get(i).addPremio();
                                        }
                                    }
                                    if(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes().size()==4){//Caso tenham sido selecionados os participantes
                                        System.out.println();
                                        System.out.println("Melhores Efeitos Visuais");
                                        vencedor3 = Vencedor_MelhorEfeitosVisuais(principal.getEdicoes().get(selecionada).getMelhorEfeitosVisuais().getFilmes());//Imprime o vencedor da categoria
                                        for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Percorre a lista de filmes para encontrar o vencedor e incrementer 1 nos premios
                                            if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getNome().equals(vencedor3))
                                                principal.getEdicoes().get(selecionada).getFilmes().get(i).addPremio();
                                        }
                                        
                                    }
                                    System.out.println();
                                    int maior=0;
                                    int pos_maior=0;
                                    maior = principal.getEdicoes().get(selecionada).getFilmes().get(0).getPremios();// Percorre o arrayList de filmes comparando o valor de prémios entre si
                                    for(int i=0; i<principal.getEdicoes().get(selecionada).getFilmes().size();i++){//Guarda o valor na variavel maior e a posicao na variavel pos_maior caso seja encontrado um valor maiir
                                        if(principal.getEdicoes().get(selecionada).getFilmes().get(i).getPremios()> maior){
                                            maior = principal.getEdicoes().get(selecionada).getFilmes().get(i).getPremios();
                                            pos_maior = i;
                                        }
                                    }//´Imprime o filme com mais prémios
                                    System.out.println("Filme com mais prémios: "+principal.getEdicoes().get(selecionada).getFilmes().get(pos_maior).getNome()+" com " +principal.getEdicoes().get(selecionada).getFilmes().get(pos_maior).getPremios()+ " prémios!");
                                    
                                    }
                                        
                                    break;
                                case 13:
                                    running4 = false;       // Volta ao menu inicial
                                    break;
                               
                                    
                                default:
                                    System.out.println("Opção inválida");     // Caso não seja selecionada uma opção válida apresenta mensagem de erro  
                                    break;
                            }
                        }while(running4 == true);
                    }
                    break;
                case 3:
                    System.exit(0);             // Fecha a aplicação
                default:
                    System.out.println("Opção inválida");        // Caso não seja selecionada uma opção válida apresenta mensagem de erro
                    break;
            }
        }while(running == true);
    }
    
        
    
    public static EdicaoFestival novaEdicao(int f){             //Cria uma nova edição de festival
        int ano = 0;  
        boolean ok = false;
        Scanner scan = new Scanner(System.in, "cp1252");
        while(!ok){
        System.out.println("Qual o ano? \n");               // Pergunta o ano da edição e verifica se os valores inseridos são aceites
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
    
 public static Filme novoFilme(String nome){    // É criado um filme novo recebendo já o nome para facilitar a verificação de filmes duplicados
        String genero, realizador;
        Scanner scan = new Scanner(System.in, "cp1252");
        System.out.println("Qual o genero do filme?");      //Pergunta o Genero e o relalizador do filme depois então é criado o filme novo
        genero = scan.next();
        System.out.println("Qual é o realizador do filme?");
        realizador = scan.next();        
        Filme novo = new Filme(nome, genero, realizador);
        return novo;
    }
    public static Ator criaAtor(String nome){        // Cria um ator novo recebendo previemente o nome para facilitar a verificação de ator duplicado
        int anoscarreira,genero; 
        Scanner scan = new Scanner(System.in, "cp1252");        
        System.out.println("Quantos anos de carreira este ator possui?"); 
        anoscarreira = scan.nextInt();
        Ator novoator = new Ator(nome,anoscarreira,false);        //Cria por padrão um ator do género feminino , mas depois pergunta qual o genero e se 
        System.out.println("É um Ator ou uma Atriz");               // necessário alterar para masculino fà-lo atraves do bool genero
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
        for(int i = 0; i< f.getPeritos().size();i++){           //Percorre o arrayList de atores gerando uma pontuação para cada ator
            pontos = pontos + f.getPeritos().get(i).geraPontos();   //Essa pontuação é vai sendo somada na variavel pontos
        }
        media = pontos/f.getPeritos().size();                   // Divide o total de pontos pelo numero de peritos fazendo assim a média
        return media;
    }
    
public static void BubbleSort_MAtor_MAtriz(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_MAtor_MAtriz()<a.get(j+1).getPontos_MAtor_MAtriz()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getPontos_MAtor_MAtriz()+" pontos!");
   }
public static void BubbleSort_Melhor_P(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Melhor_P()<a.get(j+1).getPontos_Melhor_P()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getPontos_Melhor_P()+" pontos!");
   }
public static void BubbleSort_Premio_C(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Premio_C()<a.get(j+1).getPontos_Premio_C()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getPontos_Premio_C()+" pontos!");
   }
public static void BubbleSort_Melhor_S(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Melhor_S()<a.get(j+1).getPontos_Melhor_S()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getPontos_Melhor_S()+" pontos!");
   }
public static void Vencedor_MAtor_MAtriz(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_MAtor_MAtriz()<a.get(j+1).getPontos_MAtor_MAtriz()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getPontos_MAtor_MAtriz());
   }
public static void Vencedor_Melhor_P(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Melhor_P()<a.get(j+1).getPontos_Melhor_P()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getPontos_Melhor_P());
   }
public static void Vencedor_Melhor_S(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Melhor_S()<a.get(j+1).getPontos_Melhor_S()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getPontos_Melhor_S());
   }
public static void Vencedor_Premio_C(ArrayList<Ator> a){ //Organiza a lista de Atores com o algoritmo bubbleSort
    Ator aux;
    for (int i=0; i<a.size()-1;i++ ){           
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getPontos_Premio_C()<a.get(j+1).getPontos_Premio_C()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getPontos_Premio_C());
   }
 public static void BubbleSort_MFilme(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MFilme()<a.get(j+1).getP_MFilme()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getP_MFilme()+" pontos!");
   }
    public static void BubbleSortF_MBandaSonora(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MBandaSonora()<a.get(j+1).getP_MBandaSonora()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getP_MBandaSonora()+" pontos!");
   }
    public static void BubbleSortF_MelhorEfeitosVisuais(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorEfeitosVisuais()<a.get(j+1).getP_MelhorEfeitosVisuais()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getP_MelhorEfeitosVisuais()+" pontos!");
   }
    public static void BubbleSortF_MelhorHistoria(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorHistoria()<a.get(j+1).getP_MelhorHistoria()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getP_MelhorHistoria()+" pontos!");
   }
    public static void BubbleSortF_MelhorCenarios(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorCenarios()<a.get(j+1).getP_MelhorCenarios()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    for(int i =0; i<a.size();i++)
       System.out.println((i+1)+"º Lugar: "+ a.get(i).getNome()+" com "+a.get(i).getP_MelhorCenarios()+" pontos!");
   }
 public static String Vencedor_MFilme(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MFilme()<a.get(j+1).getP_MFilme()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getP_MFilme());
    return a.get(0).getNome();
   }
    public static String Vencedor_MBandaSonora(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MBandaSonora()<a.get(j+1).getP_MBandaSonora()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    
       System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getP_MBandaSonora());
       return a.get(0).getNome();
   }
    public static String Vencedor_MelhorEfeitosVisuais(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorEfeitosVisuais()<a.get(j+1).getP_MelhorEfeitosVisuais()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    
       System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getP_MelhorEfeitosVisuais());
       return a.get(0).getNome();
   }
    public static String Vencedor_MelhorHistoria(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorHistoria()<a.get(j+1).getP_MelhorHistoria()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    
       System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getP_MelhorHistoria());
       return a.get(0).getNome();
   }
    public static String Vencedor_MelhorCenarios(ArrayList<Filme> a){ //Organiza a lista de Filmes com o algoritmo bubbleSort
    Filme aux;
    for (int i=0; i<a.size()-1;i++ ){
        for (int j = 0; j<a.size()-i-1;j++){
            if(a.get(j).getP_MelhorCenarios()<a.get(j+1).getP_MelhorCenarios()){
                aux = a.get(j);
                a.set(j, a.get(j+1));
                a.set(j+1, aux);
            }
        }
    }
    
       System.out.println("Vencedor: " + a.get(0).getNome()+" com: " + a.get(0).getP_MelhorCenarios());
       return a.get(0).getNome();
   }

public static void OrdenaMapa(LinkedHashMap<String,Double> m,ArrayList<String> nome){ // como os realizadore não estão guardados numa ArrayList
   double c,d,e,f,auxi2;                                                              //é inicialmente criado um arraylist que irá guardar a pontuação
    String auxi;                                                                      //pela ordem de inserção dos realizadores
                                                                                      //depois o processo é igual ao ator e ao filme
    c = m.get(nome.get(0));                                                           // Um bubblesort só que este ordena dois arrays, um contendo o nome
    d = m.get(nome.get(1));                                                           //Outro contendo a pontuaçao
    e = m.get(nome.get(2));
    f = m.get(nome.get(3));
    ArrayList<Double> pontos= new ArrayList<Double>();
    pontos.add(c);
    pontos.add(d);
    pontos.add(e);
    pontos.add(f);
    for (int i=0; i<pontos.size()-1;i++ ){
        for (int j = 0; j<pontos.size()-i-1;j++){
            if(pontos.get(j)<pontos.get(j+1)){
                auxi = nome.get(j);
                
                auxi2 = pontos.get(j);
                
                pontos.set(j, pontos.get(j+1));
                pontos.set(j+1, auxi2);
                
                nome.set(j, nome.get(j+1));
                nome.set(j+1, auxi);
            }
        }
    }
    for(int i =0; i<nome.size();i++)
       System.out.println((i+1)+"º Lugar: "+ nome.get(i)+" com "+pontos.get(i)+" pontos!");
   }
public static void VencedorRealizador(LinkedHashMap<String,Double> m,ArrayList<String> nome){ // como os realizadore não estão guardados numa ArrayList
   double c,d,e,f,auxi2;                                                              //é inicialmente criado um arraylist que irá guardar a pontuação
    String auxi;                                                                      //pela ordem de inserção dos realizadores
                                                                                      //depois o processo é igual ao ator e ao filme
    c = m.get(nome.get(0));                                                           // Um bubblesort só que este ordena dois arrays, um contendo o nome
    d = m.get(nome.get(1));                                                           //Outro contendo a pontuaçao
    e = m.get(nome.get(2));
    f = m.get(nome.get(3));
    ArrayList<Double> pontos= new ArrayList<Double>();
    pontos.add(c);
    pontos.add(d);
    pontos.add(e);
    pontos.add(f);
    for (int i=0; i<pontos.size()-1;i++ ){
        for (int j = 0; j<pontos.size()-i-1;j++){
            if(pontos.get(j)<pontos.get(j+1)){
                auxi = nome.get(j);
                
                auxi2 = pontos.get(j);
                
                pontos.set(j, pontos.get(j+1));
                pontos.set(j+1, auxi2);
                
                nome.set(j, nome.get(j+1));
                nome.set(j+1, auxi);
            }
        }
    }
    
   System.out.println("Vencedor: "+ nome.get(0)+" com "+pontos.get(0)+" pontos!");
   }
            
}

 
  
