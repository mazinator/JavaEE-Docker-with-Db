# JavaEE-Docker-with-Db

## Getting started with wildfly:
generate war-file from dbRest
put war-file into deployments folder
execute docker-compose up

## Getting started with payara/openliberty/tomee:
generate war-file from simpleRest
put war-file into deployments folder
excute run_<app_server>.bat


result on ports:

	- wildfly:     8080
    - payara:      8081
    - openliberty: 8082
    - tomee:       8083
    

## Used docker Images:
    
    - wildfly:      https://hub.docker.com/r/jboss/wildfly/
    - payara:       https://hub.docker.com/r/payara/server-full/
    - openliberty:  https://hub.docker.com/r/openliberty/open-liberty/
    - tomee:        https://hub.docker.com/_/tomee/

## Command Doku:
docker run -p 8082:9080 -p 9443:9443 -v %cd%/deployments:/opt/ol/wlp/usr/servers/defaultServer/dropins/ openliberty/open-liberty:webProfile8

-p 8082:9080                                                       -> map host ports\
-p 9443:9443                                                       -> map admin ports\
-v %cd%/deployments:/opt/ol/wlp/usr/servers/defaultServer/dropins/ -> map the deployments directory to host directory (%cd% represents the current directory)\
openliberty/open-liberty:webProfile8                               -> name of image\