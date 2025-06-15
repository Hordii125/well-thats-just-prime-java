package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    // Checks if n is less than or equal to 1 and returns an empty list
    if (n <= 1) {
      return new ArrayList<>();
    }

    // Creating an object to hold the prime factors
    ArrayList<Integer> factors = new ArrayList<>();

    // Loop to find prime factors
    for (int i = 2; i <= n; i++) {
      while (n % i == 0) {
        factors.add(i); // Add the factor to the list
        n /= i;
      }
    }
    return factors;
  }
}
