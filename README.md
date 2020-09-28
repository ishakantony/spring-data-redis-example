# spring-data-redis example

To use this repo, you need to have redis in your system. I recommend you to use docker.

`docker container run --name redis -p 6379:6379 -d redis`

To open `redis-cli` inside your container:

`docker container exec -it redis redis-cli`

See all keys:

`KEYS *`

---

#### Save data to redis

Using httpie: `http POST :8080/api/v1/books bookName=='Some Book'`

#### Get data from redis

Using httpie: `http GET :8080/api/v1/books/<UUID>`