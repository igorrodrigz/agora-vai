A ideia é transformar cada classe Java em um roteiro em português, descrevendo o que ela precisa fazer. Assim, vocês podem reconstruir o código por conta própria, sem depender de copiar o projeto pronto.

Vamos manter as cinco classes do projeto: `Main`, `Menu`, `Voluntario`, `Cadastro`, `Editar`, `Excluir` e `ArquivoCSV`.

# 1. Classe `Voluntario`

Objetivo: representar um voluntário e guardar suas informações.



## Classe Voluntario — Roteiro em português

1. Criar uma classe chamada `Voluntario`.
2. Declarar os atributos que representam os dados de um voluntário:
   - **Identificador numérico.
   - Nome completo.
   - CPF.
   - Município.
   - Área de formação ou especialidade.
   - Telefone.
   - E-mail.
   - Dias disponíveis.
   - Turnos disponíveis.
3. Definir os tipos de dados adequados para cada atributo.
4. Criar um construtor que receba os dados necessários e os atribua aos atributos do objeto.
5. Criar métodos para consultar os dados de um voluntário.
6. Criar métodos para alterar os dados quando necessário.

O que vocês precisam entender: cada objeto criado a partir dessa classe representa um voluntário diferente. Os atributos armazenam as informações específicas daquela pessoa.

# 2. Classe `Menu`

Objetivo: mostrar as opções disponíveis e receber a escolha do usuário.



## Classe Menu — Roteiro em português

1. Criar uma classe chamada `Menu`.
2. Criar um método responsável por exibir as opções do sistema: OKEI
   - Cadastrar voluntário.
   - Listar voluntários.
   - Consultar voluntário.
   - Editar voluntário.
   - Excluir voluntário.
   - **Salvar os dados. - Será um atributo e não opção do menu, utilizado em "excluir", "editar" e "cadastrar".
   - Sair do sistema.
3. Exibir as opções no terminal. OK
4. Solicitar que o usuário digite o número da opção desejada. OK
5. Ler a opção digitada. OK
6. Devolver essa opção para a classe principal decidir o que fazer. PRECISA DO CADASTRO.

O que vocês precisam entender: o menu apresenta as opções, mas não precisa executar todas as operações diretamente. Ele recebe a escolha e deixa a classe principal encaminhar a operação.

# 3. Classe `Cadastro`

Objetivo: controlar o cadastro e as operações com os voluntários.



## Classe Cadastro — Roteiro em português

1. Criar uma classe chamada `Cadastro`.
2. Criar um vetor capaz de armazenar até 10 objetos do tipo Voluntario. (10 inicialmente.)
3. Criar uma variável para controlar quantos voluntários estão cadastrados.
4. Criar um método para cadastrar voluntários:
   - Verificar se ainda existe espaço no vetor.
   - Solicitar os dados do voluntário.
   - Criar um objeto Voluntario com os dados recebidos.
   - Armazenar o objeto na próxima posição disponível.
   - Atualizar a quantidade de voluntários cadastrados.
5. Criar um método para listar todos os voluntários cadastrados.
6. Criar um método para procurar um voluntário pelo identificador ou CPF.
7. Criar um método para editar os dados de um voluntário encontrado.
8. Criar um método para excluir um voluntário:
   - Localizar o voluntário.
   - Removê-lo logicamente do vetor.
   - Reorganizar as posições necessárias para não deixar uma posição vazia entre os registros.
   - Atualizar a quantidade de voluntários.
9. Criar métodos que permitam consultar a quantidade de voluntários e acessar os dados necessários para salvar e carregar os registros.

O que vocês precisam entender: essa classe administra o vetor e as operações sobre os registros. Como vocês ainda estão aprendendo, vale construir e testar primeiro o cadastro e a listagem; depois, acrescentar consulta, edição e exclusão.

# 4. Classe `ArquivoCSV`

Objetivo: salvar os cadastros em um arquivo e recuperá-los quando o programa for aberto novamente.



## Classe ArquivoCSV — Roteiro em português

1. Criar uma classe chamada `ArquivoCSV`.
2. Definir o nome do arquivo CSV utilizado para armazenar os dados.
3. Criar um método para salvar os voluntários:
   - Abrir ou criar o arquivo CSV.
   - Percorrer o vetor de voluntários cadastrados.
   - Obter os dados de cada voluntário.
   - Escrever os dados em uma linha do arquivo, separando os campos por ponto e vírgula ou vírgula.
   - Fechar o arquivo após terminar a gravação.
4. Criar um método para carregar os voluntários:
   - Verificar se o arquivo existe.
   - Abrir o arquivo para leitura.
   - Ler cada linha.
   - Separar os campos de cada registro.
   - Converter os valores para os tipos de dados correspondentes.
   - Criar um objeto Voluntario para cada registro válido.
   - Armazenar os objetos no cadastro, respeitando o limite do vetor.
   - Fechar o arquivo após terminar a leitura.
5. Tratar possíveis erros de leitura e gravação, informando o usuário quando ocorrer um problema.

O que vocês precisam entender: o vetor mantém os dados durante a execução do programa. O arquivo CSV permite que esses dados continuem disponíveis depois que o programa for fechado.

Um detalhe importante: os campos que contêm o caractere usado como separador precisam ser tratados corretamente. Para uma primeira versão, vocês podem limitar os dados de entrada ou implementar o tratamento depois.

# 5. Classe `Main`

Objetivo: iniciar o programa e coordenar as outras classes.



## Classe Main — Roteiro em português

1. Criar a classe principal do programa.
2. Criar o método principal que o Java executa ao iniciar a aplicação.
3. Criar um objeto responsável por administrar os voluntários.
4. Criar um objeto responsável por exibir o menu.
5. Criar um objeto responsável pela leitura e gravação dos arquivos.
6. Ao iniciar o programa, tentar carregar os voluntários salvos no arquivo CSV.
7. Criar uma estrutura de repetição para manter o menu funcionando até que o usuário escolha sair.
8. Em cada repetição:
   - Exibir o menu.
   - Ler a opção escolhida.
   - Usar uma estrutura de decisão para identificar a opção.
   - Chamar o método responsável pela operação selecionada.
9. Ao escolher sair, salvar os dados no arquivo CSV.
10. Encerrar o programa.

O que vocês precisam entender: a classe principal funciona como coordenadora. Ela não precisa conter todo o código de cadastro, consulta e gravação; chama os métodos das outras classes.

## Como transformar os roteiros em código

Recomendo que vocês desenvolvam na seguinte ordem:

### 1

`Voluntario.java`

Criem a classe, os atributos e o construtor. Testem a criação de um objeto.

### 2

`Cadastro.java`

Implementem primeiro o vetor, o cadastro e a listagem. Testem antes de continuar.

### 3

`Menu.java`

Criem a exibição das opções e a leitura da escolha.

### 4

`ArquivoCSV.java`

Implementem a gravação e a leitura dos registros.

### 5

`Main.java`

Conectem as classes e façam o fluxo completo funcionar.

Atenção: os roteiros descrevem as responsabilidades das classes, mas não garantem que correspondam exatamente aos nomes dos métodos e à estrutura do código que vocês já receberam. Ao escreverem a versão própria, mantenham os nomes e os parâmetros consistentes entre as classes.

A melhor forma de aprender é implementar uma classe por vez, compilar, testar e corrigir os erros antes de avançar para a próxima.