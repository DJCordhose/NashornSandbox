package eu.zeigermann.nashorn.databinding;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

public class PassingData {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        int valueIn = 10;
        SimpleBindings simpleBindings = new SimpleBindings();
        simpleBindings.put("globalValue", valueIn);
        nashorn.eval("print (globalValue)", simpleBindings);

        nashorn.eval("load('src/eu/zeigermann/nashorn/databinding/dataAccess.js')", simpleBindings);
        Integer valueOut = (Integer) nashorn.eval("passGlobalValue()", simpleBindings);
        System.out.println(valueIn == valueOut.intValue());

    }
}
