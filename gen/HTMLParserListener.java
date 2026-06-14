// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HTMLParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HTMLParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#void}.
	 * @param ctx the parse tree
	 */
	void enterVoid(HTMLParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#void}.
	 * @param ctx the parse tree
	 */
	void exitVoid(HTMLParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(HTMLParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(HTMLParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#extend_class}.
	 * @param ctx the parse tree
	 */
	void enterExtend_class(HTMLParser.Extend_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#extend_class}.
	 * @param ctx the parse tree
	 */
	void exitExtend_class(HTMLParser.Extend_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(HTMLParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(HTMLParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(HTMLParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(HTMLParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#widget}.
	 * @param ctx the parse tree
	 */
	void enterWidget(HTMLParser.WidgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#widget}.
	 * @param ctx the parse tree
	 */
	void exitWidget(HTMLParser.WidgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#build_brakets}.
	 * @param ctx the parse tree
	 */
	void enterBuild_brakets(HTMLParser.Build_braketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#build_brakets}.
	 * @param ctx the parse tree
	 */
	void exitBuild_brakets(HTMLParser.Build_braketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#build_body}.
	 * @param ctx the parse tree
	 */
	void enterBuild_body(HTMLParser.Build_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#build_body}.
	 * @param ctx the parse tree
	 */
	void exitBuild_body(HTMLParser.Build_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#material_body}.
	 * @param ctx the parse tree
	 */
	void enterMaterial_body(HTMLParser.Material_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#material_body}.
	 * @param ctx the parse tree
	 */
	void exitMaterial_body(HTMLParser.Material_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#home_body}.
	 * @param ctx the parse tree
	 */
	void enterHome_body(HTMLParser.Home_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#home_body}.
	 * @param ctx the parse tree
	 */
	void exitHome_body(HTMLParser.Home_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#colum_row_body}.
	 * @param ctx the parse tree
	 */
	void enterColum_row_body(HTMLParser.Colum_row_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#colum_row_body}.
	 * @param ctx the parse tree
	 */
	void exitColum_row_body(HTMLParser.Colum_row_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#children_body}.
	 * @param ctx the parse tree
	 */
	void enterChildren_body(HTMLParser.Children_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#children_body}.
	 * @param ctx the parse tree
	 */
	void exitChildren_body(HTMLParser.Children_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#stacks}.
	 * @param ctx the parse tree
	 */
	void enterStacks(HTMLParser.StacksContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#stacks}.
	 * @param ctx the parse tree
	 */
	void exitStacks(HTMLParser.StacksContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(HTMLParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(HTMLParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#stack_body}.
	 * @param ctx the parse tree
	 */
	void enterStack_body(HTMLParser.Stack_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#stack_body}.
	 * @param ctx the parse tree
	 */
	void exitStack_body(HTMLParser.Stack_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#neted_children_body}.
	 * @param ctx the parse tree
	 */
	void enterNeted_children_body(HTMLParser.Neted_children_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#neted_children_body}.
	 * @param ctx the parse tree
	 */
	void exitNeted_children_body(HTMLParser.Neted_children_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#nested_containers}.
	 * @param ctx the parse tree
	 */
	void enterNested_containers(HTMLParser.Nested_containersContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#nested_containers}.
	 * @param ctx the parse tree
	 */
	void exitNested_containers(HTMLParser.Nested_containersContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#nested_container_body}.
	 * @param ctx the parse tree
	 */
	void enterNested_container_body(HTMLParser.Nested_container_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#nested_container_body}.
	 * @param ctx the parse tree
	 */
	void exitNested_container_body(HTMLParser.Nested_container_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribut}.
	 * @param ctx the parse tree
	 */
	void enterAttribut(HTMLParser.AttributContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribut}.
	 * @param ctx the parse tree
	 */
	void exitAttribut(HTMLParser.AttributContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#img}.
	 * @param ctx the parse tree
	 */
	void enterImg(HTMLParser.ImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#img}.
	 * @param ctx the parse tree
	 */
	void exitImg(HTMLParser.ImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(HTMLParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(HTMLParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#nav}.
	 * @param ctx the parse tree
	 */
	void enterNav(HTMLParser.NavContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#nav}.
	 * @param ctx the parse tree
	 */
	void exitNav(HTMLParser.NavContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#onpress_body}.
	 * @param ctx the parse tree
	 */
	void enterOnpress_body(HTMLParser.Onpress_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#onpress_body}.
	 * @param ctx the parse tree
	 */
	void exitOnpress_body(HTMLParser.Onpress_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#push_body}.
	 * @param ctx the parse tree
	 */
	void enterPush_body(HTMLParser.Push_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#push_body}.
	 * @param ctx the parse tree
	 */
	void exitPush_body(HTMLParser.Push_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#builder_brakets}.
	 * @param ctx the parse tree
	 */
	void enterBuilder_brakets(HTMLParser.Builder_braketsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#builder_brakets}.
	 * @param ctx the parse tree
	 */
	void exitBuilder_brakets(HTMLParser.Builder_braketsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#material_page_rout_body}.
	 * @param ctx the parse tree
	 */
	void enterMaterial_page_rout_body(HTMLParser.Material_page_rout_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#material_page_rout_body}.
	 * @param ctx the parse tree
	 */
	void exitMaterial_page_rout_body(HTMLParser.Material_page_rout_bodyContext ctx);
}