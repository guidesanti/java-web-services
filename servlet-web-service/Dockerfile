FROM tomcat:9.0-alpine

LABEL maintainer="guidesanti@yahoo.com.br"

LABEL version="0.0.1"

ADD target/servlet-web-service.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]