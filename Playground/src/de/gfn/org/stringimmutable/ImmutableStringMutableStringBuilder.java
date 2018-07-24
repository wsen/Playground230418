/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.gfn.org.stringimmutable;

/**
 *
 * @author wsen
 */
public class ImmutableStringMutableStringBuilder {
  public static void main(String[] args)  {
     String s1 = new String("java");
     StringBuilder s2 = new StringBuilder("java");
     replaceString(s1);
     replaceStringBuilder(s2);
     System.out.println(s1 + s2);
  }
  static void replaceString(String s) {
      System.out.println("String s vher: " + s);
     s = s.replace('j', 'l');
     System.out.println("String nher: " + s);
  }
  static void replaceStringBuilder(StringBuilder s) {
     s.append("c");
  }
}
