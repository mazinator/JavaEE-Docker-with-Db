#!/bin/bash
docker run -p 8080:8080 -v $PWD/deployments:/opt/jboss/wildfly/standalone/deployments/ jboss/wildfly
