package com.deepresolve.fundamentals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

public class Util {
    public static String wrapIO(Runnable f, String in) {
        ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
        PrintStream oldStdout = System.out;
        InputStream oldStdin = System.in;

        System.setIn(new ByteArrayInputStream(in.getBytes()));
        System.setOut(new PrintStream(bytesOut));

        f.run();

        System.setIn(oldStdin);
        System.setOut(oldStdout);

        return bytesOut.toString();
    }
}
