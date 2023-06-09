package generics15;//: generics/LimitsOfInference.java

import typeinfo14.pets.*;

import java.util.*;

public class LimitsOfInference {
    static void
    f(Map<Person, List<? extends Pet>> petPeople) {
    }

    public static void main(String[] args) {
        // f(New.map()); // Does not compile
    }
} ///:~
