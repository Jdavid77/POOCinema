/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author jdavi
 */
public class EdicaoFestival {
    
    private int ano;
    private int numeroedicao;
    private ArrayList<Filme> filmes;
    private ArrayList<Ator> atores;
    private ArrayList<Peritos> peritos;
    
    // apenas para efeito de verificações
    private ArrayList<Ator> principais;
    private ArrayList<Ator> atzprincipais;
    private ArrayList<Ator> secundários;
    // 
    private CategoriasAtor MAtores;
    private CategoriasAtor MAtrizes;
    
    public EdicaoFestival(int ano, int numeroedicao){
        this.ano = ano;
        this.numeroedicao = numeroedicao;
        filmes = new ArrayList<Filme>();
        atores = new ArrayList<Ator>();
        peritos = new ArrayList<Peritos>();
        MAtores = new CategoriasAtor("Melhor Ator");
        MAtrizes = new CategoriasAtor("Melhor Atriz");
        principais = new ArrayList<Ator>();
        secundários = new ArrayList<Ator>();
    }
    public String toString(){
        String info;
        info = "Edição: "+numeroedicao+"\n";
        info = info + "Ano: "+ano+"\n";
        info = info + "Filmes :\n";
        for (int i =0; i< filmes.size();i++){
            info = info +"\n"+ filmes.get(i).toString()+"\n";
        }
        return info;
    }
    public void addFilme(Filme f){
        filmes.add(f);
    }
    public int getNumEdicao(){
        return numeroedicao;
    }
    public ArrayList<Filme> getFilmes(){
        return filmes;
    }
    
    public ArrayList<Ator> getPrincipais(){
        return principais;
    }
    public ArrayList <Ator> getAtzPrincipais(){
        return atzprincipais;
    }
    
    public ArrayList<Ator> getSecundarios(){
        return secundários;
    }
    public CategoriasAtor getMAtores(){
        return MAtores;
    }
    public CategoriasAtor getMAtrizes(){
        return MAtrizes;
    }
    
    public void addAtor(Ator a){
        atores.add(a);
    }
    public void addPerito(Peritos p){        
        peritos.add(p);
    }
    public ArrayList<Ator> getAtores(){
        return atores;    
    }
    public ArrayList<Peritos> getPeritos(){
        return peritos;
    }
    
   
    
}
