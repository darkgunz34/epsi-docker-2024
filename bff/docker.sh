docker build . -t epsi-bff
docker image tag epsi-bff stephanparichon/epsi-bff:1.0
docker push stephanparichon/epsi-bff:1.0
