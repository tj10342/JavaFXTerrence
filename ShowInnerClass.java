package application;
public class ShowInnerClass {
	  private int data;

	  /** A method in the outer class */
	  public void m() {
	    // Do something
	    InnerClass instance = new InnerClass();
	  }

	  // An inner class
	  class InnerClass {
	    /** A method in the inner class */
	    public void mi() {
	      // Directly reference data and method defined in its outer class
	      data++;
	      m();
	    }
	  }
	}
	//this is a note