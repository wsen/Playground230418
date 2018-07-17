package de.gfn.org.wrapperdb;

/**
 *
 * @author wsen
 */
public class DatabaseWrapper
{
  static String url = "jdbc://derby://localhost:1527//mydb";
  static String furz = "pffffrrrrrr";
  static DatabaseWrapper getDatabase()
  {
     System.out.println("Getting DB");
     return null;
  }
  public static void main(String[ ] args)
  {
    System.out.println( getDatabase().url);
    System.out.println( getDatabase().furz);
  }
}
