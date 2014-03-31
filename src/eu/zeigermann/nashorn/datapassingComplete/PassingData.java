package eu.zeigermann.nashorn.datapassingComplete;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

public class PassingData {

    public static int value = 10;

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        System.out.println("Value from Java before: " + PassingData.value);
        nashorn.eval("load('src/eu/zeigermann/nashorn/datapassingComplete/dataAccess.js')");
        nashorn.eval("dataAccess(" + value * 2 + ")");
        SimpleBindings simpleBindings = new SimpleBindings();
        simpleBindings.put("globalNewValue", value * 2);
        // need to reload, as this creates a new context
        nashorn.eval("load('src/eu/zeigermann/nashorn/datapassingComplete/dataAccess.js')", simpleBindings);
        nashorn.eval("storeGlobalValue()", simpleBindings);
        System.out.println("Value from Java after: " + PassingData.value);
    }
}
