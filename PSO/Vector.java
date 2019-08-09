import java.util.Arrays;

/**
 * Can represent a position as well as a velocity.
 */
class Vector {

    double[] values;
    private double init_value;
    private double limit = Double.MAX_VALUE;

    Vector (int variables, double init_value) {
        this.init_value = init_value;
        values = new double[variables];
        for(int i = 0; i < variables; i++){
            values[i] = init_value;
        }
    }

    double[] get(){
        return values;
    }

    void add (Vector v) {
        for(int i = 0; i < values.length; i++){
            this.values[i] += v.values[i];
        }
        limit();
    }

    void sub (Vector v) {
        for(int i = 0; i < values.length; i++){
            this.values[i] -= v.values[i];
        }
        limit();
    }

    void mul (double s) {
        for(int i = 0; i < values.length; i++){
            this.values[i] *= s;
        }
        limit();
    }

    void div (double s) {
        for(int i = 0; i < values.length; i++){
            this.values[i] /= s;
        }
        limit();
    }

    void normalize () {
        double m = mag();
        if (m > 0) {
            for(int i = 0; i < values.length; i++){
                this.values[i] /= m;
            }
        }
    }

    private double SumOfSquares(){
        double sum = 0;

        for (double value : values) {
            sum += value * value;
        }

        return sum;
    }

    private double mag () {
        return Math.sqrt(SumOfSquares());
    }

    void limit (double l) {
        limit = l;
        limit();
    }

    private void limit () {
        double m = mag();
        if (m > limit) {
            double ratio = m / limit;
            for(int i = 0; i < values.length; i++){
                this.values[i] /= ratio;
            }
        }
    }

    public Vector clone () {
        Vector temp = new Vector(values.length, init_value);

        for(int i = 0; i < values.length; i++){
            temp.values[i] = values[i];
        }

        return temp;
    }

    public String toString () {
        return Arrays.toString(this.values);
    }

}
