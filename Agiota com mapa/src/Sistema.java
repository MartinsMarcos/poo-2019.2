import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Transacao{
    int id;
    float value;
    String clienteId;

    public Transacao(int id, float value, String clienteId) {
        this.id = id;
        this.value = value;
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "" + id + ":" + value + ":" + clienteId;
    }
}


class Cliente{
    String id;
    String fullname;
    float saldo;

    public Cliente (String id, String fullname){
        this.id = id;
        this.fullname = fullname;
        this.saldo = 0;
    }

    @Override
    public String toString() {
        return this.id + ":" + this.fullname + ": " + this.saldo;
    }
}
class Sistema{
    float saldo;
    ArrayList<Cliente> clientes;
    ArrayList<Transacao> transacoes;
    int nextTrId;

    public Sistema(float saldo){
        this.saldo = saldo;
        this.clientes = new ArrayList<Cliente>();
        this.transacoes = new ArrayList<Transacao>();
        this.nextTrId = 0;
    }

    void cadastrar(Cliente cliente){
        try {
            this.findCliente(cliente.id);
            throw new RuntimeException("Cliente ja existe");
        }catch (RuntimeException re){
            clientes.add(cliente);
        }
    }

    Cliente findCliente(String id){
        for(Cliente cli : clientes) {
            if (cli.id.equals(id))
                return cli;
        }
        throw new RuntimeException("cliente n existe");
    }

    void addTransacao(float value, String clienteId){
        this.transacoes.add(new Transacao(nextTrId, value, clienteId));
        nextTrId += 1;

    }
    void emprestar(String id, float saldo){
        Cliente cli = findCliente(id);
        if(cli == null){
            System.out.println("cliente n existe");
            return;
        }
        addTransacao(-saldo, id);
        this.saldo -= saldo;
        cli.saldo += saldo;
    }
    void receber(String id, float saldo) {
        Cliente cli = findCliente(id);
        if(cli.saldo < saldo){
            System.out.println("fail: pagamente maior q divida");
            return;
        }

        addTransacao(saldo, id);
        cli.saldo -= saldo;
        this.saldo += saldo;
    }


    ArrayList<Transacao> getHistorico(){
        return transacoes;
    }

    @Override
    public String toString() {
        String saida = "";
        for(Cliente cliente : clientes)
            saida += cliente + "\n";
        saida += "saldo: " + this.saldo;
        return saida;
    }
}

