# desafio-kitsu-backend
Desafio técnico para processo de nivelamento de conhecimento técnico em desenvolvimento de software.

# Como fiz:
- Criei gerei o zip do projeto no https://start.spring.io/ com as seguintes dependências:
  *  Spring Web já que seria uma aplicação web
  *  Spring Boot DevTools - para recarregar a aplicação de forma rápida
 - Adicionei a dependencia do Lombok pra usar na model Anime
 -  Fiz a conversão do corpo json resposta do anime pra fazer a model anime usando o https://json2csharp.com/json-to-pojo 
 - Usei o RestTemplate pra pegar o corpo da resposta da api e converter pro objeto da model.
 - Fiz a conversão pra fazer a model do Mangá.
 - Fiz o controller do Mangá

# Como fazer o código rodar:

Requisitos:
 - Ter uma JRE se quiser somente rodar o projeto.

Passos
 - Fazer o git clone do url do repositório pro seu workspace (Ou baixar o zip dele).
 - Importar o projeto Maven na IDE e selecionar o endereço do local onde baixou.
 - Selecionar o Projeto na Sua IDE e Rodar como Java Application
 - Entrar no http://localhost:8082/swagger-ui/ pelo seu navegador
 - Testar os endpoints e passar os parâmetros quando necessário.
    
# Prótotipo de banco de dados:
https://drive.google.com/drive/folders/1VW0icPsb432XV0bmfn1yi-JomjTtuMQi?usp=sharing
