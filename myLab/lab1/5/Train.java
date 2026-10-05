class Train {
	int nTotSeats;
	int nFirstClassSeats;
	int nSecondClassSeats;
	int nFirstClassReservedSeats;
	int nSecondClassReservedSeats;
	
	void build(int nTotSeats, int nFirstClassSeats, int nSecondClassSeats){
		this.nTotSeats=nTotSeats;
		this.nFirstClassSeats=nFirstClassSeats;
		this.nSecondClassSeats=nSecondClassSeats;
		this.nFirstClassReservedSeats=0;
		this.nSecondClassReservedSeats=0;
	}
	
	void reserveFirstClassSeats(int n){
		this.nFirstClassReservedSeats+=n;
	}
	void reserveSecondClassSeats(int n){
		this.nSecondClassReservedSeats+=n;
	}
	double getTotOccupancyRatio(){
		return (this.nTotSeats/(this.nFirstClassReservedSeats+this.nSecondClassReservedSeats))*100;
	}
	double getFirstClassOccupancyRatio(){
		return (this.nTotSeats/this.nFirstClassReservedSeats)*100;
	}
	double getSecondClassOccypancyRatio(){
		return (this.nTotSeats/this.nSecondClassReservedSeats)*100;
	}
	void deleteAllReservations(){
		this.nFirstClassReservedSeats=0;
		this.nSecondClassReservedSeats=0;
	}
}
	