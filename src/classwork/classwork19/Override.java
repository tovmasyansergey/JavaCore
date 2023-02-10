package classwork.classwork19;

public class Override {
    double width;
    double height;

    @java.lang.Override
    public String toString() {
        return "Override{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    double depth;

    @java.lang.Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void volume() throws CloneNotSupportedException{
        Object clone = clone();
    }


}
