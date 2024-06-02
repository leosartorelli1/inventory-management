package view;

import model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEstoque {
    private List<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        GerenciarEstoque gerenciarEstoque = new GerenciarEstoque();
        gerenciarEstoque.menu();
    }

    public void menu(){
        int opcao;
        do{
            System.out.println("Menu de Opções: ");
            System.out.println("1. Cadastrar novo produto: ");
            System.out.println("2. Alterar informação do produto: ");
            System.out.println("3. Excluir produto: ");
            System.out.println("4. Dar entrada de produto no estoque: ");
            System.out.println("5. Dar saída de produto no estoque: ");
            System.out.println("6. Visualizar saldo atual do estoque: ");
            System.out.println("7. Listar todos os produtos do estoque: ");
            System.out.println("8. Sair");
            System.out.println("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();
            

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    alterarProduto();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 4:
                    entradaEstoque();
                    break;
                case 5:
                    saidaEstoque();
                    break;
                case 6:
                    saldoAtualEstoque();
                    break;
                case 7:
                    listarProdutos();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 8);
    }

    //Solicita e adiciona um novo produto a lista
    private void cadastrarProduto(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.println("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        System.out.println("Preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        produtos.add(new Produto(nome, quantidade, preco));

        System.out.println("Produto" + nome + "Cadastrado com sucesso!.");
    }
    

    //Solicita o nome e faz a alteração de dados do produto
    private void alterarProduto(){
        System.out.println("Nome do produto a ser alterado: ");
        String nome = scanner.nextLine();
        Produto produto = encontrarProdutoPorNome(nome);

        if ( produto != null){
            
            System.out.println("Novo nome do produto: ");
            produto.setNome(scanner.nextLine());

            System.out.println("Nova quantidade em estoque: ");
            produto.setQuantidade(scanner.nextInt());

            System.out.println("Preço atualizado do produto: ");
            produto.setPreco(scanner.nextDouble());

            scanner.nextLine();

            System.out.println("Alterações realizadas com sucesso!.");
        } 
        else{
            System.out.println("Produto não encontrado no estoque!.");
        }
    }

    //Solicita o nome e faz a remoção do produto da lista 
    private void excluirProduto(){

        System.out.println("Nome do produto procurado: ");
        String nome = scanner.nextLine();
        Produto produto = encontrarProdutoPorNome(nome);


    if(produto != null){
        produtos.remove(produto);
        System.out.println("Produto retirado do estoque!.");
    } 
    else {
        System.out.println("Produto não encontrado no estoque!.");
    }
}

    //Solicita o nome para dar entrada do produto ao estoque
    private void entradaEstoque(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();
        Produto produto = encontrarProdutoPorNome(nome);

        if( produto != null){
            System.out.println("Digite a quantidade a ser acrescentada ao estoque: ");
            int quantidade = scanner.nextInt();
            scanner.nextLine();
            produto.setQuantidade(produto.getQuantidade() + quantidade);
            System.out.println("Entrada de produto realizada com sucesso!.");
        }
        else { 
            System.out.println("Produto não encontrado no estoque!.");
        }
}

        //Solicita o nome do produto e da saida dele ao estoque 
        private void saidaEstoque(){
            System.out.println("Nome do produto: ");
            String nome = scanner.nextLine();
            Produto produto = encontrarProdutoPorNome(nome);

            if ( produto != null){
                System.out.println("Digite a quantidade a ser removida: ");
                int quantidade = scanner.nextInt();

                scanner.nextLine();

                if(quantidade <= produto.getQuantidade()){
                    produto.setQuantidade((produto.getQuantidade() - quantidade));
                    System.out.println("Saída de " + quantidade + " unidades do produto '" + nome + "' realizada com sucesso!");
                
            }
            else {
                System.out.println("Quantidade insuficiente no estoque!.");
            } 
        } 
            else{
                System.out.println("Produto não encontrado no estoque!.");
            }
        
        }

    //Solicita o nome do produto e mostra a quantidade atual dele no estoque 
    private void saldoAtualEstoque(){
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();
        Produto produto = encontrarProdutoPorNome(nome);

        if( produto != null){
            System.out.println("A quantidade atual do produto '" + nome + "' no estoque é: " + produto.getQuantidade());
        } 
        else{
            System.out.println("Produto não encontrado no estoque!.");
        }
    }

    //Lista todos os produtos disponiveis no estoque atual
    private void listarProdutos(){

        if (produtos.isEmpty()){
            System.out.println("Não há produto no estoque!.");
        }
        else {
            System.out.println("Lista de produtos no estoque: ");
            for ( Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }

    private Produto encontrarProdutoPorNome(String nome){
        for ( Produto produto : produtos){
            if ( produto.getNome().equalsIgnoreCase(nome)){
                return produto;
            }
        }
        return null;
    }









    }

