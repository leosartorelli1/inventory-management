# Inventory Management

Atividade Dirigida:

Gerenciamento de Estoque com Collections em Java

Objetivo:

Nesta atividade, você aprenderá a gerenciar um estoque de produtos usando Java Collections. A atividade envolverá a criação de um menu com opções para cadastro, alteração, exclusão de produtos, entrada e saída no estoque, verificação do saldo atual e listagem de produtos.

Passo a Passo:

Passo 1: Compreensão dos Conceitos

1. Java Collections:

- Collections em Java são estruturas de dados que permitem armazenar e manipular grupos de objetos.

- A interface mais comum é a `List`, que permite armazenar elementos de forma ordenada e permite acesso e modificação através de índices.

Passo 2: Criação da Classe `Produto`

1. Defina uma classe `Produto` com os seguintes atributos:

- `nome` (String): Nome do produto.

- `quantidade` (int): Quantidade em estoque.

- `preco` (double): Preço do produto.

2. Crie os métodos necessários para a classe `Produto`:

- Construtor para inicializar os atributos.

- Métodos getters e setters para acessar e modificar os atributos.

- Método `toString` para representar o objeto `Produto` como uma string.

Passo 3: Implementação das Funcionalidades

1. Crie uma classe `GerenciarEstoque` com um menu de opções:

- **Cadastrar produto**: Solicita o nome, quantidade e preço do produto, e adiciona à lista de produtos.

- **Alterar dados do produto**: Permite modificar o nome, quantidade e preço de um produto existente.

- **Excluir produto**: Remove um produto da lista com base no nome.

- **Entrada no estoque**: Adiciona uma quantidade especificada ao estoque de um produto.

- **Saída no estoque**: Subtrai uma quantidade especificada do estoque de um produto, garantindo que a quantidade não fique negativa.

- **Saldo atual no estoque**: Exibe a quantidade atual em estoque de um produto.

- **Listar produtos**: Exibe todos os produtos cadastrados no sistema.

- **Sair**: Encerra o programa.

2. Implemente métodos auxiliares na classe `GerenciarEstoque` para realizar cada uma das funcionalidades acima.

Passo 4: Estrutura do Código

- Organize seu código em pacotes apropriados (`model` e `view`).

- Use comentários para explicar partes importantes do código.

Passo 5: Execução do Código

- Compile e execute o código para garantir que não há erros.

- Verifique se a saída está conforme o esperado.

