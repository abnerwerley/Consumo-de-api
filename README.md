# desafio-kitsu-backend
Desafio técnico para processo de nivelamento de conhecimento técnico em desenvolvimento de software.

# Como fiz:
- Criei gerei o zip do projeto no https://start.spring.io/ com as seguintes dependências:
  *  Spring Web já que seria uma aplicação web
  *  Spring Boot DevTools - para recarregar a aplicação de forma rápida
 -  Fiz a conversão do corpo json resposta do anime pra fazer as models usando o https://json2csharp.com/json-to-pojo
 - Dividi as inner classes de anime para classes, e retirei atributos que não usaria/não achei necessários, e gerei os getters e setters.
 - Criei uma classe de Response, que vai conter a lista de Animes,e gerei os getters e setters.
 - Usei o Webclient para fazer as chamadas na API-Kitsu:
  - Defini o header e a base url na classe main do projeto
  - injetei ela no AnimeService com o endereço complementar da API externa, montei a chamada pro primeiro endpoint pra teste, e criei ele (/anime/busca/{texto}.
  - Testei com o postman, e assm fui criando os demais endpoints do Anime e testando.
 <br>
 - Fiz a conversão pra fazer a model do Mangá.
 - Desmembrei as Inner Classes em classes normais e gerei seus getters e setters.
 - Criei a MangaResponse, que vai conter a lista de Mangas, e gerei seu getter e setter.
 - Criei as chamadas no MangaService e as usei no controller.
 <br>
 - Adicionei e configurei o swagger pra facilitar testes de quem quiser testar.
 - 

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
