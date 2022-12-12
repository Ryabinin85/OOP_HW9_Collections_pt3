package productsList;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipeList = new HashSet<>();

    public Set<Recipe> getRecipeList() {
        return recipeList;
    }

    public void add(Recipe recipe) {
        if (recipeList.contains(recipe))
            throw new IllegalArgumentException("Такой рецепт уже есть!");
        recipeList.add(recipe);
    }

    @Override
    public String toString() {
        return recipeList.toString();
    }
}
