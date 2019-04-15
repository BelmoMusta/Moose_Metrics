package med.rist.moose;

import com.github.javaparser.JavaParser;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MooseMetricsTest {
    @Test
    public void testNOC() {
        MooseMetrics metrics = new MooseMetrics();

        List<MetricsDescriber> noc = metrics.getNOC(JavaParser.parse(getClass().getClassLoader().getResourceAsStream("Person.java")));

        Assert.assertEquals(1,noc.size());
    }
}