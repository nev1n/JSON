// Generated from /home/neo/JSON/JSON.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(JSONParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(JSONParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(JSONParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(JSONParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(JSONParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(JSONParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(JSONParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(JSONParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JSONParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void enterNullValue(JSONParser.NullValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#nullValue}.
	 * @param ctx the parse tree
	 */
	void exitNullValue(JSONParser.NullValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(JSONParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(JSONParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#intValue}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(JSONParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#intValue}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(JSONParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(JSONParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#stringValue}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(JSONParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(JSONParser.ArrayContext ctx);
}