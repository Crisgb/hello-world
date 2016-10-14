
public class Door extends Lock{
	
	private Lock lock;
	
	private boolean state;
	
	public Door(){
		lock = new Lock();
		state = false;
	}
	
	public boolean tryKey(Key k){
		if (lock.tryKey(k)){
			state = true;
		}
		return state;
	}
	
	public boolean isOpen(){
		return state;
	}
	
	public void closeDoor(){
		lock.close();
		state = false;
	}
}
