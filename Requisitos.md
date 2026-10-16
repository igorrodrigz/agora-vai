Análise simplificada de requisitos — Cadastro de Voluntários

**Objetivo:** desenvolver um sistema simples para a Defesa Civil cadastrar e consultar voluntários, utilizando **Java, interface no terminal e armazenamento em arquivo CSV**.

A entrevista destaca dificuldades com tecnologia e a necessidade de padronizar informações. Como o cadastro de voluntários não foi detalhado no trecho, as funcionalidades abaixo são propostas para discussão com o grupo.

Problema que queremos resolver

Organizar os dados dos voluntários em um cadastro que facilite encontrar seus contatos e identificar como podem ajudar a Defesa Civil.

**Dados sugeridos**

| Campo | Finalidade |
| ----- | ----- |
| ID | Identificar cada cadastro. |
| Nome completo | Identificar o voluntário. |
| CPF | Identificar o voluntário. |
| Email | Entrar em contato |
| Telefone | Permitir contato. |
| Município | Informar onde o voluntário está localizado. |
| Habilidade ou área de atuação | Informar como pode ajudar. |
| Disponibilidade | Informar os dias ou períodos disponíveis. |

**Requisitos funcionais**

| Código | O sistema deverá… |
| ----- | ----- |
| RF01 | Cadastrar voluntários. |
| RF02 | Listar todos os voluntários cadastrados. |
| RF03 | Buscar voluntários pelo ID ou nome. |
| RF04 | Editar os dados de um voluntário. |
| RF05 | Excluir um cadastro mediante confirmação. |
| RF06 | Salvar os dados em CSV e carregá-los ao iniciar. |

**Requisitos não funcionais**

* Ser desenvolvido em Java.  
* Funcionar pelo terminal, com menu numérico e mensagens claras.  
* Armazenar os dados em um arquivo CSV local.  
* Funcionar sem internet.  
* Tratar entradas inválidas e falhas de leitura ou gravação sem encerrar inesperadamente.

**Regras básicas**

* Cada voluntário terá um ID único, gerado pelo sistema.  
* Nome e telefone serão obrigatórios.  
* Editar ou excluir exigirá um cadastro existente.  
* A exclusão precisará de confirmação.  
* Se o arquivo ainda não existir, o sistema iniciará com a lista vazia.  
* Os dados deverão continuar disponíveis após fechar e abrir o programa.  
* Campos com separadores, aspas ou quebras de linha deverão ser tratados corretamente no CSV.

**Limites da primeira versão**

A primeira versão terá somente cadastro, consulta, edição e exclusão. Login, envio de mensagens, convocação de voluntários e relatórios de ocorrências ficam para possíveis evoluções.

**Como verificar se funciona**

Cadastrar um voluntário, fechar o programa e abri-lo novamente: o registro deverá permanecer disponível. Depois, testar busca, edição e exclusão, verificando se as alterações também foram salvas.

Requisitos:

* Um cadastro para cada município;

* Filtros por Regiões, Municípios e Profissionais;

* Ser o mais intuitivo possível;

* Os profissionais precisam ter as informações profissionais, separando eles em regiões e municípios.

* Tutorial de como se utilizar o aplicativo;

* Ideia do Luigi: Transcrição de áudio para escrita.

Segundo Semestre  
**Voluntário (Entidade)**

* ID;  
* Nome completo;  
* CPF;  
* Email;  
* Telefone \- Multivalorado;  
* Município;  
* Habilidade ou área de atuação;  
* Disponibilidade.

| [Modelo PPI \- Segundo Semestre](https://app.brmodeloweb.com/publicview/6ad01e6889c4418a384c3829) |


**Ideias para terceiro semestre:**

* Município (Entidade);  
* Habilidade ou área de atuação(Entidade);  
* Login (Entidade).