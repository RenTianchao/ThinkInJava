package innerclasses10;

// : innerclasses10/AnonymousConstructor.java
// Creating a constructor for an anonymous inner class.
// import static net.mindview.util.Print.*;

abstract class Base {
    public Base(int i) {
        //        print("Base constructor, i = " + i);
        System.out.println("Base constructor, i = " + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
                //                print("Inside instance initializer");
            }

            public void f() {
                System.out.println("In anonymous f()");
                //                print("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
} /* Output:
  Base constructor, i = 47
  Inside instance initializer
  In anonymous f()
  */
// :~
