package br.com;

@ExampleAnotations(
        autor = "Arielton Ribeiro",
        aulaNumero = 97,
        blog = "arielton97"
)
public abstract class Teste {
    private String nome;
    private String especie;
    private String nomeDoDono;

    // Construtir
    public void Animal(String nome, String especie, String nomeDoDono){
        this.nome = nome;
        this.especie = especie;
        this.nomeDoDono = nomeDoDono;
    }

    // Métodos abstratos
    public abstract void mostrarInfo();
}
