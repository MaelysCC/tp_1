
# tp_1

1-1
When runing the container with a falg -e, the password are hidden and better protected than when put directly into the Dokerfile where they can get acces from the site hitself 

1-2
We need a volume to protect our data as a backup in case the container gets gamage or delete.

1-3
commande:
'''
# build the database, conect it to the designated network and add the volume
docker build -t maelys/postgres-db .
docker network create app-network
docker volume create postgres-data

# run the database and adminer 
docker run -d `
  --name postgre-db `
  --network app-network `
  -e POSTGRES_DB=db `
  -e POSTGRES_USER=usr `
  -e POSTGRES_PASSWORD=pwd `
  -v postgres-data:/var/lib/postgresql/data `
  maelys/postgres-db

docker run -d `
  -p 8090:8080 `
  --network app-network `
  --name adminer `
  adminer

# Verified 
  docker ps
'''


# see logs
docker logs simpleapi

# rebuild 
docker rm -f simpleapi
docker build -t maelys/simpleapi .
docker run -d --name simpleapi -p 8080:8080 maelys/simpleapi



1-4


1-5 
We need a reverse proxy to increase security and centralized authentification by isolating the backend, making th ereverse proxy the source of all content instead of the servers.
