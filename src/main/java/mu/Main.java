package mu;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            args = new String[]{"src/main/mu/test.mu"};
        }

        System.out.println("parsing: " + args[0]);

        // Use CharStreams.fromFileName for reading the file
        MuLexer lexer = new MuLexer(CharStreams.fromFileName(args[0]));
        MuParser parser = new MuParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.program();
        EvalVisitor visitor = new EvalVisitor();
        visitor.visit(tree);
    }
}
