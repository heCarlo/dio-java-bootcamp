public class ContaTerminal {
            private int numero;
            private String agencia;
            private String nomeCliente;
            private double saldo;
        
            //Construtor
            public ContaTerminal(int Numero, String Agencia, String Cliente, double Credito){
                this.numero = Numero;
                this.agencia = Agencia;
                this.nomeCliente = Cliente;
                this.saldo = Credito;
            }

            public int getNumero(){
                return numero;
            }
            public void setNumero (int numero){
                this.numero = numero;
            }
            public String getagencia(){
                return agencia;
            }
            public void setagencia (String agencia){
                this.agencia = agencia;
            }
            public String getnomeCliente(){
                return nomeCliente;
            }
            public void setnomeCliente(String nomeCliente){
                this.nomeCliente = nomeCliente;
            }
            public double getsaldo(){
                return saldo;
            }
            public void setsaldo (double saldo){
                this.saldo = saldo;
            }
                
    }
