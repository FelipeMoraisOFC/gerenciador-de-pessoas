public class GerenciadorDePessoas {
    //Lista para armazenar pessoas
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    //Método para cadastrar pessoa
    public void cadastrarPessoa1(Pessoa pessoa) {
        this.pessoa1 = pessoa;
    }

    public void cadastrarPessoa2(Pessoa pessoa) {
        this.pessoa2 = pessoa;
    }

    //Método para atualizar pessoa
    public void atualizarPessoa1(Pessoa pessoa){
        if (pessoa1 != null) {
            this.pessoa1 = pessoa;
        }else {
            System.out.println("Pesoa1 ainda não foi cadastrada");
        }
    }

    public void atualizarPessoa2(Pessoa pessoa){
        if (pessoa2 != null) {
            this.pessoa2 = pessoa;
        }else {
            System.out.println("Pesoa2 ainda não foi cadastrada");
        }
    }

    //Método de exibição
    public void exibirPessoa1(){
        if (this.pessoa1 != null){
            System.out.println("Pessoa1: " + pessoa1.getNome() + " CPF: " + pessoa1.getCpf() + " Idade: " + pessoa1.getIdade());
        } else {
            System.out.println("Pesoa1 ainda não foi cadastrada");
        }
            
    }

    public void exibirPessoa2(){
        if (this.pessoa2 != null){
            System.out.println("Pessoa2: " + pessoa2.getNome() + " CPF: " + pessoa2.getCpf() + " Idade: " + pessoa2.getIdade());
        } else {
            System.out.println("Pesoa2 ainda não foi cadastrada");
        }
            
    }

}