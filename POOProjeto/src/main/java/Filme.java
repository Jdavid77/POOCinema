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
public class Filme {
    private String nome;
    private String genero;
    private String realizador;
    //private Ator Ator_principal;
    //private Ator Atriz_principal;
    private ArrayList<Ator> atores;
    
    public Filme(String nome, String genero, String realizador){
        Ator Ator_Principal = new Ator();
        Ator Atriz_Principal = new Ator();
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        atores = new ArrayList<Ator>();
        this.atores.add(0,Ator_Principal);
        this.atores.add(1,Atriz_Principal);
        
        
    }    
    
    public String getNome(){
        return nome;
    }
    
    
    public void addNovoAtor(Ator a){
        
        if ((a.getPrincipal()==true) && (a.getGenero()==true)){            
            atores.set(0,a);       
        }else if (a.getPrincipal()== true && (a.getGenero()==false)){
            
            atores.set(1,a);
        }else
            atores.add(a);
            
    }
    
    public ArrayList<Ator> getAtores(){
        return atores;
    }
    
    /*public Ator getAtorPrincipal(){
        return Ator_principal;
    }
    
    public Ator getAtrizPrincipal(){
        return Atriz_principal;
    }*/
    
    public String toString(){
        String info;
        info = "Nome: " + nome + " || Genero: " + genero +" || Realizador: "+ realizador + "\n";
        info = info + "Ator Principal: "+atores.get(0).getNome() +"\n" + "Atriz Principal: "+atores.get(1).getNome()+"\n";
        info = info + "Atores Secundários: ";
        for(int i = 2; i< atores.size(); i++){
            info = info + atores.get(i).getNome() + " ";
        }
        info = info + "\n";
        return info;
        
    }
}
