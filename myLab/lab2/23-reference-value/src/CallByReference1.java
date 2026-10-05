class CallByReference1 {

    void increment(final Point3D p) {
        p.x++;
        p.y++;
        p.z++;
    }

    void main() {
        Point3D p = new Point3D();
        p.build(1, 2, 3);
        CallByReference1 cbv2 = new CallByReference1();
        cbv2.increment(p); //gli passo un oggetto di tipo Point3D (p) quindi incrementa ogni coordinata
        IO.println("x=" + p.x + ";y=" + p.y + ";z=" + p.z); // x = 2;y = 3; z = 4
    }
}
