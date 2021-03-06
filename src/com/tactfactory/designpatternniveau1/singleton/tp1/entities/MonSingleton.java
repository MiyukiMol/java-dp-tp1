package com.tactfactory.designpatternniveau1.singleton.tp1.entities;

public class MonSingleton {

	private MonSingleton()
    {
		
    }
     
    private static MonSingleton INSTANCE = null;
     
    public static synchronized MonSingleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new MonSingleton(); 
        }
        return INSTANCE;
    }
}
