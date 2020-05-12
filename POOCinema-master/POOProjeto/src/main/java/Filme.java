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
    private Ator Ator_principal;
    private Ator Atriz_principal;
    private ArrayList<Ator> atores;
    
    public Filme(String nome, String genero, String realizador){
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        Ator_principal = null;
        Atriz_principal = null;
        atores = new ArrayList<Ator>();
    }    
    
    public String getNome(){
        return nome;
    }
    
    
    public void addAtorSecundario(Ator secundario){
        atores.add(secundario);
    }
    public ArrayList<Ator> getAtoresSecundários(){
        return atores;
    }
    
    public Ator getAtorPrincipal(){
        return Ator_principal;
    }
    
    public Ator getAtrizPrincipal(){
        return Atriz_principal;
    }
    
    public String toString(){
        String info;
        info = "Nome: " + nome + "\n";
        info = info + "Genero: " + genero + "\n";
        info = info + "Realizador: "+ realizador + "\n";
        return info;
        
    }
}
