package tutorialAlchemy;

import tutorialAlchemy.ingredients.Camomile;
import tutorialAlchemy.ingredients.Flies;
import tutorialAlchemy.ingredients.Herbs;
import tutorialAlchemy.ingredients.Mushroom;
import tutorialAlchemy.potions.Potion;

public class Runner {

	public static void main(String[] args) {
		AlchemyLab lab = new AlchemyLab();

		Potion potion = lab.createPotion(new Herbs(), new Mushroom(), new Flies(), new Camomile());

		System.out.println(potion);
	}
}

