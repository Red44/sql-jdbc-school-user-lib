package de.red.sqldriver.impl;

import de.red.sqldriver.SQLDriver;

public class MSSQL extends SQLDriver {


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
  public void connect() {

  }

  @Override
  public void disconnect() {

  }

}
