package com.tesnick.nosql.redisfromjava;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisConnectionException;

/**
 * Created by tesnick on 1/11/15.
 */
public class SampleProgram {

    public static void main(String[] args) {

        try {

            //Connecting to Redis server on localhost
            Jedis jedis = new Jedis("localhost");
            System.out.println("Connection to server sucessfully");
            System.out.println("Server is running: " + jedis.ping());

            //remove data if it's present
            jedis.del("tutorial-name");
            //set the data in redis string
            jedis.set("tutorial-name", "Redis tutorial");

            // Get the stored data and print it
            System.out.println("Stored string in redis:: " + jedis.get("tutorial-name"));

            // for a list with all the available commands:
            // http://redis.io/commands

        } catch(JedisConnectionException e){
            e.printStackTrace();
            System.err.println("Something goes wrong, unable to connect to Redis server...");
        }
    }
}
