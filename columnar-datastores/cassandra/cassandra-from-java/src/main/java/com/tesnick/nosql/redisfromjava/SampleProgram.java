package com.tesnick.nosql.redisfromjava;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 * Created by tesnick on 1/11/15.
 */
public class SampleProgram {

    public static void main(String[] args) {

        Cluster cluster;
        Session session;

        // Connect to the cluster and keyspace "demo"
        cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
        session = cluster.connect("mykeyspace");

        // Use select to get the user we just entered
        ResultSet results = session.execute("SELECT * FROM users WHERE lname = 'smith'");
        for (Row row : results) {
            System.out.format("%s %s\n", row.getString("fname"), row.getString("lname"));
        }

        // Clean up the connection by closing it
        cluster.close();
    }
}
