class Outer {
    String a ="Java program";
  
    static class Inner {
      String y = "EXCECUTION FINISHED.";
    }
  }
  
  public class StaticInnerClass {
    public static void main(String[] args) {
      Outer oc = new Outer();
      System.out.println(oc.a);  
      Outer.Inner myi = new Outer.Inner();
      System.out.println(myi.y);
    }
  }
  