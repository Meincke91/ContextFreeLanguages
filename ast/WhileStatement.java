package while_language.ast;

import while_language.Environment;
import while_language.VariableNotDefinedException;

public class WhileStatement extends Statement {

	private BoolExpr condition;
	private Statement whileStatement;
	
	public WhileStatement(BoolExpr condition, Statement whileStatement) {
		this.condition = condition;
		this.whileStatement = whileStatement;
	}
	
	@Override
	public void evaluate(Environment env) throws VariableNotDefinedException {
		while (condition.evaluate(env)) {
			whileStatement.evaluate(env);	
		} 
	}

}
