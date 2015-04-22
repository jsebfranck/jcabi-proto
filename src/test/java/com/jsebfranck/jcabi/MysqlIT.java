package com.jsebfranck.jcabi;

import java.sql.DriverManager;
import java.sql.Connection;

import org.junit.Test;

public class MysqlIT {

	// http://www.yegor256.com/2014/05/21/mysql-maven-plugin.html

	@Test
	public void worksWithMysqlServer() throws Exception {
		final String port = System.getProperty("mysql.port");
		String connectionUrl = String.format("jdbc:mysql://localhost:%s/test", port);
		Connection conn = DriverManager.getConnection(connectionUrl, "root", "root");
        System.out.println("connected to " + connectionUrl);
        conn.close();
	}
}
