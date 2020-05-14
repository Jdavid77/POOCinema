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
public class MelhorAtor{
    
    private String nome = "Melhor Ator";
    private ArrayList<Ator> atoresescolhidos;
    
    public MelhorAtor(){
        this.nome = nome;
        atoresescolhidos = new ArrayList<Ator>(4);
    }
    
    public void addAtor(Ator f){
        if (f.getGenero() == true){
            atoresescolhidos.add(f);
            System.out.println("Ator Selecionado!!");
        }
        
    }
    
    public ArrayList<Ator> getAtoresSelecionados(){
        return atoresescolhidos;
    }
}
