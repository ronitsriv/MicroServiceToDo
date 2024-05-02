FROM openjdk:17
EXPOSE 8082
ADD target/microtodospring-boot-docker.jar microtodospring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/microtodospring-boot-docker.jar"]