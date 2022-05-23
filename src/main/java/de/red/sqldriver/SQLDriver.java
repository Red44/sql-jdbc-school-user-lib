package de.red.sqldriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class SQLDriver {

  final String user;
  final String ip;

  protected Connection connection;
  protected String pwd;


  public SQLDriver(String user, String pwd) {
    this.user = user;
    this.ip = "127.0.0.1";
    this.pwd = pwd;
  }

  public SQLDriver(String user, String pwd, String ip) {
    this.user = user;
    this.ip = ip;
    this.pwd = pwd;
  }

  public SQLDriver(String pwd) {
    this.user = "root";
    this.ip = "127.0.0.1";
    this.pwd = pwd;
  }

  public final String getUser() {
    return this.user;
  }

  public final String getIp() {
    return this.ip;
  }

  public Connection getConnection() {
    return connection;
  }

  public abstract void connect(String database);

  public void disconnect() throws SQLException {
    this.connection.close();
  }

  public String getName() {
    return this.getClass().getSimpleName();
  }

  protected static void loadDriver(String clazz){
    try {
       Class.forName(clazz);
    }catch (ClassNotFoundException e){
      e.printStackTrace();
    }
  }

  protected void setConnection(String connectionURL,String user, String pwd) {
    try {
      this.connection = DriverManager.getConnection(connectionURL, user, pwd);
    }catch (SQLException e){
      e.printStackTrace();
    }
  }

}
