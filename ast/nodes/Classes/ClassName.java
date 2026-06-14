package ast.nodes.Classes;

public class ClassName implements Classes {
    int line;
    String className;
    public ClassName(String className, int line) {
        this.className=className;
         this.line=line;
    }

    @Override
    public String generateCode() {
        return className;
    }
    @Override
    public int getLine() {
        return  this.line;

    }

    @Override
    public String symbol() {
        return "\nPage[ Name: "+className+" , Line: "+line+" ]";
    }
    @Override
    public String getToken() {
        return className;
    }
}
