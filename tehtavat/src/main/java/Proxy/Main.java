package Proxy;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Image image1 = new ProxyImage("HiRe_Photo1", 10000000, "13/4/2020 15.39");
    Image image2 = new ProxyImage("HiRes_Photo2", 12000000, "13/4/2020 15.45");

    ArrayList<Image> album = new ArrayList<>();
    album.add(image1);
    album.add(image2);

    for (Image image : album) {
      System.out.println("Showing data of image " + (album.indexOf(image) + 1));
      image.showData();
      System.out.println();
    }

    for (Image image : album) {
      image.displayImage();
      System.out.println();
    }
  }
}