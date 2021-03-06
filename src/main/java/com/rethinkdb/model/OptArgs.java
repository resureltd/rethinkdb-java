package com.rethinkdb.model;

import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.utils.Internals;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class OptArgs extends LinkedHashMap<String, ReqlAst> {
    public OptArgs with(String key, Object value) {
        if (key != null) {
            put(key, Internals.toReqlAst(value));
        }
        return this;
    }

    public OptArgs with(String key, List<Object> value) {
        if (key != null) {
            put(key, Internals.toReqlAst(value));
        }
        return this;
    }

    public static OptArgs fromMap(Map<String, ReqlAst> map) {
        if (map == null) {
            return new OptArgs();
        }
        OptArgs args = new OptArgs();
        args.putAll(map);
        return args;
    }

    public static OptArgs of(String key, Object val) {
        OptArgs oa = new OptArgs();
        oa.with(key, val);
        return oa;
    }
}
