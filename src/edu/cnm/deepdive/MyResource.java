package edu.cnm.deepdive;

public class MyResource implements AutoCloseable {


  public MyResource() {
    System.out.println("Opening...");
  }

  @Override
  public void close() {
    System.out.println("Closing...");
  }
}
