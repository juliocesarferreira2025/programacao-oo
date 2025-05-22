# programacao-oo

Programacao_Orientada_a_Objeto/Analise_e_desenvolvimento_de_sistemas/Julio_Cesar
 
 ---
 
 # 🎮 Jogo de Adivinhação — Programação Orientada a Objetos (POO)
 
 Este projeto é um **jogo interativo de adivinhação de número secreto** desenvolvido em **Java**, com foco nos princípios da Programação Orientada a Objetos (POO). Foi criado como parte de um estudo dirigido na disciplina de POO no curso de Análise e Desenvolvimento de Sistemas.
 
 ---
 
 ## Objetivo
 
 O jogador deve adivinhar um número secreto entre 1 e 20. A cada tentativa errada, o jogo informa se o número correto é maior ou menor. Ao acertar, o jogador recebe uma pontuação proporcional ao número de tentativas e é adicionado ao ranking geral.
 
 ---
 
 ## Estrutura e Lógica do Projeto
 
 O projeto está dividido em quatro arquivos principais que representam os conceitos trabalhados nos exercícios:
 
 | Arquivo/Classe      | Exercício | Função                                                                 |
 |---------------------|-----------|------------------------------------------------------------------------|
 | `Jogador.java`      | 1         | Representa o jogador: armazena nome, tentativas e pontuação.          |
 | `Placar.java`       | 2         | Gerencia o ranking dos jogadores, ordenando-os por pontuação.         |
 | `Jogo.java`         | 3         | Lógica do jogo: gera número secreto, recebe tentativas e valida acertos. |
 | `Main.java`         | —         | Classe principal que integra tudo: executa o jogo e mostra o ranking. |
 
 
 O projeto está organizado em quatro classes principais:
 
 ### 1. `Jogador.java` (Exercício 1)
 Responsável por representar o jogador. Armazena:
 - Nome do jogador
 - Número de tentativas
 - Pontuação acumulada
 
 Métodos:
 - `incrementarTentativas()` → Conta cada tentativa do jogador
 - `atualizarPontuacao(int valor)` → Calcula a pontuação final ao acertar
 
 ---
 
 ### 2. `Placar.java` (Exercício 2)
 Gerencia o ranking dos jogadores:
 - Armazena uma lista de todos os jogadores que jogaram
 - Ordena pela maior pontuação
 - Exibe o placar com nome e pontuação
 
 ---
 
 ### 3. `Jogo.java` (Exercício 3)
 Contém a lógica principal do jogo:
 - Gera um número secreto aleatório de 1 a 20
 - Recebe as tentativas do jogador e retorna:
   - `"maior"` se o número for menor que a tentativa
   - `"menor"` se o número for maior que a tentativa
   - `"acertou"` se for igual, e atualiza a pontuação do jogador
 
 ---
 
 ### 4. `Main.java` (Execução)
 Classe que **integra todas as outras**:
 - Recebe o nome do jogador
 - Inicia uma instância de `Jogo` e `Jogador`
 - Controla o loop de tentativas
 - Ao acertar, imprime o número de tentativas e pontuação
 - Adiciona o jogador ao placar e exibe o ranking final
 
 ---
 
 ## Como executar o projeto
 
 ### Pré-requisitos
 
 Você precisa ter instalado:
 
 - [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
 - [IntelliJ IDEA](https://www.jetbrains.com/idea/) ou outra IDE
 - Git (opcional, para clonar o repositório)
 
 ### Usando o IntelliJ IDEA (recomendado)
 
 1. **Clone o repositório:**
 ```bash
 git clone https://github.com/SchusterAluizio/programacao-oo.git
 ```
 
 2. **Abra o IntelliJ IDEA:**
    - Vá em `File > Open...`
    - Selecione a pasta `programacao-oo`
 
 3. **Espere o projeto carregar** (o IntelliJ pode demorar alguns segundos para indexar e compilar o projeto automaticamente)
 
 4. **Abra o arquivo `Main.java`:**
    - Navegue até `src/Main.java` no painel lateral esquerdo
 
 5. **Execute o programa:**
    - Clique com o botão direito no método `main`
    - Selecione a opção `Run 'Main.main()'`
    - Ou clique no botão verde ▶️ ao lado da linha `public static void main(String[] args)`
 
 6. **Interaja com o console:**
    - Digite seu nome
    - Faça tentativas até acertar o número secreto
    - Veja sua pontuação e o ranking geral
   
 ---
 
 ## O que o projeto executa
 
 Quando você executa a classe `Main`, o seguinte fluxo ocorre:
 
 1. O jogador digita seu nome
 2. Um número secreto de 1 a 20 é gerado
 3. O jogador tenta adivinhar o número
 4. O programa orienta o jogador com “maior” ou “menor”
 5. Ao acertar:
    - Mostra a quantidade de tentativas
    - Calcula e exibe a pontuação
    - Atualiza e exibe o ranking com todos que jogaram
 
 ---
 
 
 Exemplo de execução
 
 Digite seu nome: Nome
 Adivinhe o número secreto entre 1 e 20.
 Tentativa: 10
 Tente um número menor.
 Tentativa: 3
 Tente um número maior.
 Tentativa: 5
 Parabéns! Você acertou o número secreto.
 Tentativas: 3
 Sua pontuação foi: 70
 
 Ranking:
 Nome - Pontuação: 70
