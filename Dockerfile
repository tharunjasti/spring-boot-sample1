FROM openjdk:8
ADD target/spring-boot-sample-0.0.1-SNAPSHOT.jar spring-boot-sample.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "spring-boot-sample.jar"]