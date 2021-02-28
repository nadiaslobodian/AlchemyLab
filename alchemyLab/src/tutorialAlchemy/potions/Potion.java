package tutorialAlchemy.potions;

import java.util.HashSet;
import java.util.Set;

import tutorialAlchemy.effect.Effect;

public class Potion {
	
	private Set<Effect> effects = new HashSet<>();
	
	public Potion(Set<Effect> effects) {
		this.effects = effects;
	}
	
	public Set<Effect> getEffects() {
		return effects;
	}

	@Override
	public String toString() {
		String result = "";
		for (Effect effect: effects) {
			result += effect.getDescription() + "\n";
		}
		
		return result;
	}
	
}
