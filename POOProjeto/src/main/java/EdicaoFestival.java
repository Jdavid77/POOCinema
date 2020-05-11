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
public class EdicaoFestival {
    
    private int ano;
    private int numeroedicao;
    private ArrayList<Filme> filmes;
    
    public EdicaoFestival(int ano, int numeroedicao){
        this.ano = ano;
        this.numeroedicao = numeroedicao;
        filmes = new ArrayList<Filme>();
    }
    public String toString(){
        String info;
        info = "Edição: "+numeroedicao+"\n";
        info = info + "Ano: "+ano+"\n";
        info = info + "Filmes :\n";
        for (int i =0; i< filmes.size();i++){
            info = info +"\n"+ filmes.get(i).toString()+"\n";
        }
        return info;
    }
    public void addFilme(Filme f){
        filmes.add(f);
    }
    public int getNumEdicao(){
        return numeroedicao;
    }
    public ArrayList<Filme> getFilme(){
        return filmes;
    }
    
   
    
}
