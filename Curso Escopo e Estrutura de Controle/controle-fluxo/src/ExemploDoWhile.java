import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        //executando rapetidas vezes até alguém atender
        System.out.println("Discando...");
        do {

        }while(tocando());

        System.out.println("Alô!!!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}

