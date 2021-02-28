package tutorialAlchemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tutorialAlchemy.effect.Effect;
import tutorialAlchemy.ingredients.Ingredient;
import tutorialAlchemy.potions.Potion;

public class AlchemyLab {

	public Potion createPotion(Ingredient... ingredients) {
		List<Printable> printables = new ArrayList<>();
		for (Ingredient ingredient: ingredients) {
			printables.add((Printable) ingredient);
			for (Effect effect: ingredient.getEffectsSet()) {
				printables.add(effect);
			}
		}
		if (ingredients.length < Settings.INGREDIENTS_MIN || ingredients.length > Settings.INGREDIENTS_MAX) {
			throw new RuntimeException("Can not create potion with " + ingredients.length + " ingredients");
		} else {
			return createAnyPotion(ingredients);
		}
	}

	private Potion createAnyPotion(Ingredient... ingredients) {
		Set<String> ingredientNames = new HashSet<>();

		for (Ingredient ingredient : ingredients) {
			if (ingredientNames.contains(ingredient.getName())) {
				throw new RuntimeException("Can not use same ingredients");
			}
			ingredientNames.add(ingredient.getName());
		}

		Set<Effect> matchedEffects = new HashSet<>();
		Set<Effect> effects = new HashSet<>();

		for (Ingredient ingredient : ingredients) {
			for (Effect effect : ingredient.getEffectsSet()) {
				if (effects.contains(effect)) {
					matchedEffects.add(effect);
				} else {
					effects.add(effect);
				}
			}
		}

		return createPotion(matchedEffects);
	}

	private Potion createPotion(Set<Effect> effects) {
		if (effects.isEmpty()) {
			throw new RuntimeException("Potion creation failed");
		}

		return new Potion(effects);
	}

}
