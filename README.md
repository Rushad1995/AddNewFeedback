# performance-tracking-service

buildandupload
Made by the team at Scalereal, this is a base project to quickly spin up a Micronaut application built with opinions of Scalereal style of working.

Install Java v11 :
sdk install java 11

for more reference visit (https://sdkman.io/usage)

Build app :
./gradlew build

you'll get error for env vars, Export env : 
export JWT_GENERATOR_SIGNATURE_SECRET={your_secret}

to generate secret use openssl, run below command to get your secret :
openssl rand -base64 172 | tr -d '\n'

Create database :
make create-db;

Drop database :
make drop-db;

Reset database :
make reset-db;

Run server(migration will automatically run) : 
./gradlew api:run

🎉 All done, we completed our setup visit http://localhost:9000/api/health

Features
Uses Exposed ORM.
Uses Micronaut.
Heroku ready. Push to Heroku and it will work.
Uses PostgreSQL.
User JWT based authentication/authorization setup
Uses Hexagonal Architecture
For graphql setup check branch graphql
About ScaleReal
ScaleReal

wheel is maintained by ScaleReal. A product and service based company with an energetic team of passionate, self-driven individuals building Mobile and Web applications.