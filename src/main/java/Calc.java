public class Calc {

    private int i;
    private int i1;

    public Calc(int i, int i1) {
        this.i=i;
        this.i1=i1;
    }

    public Integer sumar() {
        return this.i+this.i1;
    }

    public Integer restar() {
        return this.i-this.i1;
    }

    public Integer mult() {
        return this.i*this.i1;

    }

    public Integer div() {
        return this.i/this.i1;
    }
}
