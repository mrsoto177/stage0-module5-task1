package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;
//import com.epam.mjc.stage0.utils.FridgeIml;
//import sun.tools.tree.SuperExpression;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
    	System.out.println("Open the fridge");
    	fridge.open();
    	System.out.println("Get milk fronm the fridge");
    	fridge.getMilk();
    	System.out.println("Close the fridge");
    	fridge.close();
    	
    }
    
    
    public static void main(String[] args) {
    
        FridgeAlgorithm fridgeActions = new FridgeAlgorithm();
        fridgeActions.fridgeAlgorithm(Fridge);
    }

}
