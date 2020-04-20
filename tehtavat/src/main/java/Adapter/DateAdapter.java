package Adapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAdapter implements DateObjectProvider {
  private DateStringProvider source;
  private String pattern = "dd/MM/yyyy";
  private SimpleDateFormat sdf;

  public DateAdapter(DateStringProvider source) {
    this.source = source;
    this.sdf = new SimpleDateFormat(pattern);
  }

  @Override
  public Date getDate() {
    String sourceString = source.getDate();
    Date date;
    try {
      date = sdf.parse(sourceString);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
    return date;
  }

}