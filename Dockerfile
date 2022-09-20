FROM openjdk:latest
VOLUME /tmp
COPY ./target/*.jar /temp.jar
ENTRYPOINT ["java","-jar","/temp.jar"]