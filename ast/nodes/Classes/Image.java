package ast.nodes.Classes;

public class Image implements Classes {
    String token;
    int line;


    public Image() {
        super();
    }
    public Image(String token,int line) {
       this.token=token;
       this.line=line;
    }




    @Override
    public String generateCode() {
        return "<div class=\"row\"><br>\n" +
                "            <div class=\"col\"> <img height=\"100%\" width=\"50%\"\n" +
                "                        src="+this.getToken()+" alt=\"\"></div>\n" +
                "\n" +
                "</div>";
    }

    @Override
    public String symbol() {
        return null;
    }

    @Override
    public int getLine() {
        return this.line;
    }

    @Override
    public String getToken() {
        return token;
    }
}
