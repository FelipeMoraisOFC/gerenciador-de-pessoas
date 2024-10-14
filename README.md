# gerenciador-de-pessoas
Ferramenta de gerenciamento de pessoas!

Breve descrição

Este é sistema um simples de gerenciador de pessoas em Java. Com ele podemos cadastrar, atualizar e exibir informações de duas pessoas. As informações gerenciadas para cada pessoa incluem nome, CPF e idade. O sistema utiliza o conceito de encapsulamento, onde os atributos das classes são privados e seu acesso a esses dados é controlado por métodos públicos (getters e setters).

Istruções de compilalção e execução

Você precisa ter o JDK (Java Development Kit) instalado na sua máquina e tambem alguma ferramenta como o visual studio code (VScode). Cumprindo esse Pré-requisitos, a compilasão do código será feita altamaticamente asim que você clicar no íconi de player presente no canto superior direito do VScode.

Explicação de Como a Lógica de Encapsulamento Foi Aplicada

A lógica de encapsulamento foi aplicada da seguinte forma:

1 Atributos Privados:

Na classe Pessoa, os atributos nome, cpf e idade foram declarados como private, o que impede o acesso direto a eles por outras classes. Isso protege a integridade dos dados, garantindo que eles só possam ser modificados de forma controlada.

2 Getters e Setters Públicos:

Para acessar e modificar os atributos privados, foram criados métodos get e set para cada atributo. Os métodos get permitem ler o valor dos atributos e os métodos set permitem modificar os valores. Isso dá controle total sobre como os dados são manipulados.

3 Lógica de Negócio no Gerenciador:

A classe GerenciadorDePessoas encapsula a lógica de manipulação de pessoa1 e pessoa2, usando os métodos cadastrarPessoa1(), cadastrarPessoa2(), atualizarPessoa1() e atualizarPessoa2() para modificar os objetos Pessoa internamente, garantindo que os atributos permaneçam protegidos.

4 Métodos para Exibir Dados:

Os métodos exibirPessoa1() e exibirPessoa2() acessam os dados das pessoas por meio dos getters e imprimem os valores. Isso garante que as informações das pessoas sejam expostas de forma controlada.