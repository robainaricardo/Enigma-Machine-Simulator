/*
Classe que implementao conjunto ROTOR E ANEL da Máquina,
ao receber uma entrada, retorna a saida conforme a posicao inicial do rotor e do anel.
*/

package simuladorenigma;

public class Rotor {
    
    public int codRotorAnel(int entrada,int pR, int pA){
        int dif, cod = 0;
        dif = pA-pR;
        if(dif == 0)
            cod = entrada;
        
        cod = entrada;
        while(dif != 0){
            if(dif > 0){
               if(cod == 26){
                   cod = 1;
                   dif--;
               }else{
                   cod++;
                   dif--;
               }     
           }
           if(dif < 0){
               if(cod == 1){
                   cod = 26;
                   dif++;
               }else{
                   cod--;
                   dif++;
               }    
           }
        }
        return cod;
    }  //metodo cod
    
    public int codAnelRotor(int entrada,int pA, int pR){
        int dif, cod = 0;
        dif = pR-pA;
        if(dif == 0){
            cod = entrada;    
        }
        cod = entrada;
        while(dif != 0){
            if(dif > 0){
               if(cod == 26){
                   cod = 1;
                   dif--;
               }else{
                   cod++;
                   dif--;
               }     
           }
           if(dif < 0){
               if(cod == 1){
                   cod = 26;
                   dif++;
               }else{
                   cod--;
                   dif++;
               }    
           }
        }
        return cod;
    }  //metodo cod
        
}//classe Rotor
