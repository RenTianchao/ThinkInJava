package generics15;
// : generics/CuriouslyRecurringGeneric.java

class GenericType<T> {}

public class CuriouslyRecurringGeneric extends GenericType<CuriouslyRecurringGeneric> {} // /:~
