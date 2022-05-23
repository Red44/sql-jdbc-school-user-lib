package de.red.sqldriver.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResultSetConverter {

  public static QueryResult convert(ResultSet resultset) throws SQLException {
    QueryResult res = new QueryResult();
    for (int i = 0; i < resultset.getMetaData().getColumnCount(); i++) {
      res.columns.add(resultset.getMetaData().getColumnName(i));
    }
    res.columns.forEach(colum -> res.data.put(colum, new ArrayList<>()));
    while (resultset.next()) {
      for (int i = 0; i < res.columns.size(); i++) {
        res.data.get(res.columns.get(i)).add(resultset.getString(i));
      }
    }
    return res;

  }

  public static class QueryResult {

    protected List<String> columns = new ArrayList<>();
    protected Map<String, List<String>> data = new HashMap<>();

    protected QueryResult() {
    }

    public List<String> getColum(String name) {
      return data.get(name);
    }

    public List<String> getColum(int id) {
      return getColum(columns.get(id));
    }

    public List<String> getColumns() {
      return columns;
    }

    public Map<String, List<String>> getRawData() {
      return data;
    }

    public String first(int id) {
      return first(columns.get(id));
    }

    public String first(String name) {
      return data.get(name).get(0);
    }

  }

}
