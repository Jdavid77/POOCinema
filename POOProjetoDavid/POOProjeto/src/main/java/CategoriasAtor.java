
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Velosa
 */
public class CategoriasAtor {
    private String nome ;
    private ArrayList<Ator> atores;
    
    public CategoriasAtor(String nome){
        this.nome = nome;
        atores = new ArrayList<Ator>(4);
    }
    public ArrayList<Ator> getAtores(){
        return atores;
    }
    public void addAtor(Ator f){
        atores.add(f);
        System.out.println("Ator selecionado!");
    } 
    public String toString(){
        String info;
        info = "Categoria: "+nome+"\n";
        for (int i=0;i<atores.size();i++)
            info = info + "Concorrente " + i+ ": "+atores.get(i).getNome()+"\n"+ "Pontuação: "+atores.get(i).getPontos()+"\n";            
        return info;
    }
    
}

    
    
    
   
        
    
    
    
