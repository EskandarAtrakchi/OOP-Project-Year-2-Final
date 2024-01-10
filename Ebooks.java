package bookcatalog;

/**
 *
 * @author x23137517
 */
public class Ebooks extends Book  {
    
    private String type ;

    public Ebooks() {
    }

    public Ebooks(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    //I will use this setter method to set the type and also to let the user know if they have chosen Book type or eBook type 
    
    public void setType(String type) {
        this.type = type;
    }
}
