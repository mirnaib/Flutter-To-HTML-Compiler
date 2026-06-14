package ast.nodes.Classes;

public class OnPressed  implements Classes{

    int line;
    String token;
    int id;
    public OnPressed(){}
    public OnPressed(String pageToRout,int line,int id){
        this.token=pageToRout;
        this.line=line;
        this.id=id;
    }
    @Override
    public String generateCode() {

        return "if(isset($_GET['submit'])) {\n" +
                "   $submit = $_GET['submit'];\n" +
                "\n" +
                "      if ($submit == "+ id +") {\n" +
                "          // Redirect to another page\n" +
                "          header(\"Location: "+token+".html\");\n" +
                "          exit();\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "    }";
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
        return this.token;
    }
}
