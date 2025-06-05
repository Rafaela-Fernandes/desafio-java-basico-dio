public class ContaTerminal {

    int numeroConta = 0;
    String agencia = "0-000";
    String cliente = "Rafaela";
    double saldo = 0.00;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void getStatusConta(){
        System.out.println("Olá, " + this.cliente + "obrigado por criar uma conta em nosso banco, sua agência é: " + this.agencia  + " conta: " + this.numeroConta + " saldo disponivel: " +  this.saldo);
    }


}
