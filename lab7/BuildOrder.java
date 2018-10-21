  

public class BuildOrder {

    public static Component getOrder()
    {
	/*************** Order ******************/
        Composite order = new Composite( "Order" ) ;

	/******* Custom burger 1 *****************/
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b = new Burger("Burger Options") ;
        String[] bo = {"Organic Bison*", "1/2lb.", "On A Bun"} ;
        b.setOptions(bo);

        // Cheese options
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
	// Premium cheese
        PCheese pc = new PCheese("Premium Cheese Options") ;
        String[] pco = { "Danish Blue Cheese" } ;
        pc.setOptions(pco) ;
        pc.wrapDecorator( c ) ;
        
        // Sauce options
        Sauce s = new Sauce("Sauce Options") ;
        String[] so = { "Thai Peanut Sauce", "Mayonnaise" } ;
        s.setOptions(so) ;
        s.wrapDecorator( pc ) ;

        // Toppings options
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // Premium topping options
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        // Bun options
        Bun bun = new Bun( "Bun Options" ) ;
        String[] o = { "Ciabatta (Vegan)" } ;
        bun.setOptions( o ) ;
        bun.wrapDecorator( p ) ;
       
        // Side options
        Side side = new Side( "Side Options" ) ;
        String[] sideo = { "Shoestring Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( side ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( pc ) ;
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bun ) ;
        customBurger.addChild( side ) ;
            
	/******* Custom burger 2 *****************/
        CustomBurger customBurger_1 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b_1 = new Burger( "Burger Options" ) ;
        String[] bo_1 = { "Hormone & AntiBiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b_1.setOptions( bo_1 ) ;

        // Cheese options
        Cheese c_1 = new Cheese( "Cheese Options" ) ;
        String[] co_1 = { "Greek Feta","Smoked Gauda" } ;
        c_1.setOptions( co_1 ) ;
        c_1.wrapDecorator( b_1 ) ;
        
	// Premium Cheese option
        PCheese pc_1 = new PCheese( "Premium Cheese Options" ) ;
        String[] pco_1 = { "Fresh Mozzarella" } ;
        pc_1.setOptions( pco_1 ) ;
        pc_1.wrapDecorator( c_1 ) ;
        
         // Add sauces
        Sauce s_1 = new Sauce( "Sauce Options" ) ;
        String[] so_1 = { "Habanero Salsa" } ;
        s_1.setOptions( so_1 ) ;
        s_1.wrapDecorator( pc_1 ) ;

        // Add toppings
        Toppings t_1 = new Toppings( "Toppings Options" ) ;
        String[] to_1 = { "Crushed Peanuts"} ;
        t_1.setOptions( to_1 ) ;
        t_1.wrapDecorator( s_1 ) ;
        
        // Add premium toppings
        Premium p_1 = new Premium( "Premium Toppings Options" ) ;
        String[] po_1 = { "Marinated Tomatoes", "Sunny Side Up Egg" } ;
        p_1.setOptions( po_1 ) ;
        p_1.wrapDecorator( t_1 ) ;
        
        // Choose the bun
        Bun bun_1 = new Bun( "Bun Options" ) ;
        String[] o_1 = { "Gluten-Free Bun" } ;
        bun_1.setOptions( o_1 ) ;
        bun_1.wrapDecorator( p_1 ) ;
       
        // Choose sides
        Side side_1 = new Side( "Side Options" ) ;
        String[] sideo_1 = { "Shoestring Fries" } ;
        side_1.setOptions( sideo_1 ) ;
        side_1.wrapDecorator( bun_1 ) ;
        
        // Setup Custom Burger Ingredients
        customBurger_1.setDecorator( side_1 ) ;
        customBurger_1.addChild( b_1 ) ;
        customBurger_1.addChild( c_1 ) ;
        customBurger_1.addChild( pc_1 ) ;
        customBurger_1.addChild( s_1 ) ;
        customBurger_1.addChild( t_1 ) ;
        customBurger_1.addChild( p_1 ) ;
        customBurger_1.addChild( bun_1 ) ;
        customBurger_1.addChild( side_1 ) ;
        
        // Add the two Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( customBurger_1 );
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/