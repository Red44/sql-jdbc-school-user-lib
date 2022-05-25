package de.red.sqldriver;

import de.red.sqldriver.impl.PostgreSQLConnection;
import java.sql.Connection;

public class SchoolUserConnectionBuilder {

  String name;
  String pwd;
  public SchoolUserConnectionBuilder(){

  }
  public SchoolUserConnectionBuilder appendName(String name){
    this.name = name;
    return this;
  }

  public SchoolUserConnectionBuilder appendPassword(String pwd){
    this.pwd = pwd;
    return this;
  }

  public Connection build(){
    if(name == null|| pwd == null){
      throw new RuntimeException("Name or password is missing!");
    }
    PostgreSQLConnection con = new PostgreSQLConnection(name,pwd,"redslaboratory.tech");
    con.connect(name);
    return con.getConnection();
  }
}
