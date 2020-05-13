/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago Velosa
 */
import java.util.ArrayList;
public class Festival {
    
    
    private ArrayList<EdicaoFestival> edicoes;
    
    public Festival(){        
        edicoes = new ArrayList<EdicaoFestival>();        
    }
    public void addEdicao(EdicaoFestival f){
        edicoes.add(f);
    }
    public ArrayList<EdicaoFestival> getEdicoes(){
        return edicoes;
    }
    public String toString(){
        String info;
        info = "### LISTA DE EDIÇÕES ###\n";
        for (int i =0; i< edicoes.size();i++){
            info = info + edicoes.get(i).toString()+"\n";
        }
        return info;
    }
        
}
