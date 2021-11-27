import api.GeoLocation;

public class Point3D implements GeoLocation {
    private final int _x;
    private final int _y;
    private final int _z;

    public Point3D(int x, int y, int z){
        this._x = x;
        this._y = y;
        this._z = z;
    }

    @Override
    // returning x value
    public double x() {
        return this._x;
    }

    @Override
    // returning y value
    public double y() {
        return this._y;
    }

    @Override
    // returning z value
    public double z() {
        return this._z;
    }

    @Override
    // returning distance between two points
    public double distance(GeoLocation g) {
        /* the equation of the distance between two 3d points is
        sqrt ((x2-x1)**+(y2-y1)**+(z2-z1)**)
         */
        double x_pow = Math.pow(g.x()-this.x(), 2);
        double y_pow = Math.pow(g.y()-this.y(), 2);
        double z_pow = Math.pow(g.z()-this.z(), 2);

        return Math.sqrt(x_pow+y_pow+z_pow);
    }


}
