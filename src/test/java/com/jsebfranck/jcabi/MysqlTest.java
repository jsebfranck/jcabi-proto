package com.jsebfranck.jcabi;

import java.sql.DriverManager;

import org.junit.Test;

public class MysqlTest {

	// http://www.yegor256.com/2014/05/21/mysql-maven-plugin.html

	@Test
	public void worksWithMysqlServer() throws Exception {
		final String port = System.getProperty("mysql.port");
		String connectionUrl = String.format("jdbc:mysql://localhost:%s/root?user=root&password=root", port);
		DriverManager.getConnection(connectionUrl);
	}
}
