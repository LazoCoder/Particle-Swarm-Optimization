class Function {

    /**
     * Calculate the result of (x^4)-2(x^3).
     * Domain is (-infinity, infinity).
     * Minimum is -1.6875 at x = 1.5.
     * @param x     the x component
     * @return      the y component
     */
    static double functionA (double[] values) {
        return Math.pow(values[0], 4) - 2 * Math.pow(values[0], 3);
    }

    /**
     * Perform Ackley's function.
     * Domain is [5, 5]
     * Minimum is 0 at x = 0 & y = 0.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    static double ackleysFunction (double[] values) {
        double p1 = -20*Math.exp(-0.2*Math.sqrt(0.5*((values[0]*values[0])+(values[1]*values[1]))));
        double p2 = Math.exp(0.5*(Math.cos(2*Math.PI*values[0])+Math.cos(2*Math.PI*values[1])));
        return p1 - p2 + Math.E + 20;
    }

    /**
     * Perform Booth's function.
     * Domain is [-10, 10]
     * Minimum is 0 at x = 1 & y = 3.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    static double boothsFunction (double[] values) {
        double p1 = Math.pow(values[0] + 2*values[1] - 7, 2);
        double p2 = Math.pow(2*values[0] + values[1] - 5, 2);
        return p1 + p2;
    }

    /**
     * Perform the Three-Hump Camel function.
     * @param x     the x component
     * @param y     the y component
     * @return      the z component
     */
    static double threeHumpCamelFunction (double[] values) {
        double p1 = 2*values[0]*values[0];
        double p2 = 1.05*Math.pow(values[0], 4);
        double p3 = Math.pow(values[0], 6) / 6;
        return p1 - p2 + p3 + values[0]*values[1] + values[1]*values[1];
    }

    static double sphereFunction (double[] values) {
        double sum = 0;

        for (double value : values) {
            sum += value * value;
        }

        return sum;
    }

}
