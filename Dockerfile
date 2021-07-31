FROM java:8-jdk-alpine
COPY ./target/spring-mysql-demo-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch spring-mysql-demo-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java","-jar","spring-mysql-demo-0.0.1-SNAPSHOT.jar.war"]