package productsList;

public class Main {
    public static void main(String[] args) {

        Product bananas = new Product("Бананы", 1.5, 70.0);
        Product bananas2 = new Product("Бананы", 3.5, 30.0);
        Product tomatoes = new Product("Помидоры", 1.2, 120.0);
        Product potato = new Product("Картошка", 5, 50.0);
        Product bread = new Product("Хлеб", 0.5, 20.0);
        Product flour = new Product("Мука", 1.0, 90.0);
        Product cucumbers = new Product("Огурцы", 1.0, 90.0);
        Product eggs = new Product("Яйца", 1.0, 90.0);
        Product milk = new Product("Молоко", 1.0, 90.0);

        ProductList salad = new ProductList();
        ProductList milkCocktail = new ProductList();
        ProductList milkCocktail2 = new ProductList();
        ProductList draniki = new ProductList();
        ProductList omelet = new ProductList();
        ProductList eggSandwich = new ProductList();

        salad.add(tomatoes, 2);
        salad.add(cucumbers, 2);
        Recipe recipeSalad = new Recipe("Салат", salad, salad.totalCost(salad.getProductList()));

        milkCocktail.add(milk, 1);
        milkCocktail.add(bananas, 3);
        milkCocktail2.add(milk, 1);
        milkCocktail2.add(bananas2, 4);
        Recipe recipeMilkCocktail = new Recipe("Молочный коктейль", milkCocktail, milkCocktail.totalCost(milkCocktail.getProductList()));
        Recipe recipeMilkCocktail2 = new Recipe("Молочный коктейль", milkCocktail2, milkCocktail2.totalCost(milkCocktail2.getProductList()));

        draniki.add(potato, 5);
        draniki.add(flour, 1);
        Recipe recipeDraniki = new Recipe("Драники", draniki, draniki.totalCost(draniki.getProductList()));

        omelet.add(eggs, 4);
        omelet.add(bread, 2);
        Recipe recipeOmelet = new Recipe("Омлет", omelet, omelet.totalCost(omelet.getProductList()));


        eggSandwich.add(eggs, 1);
        eggSandwich.add(bread, 1);
        Recipe recipeEggSandwich = new Recipe("Бутерброд с яйцом", eggSandwich, eggSandwich.totalCost(eggSandwich.getProductList()));

        RecipeList recipeList = new RecipeList();

        recipeList.add(recipeSalad);
        recipeList.add(recipeMilkCocktail);
//        recipeList.add(recipeMilkCocktail2);
        recipeList.add(recipeDraniki);
        recipeList.add(recipeOmelet);
        recipeList.add(recipeEggSandwich);

        for (Recipe recipe : recipeList.getRecipeList()) {
            System.out.println(recipe);
        }
    }
}
