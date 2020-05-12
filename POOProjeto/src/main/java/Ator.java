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
    private String sobrenome;
    private int anoscarreira;
    
    public Ator(String nome,String sobrenome, int anos){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anoscarreira = anos;
    }    
    
    public Ator(){
        nome = "";
        sobrenome = "";
        anoscarreira = 0;
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }    
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setAnosCarreira(int anos){
        this.anoscarreira = anos;
    }    
    
    public String getNome(){
        return nome ;
        
    }
    
    public String getSobrenome(){
        return sobrenome;
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
