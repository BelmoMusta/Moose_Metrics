package med.rist.moose;

public class MetricsDescriber {
    private String className;
    private int noc;

    public MetricsDescriber(String s, int size) {
        className = s;
        noc = size;
    }


    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
