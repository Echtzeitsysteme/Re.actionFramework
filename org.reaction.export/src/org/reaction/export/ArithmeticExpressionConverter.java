package org.reaction.export;

import org.reaction.dsl.interpreter.Calculator;
import org.reaction.dsl.reactionLanguage.ArithmeticExpr;
import org.reaction.dsl.reactionLanguage.Div;
import org.reaction.dsl.reactionLanguage.FunctionCall;
import org.reaction.dsl.reactionLanguage.Minus;
import org.reaction.dsl.reactionLanguage.Multi;
import org.reaction.dsl.reactionLanguage.NumberLiteral;
import org.reaction.dsl.reactionLanguage.Plus;
import org.reaction.dsl.reactionLanguage.Pow;
import org.reaction.dsl.reactionLanguage.VarRef;

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
