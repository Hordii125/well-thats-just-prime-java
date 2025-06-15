package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {

  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList());
  }

  @Test
  void itReturnsAnEmptyListForOne() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(1), new ArrayList());
  }

  @Test
  void itReturnsAnEmptyListForNegativeInteger() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(-5), new ArrayList());
  }

  @Test
  void itReturnsPrimeFactorsForPositiveInteger() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedFactors = new ArrayList<>();
    expectedFactors.add(2);
    expectedFactors.add(2);
    expectedFactors.add(7);
    assertEquals(factorizer.primeFactors(28), expectedFactors);
  }

  @Test
  void itReturnsPrimeFactorsForAnotherPositiveInteger() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedFactors = new ArrayList<>();
    expectedFactors.add(2);
    expectedFactors.add(2);
    expectedFactors.add(5);
    expectedFactors.add(5);
    assertEquals(factorizer.primeFactors(100), expectedFactors);
  }

  @Test
  void itReturnsPrimeFactorsForLargeInteger() {
    Factorizer factorizer = new Factorizer();
    ArrayList<Integer> expectedFactors = new ArrayList<>();
    expectedFactors.add(2);
    expectedFactors.add(2);
    expectedFactors.add(2);
    expectedFactors.add(3);
    expectedFactors.add(5);
    assertEquals(factorizer.primeFactors(120), expectedFactors);
  }
}
