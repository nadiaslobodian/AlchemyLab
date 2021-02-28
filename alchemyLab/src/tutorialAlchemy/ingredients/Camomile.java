package tutorialAlchemy.ingredients;

import tutorialAlchemy.effect.Effects;

public class Camomile extends Ingredient {

	public Camomile() {
		super(Effects.INCREASE_SPEED, Effects.REDUCE_HEALTH, Effects.INCREASE_STRENGTH, Effects.INCREASE_HEALTH);
	}

	@Override
	public String getName() {
		return "Camomil";
	}



}

