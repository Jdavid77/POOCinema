/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
/**
 *
 * @author jdavi
 */
public class EdicaoFestival {
    // Declaração das variáveis necessárias
    private int ano;
    private int numeroedicao;
    private ArrayList<Filme> filmes;
    private ArrayList<Ator> atores;
    private ArrayList<Peritos> peritos;
    
    // apenas para efeito de atribuição de prémios
    
    private ArrayList<Ator> masculinos;
    private ArrayList<Ator> femininos;
    private ArrayList<Ator> principais;
    private ArrayList<Ator> atzprincipais;
    private ArrayList<Ator> secundários;
    private ArrayList<Filme> verificafilmes;
    private ArrayList<String> realizadores;
    private ArrayList<Ator> carreira;
    private ArrayList<String> aux ;
     
    private LinkedHashMap<String,Double> map_realizadores; 
    private CategoriasAtor MAtores;
    private CategoriasAtor MAtrizes;
    private CategoriasAtor MPrincipal;
    private CategoriasAtor MSecundario;
    private CategoriasAtor PCarreira;
    private CategoriasFilme MFilme;
    private CategoriasFilme MBandaSonora;
    private CategoriasFilme MelhorCenarios;
    private CategoriasFilme MelhorEfeitosVisuais;
    private CategoriasFilme MelhorHistoria;
    
    public EdicaoFestival(int ano, int numeroedicao){// Iniciação das váriaveis, só é permitido criar edicção com o ano e o numero
        this.ano = ano;
        this.numeroedicao = numeroedicao;
        filmes = new ArrayList<Filme>();
        atores = new ArrayList<Ator>();
        peritos = new ArrayList<Peritos>();
        MAtores = new CategoriasAtor("Melhor Ator");
        MAtrizes = new CategoriasAtor("Melhor Atriz");
        MPrincipal = new CategoriasAtor("Melhor Ator/Atriz Principal");
        MSecundario = new CategoriasAtor("Melhor Ator/Atriz Secundária");
        PCarreira = new CategoriasAtor("Premio Carreira");
        MFilme = new CategoriasFilme("Melhor Filme");
        MBandaSonora = new CategoriasFilme("Melhor Banda Sonora");
        MelhorCenarios = new CategoriasFilme("Melhores Cenários");
        MelhorEfeitosVisuais = new CategoriasFilme("Melhores efeitos visuais");
        MelhorHistoria = new CategoriasFilme("Melhor história");
        aux = new ArrayList<String>();
        
        // Para efeitos de verificação de atribuição de premios
        masculinos = new ArrayList<Ator>();
        femininos = new ArrayList<Ator>();
        principais = new ArrayList<Ator>();
        secundários = new ArrayList<Ator>();
        atzprincipais = new ArrayList<Ator>();
        verificafilmes = new ArrayList<Filme>();
        realizadores = new ArrayList<String>();
        carreira = new ArrayList<Ator>();
        map_realizadores = new LinkedHashMap<String,Double>();
        
    }
    
    public String toString(){// Função onde é impresso as informações sobre a edicão: Ano, n_edicao, e informações sobre os filmes
        String info;
        info = "Edição: "+numeroedicao+"\n";
        info = info + "Ano: "+ano+"\n";
        info = info + "Filmes :\n";
        for (int i =0; i< filmes.size();i++){
            info = info +"\n"+ filmes.get(i).toString()+"\n";
        }
        return info;
    }
    
    //Funções getters
    public int getNumEdicao(){
        return numeroedicao;
    }
    public ArrayList<Filme> getFilmes(){
        return filmes;
    }
     
    public CategoriasFilme getBandaSonora(){
            return MBandaSonora;
    }
    public CategoriasFilme getMelhorHistoria(){
            return MelhorHistoria;
    }
    public CategoriasFilme getMelhorEfeitosVisuais(){
            return MelhorEfeitosVisuais;
    }
    public CategoriasFilme getMelhorCenarios(){
            return MelhorCenarios;
    }

    public ArrayList<Ator> getMasculinos(){
        return masculinos;
    }
    
    public ArrayList<Ator> getFemininos(){
        return femininos;
    }
    
    public ArrayList<Ator> getPrincipais(){
        return principais;
    }
    public ArrayList<Ator> getAtzPrincipais(){
        return atzprincipais;
    }
    
    public ArrayList<Ator> getSecundarios(){
        return secundários;
    }
    
    public ArrayList<Filme> getVerificaFilmes(){
        return verificafilmes;
    }
    
    public ArrayList<String> getRealizadores(){
        return realizadores;
    }
    
    public ArrayList<Ator> getCarreira(){
        return carreira;
    }
    
    public CategoriasAtor getMAtores(){
        return MAtores;
    }
    public CategoriasAtor getMAtrizes(){
        return MAtrizes;
    }
    public CategoriasAtor getMPrincipal(){
        return MPrincipal;
    }
    
    public CategoriasAtor getMSecundario(){
        return MSecundario;
    }
    
    public CategoriasFilme getMFilme(){
        return MFilme;
    }
    public CategoriasAtor getPCarreira(){
        return PCarreira;
    }
    public LinkedHashMap<String,Double> getMap(){
        return map_realizadores;
    }
    public ArrayList<String> getAux(){
        return aux;
    }
    
    public ArrayList<Ator> getAtores(){
        return atores;    
    }
    public ArrayList<Peritos> getPeritos(){
        return peritos;
    }
    
    //Funções ADD
    public void addAtor(Ator a){
        atores.add(a);
    }
    public void addPerito(Peritos p){ 
        peritos.add(p);
    }
   public void addFilme(Filme f){
        filmes.add(f);
    }
    
}
