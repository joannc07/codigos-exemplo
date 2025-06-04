
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.mostrarDados();
    }
}


class Pessoa {
    private String nome;
    private int idade;

    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
