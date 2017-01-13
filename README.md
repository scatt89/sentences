# Sentences api
This api provides funny sentences for ["La tortuga sabia"](https://github.com/scatt89/tortuga_sabia) web app. Currently is deployed in a Heroku dyno called [sentences01](https://sentences01.herokuapp.com/).

Uses tecnologies like **Java 8**, **Spring MVC**, **Spring Boot**, **Hibernate**, **Postgresql**.

## Rest Methods
### Get all sentences in database
method: GET
link:  [https://sentences01.herokuapp.com/sentences](https://sentences01.herokuapp.com/sentences)
response example:
```json
[
  {
    "id": 2,
    "author": "La loca de los gatos",
    "advice": "AHHHHHHHHHHHHHHHHHHHH!"
  },
  {
    "id": 3,
    "author": "Maria Josefa",
    "advice": "Antes todo esto era campo, hijo... Menudos porrillos liábamos."
  },
  {
    "id": 4,
    "author": "La tortuga sabia",
    "advice": "Mira hacia la luna pequeño aprendiz, sigue mirando mientras te hago un hijo."
  }
]
```

### Get random sentence
method: GET
link: [https://sentences01.herokuapp.com/sentences/random](https://sentences01.herokuapp.com/sentences/random)
response example:
```json
{
  "id": 3,
  "author": "Maria Josefa",
  "advice": "Antes todo esto era campo, hijo... Menudos porrillos liábamos."
}
```
### Get sentence by id
method: GET
link: [https://sentences01.herokuapp.com/sentences/id={id}](https://sentences01.herokuapp.com/sentences/id=2)
response example:
```json
{"id":2,"author":"La loca de los gatos","advice":"AHHHHHHHHHHHHHHHHHHHH!"}
```

### Add new sentence
method: POST
link: [https://sentences01.herokuapp.com/sentences/newAdvice](https://sentences01.herokuapp.com/sentences/newAdvice)
headers:
```json
{"Content-Type": "application/json"}
```
body: 
```json
{
	"author":"La loca de los gatos",
	"advice":"AHHHHHHHHHHHHHHHHHHHH!"
}
```
response example:
```json
{
  "id": 5,
  "author": "La loca de los gatos",
  "advice": "AHHHHHHHHHHHHHHHHHHHH!"
}
```

### Delete sentence by Id
method: GET
link: [https://sentences01.herokuapp.com/sentences/deleteAdvice/{id}](https://sentences01.herokuapp.com/sentences/deleteAdvice/5)
headers:
```json
{"Content-Type": "application/json"}
```
response example:
```json
204 No Content
```
