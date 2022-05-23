package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;
import java.sql.SQLException;

public class PostgreSQL extends SQLDriver {
  static {
    loadDriver("org.postgresql.Driver");
  }

  public PostgreSQL(String user, String pwd) {
    super(user, pwd);
  }

  public PostgreSQL(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public PostgreSQL(String pwd) {
    super(pwd);
  }

  @Override
  public void connect(String database)  {
        super.setConnection( "jdbc:postgresql://"+super.getIp()+"/"+database,super.getUser(),super.pwd);
  }
}
