package it.unibo.constructors;

class UseConstructorsEvolved {

    void main() {
        // 1) Creare un treno con numero di posti di default, come nel caso
        // precedente (serve a verificare la nuova implementazione di Train()).

        // 2) Creare i seguenti treni usando il costruttore Train(int nFCSeats, int
        // nSCSeats)
        // - nFCSeats = 20; nSCSeats= 200;
        // - nFCSeats = 35; nSCSeats= 165;
        Train t1 = new Train(Train.DEFAULT_N_FC_SEATS, Train.DEFAULT_N_SC_SEATS);
        t1.printTrainInfo();
    }
}
