package org.reaction.dsl.interpreter

import org.reaction.dsl.reactionLanguage.ArithmeticExpr
import org.reaction.dsl.reactionLanguage.Div
import org.reaction.dsl.reactionLanguage.FunctionCall
import org.reaction.dsl.reactionLanguage.MathFunc
import org.reaction.dsl.reactionLanguage.Minus
import org.reaction.dsl.reactionLanguage.Multi
import org.reaction.dsl.reactionLanguage.NumberLiteral
import org.reaction.dsl.reactionLanguage.Plus
import org.reaction.dsl.reactionLanguage.Pow
import org.reaction.dsl.reactionLanguage.VarRef

class Calculator {
	
	def double evaluate(ArithmeticExpr expr) {
		return internalEvaluate(expr);
	}

	def dispatch private internalEvaluate(Plus plus) {
		return evaluate(plus.left) + evaluate(plus.right)
	}

	def dispatch private internalEvaluate(Minus minus) {
		return evaluate(minus.left) - evaluate(minus.right)
	}

	def dispatch private internalEvaluate(Multi mul) {
		return evaluate(mul.left) * evaluate(mul.right)
	}

	def dispatch private internalEvaluate(Div div) {
		return evaluate(div.left) / evaluate(div.right)
	}

	def dispatch private internalEvaluate(Pow pow) {
		return Math.pow(evaluate(pow.left), evaluate(pow.right))
	}

	def dispatch private internalEvaluate(NumberLiteral arithType) {
		return arithType.value
	}

	def dispatch private internalEvaluate(VarRef ref) {
		return evaluate(ref.ref.value)
	}

	def dispatch private internalEvaluate(FunctionCall fc) {

		switch (fc.func) {
			case MathFunc.SQRT: return Math.sqrt(evaluate(fc.expr))
			case MathFunc.ABS: return Math.abs(evaluate(fc.expr))
			default: throw new RuntimeException("Encountered unknown function call:" + fc.func)
		}

	}
}
