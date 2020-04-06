package syntax.class24;

public class Parent {
	public void method1(){
	    System.out.println("I am a parent public method");
	  }
	  protected void method2(){
	    System.out.println("I am a parent protected method");
	  }
	    void method3(){
	    System.out.println("I am a parent default method");
	  }
	   private void method4(){
	    System.out.println("I am a parent private method");
	  }
}
class Child extends Parent {
	  
	  public void method1(){
	    System.out.println("I am a child public method");
	  }
	  protected void method2(){
	    System.out.println("I am a child protected method");
	  }
	    void method3(){
	    System.out.println("I am a child default method");
	  }
	   
	  
	}