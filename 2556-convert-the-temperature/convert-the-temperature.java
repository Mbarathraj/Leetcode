class Solution {
    public double[] convertTemperature(double cle) {
        double a[]=new double[2];
        a[0]=cle+273.15;
        a[1]=cle*1.80+32;
        return a;
    }
}