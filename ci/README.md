# Build and run db container
- Inside db directory execute
`docker build -t sentencesdb .`
- After image created execute
`docker run --name db -p 5432:5432 --env-file var.env -e POSTGRES_PASSWORD=RIGHTPASS sentencesdb`
- After docker is running, can execute queries with
`docker exec -it db bash`
- Enter in psql console
`psql sentencesdb sentencespro`

# Build and run app container
- Build app
`docker build -t sentencesapp .`
- run app
`docker run --name app --env-file var.env -p 8081:8081 --link db:db -e POSTGRES_PASSWORD=RIGHTPASS sentencesapp`

# docker-compose
- Build services
`docker-compose build`
- Run docker compose with pass variables
`docker-compose run -e POSTGRES_PASSWORD=RIGHTPASS`
- Log containers
`docker-compose logs`
- Stop and remove containers and images
`docker-compose down`

# ToDo
  - Pass the passwords using secrets
  
