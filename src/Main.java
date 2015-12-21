import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.IOException;

/**
 * Created by neo on 20/12/15.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        JSONLexer lexer = new JSONLexer(new ANTLRFileStream("test_file2.txt"));

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        JSONParser parser = new JSONParser(tokenStream);


        ParserRuleContext tree = parser.json();
        MyJSONVisitor visitor = new MyJSONVisitor(); // this does not come for free :P -> reasons!!
        System.out.println(visitor.visit(tree)); // visitor should visit tree
    }
}
