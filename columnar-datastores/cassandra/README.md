# Cassandra

As mostly all data stores in this category, Apache Cassandra is build on foundations of Google’s BigTable (and Amazon’s Dynamo) and is the right choice when you need scalability and high availability without compromising performance. It offers the linear scalability and proven fault-tolerance on commodity hardware or cloud infrastructure, which makes it the perfect platform for mission-critical data. It is totally decentralized with no single points of failure.
One of the killing features of Apache Cassandra is support for multiple datacenters replication, so demanding capability for lowering the latency and disaster recovery. From the CAP theorem stand point, Apache Cassandra is an AP system with tunable consistency levels.

Recommendations on when to use (for more details please refer to Apache Cassandra: Use Cases):

Write-heavy workloads
Product Catalog / Playlist
Recommendation / Personalization
Fraud Detection
Messaging
IOT / Sensor Data
Real-time analytics
And many, many more …

# Steps to install & execute Redis on a Ubuntu machine

1) Download the latest stable version from:

[Download page](http://cassandra.apache.org/download/)

2) Unzip the file and go into it 

    2.1) tar xvf apache-cassandra-2.2.3-bin.tar.gz
    2.2) cd apache-cassandra-2.2.3/bin

3) Run it!
  
    3.1) ./cassandra -f (to execute the service in foreground)

More info here: [Getting Started](http://wiki.apache.org/cassandra/GettingStarted)

With the service up & running, we can add some info using the interactive commnad line interface, the cqlsh program, following these steps:

4) Add some information to be validated after with the Java Test Example

    4.1) ./cqlsh
    4.2) CREATE KEYSPACE mykeyspace
WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };
    4.3) USE mykeyspace;
    4.4) CREATE TABLE users (
  user_id int PRIMARY KEY,
  fname text,
  lname text
);
    4.5) INSERT INTO users (user_id,  fname, lname)
  VALUES (1745, 'john', 'smith');
INSERT INTO users (user_id,  fname, lname)
  VALUES (1744, 'john', 'doe');
INSERT INTO users (user_id,  fname, lname)
  VALUES (1746, 'john', 'smith');
    4.6) SELECT * FROM users;
    4.7) CREATE INDEX ON users (lname);

5) Execute the SampleProgram main program. 

As a output, you should see the names of the two users with "smith" as a "lname":

	john smith
	john smith


