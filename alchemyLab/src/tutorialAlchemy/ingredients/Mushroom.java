 package tutorialAlchemy.ingredients;

import tutorialAlchemy.effect.Effects;

public class Mushroom extends Ingredient {

	public Mushroom() {
		super(Effects.INCREASE_SPEED, Effects.REDUCE_HEALTH, Effects.INCREASE_STRENGTH, Effects.INCREASE_HEALTH);
	}
		
	@Override
	public String getName() {
		return "Mushroom";
	}

}
