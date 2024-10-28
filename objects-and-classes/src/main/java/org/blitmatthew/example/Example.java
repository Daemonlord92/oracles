// This first line tells the Java Compiler where the file
// is located within the file structures
package org.blitmatthew.example;

public class Example {
    private static long serialVersionId = 1l;


    public static long getSerialVersionId() {
        return serialVersionId;
    }

    public static void setSerialVersionId(long serialVersionId) {
        Example.serialVersionId = serialVersionId;
    }
}
