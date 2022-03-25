/*
    E-18-180
    CO 225 - Lab 07 
    Kodituwakku M.K.N.M.
    
*/

import java.util.ArrayList;

// NewsChannel class
public class NewsChannel{

    private String name;
    private ArrayList<String> types = new ArrayList<>(); //arraylist to store news types
    private NewsAgency agency = new NewsAgency();
    
    // constructor for the news channel
    public NewsChannel(String name){
        super();
        this.name = name;
        
    }

    //Method to return channel name
    public String getName(){
        return this.name;
    }

    // retrieving news information
    public void update(String newsType, String description, String headline){
        for(String type: types){
            if (newsType.equals(type)){
                //System.out.println("*************************************************************************\n");
                System.out.printf("****************************************** %s News received for %s ******************************************\n",newsType,this.name);
                System.out.printf("\nHeadline\t : %s\nDescription\t : %s\n\n",headline,description);
               //System.out.println("*************************************************************************\n");
            }
        }
      
    }

    // setter for registered agency
    public void registeredAgency(NewsAgency agency){
        this.agency = agency;
    }

    // adding types for news
    public void addTypes(String type){
        types.add(type);
        System.out.println("*************************************************************************\n");
        System.out.printf("%s type added for the channel %s\n\n",type,this.name);
        System.out.println("*************************************************************************\n");

    }

    // remove added news types
    public void removeTypes(String type){
        types.remove(type);
        System.out.println("*************************************************************************\n");
        System.out.printf("%s type removed for the channel %s\n\n",type,this.name);
        System.out.println("*************************************************************************\n");

    }
}