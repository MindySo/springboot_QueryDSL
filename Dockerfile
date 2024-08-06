FROM openjdk:17-alpine
COPY build/libs/springboot_QueryDSL-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]