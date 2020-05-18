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
    private ArrayList<Ator> atores;
    double pontos;
    int numero_premios;
    
    public Filme(String nome, String genero, String realizador){
        Ator Ator_Principal = new Ator();
        Ator Atriz_Principal = new Ator(false);
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        atores = new ArrayList<Ator>();
        this.atores.add(0,Ator_Principal);
        this.atores.add(1,Atriz_Principal);
        this.pontos = 0;
        this.numero_premios = 0;
    }    
    
    public String getNome(){
        return nome;
    }
    public void setPontos(double pontuacao){
        this.pontos = pontuacao;
    }
    
    public Ator getAtorPrincipal(){
        return atores.get(0);
    }
    
    public Ator getAtrizPrincipal(){
        return atores.get(1);
    }
    
    public String getRealizador(){
        return realizador;
    }
    
    public boolean addNovoAtor(Ator a,boolean principal){
        if(principal){
            if(a.getGenero()==true){
                if(atores.get(0).getNome().equals("")){
                    atores.set(0,a);
                    System.out.println("Ator adicionado");
                    return true;
                }
                else
                    System.out.println("Já existe ator principal no filme!");                
            }else if(a.getGenero()==false){
                if(atores.get(1).getNome().equals("")){
                    atores.set(1,a);
                    System.out.println("Ariz adicionada");
                    return true;
                }
                else
                    System.out.println("Já existe atriz principal no filme!");   
                
            }
        }else if(!principal){
            atores.add(a);
            System.out.println("Ator adicionado");
            return true;
        }
        return false;
    }        
       
       
            
        
    
    
    public ArrayList<Ator> getAtores(){
        return atores;
    }   
    public String MostraP(){
        String p;
        p = "Pontuação: " + pontos+"\n";
        return p;
    }
    
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
