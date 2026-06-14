package ast.nodes.Classes;

public class Stack implements Classes {
    Link imgInLink;
    OnPressed stackOnPressed;

    public Stack(){}
    public  Stack(Link imgInLink,OnPressed stackOnPressed){
        this.imgInLink=imgInLink;
        this.stackOnPressed=stackOnPressed;

    }


    public String generateHtmlCode() {
        return imgInLink.generateCode();
    }
    public String generatePhpCode() {
        return stackOnPressed.generateCode();
    }

    @Override
    public String generateCode() {
        return getToken();
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public int getLine() {
        return this.stackOnPressed.line;
    }

    @Override
    public String getToken() {
        return this.stackOnPressed.getToken();
    }
}
