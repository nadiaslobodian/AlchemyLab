package tutorialAlchemy.ingredients;

import tutorialAlchemy.effect.Effects;

public class Flies extends Ingredient {

	public Flies() {
		super(Effects.INCREASE_SPEED, Effects.REDUCE_HEALTH, Effects.INCREASE_STRENGTH, Effects.INCREASE_HEALTH);
	}

	@Override
	public String getName() {
		return "Flies";
	}
	

}
