# Como fiz:
<h3>Criação do projeto:</h3>

- Criei gerei o zip do projeto no https://start.spring.io/ com as seguintes dependências:<br>
-  Spring Web já que seria uma aplicação web. <br>
-  Spring Boot DevTools - para recarregar a aplicação de forma rápida <br>

<h3>Anime</h3>

  - Fiz a conversão do corpo json resposta do anime pra fazer as models usando o https://json2csharp.com/json-to-pojo <br>
  - Dividi as inner classes de anime para classes, e retirei atributos que não usaria/não achei necessários, e gerei os getters e setters.<br>
  - Criei uma classe de Response, que vai conter a lista de Animes,e gerei os getters e setters.<br>

 <h3> WebClient</h3>
 
  - Defini o header e a base url na classe main do projeto<br>
  - injetei ela no AnimeService com o endereço complementar da API externa, montei a chamada pro primeiro endpoint pra teste, e criei ele (/anime/busca/{texto}.<br>
  - Testei com o postman, e assm fui criando os demais endpoints do Anime e testando.<br>

<h3>Manga</h3>

 -Fiz a conversão pra fazer a model do Mangá.<br>
 - Desmembrei as Inner Classes em classes normais e gerei seus getters e setters.<br>
 - Criei a MangaResponse, que vai conter a lista de Mangas, e gerei seu getter e setter.<br>
 - Criei as chamadas no MangaService e as usei no controller.<br>
 
<h3>Swagger</h3>

 - Adicionei e configurei o swagger pra facilitar testes de quem quiser testar.<br>

# Como fazer o código rodar:

Requisitos:
 - Ter um navegador

Passos
 - Entrar em https://challengekitsu.herokuapp.com/swagger-ui/#/ pelo seu navegador
 - Testar os endpoints e passar os parâmetros quando necessário.
    
# Prótotipo de banco de dados:
https://drive.google.com/drive/folders/1VW0icPsb432XV0bmfn1yi-JomjTtuMQi?usp=sharing
