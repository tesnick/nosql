# Redis from Java Example

Steps to install & execute Redis on a Ubuntu machine

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




