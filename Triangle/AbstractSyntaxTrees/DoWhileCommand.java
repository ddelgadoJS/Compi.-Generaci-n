/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */

package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class DoWhileCommand extends Command{
    
    public DoWhileCommand (Command cAST, Expression eAST, SourcePosition thePosition) {
    super (thePosition);
    C = cAST;
    E = eAST;
  }
    
    public Command C;
    public Expression E;

    public Object visit(Visitor v, Object o) {
        return v.visitDoWhileCommand(this, o);
    }
}
