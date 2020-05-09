FROM openjdk:8
ADD target/calculator-docker-jenkins.jar calculator-docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "/calculator-docker-jenkins.jar"]