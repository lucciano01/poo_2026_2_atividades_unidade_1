package classes_objetos;

public class App {
    static void main() {

        ContaBancaria contaDaMaria = new ContaBancaria();
        contaDaMaria.cliente = new Cliente();
        contaDaMaria.cliente.endereco = new Endereco();
        contaDaMaria.cliente.contato = new Contato();
        contaDaMaria.cliente.titular = "";
        contaDaMaria.cliente.cpf = "123456";
        contaDaMaria.cliente.rg = "654321";
        contaDaMaria.cliente.contato.email = "maria@email.com";
        contaDaMaria.cliente.contato.telefone = "XXXXXXX";
        contaDaMaria.cliente.endereco.rua = "Rua J";
        contaDaMaria.cliente.endereco.numero = "250";
        contaDaMaria.cliente.endereco.bairro = "Centro";
        contaDaMaria.cliente.endereco.cidade = "Cajazeiras/PB";
        contaDaMaria.cliente.endereco.cep = "58900-000";
        contaDaMaria.tipoDeConta = "Conta Corrente";
        contaDaMaria.saldo = 1500.50;
        contaDaMaria.agencia = "234-X";
        contaDaMaria.numeroDaConta = "5412-5";

        ContaBancaria contaDoJose = new ContaBancaria();
        contaDoJose.cliente = new Cliente();
        contaDoJose.cliente.endereco = new Endereco();
        contaDoJose.cliente.contato = new Contato();
        contaDoJose.cliente.titular = "José";
        contaDoJose.cliente.cpf = "9955477";
        contaDoJose.cliente.rg = "015246";
        contaDoJose.cliente.contato.telefone = "99447755";
        contaDoJose.cliente.contato.email = "jose@email.com";
        contaDoJose.cliente.endereco.rua = "Rua Juvencio Carneiro";
        contaDoJose.cliente.endereco.numero = "500";
        contaDoJose.cliente.endereco.cidade = "Cajazeiras/PB";
        contaDoJose.cliente.endereco.bairro = "Centro";
        contaDoJose.cliente.endereco.cep = "58900-00";
        contaDoJose.tipoDeConta = "Conta Poupança";
        contaDoJose.saldo = 250.0;
        contaDoJose.agencia = "234-X";
        contaDoJose.numeroDaConta = "4152-0";

        System.out.println("Saldo inicial conta de Maria: "+contaDaMaria.saldo);
        System.out.println("Saldo inicial conta de Jose: "+contaDoJose.saldo);

        contaDaMaria.depositar(-500.0);
        contaDoJose.depositar(-150.0);

        System.out.println(contaDaMaria);
        System.out.println("_____________________");
        System.out.println(contaDoJose);

    }
}
