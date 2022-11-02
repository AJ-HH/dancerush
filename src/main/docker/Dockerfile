FROM adoptopenjdk:11-jre-hotspot
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} application.jar
EXPOSE 8080
CMD java -Dspring.datasource.url=$SPRING_DATASOURCE_URL -Dspring.datasource.username=$SPRING_DATASOURCE_USERNAME -Dspring.datasource.password=$SPRING_DATASOURCE_PASSWORD -Dspring.jpa.hibernate.ddl-auto=$SPRING_JPA_HIBERNATE_DDL_AUTO -jar application.jar
# ENTRYPOINT ["java", "-jar", "application.jar"]
