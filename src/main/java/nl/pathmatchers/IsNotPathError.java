package nl.pathmatchers;

public class IsNotPathError extends Error {

  private IsNotPathError(String detailMessage) {
    super(detailMessage);
  }

  public IsNotPathError(Object detailMessage) {
    this(String.valueOf(detailMessage));
    if (detailMessage instanceof Throwable)
      initCause((Throwable) detailMessage);
  }

}
