docker run -p 8081:8080 -p 4848:4848 -v %cd%/deployments:/opt/payara5/glassfish/domains/domain1/autodeploy/ payara/server-full