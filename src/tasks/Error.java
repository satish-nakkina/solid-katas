package tasks;

import static java.lang.System.out;

public class Error implements DisplayError {

    public void error(String command) {
        out.printf("I don't know what the command \"%s\" is.", command);
        out.println();
    }
}
