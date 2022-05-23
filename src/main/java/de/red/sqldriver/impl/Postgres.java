package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;
import java.sql.SQLException;

public class Postgres extends SQLDriver {
  static {
    loadDriver("org.postgresql.Driver");
  }

  public Postgres(String user, String pwd) {
    super(user, pwd);
  }

  public Postgres(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public Postgres(String pwd) {
    super(pwd);
  }

  @Override
  public void connect(String database) throws SQLException {
        super.setConnection( "jdbc:postgresql://"+super.getIp()+"/"+database,super.getUser(),super.pwd);
  }
}
