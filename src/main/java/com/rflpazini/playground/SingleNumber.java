package main.java.com.rflpazini.playground;

public class SingleNumber {

  /*
  * The key to solve this problem is bit manipulation.
  * XOR will return 1 only on two different bits.
  * So if two numbers are the same, XOR will return 0. Finally only one number left.
  */

  public int singleNumber(int[] nums) {
    int single = 0 ;
    for(int number : nums) {
      single = single ^ number;
    }

    return single;
  }

}
