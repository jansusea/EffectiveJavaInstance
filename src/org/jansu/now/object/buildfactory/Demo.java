package org.jansu.now.object.buildfactory;

public class Demo {

    public static void main(String[] args){
        NutritionFacts nutritionFacts1 = new NutritionFacts.Builder(3,5)
                .calories(2).carbohydrate(3).fat(2).sodium(1).build();
    }
}
