# Respostas da entrega

**1. Por que o código passou para a posição 7 no UPDATE?**

O método `preencher` grava os seis valores do `SET` (nome, autor, ano, edição, editora e unidades) nas posições de 1 a 6, seguindo a ordem dos pontos de interrogação (`?`) no SQL. O parâmetro do `WHERE id = ?` é o sétimo, por isso o código do livro é definido na posição 7.

**2. Por que a interface `LivroRepository` não precisou mudar?**

A interface `LivroRepository` trabalha com objetos da classe `Livro`, que agora possuem os novos atributos. Como os métodos continuam recebendo e devolvendo objetos `Livro`, não foi necessário alterar a interface. As mudanças foram feitas na implementação JDBC, incluindo o SQL e os métodos `preencher` e `mapear`.

**3. Qual é a diferença entre ler um número no terminal e validar a regra de negócio?**

Ler um número no terminal, responsabilidade da View, significa verificar se o texto digitado representa um número inteiro válido. Já validar a regra de negócio, responsabilidade do Service, significa verificar se o valor atende às condições do sistema, como edição maior ou igual a 1 e unidades maiores ou iguais a 0. A editora também deve ter entre 1 e 120 caracteres.

**4. Por que alterar apenas a View não seria suficiente?**

A View é responsável por exibir informações e receber os dados digitados pelo usuário. Para que os novos campos funcionem corretamente, também é necessário atualizar o Model, o banco de dados, o Repository, o Service e o Controller. Assim, os dados podem ser armazenados, recuperados, validados e utilizados corretamente pelo sistema.