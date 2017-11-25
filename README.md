# Sentences api
This api provides funny sentences for ["La tortuga sabia"](https://github.com/scatt89/tortuga_sabia) web app. Currently is deployed in a Heroku dyno called [sentences01](https://sentences01.herokuapp.com/).

Uses tecnologies like **Java 8**, **Spring MVC**, **Spring Boot**, **Spring JPA**, **Postgresql**.

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
    "adviceVO": "AHHHHHHHHHHHHHHHHHHHH!"
  },
  {
    "id": 3,
    "author": "Maria Josefa",
    "adviceVO": "Antes todo esto era campo, hijo... Menudos porrillos liábamos."
  },
  {
    "id": 4,
    "author": "La tortuga sabia",
    "adviceVO": "Mira hacia la luna pequeño aprendiz, sigue mirando mientras te hago un hijo."
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
  "adviceVO": "Antes todo esto era campo, hijo... Menudos porrillos liábamos."
}
```
### Get sentence by id
method: GET
link: [https://sentences01.herokuapp.com/sentences/id={id}](https://sentences01.herokuapp.com/sentences/id=2)
response example:
```json
{"id":2,"author":"La loca de los gatos","adviceVO":"AHHHHHHHHHHHHHHHHHHHH!"}
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
	"adviceVO":"AHHHHHHHHHHHHHHHHHHHH!"
}
```
response example:
```json
{
  "id": 5,
  "author": "La loca de los gatos",
  "adviceVO": "AHHHHHHHHHHHHHHHHHHHH!"
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

## Run in local
- run `mvn clean package` and copy the jar target/sentences-0.0.1-SNAPSHOT.jar to ci/app/sentences.jar before run docker
`
java -jar sentences.jar --spring.profiles.active="pro" --DB_URL="jdbc:postgresql://localhost:5432/test" --DB_USER="test" --DB_PASS="test"
`

## ToDo
 - Dockerize in local
 - Create pro environment and deploy in AWS
 - Ci with jenkins
 - Tests plz
 - Migrate to kotlin?
 - Migrate to Gradle?