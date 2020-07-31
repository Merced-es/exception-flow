package edu.cnm.deepdive;

import java.io.IOException;

public class ExceptionDemo {

  public static void main(String[] args) {
    try (MyResource myRes = new MyResource()) {
      System.out.println("Trying...");
      throw new IllegalArgumentException("Testing the message");
    } catch (IllegalStateException e) {
      System.out.println("Catching " + e.getClass().getSimpleName());
      System.out.println(e.getMessage());
    } catch (RuntimeException e) {
      System.out.println("Catching " + e.getClass().getSimpleName());
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Finally...");
    }
    System.out.println("Done!");
  }

}
