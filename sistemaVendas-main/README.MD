
#Modificações Implementadas:

- Inclusão do Maven como gerenciador de dependências para simplificar a distribuição da aplicação. Agora, qualquer usuário pode clonar o repositório e instalar as dependências sem complicações.

- Introdução de um docker-compose para configurar facilmente o banco de dados MariaDB. Basta executar o comando abaixo para iniciar:


``` bash
$ docker-compose up
```
- Atualização das dependências do projeto para garantir compatibilidade e segurança.

- Implementação de suporte dinâmico para relatórios no Jasper. A partir de arquivos .jrfxml, o Jasper agora gera automaticamente novos arquivos .jasper conforme necessário.

- Adição de uma função para criação automática de tabelas no banco de dados durante a primeira conexão, um recurso previamente ausente.

<a href="https://ibb.co/1vFj5jY"><img src="https://i.ibb.co/6njLxLc/image-2024-06-15-222054888.png" alt="image-2024-06-15-222054888" border="0"></a>