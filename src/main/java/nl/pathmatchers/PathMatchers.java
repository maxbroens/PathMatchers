package nl.pathmatchers;

import java.util.ArrayList;
import java.util.Arrays;

public class PathMatchers {

  private static ArrayList<String> pathList = new ArrayList(Arrays. asList("path", "pad", "padt", "padth", "patd", "pat"));

  public static void equalsPath(Object path) {
    checkForPath(path);
  }

  public static void isPath(Object path) {
    checkForPath(path);
  }

  private static void checkForPath(Object path) {
    boolean throwError = false;

    if (path instanceof String) {
      if (!pathList.contains(((String) path).toLowerCase())) {
        throwError = true;
      }
    } else {
      throwError = true;
    }

    if (throwError) throw new IsNotPathError("Is not padtdth!");
  }

}
