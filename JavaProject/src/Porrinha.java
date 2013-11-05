import java.util.Random;
import java.util.Scanner;
public class Porrinha {
    
    static int PALITOS_ESCONDIDOS_JOGADOR;
    static int PALITOS_ESCONDIDOS_CPU;
    static int PALITOS_JOGADOR;
    static int PALITOS_CPU;
    static Scanner scan;
    
    public static void main(String[]args){
      
     PALITOS_JOGADOR = 3;
     PALITOS_CPU = 3;
     boolean semGanhador = true;
     
     int somaPalitos;
     while(semGanhador){
         msg("--------------------\n\n");
         prepararJogador();
         prepararCpu(PALITOS_CPU);
         
         somaPalitos = PALITOS_ESCONDIDOS_JOGADOR + PALITOS_ESCONDIDOS_CPU;
         if(obterChuteJogador() == somaPalitos){
             msg("Você acertou. Parabéns!!!");
             PALITOS_JOGADOR--;
             if(PALITOS_JOGADOR == 0){
                 msg("###############\nPARABÉNS VOCÊ VENCER!!!!\n");
                 semGanhador = false;
             }
         }else{
             msg("Que pena, você errou!!! o resultado correto seria: "+somaPalitos);
         }
         if(obterChuteCpu(somaPalitos) == somaPalitos){
             msg("CPU acertou!!!");
             PALITOS_CPU--;
             if(PALITOS_CPU== 0){
                 msg("Que pena, CPU venceu!!! tente novamente.");
                 semGanhador = false;
             }
         }
         
     }
     
    }
    
    public static void prepararJogador(){        
        scan = new Scanner(System.in);
        
        msg("Digite quantos palitos você deseja esconder?\nVocê possui "
        +PALITOS_JOGADOR+ " palitos. | CPU possui: "+PALITOS_CPU + " palitos.");
        
        PALITOS_ESCONDIDOS_JOGADOR = scan.nextInt();
    }
    public static void prepararCpu(int qtd){ 
       Random random = new Random();
       PALITOS_ESCONDIDOS_CPU = random.nextInt(qtd+1);
      
    }
    public static int obterChuteJogador(){
       int chute;
       msg("Qual a soma das suas moedas escondidas com as da cpu?");
       chute = scan.nextInt();
       
       return chute;
    }
    public static int obterChuteCpu(int qtdMaxima){
        Random random = new Random();
        int chute;
        chute = random.nextInt(qtdMaxima+1);
        msg("CPU chute: "+ chute);
        return chute;
    }
    public static void msg(String texto){
        System.out.println(texto);
    }
    
}
