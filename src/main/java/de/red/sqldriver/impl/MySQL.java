package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL extends SQLDriver {

  static {
    loadDriver("com.mysql.jdbc.Driver");
  }

  public MySQL(String user, String pwd) {
    super(user, pwd);
  }

  public MySQL(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public MySQL(String user) {
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