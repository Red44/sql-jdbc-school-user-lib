package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;

public class SQLite extends SQLDriver {

  public SQLite(String user, String pwd) {
    super(user, pwd);
  }

  public SQLite(String user, String pwd, String ip) {
    super(user, pwd, ip);
  }

  public SQLite(String user) {
    super(user);
  }

  @Override
  public void connect() {

  }

  @Override
  public void disconnect() {

  }
}