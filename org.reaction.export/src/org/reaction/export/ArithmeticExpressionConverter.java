package org.reaction.export;

import org.xtext.biochemics.dotDsl.ArithmeticExpr;
import org.xtext.biochemics.dotDsl.Div;
import org.xtext.biochemics.dotDsl.FunctionCall;
import org.xtext.biochemics.dotDsl.Minus;
import org.xtext.biochemics.dotDsl.Multi;
import org.xtext.biochemics.dotDsl.NumberLiteral;
import org.xtext.biochemics.dotDsl.Plus;
import org.xtext.biochemics.dotDsl.Pow;
import org.xtext.biochemics.dotDsl.VarRef;
import org.xtext.biochemics.interpreter.Calculator;

public class ArithmeticExpressionConverter {

	public static String toString(ArithmeticExpr expr) {

		Calculator calculator = new Calculator();

		if (expr instanceof Plus) {
			return "(" + toString(((Plus) expr).getLeft()) + "+" + toString(((Plus) expr).getRight()) + ")";
		} else if (expr instanceof Minus) {
			return "(" + toString(((Minus) expr).getLeft()) + "-" + toString(((Minus) expr).getRight()) + ")";
		} else if (expr instanceof Multi) {
			return "(" + toString(((Multi) expr).getLeft()) + "*" + toString(((Multi) expr).getRight()) + ")";
		} else if (expr instanceof Div) {
			return "(" + toString(((Div) expr).getLeft()) + "/" + toString(((Div) expr).getRight()) + ")";
		} else if (expr instanceof Pow) {
			return "(" + toString(((Plus) expr).getLeft()) + "^" + toString(((Plus) expr).getRight()) + ")";
		} else if (expr instanceof NumberLiteral) {
			return String.valueOf(((NumberLiteral) expr).getValue());
		} else if (expr instanceof VarRef) {
			return ((VarRef) expr).getRef().getName();
		} else {
			FunctionCall fc = (FunctionCall) expr;
			switch (((FunctionCall) expr).getFunc()) {
			case SQRT:
				return String.valueOf(Math.sqrt(calculator.evaluate(fc.getExpr())));
			case ABS:
				return String.valueOf(Math.abs(calculator.evaluate(fc.getExpr())));
			default:
				throw new RuntimeException("Encountered unknown function call:" + ((FunctionCall) expr).getFunc());
			}
		}
	}

}
