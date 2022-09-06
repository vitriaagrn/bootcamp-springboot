FROM openjdk:11-oraclelinux8
COPY target/demo-0.0.1-SNAPSHOT.jar /var/app/application.jar
ENTRYPOINT [ "java" ]
CMD [ "-jar", "/var/app/application.jar" ]
EXPOSE 8080/tcp