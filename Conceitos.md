1 - Repositórios: É um diretório (Pasta oculta, todos os arquivos .git são ocultos no sistema windows).
    Essa pasta rastreia e revisa TODAS as mudanças feitas nos arquivos, e constrói um histórico de mudanças, que é chamado de "Marco Histórico".

2 - Commit: São as alterações públicadas no marco histórico do repositório. Ex: Pense em fases de um video-game, cada Commit é como se  fosse um save.
    Marco Histórico: o(Início do projeto) ---- o(Primeiro Commit) ---- o(Segundo commit).
    Estágios para Commitar: 
    - Modified: O código foi modificado;
    - Stage: O código está PRONTO para ser comittado. (Pense como se fosse um palco, você coloca ele em preferência para ser commitado)
    - Commited: O código/mudanças no código que já foram enviados.

3 - Branch: É uma nova linha do tempo do código principal, podendo mesclar essas novas linhas com a brench principal do código.
    Por exemplo, imagina que o cliente peça para você modificar o programa para colocar a cor laranja para um teste, em vez de mudar a brench principal sem ter nenhuma forma de voltar atrás, você cria uma brench nova e testa as modificações na brench, e caso o cliente aprove possa mesclar com a branch principal.
            /------o------o----\ - Essa seria uma brench criada enquanto a linha principal está sendo comittada, e ela foi mesclada no final.
    ------o------o------o------o - Essa é a brench PRINCIPAL, é o seu código primário. 

    Curiosidades:
    - Cada branch é um novo diretório. (Pasta oculta para o windows);
    - Mesmo cada commit sendo uma nova pasta, o repositório (a pasta principal) rastrea todos os brenchs e suas alterações.

    Comandos:
    - "git fetch": Confere se o repositório tem atualizações na nuvem. E atualiza automaticamente. (Use o comando no terminal);
    - "git pull": Puxa a versão atualizada da núvem. Similar ao botão "sincronizar".