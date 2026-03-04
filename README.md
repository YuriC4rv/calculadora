#Calculadora
Projeto simples de calculadora em Java, para praticar lógica de programação e estrutura de controle.

## Funcionalidades:
- Soma;
- Subtração;
- Multiplicação;
- Divisão;
- Potência;
- Raiz quadrada.

## Como Executar:
- 1º - Clone o repositório:
-   git clone https://github.com/YuriC4rv/calculadora.git
- 2º - Abra o projeto no Eclipse
- 3º - Execute a classe principal(e única até o momento)

## Aprendizados nesse projeto:
- Estrutura de controle em Java;
- Manipulação de entrada do usuário;
- Organização básica de projeto;
- Uso do Git para versionamento

## Roadmap de melhorias:
- // 1º - Estabilização:
- [X] - Corrigir fluxo de saída:
- #1.1 -> Fluxo de saída melhorado, com função de input baseado em exceção. Utilizando o try-catch para decidir se é string ou não.
- [x] - Tratar operador inválido
- #1.2:
- Lê números e operadores do usuário;
- Trata entradas inválidas (não numéricas ou operadores desconhecidos);
- Impede divisão por zero;
- Permite sair a qualquer momento digitando 'sair';
- Garante que operações inválidas não interrompam o programa;
- Organizado com estrutura de loop principal clara, facilitando futuras refatorações em métodos separados.
- [ ] - Refatorar em métodos separados
- // 2º - Organização:
-  [ ] - Separar classe Main e Calculadora
-  [ ] - Criar menu interativo
-  [ ] - Melhorar mensagem ao usuário
-  // 3º - Robustez:
-  [ ] - Implementar tratamento de exceções
-  [ ] - Validar entradas
-  [ ] - Tratar casos matemáticos inválidos
-  // 4º - Funcionalidades:
-  [ ] - Histórico de operações
-  [ ] - Porcentagem e módulo
-  [ ] - Operações encadeadas
-  // 5º - Profissionalização:
-  [ ] - Testes unitários
-  [ ] - Interface gráfica
-  [ ] - Versão executável
