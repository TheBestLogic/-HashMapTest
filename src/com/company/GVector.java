package com.company;

public class GVector {
    private double x = 0;
    private double y = 0;
    private double z = 0;

    GVector(double _x, double _y, double _z)
    {
        x = _x;
        y = _y;
        z = _z;
    }

    public double vectorLength()
    {
        return Math.sqrt( x*x + y*y + z*z );
    }

    public  double scalarProduct(GVector Vector)
    {
        return Vector.x * x +
                Vector.y * y +
                Vector.z * z;
    }

    public  GVector vectorProduct(GVector Vector)
    {
        return new GVector(
                (y * Vector.z - z * Vector.y),
                (z * Vector.x - x * Vector.z),
                (x * Vector.y - y * Vector.x)
        );
    }

    public double cos(GVector Vector) {
        return scalarProduct(Vector) /
                (vectorLength() * Vector.vectorLength());
    }

    public GVector add(GVector Vector) {
        return new GVector(
                x + Vector.x,
                y + Vector.y,
                z + Vector.z
        );
    }

    public GVector subtract(GVector Vector) {
        return new GVector(
                x - Vector.x,
                y - Vector.y,
                z - Vector.z
        );
    }

    public static GVector[] getVectors(int N){
        GVector[] Vectors = new GVector[N];
        for(int i =0; i < N; i++){
            Vectors[i] = new GVector(Math.random(), Math.random(), Math.random());
        }
        return Vectors;
    }
}
