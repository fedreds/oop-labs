class CallByReference2 {

    void print(Point3D point) {
        point = new Point3D(); //crea un nuovo oggetto
        point.build(11, 12, 13);
        IO.println("[print] x=" + point.x + ";y=" + point.y + ";z=" + point.z); // x=11,y=12,z=13
    }

    void main() {
        Point3D p1 = new Point3D();
        p1.build(1, 2, 3);
        CallByReference2 cbr2 = new CallByReference2();
        cbr2.print(p1); // gli passo p1 (Oggetto Point3D)
        IO.println("[main] x=" + p1.x + ";y=" + p1.y + ";z=" + p1.z);//la funzione print non ritorna l'oggetto quindi p1 avrà gli stessi valori delle variabili
        //x=1,y=2,z=3
    }
}
