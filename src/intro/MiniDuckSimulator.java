
package intro;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck d = new MallardDuck();
		d.performFly();
		d.performQuack();
		
		d.setFlyBehavior(new FlyNoWay());
		
		d.performFly();
	}
}
