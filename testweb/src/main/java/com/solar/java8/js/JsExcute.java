package com.solar.java8.js;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by hushaoge on 2017/9/28.
 */
public class JsExcute {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        /**"nashorn", "Nashorn", "js", "JS", "JavaScript", "javascript", "ECMAScript", "ecmascript"*/
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
        /*Optional<ScriptEngine> op = Optional.of(scriptEngineManager.getEngineByName("ecmascript"));
        op.ifPresent(System.out::println);*/

        String name = "Runoob";
        Integer result = null;

        try {
            nashorn.eval("print('"+ name +"')");
            result = (Integer) nashorn.eval("12-3");
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());
    }
}
