// Classe que representa um Funcionário Cadastrador
class FuncionarioCadastrador {

    public FuncionarioCadastrador() {
    }

    // Método para cadastrar um cidadão
    public void cadastrarCidadao(Cidadao cidadao) {
        if (cidadao.Vacinado()) {
            System.out.println("Cidadão " + cidadao.getNome() + " cadastrado com sucesso!");
        } else {
            System.out.println("Cidadão " + cidadao.getNome() + " não pode ser cadastrado pois não está vacinado.");
        }
    }
}

// Classe que representa um Cidadão
class Cidadao {
    private final String cpf;
    private final String nome;
    private final int idade;
    private final boolean vacinado;

    public Cidadao(String cpf, String nome, int idade, boolean vacinado) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.vacinado = vacinado;
    }

    public String getNome() {
        return nome;
    }

    public boolean Vacinado() {
        return vacinado;
    }

    // Método para exibir informações sobre o cidadão
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Vacinado: " + (vacinado ? "Sim" : "Não"));
    }
}

// Classe principal para testar o código
public class Atividade01 {
    public static void main(String[] args) {
        // Criando um funcionário cadastrador
        FuncionarioCadastrador funcionario = new FuncionarioCadastrador();

        // Criando um cidadão
        Cidadao cidadao = new Cidadao("12345678901", "Maria", 30, true);

        // Exibindo informações sobre o cidadão
        cidadao.exibirInformacoes();

        // Cadastrando o cidadão através do funcionário cadastrador
        funcionario.cadastrarCidadao(cidadao);
    }
}
