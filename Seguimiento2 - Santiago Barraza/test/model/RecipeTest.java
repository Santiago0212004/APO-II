package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	private Recipe recipe;
	
	public void setupStage1() {
		recipe = new Recipe();
	}
	
	public void setupStage2() {
		recipe = new Recipe();
		
		recipe.addIngredient("Cebolla", 315);
		recipe.addIngredient("Ajo", 58);
		recipe.addIngredient("Arroz", 520);
	}

	@Test
	void test1() {
		setupStage1();
		
		recipe.addIngredient("Sal", 12);
		
		assertEquals(1, recipe.getIngredients().size());
	}
	
	@Test
	void test2() {
		setupStage2();
		
		List<Ingredient> ingredients = recipe.getIngredients();
		
		recipe.addIngredient("Pimienta", 6);
		
		assertEquals(4, ingredients.size());
		
		assertEquals("Pimienta",ingredients.get(ingredients.size()-1).getName());
		
		assertEquals(6,ingredients.get(ingredients.size()-1).getWeight());
	}
	
	@Test
	void test3() {
		setupStage2();
		
		List<Ingredient> ingredients = recipe.getIngredients();
		
		recipe.addIngredient("Ajo", 21);
		
		assertEquals(3, ingredients.size());
		
		assertEquals(79,ingredients.get(1).getWeight());
		
	}
	
	@Test
	void test4() {
		setupStage2();
		
		List<Ingredient> ingredients = recipe.getIngredients();
		
		recipe.removeIngredient("Ajo");
		
		assertEquals(2, ingredients.size());
	}

}
