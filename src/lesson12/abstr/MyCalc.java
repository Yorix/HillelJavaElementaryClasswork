package lesson12.abstr;

public class MyCalc extends CommandParser {
    @Override
    protected boolean validateParams(String[] params) {
        for (String param : params) {
            if (param.equalsIgnoreCase("a") ||
                    param.equalsIgnoreCase("s") ||
                    param.equalsIgnoreCase("d") ||
                    param.equalsIgnoreCase("m") ||
                    isNumber(param)) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void process() {
        System.out.println("Result of ariphmetic operation = 100");
    }

    private boolean isNumber(String str) {
        //
        return true;
    }
}
