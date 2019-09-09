
public class Conta {
    private String titular;
    static int nextId = 1;
    private int id;
    private double saldo;



    public Conta(String titular, double saldo){//int totalDeContas){
        this.titular = titular;
        this.saldo = saldo;
        this.id= nextId;
        nextId += 1;
        this.totalDeContas = totalDeContas;
    }
    public Conta(){

    }
    public String toString(){
        return "[" + this.titular + "]" +
               "Numero da conta: " + this.id + "Saldo:" + this.saldo;
    }

    //Questão 2:
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getIdentificador() {
        return id;
    }

    void getRedimento(){

    }
    void sacar(double valor){
        if (titular != null){
            if(valor <= this.saldo){
                System.out.println("Sacando dinheiro" + valor + "...");
                this.saldo = this.saldo - valor;
            } else{
                System.out.println("Você não tem saldo suficiente para realizar saque ");
            }
        } else {
            System.out.println("So é possivel realizar saque por usuarios com contas ativas");
        }
    }

    void depositar(double valor){
        if (titular != null){
            System.out.println("Realizando deposito" + valor + "...");
            this.saldo = this.saldo + valor;
        } else {
            System.out.println("So é possivel realizar saque por usuarios com contas ativas");
        }
    }

    void tranferir(int id, double valor){
        if (titular != null){
            if(valor <= this.saldo){
                System.out.println("Realizando transferencia" + valor + "...");
                this.saldo -= valor;
            } else{
                System.out.println("Você não tem saldo suficiente para realizar tranferencia desse valor");
            }
        } else {
            System.out.println("So é possivel realizar transferencia por usuarios com contas ativas");
        }
    }
    void receber(double valor){
        this.saldo = valor;
    }
}