package de.red.sqldriver.impl;

import de.red.sqldriver.SQLConnection;
import java.sql.SQLException;

public class MySQLConnection extends SQLConnection {

  static {
    loadDriver("com.mysql.jdbc.Driver");
  }

  public MySQLConnection(String user, String pwd) {
    super(user, pwd);
  }

  public MySQLConnection(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public MySQLConnection(String user) {
    super(user);
  }

  @Override
  public void connect(String database)  {
    super.setConnection("jdbc:mysql://"+super.getIp()+"/"+database,super.getUser(),super.pwd);
  }

  @Override
  public void disconnect() throws SQLException {
    super.connection.close();
  }
}