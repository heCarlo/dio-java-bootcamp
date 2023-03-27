import java.util.Scanner;

public class CTDriver {
    public static void main(String[] args) {
        int tempNumero;
        String tempAgencia;
        String tempCliente;
        double tempCredito;

        Scanner in = new Scanner(System.in);
    
        System.out.println("Digite o numero da sua conta:");
		tempNumero = in.nextInt();
		in.nextLine();

        System.out.println("Digite a agência da sua conta:");
		tempAgencia = in.next();
		in.nextLine();

        System.out.println("Digite o nome do cliente:");
		tempCliente = in.next();
		in.nextLine();

        System.out.println("Digite o saldo da conta:");
		tempCredito = in.nextDouble();
		in.nextLine();

        
		ContaTerminal c1 = new ContaTerminal(tempNumero, tempAgencia, tempCliente, tempCredito);
        System.out.println("Olá "+tempCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+tempAgencia+", conta "+tempNumero+" e seu saldo "+tempCredito+" já está disponível para saque.");
    }

}
