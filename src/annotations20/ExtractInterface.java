// : annotations/ExtractInterface.java
// APT-based annotation processing.
package annotations20;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    public String value();
} /// :~
