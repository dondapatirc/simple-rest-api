FROM openjdk:17

ADD target simple-rest-api-0.0.1-SNAPSHOT.jar simple-rest-api.jar

ENTRYPOINT ["java", "-jar", "simple-rest-api.jar"]