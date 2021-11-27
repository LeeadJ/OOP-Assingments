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
    public double x() {
        return this._x;
    }

    @Override
    public double y() {
        return this._y;
    }

    @Override
    public double z() {
        return this._z;
    }

    @Override
    public double distance(GeoLocation g) {
        return 0;
    }
}
