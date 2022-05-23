package de.red.sqldriver;

import java.sql.Connection;

public abstract class SQLDriver {

  final String user;
  final String ip;

  Connection connection;
  String pwd;


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

  public SQLDriver(String user) {
    this.user = user;
    this.ip = "127.0.0.1";
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

  public abstract void connect();

  public abstract void disconnect();

  public String getName() {
    return this.getClass().getSimpleName();
  }

}
