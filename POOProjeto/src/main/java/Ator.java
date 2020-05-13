
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
    private String filmes [] = new String[2];
    
    public Ator(String nome, int anos,boolean principal,boolean genero){
        this.nome = nome;
        
        this.anoscarreira = anos;
        //this.principal = principal;
        this.genero = genero;
    }    
    
    
    public Ator(){
        nome = "";
        
        anoscarreira = 0;
        //principal = false;
        genero = true;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    
    
    
    public void setAnosCarreira(int anos){
        this.anoscarreira = anos;
    }
   /* public void setPrincipal(boolean p){
        this.principal = p;
    }*/
    public void setGenero(boolean h){
        this.genero = h;
    }
    public void setFilme(String s){
        if(this.filmes[0]==null)
            this.filmes[0]=s;
        else if (this.filmes[1]==null)
            this.filmes[1] = s;
        else  
            System.out.println("O Ator já participa em 2 filmes!");
    }
    
    public String getNome(){
        return nome ;
        
    }
    
    
    
    public int getAnosCarreira(){
        return anoscarreira;
    }
    /*public boolean getPrincipal(){
        return principal;
    }*/
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
        /*if(principal)
            info = info + "Principal \n";
        else
            info = info + "Secundário \n";*/
        return info;
        
    }
    public String atorFilmes(){
        String s;
        s = nome +" ";
        s = s + "Filmes: "+ filmes[0] +" ; " + filmes [1]+"\n";
        return s;
    }
    
    
    
    
    
}
