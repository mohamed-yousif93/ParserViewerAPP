FROM openjdk:19
EXPOSE 8080
VOLUME /var/lib/postgresql/data
LABEL maintainer="mohamedyousif093@gmail.com"
WORKDIR /ParserViewerAPP
COPY target/ParserViewerAPP-0.0.1-SNAPSHOT.jar ParserViewerAPP-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ParserViewerAPP-0.0.1-SNAPSHOT.jar"]