package org.reaction.dsl.interpreter;

import java.util.Arrays;
import org.reaction.dsl.reactionLanguage.ArithmeticExpr;
import org.reaction.dsl.reactionLanguage.Div;
import org.reaction.dsl.reactionLanguage.FunctionCall;
import org.reaction.dsl.reactionLanguage.MathFunc;
import org.reaction.dsl.reactionLanguage.Minus;
import org.reaction.dsl.reactionLanguage.Multi;
import org.reaction.dsl.reactionLanguage.NumberLiteral;
import org.reaction.dsl.reactionLanguage.Plus;
import org.reaction.dsl.reactionLanguage.Pow;
import org.reaction.dsl.reactionLanguage.VarRef;

@SuppressWarnings("all")
public class Calculator {
  public double evaluate(final ArithmeticExpr expr) {
    return this.internalEvaluate(expr);
  }
  
  private double _internalEvaluate(final Plus plus) {
    double _evaluate = this.evaluate(plus.getLeft());
    double _evaluate_1 = this.evaluate(plus.getRight());
    return (_evaluate + _evaluate_1);
  }
  
  private double _internalEvaluate(final Minus minus) {
    double _evaluate = this.evaluate(minus.getLeft());
    double _evaluate_1 = this.evaluate(minus.getRight());
    return (_evaluate - _evaluate_1);
  }
  
  private double _internalEvaluate(final Multi mul) {
    double _evaluate = this.evaluate(mul.getLeft());
    double _evaluate_1 = this.evaluate(mul.getRight());
    return (_evaluate * _evaluate_1);
  }
  
  private double _internalEvaluate(final Div div) {
    double _evaluate = this.evaluate(div.getLeft());
    double _evaluate_1 = this.evaluate(div.getRight());
    return (_evaluate / _evaluate_1);
  }
  
  private double _internalEvaluate(final Pow pow) {
    return Math.pow(this.evaluate(pow.getLeft()), this.evaluate(pow.getRight()));
  }
  
  private double _internalEvaluate(final NumberLiteral arithType) {
    return arithType.getValue();
  }
  
  private double _internalEvaluate(final VarRef ref) {
    return this.evaluate(ref.getRef().getValue());
  }
  
  private double _internalEvaluate(final FunctionCall fc) {
    MathFunc _func = fc.getFunc();
    if (_func != null) {
      switch (_func) {
        case SQRT:
          return Math.sqrt(this.evaluate(fc.getExpr()));
        case ABS:
          return Math.abs(this.evaluate(fc.getExpr()));
        default:
          MathFunc _func_1 = fc.getFunc();
          String _plus = ("Encountered unknown function call:" + _func_1);
          throw new RuntimeException(_plus);
      }
    } else {
      MathFunc _func_1 = fc.getFunc();
      String _plus = ("Encountered unknown function call:" + _func_1);
      throw new RuntimeException(_plus);
    }
  }
  
  private double internalEvaluate(final ArithmeticExpr div) {
    if (div instanceof Div) {
      return _internalEvaluate((Div)div);
    } else if (div instanceof FunctionCall) {
      return _internalEvaluate((FunctionCall)div);
    } else if (div instanceof Minus) {
      return _internalEvaluate((Minus)div);
    } else if (div instanceof Multi) {
      return _internalEvaluate((Multi)div);
    } else if (div instanceof NumberLiteral) {
      return _internalEvaluate((NumberLiteral)div);
    } else if (div instanceof Plus) {
      return _internalEvaluate((Plus)div);
    } else if (div instanceof Pow) {
      return _internalEvaluate((Pow)div);
    } else if (div instanceof VarRef) {
      return _internalEvaluate((VarRef)div);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(div).toString());
    }
  }
}
