// Autogenerated by convert_tests.py and process_polyglot.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../templates/Test.java
package com.rethinkdb.gen;

import com.rethinkdb.RethinkDB;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.net.Connection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static com.rethinkdb.TestingCommon.*;
import com.rethinkdb.TestingFramework;

public class Range {
    // Tests RQL range generation
    Logger logger = LoggerFactory.getLogger(Range.class);
    public static final RethinkDB r = RethinkDB.r;

    Connection conn;

    @Before
    public void setUp() throws Exception {
        logger.info("Setting up.");
        conn = TestingFramework.createConnection();
        try {
            r.dbCreate("test").run(conn);
            r.db("test").wait_().run(conn);
        }catch (Exception e){}
    }

    @After
    public void tearDown() throws Exception {
        logger.info("Tearing down.");
        r.db("rethinkdb").table("_debug_scratch").delete().run(conn);
        if(!conn.isOpen()){
            conn.close();
            conn = TestingFramework.createConnection();
        }
        r.dbDrop("test").run(conn);
        conn.close(false);
    }

    // Matches Python's str() function, which we use.
    // TODO: We might want to handle this in a visit_Call in convert_tests.py instead.
    private static String str(long i) {
        return String.valueOf(i);
    }

    // A hack to concatenate two Lists -- see is_array_add in convert_tests.py.
    private static List concatList(List x, List y) {
        List ret = new ArrayList<Long>(x);
        ret.addAll(y);
        return ret;
    }

    // Autogenerated tests below

    @Test(timeout=120000)
    public void test() throws Exception {

        {
            // range.yaml line #3
            /* 'STREAM' */
            String expected_ = "STREAM";
            /* r.range().type_of() */
            logger.info("About to run line #3: r.range().typeOf()");
            Object obtained = runOrCatch(r.range().typeOf(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #3");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #3:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #6
            /* [0, 1, 2, 3] */
            List expected_ = r.array(0L, 1L, 2L, 3L);
            /* r.range().limit(4) */
            logger.info("About to run line #6: r.range().limit(4L)");
            Object obtained = runOrCatch(r.range().limit(4L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #6");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #6:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #9
            /* [0, 1, 2, 3] */
            List expected_ = r.array(0L, 1L, 2L, 3L);
            /* r.range(4) */
            logger.info("About to run line #9: r.range(4L)");
            Object obtained = runOrCatch(r.range(4L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #9");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #9:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #12
            /* [2, 3, 4] */
            List expected_ = r.array(2L, 3L, 4L);
            /* r.range(2, 5) */
            logger.info("About to run line #12: r.range(2L, 5L)");
            Object obtained = runOrCatch(r.range(2L, 5L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #12");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #12:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #15
            /* [] */
            List expected_ = r.array();
            /* r.range(0) */
            logger.info("About to run line #15: r.range(0L)");
            Object obtained = runOrCatch(r.range(0L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #15");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #15:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #18
            /* [] */
            List expected_ = r.array();
            /* r.range(5, 2) */
            logger.info("About to run line #18: r.range(5L, 2L)");
            Object obtained = runOrCatch(r.range(5L, 2L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #18");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #18:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #21
            /* [-5, -4, -3] */
            List expected_ = r.array(-5L, -4L, -3L);
            /* r.range(-5, -2) */
            logger.info("About to run line #21: r.range(-5L, -2L)");
            Object obtained = runOrCatch(r.range(-5L, -2L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #21");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #21:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #24
            /* [-5, -4, -3, -2, -1, 0, 1] */
            List expected_ = r.array(-5L, -4L, -3L, -2L, -1L, 0L, 1L);
            /* r.range(-5, 2) */
            logger.info("About to run line #24: r.range(-5L, 2L)");
            Object obtained = runOrCatch(r.range(-5L, 2L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #24");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #24:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #30
            /* err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Expected type NUMBER but found STRING.", r.array());
            /* r.range("foo") */
            logger.info("About to run line #30: r.range('foo')");
            Object obtained = runOrCatch(r.range("foo"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #30");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #30:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #34
            /* err_regex("ReqlQueryLogicError", "Number not an integer \\(>2\\^53\\). 9007199254740994", []) */
            ErrRegex expected_ = err_regex("ReqlQueryLogicError", "Number not an integer \\(>2\\^53\\). 9007199254740994", r.array());
            /* r.range(9007199254740994) */
            logger.info("About to run line #34: r.range(9007199254740994L)");
            Object obtained = runOrCatch(r.range(9007199254740994L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #34");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #34:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #37
            /* err_regex("ReqlQueryLogicError", "Number not an integer \\(<-2\\^53\\). -9007199254740994", []) */
            ErrRegex expected_ = err_regex("ReqlQueryLogicError", "Number not an integer \\(<-2\\^53\\). -9007199254740994", r.array());
            /* r.range(-9007199254740994) */
            logger.info("About to run line #37: r.range(-9007199254740994L)");
            Object obtained = runOrCatch(r.range(-9007199254740994L),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #37");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #37:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #40
            /* err_regex("ReqlQueryLogicError", "Number not an integer. 0\\.5", []) */
            ErrRegex expected_ = err_regex("ReqlQueryLogicError", "Number not an integer. 0\\.5", r.array());
            /* r.range(0.5) */
            logger.info("About to run line #40: r.range(0.5)");
            Object obtained = runOrCatch(r.range(0.5),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #40");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #40:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #43
            /* err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", r.array());
            /* r.range().count() */
            logger.info("About to run line #43: r.range().count()");
            Object obtained = runOrCatch(r.range().count(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #43");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #43:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #46
            /* err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", r.array());
            /* r.range().coerce_to("ARRAY") */
            logger.info("About to run line #46: r.range().coerceTo('ARRAY')");
            Object obtained = runOrCatch(r.range().coerceTo("ARRAY"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #46");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #46:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #49
            /* err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", []) */
            Err expected_ = err("ReqlQueryLogicError", "Cannot use an infinite stream with an aggregation function (`reduce`, `count`, etc.) or coerce it to an array.", r.array());
            /* r.range().coerce_to("OBJECT") */
            logger.info("About to run line #49: r.range().coerceTo('OBJECT')");
            Object obtained = runOrCatch(r.range().coerceTo("OBJECT"),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #49");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #49:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }

        {
            // range.yaml line #52
            /* 4 */
            Long expected_ = 4L;
            /* r.range(4).count() */
            logger.info("About to run line #52: r.range(4L).count()");
            Object obtained = runOrCatch(r.range(4L).count(),
                                          new OptArgs()
                                          ,conn);
            try {
                assertEquals(expected_, obtained);
            logger.info("Finished running line #52");
            } catch (Throwable ae) {
                logger.error("Whoops, got exception on line #52:" + ae.toString());
                if(obtained instanceof Throwable) {
                    ae.addSuppressed((Throwable) obtained);
                }
                throw ae;
            }
        }
    }
}
