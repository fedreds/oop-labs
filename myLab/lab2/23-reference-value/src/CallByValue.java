class CallByValue {

    void increment(int a) {
        a++;
    }

    void main() {
        int x = 1;
        CallByValue cbv = new CallByValue();
        cbv.increment(x); // gli passo x (1), aumenta ma non ritorna niente quindi rimane 1
        IO.println("x=" + x); // x = 1
    }
}
