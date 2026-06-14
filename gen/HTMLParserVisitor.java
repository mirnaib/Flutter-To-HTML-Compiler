// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(HTMLParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#void}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoid(HTMLParser.VoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(HTMLParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#extend_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtend_class(HTMLParser.Extend_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(HTMLParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(HTMLParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#widget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidget(HTMLParser.WidgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#build_brakets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_brakets(HTMLParser.Build_braketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#build_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild_body(HTMLParser.Build_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#material_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial_body(HTMLParser.Material_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#home_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHome_body(HTMLParser.Home_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#colum_row_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColum_row_body(HTMLParser.Colum_row_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#children_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildren_body(HTMLParser.Children_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#stacks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStacks(HTMLParser.StacksContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(HTMLParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#stack_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_body(HTMLParser.Stack_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#neted_children_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeted_children_body(HTMLParser.Neted_children_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#nested_containers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_containers(HTMLParser.Nested_containersContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#nested_container_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_container_body(HTMLParser.Nested_container_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribut}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribut(HTMLParser.AttributContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(HTMLParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(HTMLParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#nav}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNav(HTMLParser.NavContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#onpress_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnpress_body(HTMLParser.Onpress_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#push_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush_body(HTMLParser.Push_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#builder_brakets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuilder_brakets(HTMLParser.Builder_braketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#material_page_rout_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterial_page_rout_body(HTMLParser.Material_page_rout_bodyContext ctx);
}