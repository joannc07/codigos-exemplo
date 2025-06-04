// Classe principal
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.mostrarDados();
    }
}

// Classe Pessoa
class Pessoa {
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}