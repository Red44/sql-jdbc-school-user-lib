package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MSSQL extends SQLDriver {
  static {
    loadDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  }

  public MSSQL(String user, String pwd) {
    super(user, pwd);
  }

  public MSSQL(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public MSSQL(String user) {
    super(user);
  }

  @Override
  public void connect(String database) throws SQLException {
    super.setConnection("jdbc:sqlserver://"+super.getIp()+"\\\\"+database,super.getUser(),super.pwd);
  }

}
