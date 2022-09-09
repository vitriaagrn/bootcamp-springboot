FROM openjdk:11-oraclelinux8
ARG JAR_FILE=demo-0.0.1-SNAPSHOT.jar
COPY target/${JAR_FILE} /var/app/application.jar
ENTRYPOINT [ "java" ]
CMD [ "-jar", "/var/app/application.jar" ]

ENV DATABASE_HOST=localhost
ENV DATABASE_PORT=5432
ENV DATABASE_USER=postgres
ENV DATABASE_PASSWORD=password

EXPOSE 8080/tcp