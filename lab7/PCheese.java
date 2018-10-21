public class PCheese extends LeafDecorator
{
    private String[] options ;
    
    
    public PCheese( String d )
    {
        super(d) ;
    }
    
    // per premium cheese +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        if ( options.length > 0 )
            this.price += options.length * 1.50 ;
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}