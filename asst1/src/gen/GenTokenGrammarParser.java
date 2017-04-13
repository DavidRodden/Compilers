/*
 * Created on Jun 16, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package gen;
import java.io.*;

/**
 * @author Steven R. Vegdahl
 * @version 17 June 2004
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class GenTokenGrammarParser {

	public static void main(String[] args) {
		
		try {
			wrangLR.generator.main.Main.main(new String[] {
					"TokenGrammar.java",
//					"-n",
					"-d",
					"src/parse",
					"-o",
					"TokenGrammarParseTable.java",
			});
		}
		catch (Exception x) {
			System.out.println("Exception occurred.");
		}

	}
}
