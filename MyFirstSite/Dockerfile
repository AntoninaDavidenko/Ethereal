FROM openjdk
EXPOSE 8080
ADD target/ethereal-docker.jar ethereal-docker.jar
ENTRYPOINT ["java", "-jar", "ethereal-docker.jar"]