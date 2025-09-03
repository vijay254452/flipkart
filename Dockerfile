FROM tomcat:10.1-jdk17

# Remove default webapps
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR file into Tomcat as ROOT
COPY target/flipkart-app.war /usr/local/tomcat/webapps/ROOT.war
 


EXPOSE 8080
CMD ["catalina.sh", "run"]
