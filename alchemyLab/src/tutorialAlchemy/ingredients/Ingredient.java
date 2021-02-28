package tutorialAlchemy.ingredients;
import java.util.HashSet;
import java.util.Set;
import tutorialAlchemy.effect.Effect;

public abstract class Ingredient {

		private Effect[] effects = new Effect[4];

		public Ingredient(Effect effect1, Effect effect2, Effect effect3, Effect effect4) {
			effects[0] = effect1;
			effects[1] = effect2;
			effects[2] = effect3;
			effects[3] = effect4;
		}

		public Effect getEffect(int index) {
			return effects[index];
		}

		public Set<Effect> getEffectsSet() {
			Set<Effect> result = new HashSet<>();
			for (Effect effect : effects) {
				result.add(effect);
			}
			return result;
		}

		public abstract String getName();
	}
