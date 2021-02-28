package tutorialAlchemy.effect;

import java.util.HashSet;
import java.util.Set;

public final class Effects {
	
	public static Set<Effect> effects = new HashSet<>();
	
	private Effects() {
		effects.add(new Effect("Increase Speed"));
		effects.add(new Effect("Increase Strength"));
		effects.add(new Effect("Reduce Health"));
		effects.add(new Effect("Increase Health"));
	}
	
	public final static Effect INCREASE_SPEED = new Effect("Increase Speed");
	public final static Effect INCREASE_STRENGTH = new Effect("Increase Strength");
	public final static Effect REDUCE_HEALTH = new Effect("Reduce Health");
	public final static Effect INCREASE_HEALTH = new Effect("Increase Health");
	
}