class DivisibleBy5 {
    public void divByGreaterThan40() {
      for (int i = 1; i <= 100; i++) {
        if (i % 5 == 0 && i > 40) {
          System.out.print(i + " ");
        }
      }
    }
  
    public static void main(String[] args) {
      DivisibleBy5 obj = new DivisibleBy5();
      System.out.println("Numbers from 1-100, which are divisible by 5 and greater than 40:");
      obj.divByGreaterThan40();
    }
  }
  