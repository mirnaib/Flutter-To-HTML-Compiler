package ast.nodes.Classes;

public class Paragraph implements Classes {
    String token;
    int line;
    public Paragraph(){}
    public Paragraph(String token,int line) {
        this.token=token;
        this.line=line;
    }
    @Override
    public int getLine() {
        return  this.line;

    }

    @Override
    public String generateCode() {
        return "      <div class=\"row\">\n" +
                "            <div class=\"col\">\n" +
                "                <p>"+getToken().split("\'")[1]+"</p>\n" +
                "            </div>\n" +
                "        </div>";
    }
    @Override
    public String symbol() {
        return "\nParagraph[  Name:"+token+" , Line:"+line+" ]";
    }
    @Override
    public String getToken() {
        return token;
    }
}
