package de.red.sqldriver.impl;

import de.red.sqldriver.SQLConnection;

public class SQLiteConnection extends SQLConnection {

  static {
    loadDriver("org.sqlite.JDBC");
  }

  public SQLiteConnection(String user, String pwd) {
    super(user, pwd);
  }

  public SQLiteConnection(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public SQLiteConnection(String pwd) {
    super(pwd);
  }
  @Override
  public void connect(String database)  {
     setConnection("jdbc:sqlite:"+database,"","");
  }
}
