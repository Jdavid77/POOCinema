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
    
}
