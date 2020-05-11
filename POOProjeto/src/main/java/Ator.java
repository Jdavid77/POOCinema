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
    
    public Ator(String nome, int anos){
        this.nome = nome;
        this.anoscarreira = anos;
    }    
    public void setNome(String nome){
        this.nome = nome;
    }    
    public void setAnosCarreira(int anos){
        this.anoscarreira = anos;
    }    
    public String getNome(){
        return nome;
        
    }
    
    public int getAnosCarreira(){
        return anoscarreira;
    }
    
    
    public String toString(){
        String info;
        info = "Nome: " + nome + "\n";
        info = info + "Anos carreira: " + anoscarreira + "\n";
        return info;
        
    }
    
    
    
    
}
