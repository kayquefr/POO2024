// Classe que representa um Funcionário Cadastrador
class FuncionarioCadastrador {
    private String nome;
    private int matricula;
    private String cnpjPrestadoraServico;

    public FuncionarioCadastrador(String nome, int matricula, String cnpjPrestadoraServico) {
        this.nome = nome;
        this.matricula = matricula;
        this.cnpjPrestadoraServico = cnpjPrestadoraServico;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCnpjPrestadoraServico() {
        return cnpjPrestadoraServico;
    }

    public void setCnpjPrestadoraServico(String cnpjPrestadoraServico) {
        this.cnpjPrestadoraServico = cnpjPrestadoraServico;
    }

    // Método para cadastrar um cidadão
    public void cadastrarCidadao(Cidadao cidadao) {
        if (cidadao.isVacinado()) {
            System.out.println("Cidadão " + cidadao.getNome() + " cadastrado com sucesso!");
        } else {
            System.out.println("Cidadão " + cidadao.getNome() + " não pode ser cadastrado pois não está vacinado.");
        }
    }
}

// Classe que representa um Cidadão
class Cidadao {
    private String cpf;
    private String nome;
    private int idade;
    private boolean vacinado;

    public Cidadao(String cpf, String nome, int idade, boolean vacinado) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.vacinado = vacinado;
    }

    // Métodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
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
        FuncionarioCadastrador funcionario = new FuncionarioCadastrador("João", 123456, "123456789");

        // Criando um cidadão
        Cidadao cidadao = new Cidadao("12345678901", "Maria", 30, true);

        // Exibindo informações sobre o cidadão
        cidadao.exibirInformacoes();

        // Cadastrando o cidadão através do funcionário cadastrador
        funcionario.cadastrarCidadao(cidadao);
    }
}
