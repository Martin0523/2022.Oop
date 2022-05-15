package oop.labor11.lab11_4;

public interface IExpression {
    public static boolean isOperator( String op){
        return  (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"));
    }

    public static double evaluate( String postfixExpression) throws ExpressionException, StackException {
        String[] items = postfixExpression.split(" ");
        Stack stack = new Stack(items.length);
        for (String item:items){
            if (isOperator(item.trim())){
                try{
                    double a = (double)stack.top();
                    stack.pop();
                    double b = (double)stack.top();
                    stack.pop();
//                    switch (item.trim()){
//                        case "+": stack.push(a+b);
//                        case "-": stack.push(a-b);
//                        case "*": stack.push(a*b);
//                        case "/": stack.push(a/b);
//                    }
                    if (item.trim().equals("+")){
                        stack.push(a+b);
                    }
                    if (item.trim().equals("-")){
                        stack.push(a-b);
                    }
                    if (item.trim().equals("*")){
                        stack.push(a*b);
                    }
                    if (item.trim().equals("/")){
                        stack.push(a/b);
                    }
                }
                catch (StackException e){
                    throw new ExpressionException("Wrong postfix expression");
                }
            }
            else {
                try {
                    stack.push(Double.parseDouble(item.trim()));
                }
                catch (NumberFormatException e){
                    throw new ExpressionException("Wrong operand: " + item);
                }
            }
        }
        return (double)stack.top();
    }
}
