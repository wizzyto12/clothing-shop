package task5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.lang3.StringUtils;

public class SQLConnection {
    private static Connection connection = null;
	   
    public SQLConnection(String localhost, String dbport, String dbname, String dbuser, String dbpassword) throws SQLException
    {
    	connection = DriverManager.getConnection("jdbc:mysql://" + localhost + ":"  + dbport + "/" + dbname, dbuser, dbpassword);
    }
    

    
    private Statement execute(String query) throws SQLException
    {
    	Statement statement = null;
    	
	    statement = connection.createStatement();
	    statement.execute(query);
	    
	    return statement;
    }
    
    public ResultSet select(String query) throws SQLException
    {
    	Statement statement = execute(query);
    	ResultSet resultSet = statement.getResultSet();
    	
		return resultSet;
    }
    
    public void init() throws SQLException
    {
    	String query = "CREATE TABLE IF NOT EXISTS `school`.`items` ( `id` INT NOT NULL AUTO_INCREMENT , `type` VARCHAR(255) NOT NULL , `size` VARCHAR(255) NOT NULL , `weight` VARCHAR(255) NOT NULL , `color` VARCHAR(255) NOT NULL , `color_pattern` VARCHAR(255) NOT NULL , `price` VARCHAR(255) NOT NULL , `fabric` VARCHAR(255) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;";
    	execute(query);
    }
    
    public void insert(String table_name, String[] columns, String[] values) throws SQLException {
    	String query_columns = "`" + StringUtils.join(columns, "`,`") + "`";
    	String query_values = "'" + StringUtils.join(values, "','") + "'";
    	
    	String query = "INSERT INTO `" + table_name + "` (" + query_columns + ") VALUES (" + query_values + ")";
    	
    	execute(query);
    }
}