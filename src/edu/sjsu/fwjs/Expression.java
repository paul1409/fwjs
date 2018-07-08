package edu.sjsu.fwjs;

import java.util.List;

/**
 * FWJS expressions.
 */
public interface Expression {
    /**
     * Evaluate the expression in the context of the specified environment.
     */
    public Value evaluate(Environment env);
}

// NOTE: Using package access so that all implementations of Expression
// can be included in the same file.

/**
 * FWJS constants.
 */
class ValueExpr implements Expression {
    private Value val;
    public ValueExpr(Value v) {
        this.val = v;
    }
    public Value evaluate(Environment env) {
        return this.val;
    }
}

/**
 * Expressions that are a FWJS variable.
 */
class VarExpr implements Expression {
    private String varName;
    public VarExpr(String varName) {
        this.varName = varName;
    }
    public Value evaluate(Environment env) {
        return env.resolveVar(varName);
    }
}

/**
 * A print expression.
 */
class PrintExpr implements Expression {
    private Expression exp;
    public PrintExpr(Expression exp) {
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        Value v = exp.evaluate(env);
        System.out.println(v.toString());
        return v;
    }
}
/**
 * Binary operators (+, -, *, etc).
 * Currently only numbers are supported.
 */
class BinOpExpr implements Expression {
    private Op op;
    private Expression e1;
    private Expression e2;
    public BinOpExpr(Op op, Expression e1, Expression e2) {
        this.op = op;
        this.e1 = e1;
        this.e2 = e2;
    }

    @SuppressWarnings("incomplete-switch")
    public Value evaluate(Environment env) {
<<<<<<< HEAD
        IntVal v1 = (IntVal) this.e1.evaluate(env);
        IntVal v2 = (IntVal) this.e2.evaluate(env);

        switch (op) {
            case ADD: return new IntVal(v1.toInt() + v2.toInt());
            case SUBTRACT: return new IntVal(v1.toInt() - v2.toInt());
            case MULTIPLY: return new IntVal(v1.toInt() * v2.toInt());
            case DIVIDE: return new IntVal(v1.toInt() / v2.toInt());
            case MOD: return new IntVal(v1.toInt() % v2.toInt());
            case GT: return new BoolVal(v1.toInt() > v2.toInt());
            case GE: return new BoolVal(v1.toInt() >= v2.toInt());
            case LT: return new BoolVal(v1.toInt() < v2.toInt());
            case LE: return new BoolVal(v1.toInt() <= v2.toInt());
            case EQ: return new BoolVal(v1.toInt() == v2.toInt());
=======
    	Value v1 = e1.evaluate(env); // Evaluates expression one and stores in Value
    	Value v2 = e2.evaluate(env); 
    	int x = ((IntVal)v1).toInt(); // Casting IntVal to turn v1 into an Int by calling toInt()
    	int y = ((IntVal)v2).toInt();
        switch (op) {
            case ADD: return new IntVal(x+y); // Adds two ints together and returns a value
            case SUBTRACT: return (Integer) e1.evaluate(env) - (Integer) e2.evaluate(env);
            case MULTIPLY: return (Integer) e1.evaluate(env) * (Integer) e2.evaluate(env);
            case DIVIDE: return (Double) ((Integer) e1.evaluate(env) / (Integer) e2.evaluate(env));
            case MOD: return (Integer) e1.evaluate(env) % (Integer) e2.evaluate(env);
            case GT: return (Integer) e1.evaluate(env) > (Integer) e2.evaluate(env); //TODO
            case GE: return (Integer) e1.evaluate(env) >= (Integer) e2.evaluate(env);
            case LT: return (Integer) e1.evaluate(env) < (Integer) e2.evaluate(env);
            case LE: return (Integer) e1.evaluate(env) <= (Integer) e2.evaluate(env);
            case EQ: return (Integer) e1.evaluate(env) == (Integer) e2.evaluate(env);
>>>>>>> 621032fde8b336be9b29acf49c5ab4baaf0643ac
            default: return null;
        }
    }
}

/**
 * If-then-else expressions.
 * Unlike JS, if expressions return a value.
 */
class IfExpr implements Expression {
    private Expression cond;
    private Expression thn;
    private Expression els;
    public IfExpr(Expression cond, Expression thn, Expression els) {
        this.cond = cond;
        this.thn = thn;
        this.els = els;
    }
   public Value evaluate(Environment env) {
        BoolVal condBoolVal = (BoolVal) cond.evaluate(env);
        env.updateVar(condBoolVal.toString(),condBoolVal);

        if (condBoolVal.toBoolean()) { 
            Value thnValue = thn.evaluate(env);
            env.updateVar(thnValue.toString(),thnValue);
            return thnValue;
        } else {
            Value elsValue = els.evaluate(env);
            env.updateVar(elsValue.toString(),elsValue);
            return elsValue;
        }
    }
}

/**
 * While statements (treated as expressions in FWJS, unlike JS).
 */
class WhileExpr implements Expression {
    private Expression cond;
    private Expression body;
    public WhileExpr(Expression cond, Expression body) {
        this.cond = cond;
        this.body = body;
    }
    public Value evaluate(Environment env) { //TODO incomplete
        BoolVal bool = (BoolVal) cond.evaluate(env);
        Value v = body.evaluate(env);
        while(this.cond.evaluate(env).equals(new BoolVal(true))) this.body.evaluate(env);
        return null;
    }
}

/**
 * Sequence expressions (i.e. 2 back-to-back expressions).
 */
class SeqExpr implements Expression {
    private Expression e1;
    private Expression e2;
    public SeqExpr(Expression e1, Expression e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        return null;
    }
}

/**
 * Declaring a variable in the local scope.
 */
class VarDeclExpr implements Expression {
    private String varName;
    private Expression exp;
    public VarDeclExpr(String varName, Expression exp) {
        this.varName = varName;
        this.exp = exp;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        return null;
    }
}

/**
 * Updating an existing variable.
 * If the variable is not set already, it is added
 * to the global scope.
 */
class AssignExpr implements Expression {
    private String varName;
    private Expression e;
    public AssignExpr(String varName, Expression e) {
        this.varName = varName;
        this.e = e;
    }
    public Value evaluate(Environment env) {
        env.updateVar(varName, e.evaluate(env));
        return env.resolveVar(varName);
    }
}

/**
 * A function declaration, which evaluates to a closure.
 */
class FunctionDeclExpr implements Expression {
    private List<String> params;
    private Expression body;
    public FunctionDeclExpr(List<String> params, Expression body) {
        this.params = params;
        this.body = body;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        return null;
    }
}

/**
 * Function application.
 */
class FunctionAppExpr implements Expression {
    private Expression f;
    private List<Expression> args;
    public FunctionAppExpr(Expression f, List<Expression> args) {
        this.f = f;
        this.args = args;
    }
    public Value evaluate(Environment env) {
        // YOUR CODE HERE
        return null;
    }
}

