FROM postgres:10-alpine
MAINTAINER mdasilva <dasilvagarciam@gmail.com>
LABEL Description="sentences database" Version="0.1"

COPY 01_schema.sh /docker-entrypoint-initdb.d/
COPY 02_data.sh /docker-entrypoint-initdb.d/