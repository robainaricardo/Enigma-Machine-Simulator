/*
    Classe que implementa so metodos Encripta() e converter();
    Encripta agrupa e utiliza todos os outros  componentes da maquina, em ordem para fazer a criptografia da letra.
    Converter converte o numero(int) para a letra correspondente(char).
*/

package simuladorenigma;


public class Converter {
    
    int e, exit,pp1,pp2, r11,r12,r21,r22,r31,r32,a11,a12,a21,a22,a31,a32,rf1,rf2;

    public int getE() {
        return e;
    }

    public int getExit() {
        return exit;
    }

    public int getPp1() {
        return pp1;
    }

    public int getPp2() {
        return pp2;
    }

    public int getR11() {
        return r11;
    }

    public int getR12() {
        return r12;
    }

    public int getR21() {
        return r21;
    }

    public int getR22() {
        return r22;
    }

    public int getR31() {
        return r31;
    }

    public int getR32() {
        return r32;
    }

    public int getA11() {
        return a11;
    }

    public int getA12() {
        return a12;
    }

    public int getA21() {
        return a21;
    }

    public int getA22() {
        return a22;
    }

    public int getA31() {
        return a31;
    }

    public int getA32() {
        return a32;
    }

    public int getRf1() {
        return rf1;
    }

    public int getRf2() {
        return rf2;
    }
            
            
            
    public int Encripta(int entrada, int r1, int r2, int r3, int a1, int a2, int a3, int cabo11, int cabo12, int cabo21, int cabo22, int cabo31, int cabo32, int cabo41, int cabo42, int cabo51, int cabo52, int cabo61, int cabo62, int cabo71, int cabo72, int cabo81, int cabo82){
        Rotor rotor1 = new Rotor();
        Rotor rotor2 = new Rotor();
        Rotor rotor3 = new Rotor();
        Refletor refletor = new Refletor();
        PainelPlug plug = new PainelPlug(); 
        int s;
        this.e = entrada;
        
        
        //SETA OS PLUGS DO PAINEL
        plug.completaPainel(cabo11, cabo12);
        plug.completaPainel(cabo21, cabo22);
        plug.completaPainel(cabo31, cabo32);
        plug.completaPainel(cabo41, cabo42);
        plug.completaPainel(cabo51, cabo52);
        plug.completaPainel(cabo61, cabo62);
        plug.completaPainel(cabo71, cabo72);
        plug.completaPainel(cabo81, cabo82);
       
        //caminho da encriptação
        //tambem pega dados para a simulação do caminho
        s = plug.saidaPainel(entrada);
        this.pp1 = s;
        this.e = entrada;
        this.r11 = s;
        
        s = rotor1.codRotorAnel(s,r1,a1);
        this.a11 = s;
        this.r21 = s;
        
                
        s = rotor2.codRotorAnel(s,r2,a2);
        this.a21 = s;
        this.r31 = s;
        
        s = rotor3.codRotorAnel(s,r3,a3);
        this.a31 = s;
        this.rf1 = s;
        
        s = refletor.reflete(s);
        this.rf2 = s;
        this.a12 = s;
        
        s = rotor3.codAnelRotor(s, a3, r3);
        this.r32 = s;
        this.a22 = s;
        
        s = rotor2.codAnelRotor(s, a2, r2);
        this.r22 = s;
        this.a32 = s;
        
        s = rotor1.codAnelRotor(s, a1, r1);
        this.r12 = s;
        
        s = plug.saidaPainel(s);
        this.pp2 = s;
        this.exit = s;
        
        return s;
    }
    
    public char Converter(int op){
        char var = 0;
        
        switch(op){
            case 0:
                break;
            case 1:
                var = 'A';
                break;
            case 2:
                var = 'B';
                break;
            case 3:
                var = 'C';
                break;
            case 4:
                var = 'D';
                break;
            case 5:
                var = 'E';
                break;
            case 6:
                var = 'F';
                break;
            case 7:
                var = 'G';
                break;
            case 8:
                var = 'H';
                break;
            case 9:
                var = 'I';
                break;
            case 10:
                var = 'J';
                break;
            case 11:
                var = 'K';
                break;
            case 12:
                var = 'L';
                break;
            case 13:
                var = 'M';
                break;
            case 14:
                var = 'N';
                break;
            case 15:
                var = 'O';
                break;
            case 16:
                var = 'P';
                break;
            case 17:
                var = 'Q';
                break;
            case 18:
                var = 'R';
                break;
            case 19:
                var = 'S';
                break;
            case 20:
                var = 'T';
                break;
            case 21:
                var = 'U';
                break;
            case 22:
                var = 'V';
                break;
            case 23:
                var = 'W';
                break;
            case 24:
                var = 'X';
                break;
            case 25:
                var = 'Y';
                break;
            case 26:
                var = 'Z';
                break;
        }    
    return var;
    }  
}