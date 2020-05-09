FROM openjdk:8
ADD target/calculator-docker-jenkins-1.0-SNAPSHOT.jar calculator-docker-jenkins-1.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/calculator-docker-jenkins-1.0-SNAPSHOT.jar"]