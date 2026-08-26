package classes_objetos;

public class ContaBancaria {

    String agencia;
    String numeroDaConta;
    Double saldo;
    String tipoDeConta;
    Cliente cliente;

    public void depositar(Double valorDeposito){
        if(valorDeposito <= 0){
            System.out.println("Valor do deposito inválido");
            return;
        }
        saldo += valorDeposito; //saldo = saldo + valorDeposito
    }

   /* public void exibirDetalhes(){
        System.out.println("Agência: " +agencia);
        System.out.println("Número da conta: " +numeroDaConta);
        System.out.println("Titular: " +cliente.titular);
        System.out.println("CPF: " +cliente.cpf);
        System.out.println("RG: " +cliente.rg);
        System.out.println("Rua: " +cliente.endereco.rua);
        System.out.println("Número: " +cliente.endereco.numero);
        System.out.println("Bairro: " +cliente.endereco.bairro);
        System.out.println("Cidade: " +cliente.endereco.cidade);
        System.out.println("Cep: " +cliente.endereco.cep);
        System.out.println("Telefone: " +cliente.contato.telefone);
        System.out.println("Email: " +cliente.contato.email);
        System.out.println("Saldo R$ : " +saldo);
        System.out.println("Tipo de Conta: " +tipoDeConta);
    }
    */

    @Override
    public String toString() {
        return "**ContaBancaria**:" +
                "\nAgencia: " + agencia +
                "\nNúmero da Conta: " + numeroDaConta +
                "\nSaldo R$: " + saldo +
                "\nTipo de Conta: " + tipoDeConta +
                "\n" +cliente;
    }
}
