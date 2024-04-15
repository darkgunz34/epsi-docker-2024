docker build . -t epsi-front

docker image tag epsi-front stephanparichon/epsi-front:1.0
docker push stephanparichon/epsi-front:1.0
