# Sentences api
This api provides funny sentences for ["La tortuga sabia"](https://github.com/scatt89/tortuga_sabia) web app. Currently is deployed in a Heroku dyno called [sentences01](https://sentences01.herokuapp.com/).

Uses technologies like **Java 8**, **Spring MVC**, **Spring Boot**, **Spring JPA**, **Postgresql**.

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
link: [http://localhost:8081/sentences/insert](http://sentences01.herokuapp.com/sentences/insert)
headers:
```json
{"Content-Type": "application/json"}
```
body: 
```json
{
	"sentence":"AHHHHHHHHHHHHHHHHHHHH!"
	"userName":"La loca de los gatos",
}
```
response example:
```json
{
  "id": 5,
  "sentence": "AHHHHHHHHHHHHHHHHHHHH!",
  "author": {
    "userName": "wise_turtle",
    "name": "La loca de los gatos"
  }
}
```

### Delete sentence by Id
method: GET
link: [http://sentences01.herokuapp.com/sentences/delete/id={id}](http://sentences01.herokuapp.com/sentences/delete/id=72)
headers:
```json
{"Content-Type": "application/json"}
```
response example:
```json
200 Ok
```

## Run in local
- Look up the ci/README.md file

## ToDo
 - Dockerize in local
 - Ci with jenkins
 - Create pro environment and deploy in AWS
 - Tests plz
 - Migrate to kotlin?
 - Migrate to Gradle?