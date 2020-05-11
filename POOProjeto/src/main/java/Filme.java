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
    
    public Filme(String nome, String genero, String realizador){
        this.nome = nome;
        this.genero = genero;
        this.realizador = realizador;
        atores = new ArrayList<Ator>();
    }
}
