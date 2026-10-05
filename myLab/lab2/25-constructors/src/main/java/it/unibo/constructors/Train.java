package it.unibo.constructors;

class Train {

    static final int DEFAULT_N_FC_SEATS = 150;
    static final int DEFAULT_N_SC_SEATS = 250;
    static final int DEFAULT_TOT_SEATS = 400;

    int seats;
    int firstClassSeats;
    int secondClassSeats;
    int firstClassReserved;
    int secondClassReserved;

    Train() {
        this.seats = DEFAULT_TOT_SEATS;
        this.firstClassSeats = DEFAULT_N_FC_SEATS;
        this.secondClassSeats = DEFAULT_N_SC_SEATS;
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    Train(int seats, int firstClassSeats, int secondClassSeats) {
        this.seats = seats;
        this.firstClassSeats = firstClassSeats;
        this.secondClassSeats = secondClassSeats;
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    Train(int firstClassSeats, int secondClassSeats) {
        this.seats = firstClassSeats + secondClassSeats;
        this.firstClassSeats = firstClassSeats;
        this.secondClassSeats = secondClassSeats;
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    void deleteAllReservations() {
        this.firstClassReserved = 0;
        this.secondClassReserved = 0;
    }

    double getFirstClassOccupancyRatio() {
        return this.firstClassReserved * 100d / this.firstClassSeats;
    }

    int getFirstClassSeats() {
        return this.firstClassSeats;
    }

    int getSecondClassSeats() {
        return this.secondClassSeats;
    }

    double getOccupancyRatio() {
        return (this.firstClassReserved + this.secondClassReserved) * 100d / this.seats;
    }

    double getSecondClassOccupancyRatio() {
        return this.secondClassReserved * 100 / this.secondClassSeats;
    }

    int getTotalSeats() {
        return this.seats;
    }

    void printTrainInfo() {
        IO.println("Train info:");
        IO.println("-nTotSeats: " + this.seats);
        IO.println("-nFCSeats: " + this.firstClassSeats);
        IO.println("-nSCSeats: " + this.secondClassSeats);
        IO.println("-nFCReservedSeats: " + this.firstClassReserved);
        IO.println("-nSCReservedSeats: " + this.secondClassReserved + "\n");
    }

    void reserveFirstClassSeats(final int nSeats) {
        this.firstClassReserved += nSeats;
    }

    void reserveSecondClassSeats(final int nSeats) {
        this.secondClassReserved += nSeats;
    }

    boolean checkValid() {
        boolean verdict = true;
        if(this.seats > DEFAULT_TOT_SEATS || this.seats < 0) {
            verdict = false;
        }
        if(this.firstClassSeats > DEFAULT_N_FC_SEATS || this.firstClassSeats < 0) {
            verdict = false;
        }
        if(this.secondClassSeats > DEFAULT_N_SC_SEATS || this.secondClassSeats < 0) {
            verdict = false;
        }
        if(this.firstClassSeats+this.secondClassSeats != this.seats){
            verdict = false;
        }
        return verdict;
    }
}
