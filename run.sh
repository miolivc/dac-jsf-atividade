mvn clean install;
docker kill app;
docker rm app;
docker rmi miolivc/atividade-jsf;
docker build -t miolivc/atividade-jsf .;
docker run -p 8080:8080 -d --name app miolivc/atividade-jsf