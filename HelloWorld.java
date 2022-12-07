class HelloWorld {
  
      public static String main(String [] args) {
          System.out.println("Hello World");
          tobetested("Hello");
      }
      public static Integer tobetested(String foo) {
          if (foo.equals("Hello")) return 1;
          else return 0;
      }
  
}
