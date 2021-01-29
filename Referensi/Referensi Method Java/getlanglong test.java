public class Main {
  public static void main(String[] args) {
    double y1 = -7.7572336;
    double y2 = -7.7572333;
    double x1 = 110.4726684;
    double x2 = 110.4726690;
    double ytry = -7.7572338;
    double xtry = 110.4726625;
    if (ytry > y1 && ytry < y2) {
      System.out.println("lat yes");
      if (xtry > x1 && xtry < x2) {
      	System.out.println("long yes");
        System.out.println("success");
      }
      else {
      System.out.println("long no");
      }
    }
    else {
    	System.out.println("lat no");
        System.out.println("fail");
    }
  }
}
