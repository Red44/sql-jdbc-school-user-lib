package de.red.sqldriver.impl;

import de.red.sqldriver.SQLConnection;

public class MSSQLConnection extends SQLConnection {
  static {
    loadDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver");
  }

  public MSSQLConnection(String user, String pwd) {
    super(user, pwd);
  }

  public MSSQLConnection(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public MSSQLConnection(String user) {
    super(user);
  }

  @Override
  public void connect(String database) {
    super.setConnection("jdbc:sqlserver://"+super.getIp()+"\\\\"+database,super.getUser(),super.pwd);
  }

}
