package m.wc;

import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Printer extends RichSinkFunction<Tuple2<String, Integer>> {

    private static final Logger log = LoggerFactory.getLogger(Printer.class);

    @Override
    public void invoke(Tuple2<String, Integer> value, Context context) throws Exception {
        super.invoke(value, context);
        log.info("{}", value);
    }

}
