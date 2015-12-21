/**
 * Created by neo on 20/12/15.
 */
public class MyJSONVisitor extends JSONBaseVisitor<String>{

    int tabIndex = 0;

    @Override
    public String visitJson(JSONParser.JsonContext ctx) {
        String json = getTabs()+ "<json>";
        tabIndex++;
        json += this.visit(ctx.object());
        tabIndex--;
        json += "\n" + getTabs() + "</json>";

        return json;
    }

    @Override
    public String visitObject(JSONParser.ObjectContext ctx) {
        String object = "\n" + getTabs() + "<object>";
        tabIndex++;
        for(JSONParser.PropertyContext propertyContext : ctx.property()){
            object += this.visit(propertyContext);
        }
        tabIndex--;
       object+= "\n" + getTabs()+ "</object>";

        return object;
    }

    @Override
    public String visitProperty(JSONParser.PropertyContext ctx) {
        String property = "";
        tabIndex++;
        String key = this.visit(ctx.key());
        String value = this.visit(ctx.value());
        property += "\n"+ getTabs() + "<" + key + ">"  +  value + "\n" +getTabs() +"</" + key + ">";
        tabIndex --;
        return property;
    }

    @Override
    public String visitKey(JSONParser.KeyContext ctx) {
        return ctx.getText().substring(1, ctx.getText().length() - 1);
    }

    @Override
    public String visitStringValue(JSONParser.StringValueContext ctx) {
        return "\n" + getTabs() + "  "+  ctx.getText().substring(1, ctx.getText().length() - 1);
    }

    @Override
    public String visitArray(JSONParser.ArrayContext ctx) {
        String array = "";

        for(JSONParser.ObjectContext object : ctx.object()){
            array += this.visit(object);
        }

        return array;
    }

    @Override
    public String visitBooleanValue(JSONParser.BooleanValueContext ctx) {
        return  "\n" + getTabs() + "  "+ ctx.getText();
    }

    @Override
    public String visitIntValue(JSONParser.IntValueContext ctx) {
        return  "\n" + getTabs() + "  "+ctx.getText();
    }
    @Override
    public String visitNullValue(JSONParser.NullValueContext ctx) {
        return  "\n" + getTabs() + "  "+ctx.getText(); //if u want to return nothing return""
    }

    public String getTabs(){
        String tabs = "";
        for(int i = 0; i < tabIndex; i++){
            tabs += "  ";
        }

        return tabs;
    }
}
