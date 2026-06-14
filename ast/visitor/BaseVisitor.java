package ast.visitor;


import ast.nodes.Classes.*;
import gen.HTMLParser;
import gen.HTMLParserBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import sympolTable.SymbolTable;

import java.util.ArrayList;

public class BaseVisitor extends HTMLParserBaseVisitor {
    public ArrayList<Classes> AST =new ArrayList();
    public SymbolTable symbolTable= SymbolTable.getInstance();
    int  classCount=0;
    int stackNum=1;
    @Override
    public Object visitMain(HTMLParser.MainContext ctx) {


        for (HTMLParser.ClassContext classN : ctx.class_()) {
            symbolTable.classes.put(classN.CLASS_NAME().getText(),new ArrayList<Classes>());

            symbolTable.className.add(new ClassName(classN.CLASS_NAME().getText(),classN.CLASS_NAME().getSymbol().getLine()) );
//            symbolTable.classes.get(symbolTable.className.get(classCount).getToken()).add(new ClassName(classN.CLASS_NAME().getText(),classN.CLASS_NAME().getSymbol().getLine()));
            visitClass(classN);
        }

        return 0;
    }

    @Override
    public Object visitVoid(HTMLParser.VoidContext ctx) {

        return super.visitVoid(ctx);
    }

    @Override
    public Object visitClass(HTMLParser.ClassContext ctx) {
//        visitExtend_class(ctx.extend_class());

        return visitClass_body(ctx.class_body());
    }

    @Override
    public Object visitExtend_class(HTMLParser.Extend_classContext ctx) {
        ArrayList<Classes> arrayList=new ArrayList<>();
        if (ctx.BASE_CLASS()!=null)
            symbolTable.classes.put(ctx.BASE_CLASS().getText(),arrayList);
        if (ctx.STATE()!=null)
            symbolTable.classes.put(ctx.STATE().getText(),arrayList);
        return 0;
    }

    @Override
    public Object visitClass_body(HTMLParser.Class_bodyContext ctx) {

        if (ctx.widget()!=null){
            visitWidget(ctx.widget());

        }
        classCount++;
        return 0;
    }

    @Override
    public Object visitState(HTMLParser.StateContext ctx) {
        return super.visitState(ctx);
    }

    @Override
    public Object visitWidget(HTMLParser.WidgetContext ctx) {

        return visitBuild_body(ctx.build_body());


    }

    @Override
    public Object visitBuild_brakets(HTMLParser.Build_braketsContext ctx) {
        return super.visitBuild_brakets(ctx);
    }

    @Override
    public Object visitBuild_body(HTMLParser.Build_bodyContext ctx) {
        return visitMaterial_body(ctx.material_body());
    }

    @Override
    public Object visitMaterial_body(HTMLParser.Material_bodyContext ctx) {
         if (ctx.home_body()!=null){

             visitHome_body(ctx.home_body());}

         return 0;
    }

    @Override
    public Object visitHome_body(HTMLParser.Home_bodyContext ctx) {

        return visitColum_row_body(ctx.colum_row_body());
    }

    @Override
    public Object visitColum_row_body(HTMLParser.Colum_row_bodyContext ctx) {

        return visitChildren_body(ctx.children_body());
    }

    @Override
    public Object visitChildren_body(HTMLParser.Children_bodyContext ctx) {
        if (ctx.stacks()!=null){
            visitStacks(ctx.stacks());

        }
        if (ctx.neted_children_body()!=null){
            visitNeted_children_body(ctx.neted_children_body());
        }

        return 0;
    }

    @Override
    public Object visitStacks(HTMLParser.StacksContext ctx) {

            for (HTMLParser.StackContext stack: ctx.stack()) {

             symbolTable.classes.get(symbolTable.className.get(classCount).getToken()).add(visitStack(stack));
                stackNum++;
            }
        return 0;
    }

    @Override
    public Stack visitStack(HTMLParser.StackContext ctx) {
       return visitStack_body(ctx.stack_body());

    }

    @Override
    public Stack visitStack_body(HTMLParser.Stack_bodyContext ctx) {
        Link imgInLink=new Link();

        OnPressed onPress=new OnPressed();
        for (int i=0;i<ctx.neted_children_body().nested_containers().size();i++){
            if (ctx.neted_children_body().nested_containers().get(i).nested_container_body().getText().contains("Image")){
                Image image=new Image( ctx.neted_children_body().nested_containers().get(i).nested_container_body().attribut().img().ATTRIBUT_DESCRIPTION().getText(), ctx.neted_children_body().nested_containers().get(i).nested_container_body().attribut().img().ATTRIBUT_DESCRIPTION().getSymbol().getLine());
                Link link=new Link(image,stackNum);
                imgInLink=link;
            }
            if (!ctx.neted_children_body().nested_containers().get(i).nested_container_body().getText().contains("Image")){
                OnPressed onPressed=new OnPressed(visitPush_body(ctx.neted_children_body().nested_containers().get(i).nested_container_body().nav().onpress_body().push_body()),ctx.neted_children_body().nested_containers().get(i).nested_container_body().nav().onpress_body().push_body().material_page_rout_body().TARGET_CLASS().getSymbol().getLine(),stackNum);
                onPress=onPressed;
            }
        }


        return new Stack(imgInLink,onPress);
    }

    @Override
    public Classes visitNeted_children_body(HTMLParser.Neted_children_bodyContext ctx) {

        for (int i=0;i<ctx.nested_containers().size();i++){

             visitNested_containers(ctx.nested_containers().get(i));
        }
        return null;
    }

    @Override
    public Classes visitNested_containers(HTMLParser.Nested_containersContext ctx) {

        return visitNested_container_body(ctx.nested_container_body());
    }

    @Override
    public Classes visitNested_container_body(HTMLParser.Nested_container_bodyContext ctx) {
        if (ctx.nav()!=null)
            return    visitNav(ctx.nav());
        if (ctx.attribut()!=null)
            return visitAttribut(ctx.attribut());

        return null;
    }

    @Override
    public Classes visitAttribut(HTMLParser.AttributContext ctx) {

        if (ctx.img()!=null)
            return visitImg(ctx.img());
        if (ctx.text()!=null){
            return  visitText(ctx.text());
        }
        return null;
    }

    @Override
    public Classes visitImg(HTMLParser.ImgContext ctx) {
        Image image=new Image(ctx.ATTRIBUT_DESCRIPTION().getText(),ctx.ATTRIBUT_DESCRIPTION().getSymbol().getLine());
        AST.add(image);

        symbolTable.classes.get(symbolTable.className.get(classCount).getToken()).add(image);
        return image;
    }

    @Override
    public Classes visitText(HTMLParser.TextContext ctx) {
        Paragraph paragraph=new Paragraph(ctx.ATTRIBUT_DESCRIPTION().getText(),ctx.ATTRIBUT_DESCRIPTION().getSymbol().getLine());
        AST.add(paragraph);

        symbolTable.classes.get(symbolTable.className.get(classCount).getToken()).add(paragraph);
        return paragraph;
    }


    @Override
    public Classes visitNav(HTMLParser.NavContext ctx) {
        if (ctx.onpress_body()!=null)
            return visitOnpress_body(ctx.onpress_body());
        return null;
    }

    @Override
    public Classes visitOnpress_body(HTMLParser.Onpress_bodyContext ctx) {

        return null;
    }

    @Override
    public String visitPush_body(HTMLParser.Push_bodyContext ctx) {

        return visitMaterial_page_rout_body(ctx.material_page_rout_body());
    }

    @Override
    public Object visitBuilder_brakets(HTMLParser.Builder_braketsContext ctx) {
        return super.visitBuilder_brakets(ctx);
    }

    @Override
    public String visitMaterial_page_rout_body(HTMLParser.Material_page_rout_bodyContext ctx) {
        return ctx.TARGET_CLASS().getText();
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}