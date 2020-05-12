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
    
    public Filme(String nome, String genero, String realizador,String Ator_P, String Atriz_P){
        Ator Ator_Principal = new Ator();
        Ator Atriz_Principal = new Ator();
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        this.Ator_principal = Ator_Principal;
        this.Atriz_principal= Atriz_Principal;
        this.Ator_principal.setNome(Ator_P);
        this.Atriz_principal.setNome(Atriz_P);
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
        info = "Nome: " + nome + " || Genero: " + genero +" || Realizador: "+ realizador + "\n";
        info = info + "Ator Principal: "+Ator_principal.getNome() +"\n" + "Atriz Principal: "+Atriz_principal.getNome()+"\n";
        info = info + "Atores Secundários: ";
        for(int i = 0; i< atores.size(); i++){
            info = info + atores.get(i).getNome() + " ";
        }
        info = info + "\n";
        return info;
        
    }
}
