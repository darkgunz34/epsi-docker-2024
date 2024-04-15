docker build . -t epsi-micro-service

docker image tag epsi-micro-service stephanparichon/epsi-micro-service:1.0
docker push stephanparichon/epsi-micro-service:1.0
