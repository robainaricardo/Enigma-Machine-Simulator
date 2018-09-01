/*
Classe que implementa o painel de plugs, componente que foi adicionado posteriormente na máquina, a fim de aumentar a segurança da criptografia.
sao oito cabos disponiveis que podem ligar, cada um, uma letra a outra. Sendo assim se um cabo liga as letras A e B, ao passar A pelo painel, este retorna B.
se passar B retorna A.
*/
package simuladorenigma;


public class PainelPlug {
   //atributos
    int a = 1 ;
    int b = 2;
    int c = 3;
    int d = 4;
    int e = 5;
    int f = 6;
    int g = 7;
    int h = 8;
    int i = 9;
    int j = 10;
    int k = 11;
    int l = 12;
    int m = 13;
    int n = 14;
    int o = 15;
    int p = 16;
    int q = 17;
    int r = 18;
    int s = 19;
    int t = 20;
    int u = 21;
    int v = 22;
    int w = 23;
    int x = 24;
    int y = 25;
    int z = 26;
    
    public int saidaPainel(int ia){
        int ri = 0;
        switch(ia){
            case 1:
                ri = a;
            break;
                
            case 2:
                ri = b;
            break;
            
            case 3:
                ri = c;
            break;
                
            case 4:
                ri = d;
            break;
                
            case 5:
                ri = e;
            break;
                
            case 6:
                ri = f;
            break;
                
            case 7:
                ri = g;
            break;
                
            case 8:
                ri = h;
            break;
                
            case 9:
                ri = i;
            break;
               
            case 10:
                ri = j;
            break;
                
            case 11:
                ri = k;
            break;
                
            case 12:
                ri = l;
            break;
                
            case 13:
                ri = m;
            break;
                
            case 14:
                ri = n;
            break;
                
             case 15:
                ri = o;
            break;
                 
            case 16:
                ri = p;
            break;
                
            case 17:
                ri = q;
            break;
                
            case 18:
                ri = r;
            break;
                
            case 19:
                ri = s;
            break;
                
            case 20:
                ri = t;
            break;
                
            case 21:
                ri = u;
            break;
                
            case 22:
                ri = v;
            break;
                
            case 23:
                ri = w;
            break;
                
            case 24:
                ri = x;
            break;
                
            case 25:
                ri = y;
            break;
                
            case 26:
                ri = z;
            break;
        }
        return ri;
    } 
    
    //metodo que altera o padrao do painel, sempre que um cabo for ligado.
    public void cP(int ai, int b){
        switch(ai){
            case 1:
                this.a = b;
            break;
                
            case 2:
                this.b = b;
            break;
            
            case 3:
                this.c = b;
            break;
                
            case 4:
                this.d = b;
            break;
                
            case 5:
                this.e = b;
            break;
                
            case 6:
                this.f = b;
            break;
                
            case 7:
                this.g = b;
            break;
                
            case 8:
                this.h = b;
            break;
                
            case 9:
                this.i = b;
            break;
               
            case 10:
                this.j = b;
            break;
                
            case 11:
                this.k = b;
            break;
                
            case 12:
                this.l = b;
            break;
                
            case 13:
                this.m = b;
            break;
                
            case 14:
                this.n = b;
            break;
                
             case 15:
                this.o = b;
            break;
                 
            case 16:
                this.p = b;
            break;
                
            case 17:
                this.q = b;
            break;
                
            case 18:
                this.r = b;
            break;
                
            case 19:
                this.s = b;
            break;
                
            case 20:
                this.t = b;
            break;
                
            case 21:
                this.u = b;
            break;
                
            case 22:
                this.v = b;
            break;
                
            case 23:
                this.w = b;
            break;
                
            case 24:
                this.x = b;;
            break;
                
            case 25:
                this.y = b;
            break;
                
            case 26:
                this.z = b;
            break;
        }
    }
    
    //Como um cabo tem dupla ligação, este metodo faz duas chamdas do metodo cP(); alterando a ordem dos parâmetros
    public void completaPainel(int a, int b){
        cP(a,b);
        cP(b,a);
    }
 
}