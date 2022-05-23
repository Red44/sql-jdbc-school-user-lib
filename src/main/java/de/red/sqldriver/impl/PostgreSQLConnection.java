package de.red.sqldriver.impl;

import de.red.sqldriver.SQLConnection;

public class PostgreSQLConnection extends SQLConnection {
  static {
    loadDriver("org.postgresql.Driver");
  }

  public PostgreSQLConnection(String user, String pwd) {
    super(user, pwd);
  }

  public PostgreSQLConnection(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public PostgreSQLConnection(String pwd) {
    super(pwd);
  }

  @Override
  public void connect(String database)  {
        super.setConnection( "jdbc:postgresql://"+super.getIp()+"/"+database,super.getUser(),super.pwd);
  }
}
