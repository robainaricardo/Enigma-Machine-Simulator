/*
Classe que implementa o Refletor B, componente da máquina enigma.
Funciona da seguinte forma basicamente ao receber uma letra ele retorna outra, predefinida no modelo do refletor.
 // 1  2  3 4  5  6  7 8  9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26  // Contatos    = ABCDEFGHIJKLMNOPQRSTUVWXYZ                     
// 25 18 21 8 17 19 12 4 16 24 14  7 15 11 13  9  5  2  6 26  3 23 22 10  1 20  // Refletor B  = YRUHQSLDPXNGOKMIEBFZCWVJAT 
*/
package simuladorenigma;

public class Refletor {
      
    public int reflete(int a){
        int r = 0;
        switch(a){
            case 1:
                r = 25;
            break;
                
            case 2:
                r = 18;
            break;
            
            case 3:
                r = 21;
            break;
                
            case 4:
                r = 8;
            break;
                
            case 5:
                r = 17;
            break;
                
            case 6:
                r = 19;
            break;
                
            case 7:
                r = 12;
            break;
                
            case 8:
                r = 4;
            break;
                
            case 9:
                r = 16;
            break;
               
            case 10:
                r = 24;
            break;
                
            case 11:
                r = 14;
            break;
                
            case 12:
                r = 7;
            break;
                
            case 13:
                r = 15;
            break;
                
            case 14:
                r = 11;
            break;
                
             case 15:
                r = 13;
            break;
                 
            case 16:
                r = 9;
            break;
                
            case 17:
                r = 5;
            break;
                
            case 18:
                r = 2;
            break;
                
            case 19:
                r = 6;
            break;
                
            case 20:
                r = 26;
            break;
                
            case 21:
                r = 3;
            break;
                
            case 22:
                r = 23;
            break;
                
            case 23:
                r = 22;
            break;
                
            case 24:
                r = 10;
            break;
                
            case 25:
                r = 1;
            break;
                
            case 26:
                r = 20;
            break;
        }
        return r;
    }           
}