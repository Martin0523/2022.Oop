package oop.labor11.lab11_4;

public interface IExpression {
    public static boolean isOperator( String op){
        return  (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
    }

    public static double evaluate( String postfixExpression) throws ExpressionException, StackException {
        Stack stack = new Stack(10);
        String[] items = postfixExpression.split(" ");
        for (String item:items){
            try {
                stack.push(Double.parseDouble(item.trim()));
            }
            catch (NumberFormatException e){
            }
            if (isOperator(item.trim())){
                double a = (Double)stack.top();
                stack.pop();
                double b = (Double)stack.top();
                stack.pop();
                switch (item.trim()){
                    case "+": stack.push(a+b);
                    case "-": stack.push(a-b);
                    case "*": stack.push(a*b);
                    case "/": stack.push(a/b);
                }
            }
        }
        return (Double)stack.top();
    }
}
