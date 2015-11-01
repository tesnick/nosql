# Redis

Along with Memcached, Redis is one of the most widely known and used key/value data stores. Although thinking about Redis as a key/value store is a valid assumption, Redis does much more, giving away to the hands of the developers the power of complex data structures. To quote http://redis.io:

“Redis is an open source, BSD licensed, advanced key-value store, used as database, cache and message broker. It is often referred to as a data structure server since keys can contain strings, hashes, lists, sets and sorted sets.”

For distributed deployment, Redis supports clustering (also known as Redis Cluster). Interestingly, from the CAP theorem prospective, Redis Cluster is neither a CP nor a AP system but something along these lines.

Recommendations on when to use (for more details please refer to [How to take advantage of Redis just adding it to your stack](http://oldblog.antirez.com/post/take-advantage-of-redis-adding-it-to-your-stack.html)):

Caching Layer
In-memory Session Store
Distributed locking
Real-time analytics
Publish/Subscribe & Queues
Counters
Leader boards
To finish up with Redis, it is worth to mention quite a few case studies:
Redis Sharding at Craigslist
How Twitter Uses Redis to Scale

# Steps to install & execute Redis on a Ubuntu machine

1) Download the latest stable version ([this one at the moment](http://download.redis.io/releases/redis-3.0.5.tar.gz)) from:

[Download page](http://redis.io/download)

2) Unzip the file and go into it 

    2.1) tar xvf redis-3.0.5.tar.gz 
    2.2) cd redis-3.0.5 

3) Install it following the instructions inside the README file. Basically, you only need to execute this command: 

    3.1) make

4) Run it!
  
    4.1) cd src
    4.2) ./redis-server
   
You should see something like "The server is now ready to accept connections on port ..." at the end. 

Wit the server running, you can execute the SampleProgram application.




