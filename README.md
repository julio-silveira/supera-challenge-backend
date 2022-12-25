# Processo Seletivo Java

## Descrição 

- Este teste consiste em construir uma camada de serviço, para uma operação muito realizada em bancos, para emissão de extrato bancário.


## Como executar a aplicação 

1. Clone a aplicação utilizando o comando `git clone git@github.com:julio-silveira/supera-challenge-backend.git`

2. Utilize o comando `cd supera-challenge-backend/` para entrar no diretório da aplicação;

### Utilizando Docker(Sugerido)

3a. Execute o comando `docker-compose up` e aguarde a instalação de dependências e configuração da aplicação/banco de dados(Esse processo leva em média 3 minutos para finalizar);

4a. Se não ocorrer nenhum erro durante a execução do docker compose, baixe o frontend da aplicação seguindo o passo a passo que se encontra no repositório. https://github.com/julio-silveira/supera-challenge-frontend

### Sem Docker
   
 3b. Crie um banco de dados mysql com nome de "banco" na sua máquina; 
 
 4b. Acesse o arquivo application.properties que se encontra no caminho /app/src/main/resources e altere as 3 primeiras linhas com as informações do seu banco de dados criado anteriormente;
 
 5b. Volte para o diretório /app e execute o comando `mvn clean install` e em seguida `mvn spring-boot:run`
  
 6b. Se não ocorrer nenhum erro durante a execução dos comandos, baixe o frontend da aplicação seguindo o passo a passo que se encontra no repositório. https://github.com/julio-silveira/supera-challenge-frontend 

## Requisitos do Projeto

- A sua api deve fornecer os dados de transferência de acordo com o número da conta bacária.
- Caso não seja informado nenhum filtro, retornar  todos os dados de transferência.
- Caso seja informado um período de tempo, retornar todas as transferências relacionadas à aquele período de tempo.
- Caso seja informado o nome do operador da transação, retornar todas as transferências relacionados à aquele operador.
- Caso todos os filtros sejam informados, retornar todas as transferências com base no período de tempo informado e o nome do operador.
- Operador de transação nada mais é que, o nome do responsável de destino da transação caso seja uma operação de transferência de saida ou o nome do responsável de onde se originou a transação caso seja uma operação de transferência de entrada.
- Os valores devem ser de ponto flutuante, e deve-se considerar apenas duas casas decimais.
- O frontend deve seguir como exemplo o protótipo informado no documento do processo seletivo.
- No frontend o usuário deve ser capaz de informar um período de tem e/ou nome do operador da transasção como filtros para buscar as transações.
- As transações devem ser exibidas junto com o saldo total e o saldo total no período de acordo com o protótipo do documento.

### Tecnologias Utilizadas

- Java 11
- Spring Boot 2.6.4
- Maven 3.6.3
- Docker
- Docker Compose
