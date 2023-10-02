package m.wc;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class Tokenizer implements FlatMapFunction<String, Tuple2<String, Integer>> {

    @Override
    public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) {
        if (s == null) {
            return;
        }
        String[] tokens = s.toLowerCase().split("\\W+");
        for (String token : tokens) {
            if (token != null && !token.isEmpty()) {
                collector.collect(new Tuple2<>(token, 1));
            }
        }
    }

}
