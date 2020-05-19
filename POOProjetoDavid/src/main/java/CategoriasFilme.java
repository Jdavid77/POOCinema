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
public class CategoriasFilme {
    private String nome;
    public ArrayList<Filme> filmes;
    
    
    public CategoriasFilme(String nome){
        this.nome = nome;
        filmes = new ArrayList<Filme>(4);
    }
    
    public ArrayList<Filme> getFilmes(){
        return filmes;
    }
 
    public void addFilme(Filme f){
        filmes.add(f);
        System.out.println("Filme adicionado!");
    }
    
    public String toString(){
        String info;
        info = "Categoria: "+nome+"\n";
        for (int i=0;i<filmes.size();i++)
            info = info + "Filme; " + i+ ": "+filmes.get(i).getNome()+"\n"+ "Pontuação: "+filmes.get(i).getPontos()+"\n";            
        return info;
    }
    
}
