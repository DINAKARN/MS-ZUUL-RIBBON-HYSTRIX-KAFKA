FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar kafka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/kafka-0.0.1-SNAPSHOT.jar"]