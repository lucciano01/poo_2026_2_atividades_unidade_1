package aula5;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // Criando o usuário
        User user = new User("José", "123");

        // Cadastrando os serviços (O metódo que eu me confundio)
        // O sentido desse metodo é adicionar o TipoServico e o Valor em Servico
        // e o serviço ser adicionado a user.
        user.adicionarServico(
                new Servico(TipoServico.ELETRICO, 200)
        );

        // Adiciona 2 serviços com o mesmo metódo
        user.adicionarServico(
                new Servico(TipoServico.ALVENARIA, 300)
        );

        // Consulta pelo CPF
        try (Scanner sc = new Scanner(System.in)) {
        // Pq vc usou try no Scanner?
        // Lembra que na monitoria eu disse que tinha um jeito de fechar o scanner
        // automaticamente após o uso? é com esse try e não, ele não para exceptions
        // O motivo principal de fecharmos ele, é a otimização de recursos.

            System.out.print("Digite o CPF: ");
            String cpf = sc.nextLine().trim();
            // O trim serve para remover espaços em branco
            // importante para compararmos ele a outra variável.

            // O exemplo de exceptions que eu prometi, um Try, com if e um Throw new
            try {
                if (!user.getCpf().equals(cpf)) {
                    throw new IllegalArgumentException(
                            "Usuário não encontrado."
                    );
                }

                // Formatação da atividade.
                System.out.println("************************");
                System.out.println(
                        "Usuário: " + user.getNome()
                                + " - CPF: " + user.getCpf()
                );

                // Agrupando os serviços pelo tipo
                List<Servico> servicos = user.getServicos();

                Map<TipoServico, List<Servico>> agrupados =
                        servicos.stream()
                                .collect(Collectors.groupingBy(Servico::getTipo));

                agrupados.forEach((tipo, lista) -> {
                    lista.forEach(servico ->
                            System.out.println(
                                    " Serviço: " + tipo
                                            + " | Valor R$: " + servico.getValor()
                            )
                    );
                });

                // Somando o valor de todos os serviços
                double total = servicos.stream()
                        .mapToDouble(Servico::getValor)
                        .sum();

                System.out.println("Total R$: " + total);
                System.out.println("************************");

            }

            // Se der erro, vai pular t0do o resto e cair aqui, caso contrario, vai só executar.

            catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}