package gr.uom.java.ast.util;

import com.intellij.psi.PsiBreakStatement;
import com.intellij.psi.PsiStatement;

public class InstanceOfBreakStatement implements StatementInstanceChecker {

	public boolean instanceOf(PsiStatement statement) {
		return statement instanceof PsiBreakStatement;
	}

}
