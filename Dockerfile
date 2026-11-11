FROM eclipse-temurin:17-jre
LABEL maintainer="cool"
RUN echo "application starting, brace yourself"
WORKDIR /user/app
COPY target/docker-app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

#FROM openjdk:latest
#EXPOSE 9091 
#MAINTAINER cool 
#COPY target/docker-app.jar /user/app
#WORKDIR /user/app
#ENTRYPOINT [ "jave","-jar","docker-app.jar" ]