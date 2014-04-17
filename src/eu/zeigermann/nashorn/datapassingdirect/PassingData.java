package eu.zeigermann.nashorn.datapassingdirect;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class PassingData {

    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        nashorn.eval("load('src/eu/zeigermann/nashorn/datapassingdirect/dataAccess.js')");
        int valueIn = 10;
        Integer valueOut = (Integer) nashorn.eval("pass(" + valueIn + ")");
        System.out.println(valueIn == valueOut.intValue());

        Integer result = (Integer) nashorn.eval("1 + 2");
        System.out.println(result == 3);

        String name = "Olli";
        nashorn.eval("print('" + name + "')");

    }
}
