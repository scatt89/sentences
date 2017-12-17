FROM openjdk:8-jre-alpine
MAINTAINER mdasilva <dasilvagarciam@gmail.com>
LABEL Description="sentences service" Version="0.1"

ADD sentences.jar /sentences.jar

CMD ["sh", "-c", "java -jar sentences.jar --spring.profiles.active=$PROFILE --DB_URL=$DB_DRIVER:$DB_VENDOR://$DB_HOST:$DB_PORT/$POSTGRES_DB --DB_USER=$POSTGRES_USER --DB_PASS=$POSTGRES_PASSWORD"]

EXPOSE 8081