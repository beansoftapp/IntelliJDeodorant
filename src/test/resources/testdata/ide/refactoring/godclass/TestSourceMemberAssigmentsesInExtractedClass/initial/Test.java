package TestSourceMemberAssigmentsesInExtractedClass.actual;

public class Test {
    private int a;
    private int b;
    private int c;
    private int d;
    private Integer e;

    public void fun1() {
        a += 1;
        b += 1;
        c += 1;
        d = this.e;
        d -= this.e;
        d = (e * (e + 1) + e.getClass().getName().length()) * (this.e);
        e += d;
        d = d + d;
        d += d + d;
        d += 1;
    }

    public void fun2() {
        d += 1;
        e += 1;
    }
}