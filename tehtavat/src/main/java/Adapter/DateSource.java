package Adapter;

public class DateSource implements DateStringProvider {
  private String year = "";
  private String month = "";
  private String day = "";

  public DateSource(String year, String month, String day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String getDate() {
    return day + "/" + month + "/" + year;
  }

}