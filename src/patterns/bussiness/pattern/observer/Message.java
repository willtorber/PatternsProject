package patterns.bussiness.pattern.observer;

public class Message implements Observer {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("The test has finished, please check it");
	}
  // the observer
}
