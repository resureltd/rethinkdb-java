// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class Db extends ReqlAst {


    public Db(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public Db(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public Db(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.DB, args, optargs);
    }
    protected Db(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static Db fromArgs(java.lang.Object... args){
        return new Db(new Arguments(args), null);
    }


}
