FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.bat admin passme --silent

CMD ["/opt/jboss/wildfly/bin/standalone.bat", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
