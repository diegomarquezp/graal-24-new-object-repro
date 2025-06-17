package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Repro {

  public static <T> T repro(Class<T> clazz) throws InstantiationException, IllegalAccessException {
    System.out.println("clazz.getName() = " + clazz.getName());
    T instance = clazz.newInstance();
    System.out.println("instance.getClass().getName() = " + instance.getClass().getName());
    return instance;
  }
}