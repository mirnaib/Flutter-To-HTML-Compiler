package ast.nodes.Classes;

public class Link implements Classes {
    Image imgObj;
    int id;
public Link(){}
public Link(Image imgObj,int id){
    this.imgObj =imgObj;
    this.id=id;
}
//
    @Override
    public String generateCode() {

        return " <a href=\"?submit="+id+"\">"+imgObj.generateCode()+"</a>";
    }
    @Override
    public int getLine() {
        return  0;

    }

    @Override
    public String symbol() {
        return "";
    }
    @Override
    public String getToken() {
        return null;
    }
}
