import ErrorHandling.SymantecError;
import ErrorHandling.SyntaxError;
import ast.visitor.BaseVisitor;
import gen.HTMLLexer;
import gen.HTMLParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import sympolTable.SymbolTable;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) {
        try {

            SyntaxError syntaxError=new SyntaxError();
            String source = "samples//samples.txt";
//            String source = "samples//sample1.txt";
//            String source = "samples//sample2.txt";
            CharStream cs = fromFileName(source);
            HTMLLexer lexer = new HTMLLexer(cs);
            lexer.removeErrorListeners();
            lexer.addErrorListener(syntaxError.INSTANCE);
            CommonTokenStream token  = new CommonTokenStream(lexer);
            HTMLParser parser = new HTMLParser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(syntaxError.INSTANCE);
            ParseTree tree = parser.main();
            BaseVisitor baseVisitor=  new BaseVisitor();
            baseVisitor.visit(tree);
            SymbolTable symbolTable = SymbolTable.getInstance();
            SymantecError symantecError=new SymantecError();
            symantecError.checkErrors();

            if (!symbolTable.hasSyntaxError&&!symbolTable.hasSymantecError){
               symbolTable.generateCode();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
