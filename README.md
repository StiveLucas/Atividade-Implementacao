# Atividade-Implementacao

Desenvolva um sistema para gerenciamento de contas bancárias, garantindo encapsulamento e tratamento adequado de exceções. O sistema deve conter as seguintes classes e funcionalidades:

1. Classe Conta (Entidade Principal)
Deve possuir atributos privados para armazenar o número da conta, nome do titular e saldo. Os métodos set devem validar os dados e lançar a exceção ExcecaoDadoInvalido caso o valor seja inválido.
Implementar métodos get para acessar os atributos de forma segura.

2. Classe CadastroContas (Gerenciador de Contas)
Responsável por armazenar e gerenciar as contas cadastradas.
Deve conter um atributo privado para manter a lista de contas.
Implementar os seguintes métodos:
inserir(Conta conta): Adiciona uma conta à lista.
Deve lançar:
ExcecaoRepositorio caso o limite máximo seja atingido.
ExcecaoElementoJaExistente se já existir uma conta com o mesmo número.
buscar(String numero): Retorna uma conta com base no número informado. Deve lançar ExcecaoElementoInexistente caso a conta não seja encontrada.
remover(String numero): Remove uma conta existente. Deve lançar ExcecaoElementoInexistente se a conta não estiver cadastrada.

3. Classes de Exceção Personalizadas
Implemente classes de exceção específicas para lidar com diferentes erros no sistema:

ExcecaoDadoInvalido: Para dados inválidos ao definir valores nos atributos da conta.
ExcecaoRepositorio: Para erro ao tentar inserir contas além da capacidade do sistema.
ExcecaoElementoJaExistente: Para erro ao cadastrar uma conta com um número já existente.
ExcecaoElementoInexistente: Para erro ao buscar ou remover uma conta inexistente.

4. Classe Main (Simulação do Sistema)
Criar uma classe Main com o método main para testar o funcionamento do sistema.
Implementar testes práticos para:
Cadastrar novas contas.
Buscar contas existentes e inexistentes.
Tentar cadastrar contas duplicadas.
Remover contas e tratar exceções.


O objetivo desse sistema é garantir segurança, organização e robustez no gerenciamento de contas, aplicando os princípios da Programação Orientada a Objetos (POO).