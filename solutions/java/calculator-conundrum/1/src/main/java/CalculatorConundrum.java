class CalculatorConundrum {
    public static String calculate(int operand1, int operand2, String operation) throws IllegalArgumentException {
        if(operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if(operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        if(operation.contains("/") && operand2 == 0){
            throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
        }
        if (operation.equals("+") || operation.equals("*") || operation.equals("/")) {

            return switch (operation) {
                case "+" -> operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                case "*" -> operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                case "/" -> operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                default -> "";
            };

        }else {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

    }
}

