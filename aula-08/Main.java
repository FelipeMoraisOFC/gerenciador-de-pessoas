public class Main {
    public static void main(String[] args) {
        // Criando o gerenciador de pessoas
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Criando duas pessoas
        Pessoa pessoa1 = new Pessoa("Aloy", "123.456.789-00", 16);
        Pessoa pessoa2 = new Pessoa("Felipe", "987.654.321-00", 27);

        // Cadastrando as pessoas
        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibindo as informações cadastradas
        System.out.println("Informações iniciais:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualizando a pessoa 1
        Pessoa novaPessoa1 = new Pessoa("Aloy", "123.456.789-00", 22); // Mudança de idade
        gerenciador.atualizarPessoa1(novaPessoa1);

        // Exibindo as informações após a atualização
        System.out.println("\nInformações após atualização:");
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();
    }
}