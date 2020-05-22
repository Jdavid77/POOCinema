
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdavi
 */
public class Ator {
    private String nome;   
    private int anoscarreira;
    //private boolean principal;
    private boolean genero;
    private String filmes [];
    private double pontos_MAtor_MAtriz;
    private double pontos_Melhor_P;
    private double pontos_Melhor_S;
    private double pontos_Premio_C;

    
    
    public Ator(String nome, int anos,boolean genero){
        this.nome = nome;
        
        this.anoscarreira = anos;
        //this.principal = principal;
        this.genero = genero;
        this.filmes = new String[2];
        pontos_MAtor_MAtriz = 0;
        pontos_Melhor_P=0;
        pontos_Melhor_S=0;
        pontos_Premio_C=0;
    }    
    
    
    
    public void setPontos_MAtor_MAtriz(double pontuacao){
        this.pontos_MAtor_MAtriz = pontuacao;
    }
    public double getPontos_MAtor_MAtriz(){
        return pontos_MAtor_MAtriz;
    }
    public void setPontos_Melhor_P(double pontuacao){
        this.pontos_Melhor_P = pontuacao;
    }
    public double getPontos_Melhor_P(){
        return pontos_Melhor_P;
    }
    public void setPontos_Melhor_S(double pontuacao){
        this.pontos_Melhor_S = pontuacao;
    }
    public double getPontos_Melhor_S(){
        return pontos_Melhor_S;
    }
    public void setPontos_Premio_C(double pontuacao){
        this.pontos_Premio_C = pontuacao;
    }
    public double getPontos_Premio_C(){
        return pontos_Premio_C;
    }
    
    public Ator(){
        nome = "";
        
        anoscarreira = 0;
        //principal = false;
        this.genero = true;
        pontos_Premio_C = 0;
        pontos_Melhor_S = 0;
        pontos_Melhor_P = 0;
        pontos_MAtor_MAtriz = 0;
    }
    
    public Ator(boolean f){
        nome = "";
        anoscarreira = 0;
        this.genero = f;
        pontos_Premio_C = 0;
        pontos_Melhor_S = 0;
        pontos_Melhor_P = 0;
        pontos_MAtor_MAtriz = 0;
        
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    
    
    
    public void setAnosCarreira(int anos){
        this.anoscarreira = anos;
    }
       public void setGenero(boolean h){
        this.genero = h;
    }
    public void setFilme(String s){//Função que coloca no string filmes do ator os nomes do filme que ele participa
        if(this.filmes[0]==null)//Caso a primeira posição esteja vazia coloca lá o nome do filme
            this.filmes[0]=s;
        else if (this.filmes[1]==null) // Caso a primeira esteja ocupada, mas a segunda vazia coloca na segunda
            this.filmes[1] = s;
        else  //Caso estejam ambas ocupadas significa que o ator já participa em 2 filmes, não permite adicionar mais que 2 
            System.out.println("O Ator já participa em 2 filmes!");
    }
    
    public String getNome(){
        return nome ;
        
    }
    
    
    
    public int getAnosCarreira(){
        return anoscarreira;
    }
    public boolean getGenero(){
        return genero;
    }
    public String[] getFilmes(){
        return filmes;
    }
    
    public String toString(){
        String info;
        info = "Nome: " + nome + "\n";
        info = info + "Anos carreira: " + anoscarreira + "\n";
        return info;
        
    }
    public String atorFilmes(){
        String s;
        s = nome +" ";
        s = s + "Filmes: "+ filmes[0] +" ; " + filmes [1]+"\n";
        return s;
    }
    public String MostraPontos_Premio_C(){
        String p;
        p = "Nome: "+ nome +" Pontuação: " + pontos_Premio_C+"\n";
        return p;
    }
    public String MostraPontos_MAtor_MAtriz(){
        String p;
        p = "Nome: "+ nome +" Pontuação: " + pontos_MAtor_MAtriz+"\n";
        return p;
    }
    public String MostraPontos_Melhor_P(){
        String p;
        p = "Nome: "+ nome +" Pontuação: " + pontos_Melhor_P+"\n";
        return p;
    }
    public String MostraPontos_Melhor_S(){
        String p;
        p = "Nome: "+ nome +" Pontuação: " + pontos_Melhor_S+"\n";
        return p;
    }
    
    
    
    
    
}
