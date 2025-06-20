package com.skillabb.reboot.junit.test.model;

import java.util.List;

public class PrimeNumber {

  private int number;

  private boolean isPrime;

  private List<Integer> dividers;

  public PrimeNumber() {

  }

  public PrimeNumber(int number, boolean isPrime, List<Integer> dividers) {
    super();
    this.number = number;
    this.isPrime = isPrime;
    this.dividers = dividers;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public boolean isPrime() {
    return isPrime;
  }

  public void setPrime(boolean isPrime) {
    this.isPrime = isPrime;
  }

  public List<Integer> getDividers() {
    return dividers;
  }

  public void setDividers(List<Integer> dividers) {
    this.dividers = dividers;
  }
}
