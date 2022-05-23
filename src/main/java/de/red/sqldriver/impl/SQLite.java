package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;
import java.sql.SQLException;

public class SQLite extends SQLDriver {

  static {
    loadDriver("org.sqlite.JDBC");
  }


  public SQLite(String user, String pwd) {
    super(user, pwd);
  }

  public SQLite(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public SQLite(String pwd) {
    super(pwd);
  }
  @Override
  public void connect(String database) throws SQLException {
     setConnection("jdbc:sqlite:"+database,"","");
  }
}
