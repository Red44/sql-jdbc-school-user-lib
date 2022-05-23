package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;

public class MySQL extends SQLDriver {

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
  public void connect() {

  }

  @Override
  public void disconnect() {

  }
}