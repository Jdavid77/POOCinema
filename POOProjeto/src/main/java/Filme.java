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
  
    private int premios;
    private double p_MFilme;
    private double p_MBandaSonora;
    private double p_MelhorCenarios;
    private double p_MelhorEfeitosVisuais;
    private double p_MelhorHistoria;
    
    public Filme(String nome, String genero, String realizador){
        Ator Ator_Principal = new Ator();
        Ator Atriz_Principal = new Ator(false);
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        atores = new ArrayList<Ator>();
        this.atores.add(0,Ator_Principal);
        this.atores.add(1,Atriz_Principal);
       
        p_MFilme=0;
        p_MBandaSonora=0;
        p_MelhorCenarios=0;
        p_MelhorEfeitosVisuais=0;
        p_MelhorHistoria=0;
        premios = 0;
        
    }    
    
    public String getNome(){
        return nome;
    }
    public void setP_MFilme(double pontuacao){
        this.p_MFilme = pontuacao;
    }
    
    public double getP_MFilme(){
        return p_MFilme;
    }
    public void setP_MBandaSonora(double pontuacao){
        this.p_MBandaSonora = pontuacao;
    }
    
    public double getP_MBandaSonora(){
        return p_MBandaSonora;
    }
    public void setP_MelhorCenarios(double pontuacao){
        this.p_MelhorCenarios = pontuacao;
    }
    
    public double getP_MelhorEfeitosVisuais(){
        return p_MelhorEfeitosVisuais;
    }
    public void setP_MelhorEfeitosVisuais(double pontuacao){
        this.p_MelhorEfeitosVisuais = pontuacao;
    }
    
    public double getP_MelhorHistoria(){
        return p_MelhorHistoria;
    }
    public void setP_MelhorHistoria(double pontuacao){
        this.p_MelhorHistoria = pontuacao;
    }
    
    public double getP_MelhorCenarios(){
        return p_MelhorCenarios;
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
    
    public boolean addNovoAtor(Ator a,boolean principal){// A função que adiciona ator ao filme recebe o ator e um bool que define se o ator é principal ou secundário
        if(principal){  // Caso principal == true, o ator tem papel principal no filme
            if(a.getGenero()==true){ // Se o genero for True significa que o ator é do sexo masculino
                if(atores.get(0).getNome().equals("")){ // Se o nome da primeira posição do arrayList de atores (primeira posição é só para o ator principal) for igual a "" significa que nao há ator principal ainda
                    atores.set(0,a); // Caso não haja ator principal ainda é colocado o novo ator na posição 0
                    System.out.println("Ator adicionado");
                    return true; // Return true para o programa saber que foi adicionado com sucesso
                }
                else// Caso o nome da posição seja diferente de "" significa que já existe ator principal
                    System.out.println("Já existe ator principal no filme!");                
            }else if(a.getGenero()==false){//Genero falso significa que é uma atriz
                if(atores.get(1).getNome().equals("")){ // Se o nome da segunda posição do arrayList de atores (segunda posição é só para o atriz principal) for igual a "" significa que nao há atriz principal ainda
                    atores.set(1,a); // Caso não haja atriz principal ainda é colocado a nova atriz na posição 0
                    System.out.println("Ariz adicionada");
                    return true;// Return true para o programa saber que foi adicionado com sucesso
                }
                else// Caso o nome da posição seja diferente de "" significa que já existe atriz principal
                    System.out.println("Já existe atriz principal no filme!");   
                
            }
        }else if(!principal){//Se não for principal
            atores.add(a); //O ator simplesmente é adicionado na próxima posição livre 
            System.out.println("Ator adicionado");
            return true;// Return true para o programa saber que foi adicionado com sucesso
        }
        return false;//Caso não seja adicionado ninguem return falso
    }        
       
    public void addPremio(){
        premios = premios+1;
    }
    public int getPremios(){
        return premios;
    }
            
        
    
    
    public ArrayList<Ator> getAtores(){
        return atores;
    }   
    public String MostraP_MFilme(){
        String p;
        p = "Nome "+nome+"Pontuação: " + p_MFilme+"\n";
        return p;
    }
    public String MostraP_MBandaSonora(){
        String p;
        p = "Nome "+nome+"Pontuação: " + p_MBandaSonora+"\n";
        return p;
    }
    public String MostraP_MelhorCenarios(){
        String p;
        p = "Nome "+nome+"Pontuação: " + p_MelhorCenarios+"\n";
        return p;
    }
    public String MostraP_MelhorEfeitosVisuais(){
        String p;
        p = "Nome "+nome+"Pontuação: " + p_MelhorEfeitosVisuais+"\n";
        return p;
    }
    public String MostraP_MelhorHistoria(){
        String p;
        p = "Nome "+nome+"Pontuação: " + p_MelhorHistoria+"\n";
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
