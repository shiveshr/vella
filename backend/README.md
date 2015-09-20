backend logic:
comprises of multiple flows which should be broken into microservices in future:
1. access to db
2. access to elastic search
3. access to cassandra

// right now backend should not even have a main.
// front end should directly call into this

deployment will look as follows (later this will all change into different clusters)
1. frontend process in a docker containr
2. backend process in a docker container
3. elastic search in a docker container
4. cassandra/mongodb in a docker container

// start all containers with -d flag so that they run in daemon mode

for v.01
frontend+backend will be one single service -- later this can be broken up into two microservices that will communicate via some messaging scheme


