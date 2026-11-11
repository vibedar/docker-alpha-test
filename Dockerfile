FROM openjdk:latest
EXPOSE 9091 
#MAINTAINER cool 
RUN echo "application starting, brace yourself"
COPY target/docker-app.jar /user/app
WORKDIR /user/app
ENTRYPOINT [ "jave","-jar","docker-app.jar" ]