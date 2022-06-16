FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE=target/nacos-consumer-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]