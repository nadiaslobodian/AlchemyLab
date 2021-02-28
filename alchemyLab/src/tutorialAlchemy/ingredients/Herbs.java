package tutorialAlchemy.ingredients;

import tutorialAlchemy.effect.Effects;

public class Herbs extends Ingredient {

	public Herbs() {
		super(Effects.INCREASE_SPEED, Effects.REDUCE_HEALTH, Effects.INCREASE_STRENGTH, Effects.INCREASE_HEALTH);
	}

	@Override
	public String getName() {
		return "Herbs";
	}

}
