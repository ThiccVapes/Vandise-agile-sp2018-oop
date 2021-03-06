
public class Coordinate extends CoordinateSubject {
	private boolean called;
	private boolean hasShip;

	public Coordinate() {
		this.called = false;
		this.hasShip = false;
	}

	// TODO
	// call the coordinate, check if the ship was hit, missed, or sunk
	// read about the observer pattern
	// 
	public String call() throws Exception {
		if (!this.called) {
		  if (this.hasShip()) {
		    this.called = true;
		    this.notifyObserver();
		    return "Hit";
		    
		  } else {	
			this.called = true;
			return "Miss";
		  }
		
		  
		} else {
			throw new Exception("Coordinate already called");
		}
	}


	// TODO
	//	read about inheritance and calling parent
	//	methods in Java
	//
	@Override
	public void attach(Ship observer) {
		super.attach(observer);
		this.hasShip = true;
	}

	// TODO
	// return if the coordinate has been called or not
	//
	public boolean called() {
	  if (this.called) {
	    return true;
	  } else {
		return false;
	  }
	}

	// TODO 
	// is there a ship on this coordinate?
	//
	public boolean hasShip() {
	  if (this.hasShip) {
	    return true;
	  } else {
		return false;
	}
	}
}
