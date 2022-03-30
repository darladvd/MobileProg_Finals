package com.example.filipinorecipes;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new recipes("Dinakdakan","200 gm chopped into cubes chicken" +
                "1 medium chopped tomato\n" +
                "1/2 pinch red chilli powder\n" +
                "2 tablespoon vegetable oil\n" +
                "1/2 cut into strips cucumber\n" +
                "1/2 tablespoon chopped coriander leaves\n" +
                "1 large thinly sliced onion\n" +
                "2 medium chopped green chilli\n" +
                "2 pinches garam masala powder\n" +
                "1 lemon wedges\n" +
                "1 teaspoon tomato ketchup\n" +
                "1 tablespoon green chilli sauce\n","Method",
            "Chicken Roll is a delectable North Indian recipe made using all purpose flour, stir-fried chicken, yoghurt and a variety of vegetables rolled into paranthas. On days you do not want to prepare an elaborate meal, this delectable dish can be a saviour. Rolls are quite popular across India and they are often a favourite evening snack. Egg Roll, Kathi Kebab Roll, Mutton Roll, Paneer Roll, Potato Roll and even Fish Roll are among its many variations. This easy roll recipe is made using chicken and has the unforgettable aroma of Indian spices. You can also utilize your leftover parathas and chapatis in making this recipe. If you do not like to use all-purpose flour or maida, you can make it with whole wheat flour too. In fact, it can be made even with leftover chicken. All you have to ensure is that you use the right amount of spices so that the flavour is not lost. Easy to pack and carry, you can also take it to office or prepare it for picnics and day trips. A must try roll recipe for all chicken lovers!\n",R.drawable.dinakdakan));

        recipes1.add(new recipes("Dinuguan","1 c. whole milk" +
                "1/4 c. plus 1 tsp. granulated sugar, divided" +
                "1 packet (or 2 1/4 tsp.) active dry yeast " +
                "4 c. all-purpose flour, plus more if needed" +
                "1/2 tsp. kosher salt" +
                "6 tbsp. melted butter" +
                "2 large eggs" +
                "1/2 tsp. pure vanilla extract" +
                "Canola or vegetable oil, for frying","Method","\n" +
                "Grease a large bowl with cooking spray and set aside. In a small, microwave-safe bowl or glass measuring cup, add milk. Microwave until lukewarm, 40 seconds. Add a teaspoon of sugar and stir to dissolve, then sprinkle over yeast and let sit until frothy, about 8 minutes.\n" +
                "Make glaze: In a large bowl, whisk together milk, powdered sugar, and vanilla until smooth. Set aside.\n" +
                "Line a large baking sheet with paper towels. In a large dutch oven over medium heat, heat 2'' oil to 350°. Cook doughnuts, in batches, until deeply golden on both sides, about 1 minute per side. Holes will cook even faster!\n" +
                "Transfer doughnuts to paper towel-lined baking sheet to drain and cool slightly. Dip into glaze, then place onto a cooling rack (or eat immediately!)",R.drawable.dinuguan));

        recipes1.add(new recipes("Dosa","3 cups rice" +
                "1 cup urad daal (split, skinless black gram)" +
                "3/4 teaspoon fenugreek seeds" +
                "Salt (to taste)" +
                "Vegetable / canola / sunflower cooking oil","Method",
            "Wash the rice and urad daal well. Add the fenugreek seeds to the mix and fill enough water in the rice-daal bowl to cover them about 2-inch deep. Soak overnight.\n" +
                    "Put some cooking oil in a small bowl and keep ready. You will also need a bowl of ice cold water, a large, flat nonstick pan, 2 sheets of paper towel, a ladle, a spatula, and a basting brush.\n" +
                    "When the upper surface begins to look cooked (it will no longer look soft or runny), flip the dosa. By this time, ideally, the surface that was underneath should be light golden in color. Cook for 1 minute after flipping.\n" +
                    "The dosa is almost done. Fold it in half and allow to cook for 30 seconds more.",R.drawable.lechonpaksiw));

        recipes1.add(new recipes("Sizzling Sisig","2 pounds pig face (snouts, ears, and jowls)\n" +
                "1 cup vinegar\n" +
                "1/4 cup soy sauce\n" +
                "1 head garlic, peeled and crushed\n" +
                "1 teaspoon whole peppercorns\n" +
                "2 bay leaves\n" +
                "1 tablespoon salt\n" +
                "water\n" +
                "1 large onion, peeled and diced\n" +
                "6 Thai chili peppers, stemmed and minced\n" +
                "1/2 cup calamansi juice\n" +
                "1 tablespoon Liquid seasoning (I used Maggi)\n" +
                "1/2 cup liver spread\n" +
                "pepper to taste\n","Method",
            "In a large pot, combine pig face, vinegar, soy sauce, garlic, peppercorns, bay leaves, about 1 tablespoon salt,  and enough water to completely cover pork. \n\n" +
                    "Bring to a boil, skimming scum that floats on top. Lower heat, cover, and simmer for about 50 minutes to 1 hour or until meat is tender. Remove from heat and drain well, discarding liquid.\n\n" +
                    "Over a hot grill, grill pork for about 7 to 10 minutes on each side or until crisp and slightly charred. Or arrange in a single layer on a baking sheet and broil in a 450 F oven for about 4 to 5 minutes or until nicely charred.\n\n"+
                    "Remove from heat, allow to cool to touch, and chop meat.\n\n"+
                    "In a large bowl, combine chopped meat, onions, chili peppers, calamansi juice., and liquid seasoning. \n\n"+
                    "And liver spread and gently stir to combine. Season with salt and pepper to taste.\n\n"+
                    "To serve, transfer to sizzling hot plates. ",R.drawable.sisig));

        recipes1.add(new recipes("Tapa","1 1/4 cups milk" +
                "1 1/2 lb beef sirloin\n" +
                "5 tablespoons soy sauce\n" +
                "3 tbsp minced garlic or 1 tablespoon garlic powder\n" +
                "2 tbsp sugar\n" +
                "1/4 teaspoon salt\n" +
                "1/4 teaspoon ground black pepper\n","Method",
                "In a container, combine soy sauce, garlic, salt, pepper, and sugar and mix well, then set aside\n\n" +
                        "Place the beef in the clear plastic bag," +
                        "and pour-in the the mixed seasonings in the clear plastic bag with meat and mix well\n\n" +
                        "Then, place inside the refrigerator and marinate for a minimum of 12 hours.\n" +
                        "In a pan, place 1 cup water and bring to a boil " +
                        "then add 3 tbsp of cooking oil\n\n" +
                        "Finally, put-in the marinated beef tapa and cook until the water evaporates.",R.drawable.tapa));


        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);
        myAdapter = new RecyclerViewAdapter(this,recipes1);
        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));
        myrecyclerView.setAdapter(myAdapter);

    }

}