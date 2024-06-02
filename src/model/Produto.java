package model;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;


//construtor

public Produto(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
}


//getters e setters

public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public void setQuantidade(int quantidade){
    this.quantidade = quantidade;
}

public int getQuantidade(){
    return quantidade;
}

public double getPreco(){
    return preco;
}

public void setPreco(double preco){
    this.preco = preco;
}


public String toString(){
    return "Produto{" + "nome='" + nome + '\'' + ", quantidade=" + quantidade + ", preco=" + preco + '}';
}

}