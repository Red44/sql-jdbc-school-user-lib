package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;

public class Postgres extends SQLDriver {


  public Postgres(String user, String pwd) {
    super(user, pwd);
  }

  public Postgres(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public Postgres(String user) {
    super(user);
  }

  @Override
  public void connect() {

  }

  @Override
  public void disconnect() {

  }
}
