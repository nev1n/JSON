/**
 * Created by neo on 20/12/15.
 */
public class MyJsonListener extends JSONBaseListener {
    @Override
    public void enterJson(JSONParser.JsonContext ctx) {
        System.out.println("<json>");
    }

    @Override
    public void exitJson(JSONParser.JsonContext ctx) {
        System.out.println("</json>");
    }

    @Override
    public void enterObject(JSONParser.ObjectContext ctx) {
        System.out.println("<object>");
    }

    @Override
    public void exitObject(JSONParser.ObjectContext ctx) {
        System.out.println("</object>");
    }

    @Override
    public void enterKey(JSONParser.KeyContext ctx) {
        System.out.print("<" + ctx.getText().substring(1, ctx.getText().length() -1) + ">");
    } //getting the context key string text and creating the tag

    @Override
    public void exitStringValue(JSONParser.StringValueContext ctx) {
        System.out.println(ctx.getParent().getParent().getText());
        System.out.print(ctx.StringLiteral().getText());
    }

    @Override
    public void exitKey(JSONParser.KeyContext ctx) {
        System.out.println("</" + ctx.getText().substring(1, ctx.getText().length() -1) + ">");
    }  // printing the closing type tag
}
