FROM openjdk:17

EXPOSE 8080

COPY target/Design_Patterns_Practice-1.0-SNAPSHOT.jar /Design_Patterns_Practice-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/Design_Patterns_Practice-1.0-SNAPSHOT.jar"]