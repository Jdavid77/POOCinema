/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author Tiago Velosa
 */
public class Peritos {
    private String nome;
   
    
    public Peritos(String nome){
        this.nome = nome;
        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome ;        
    }
    
    public int geraPontos(){
        Random rand = new Random();
        int pontos = rand.nextInt(10)+1;
        return pontos;       
    }
    public String toString(){
        String info ;
        info = "nome: " + nome ;
        return info;
    }
    
       
}

