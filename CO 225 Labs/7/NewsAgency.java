 /*
    E-18-180
    CO 225 - Lab 07 
    Kodituwakku M.K.N.M.
    
*/

import java.util.ArrayList;


// NewsAgency class 
public class NewsAgency{

    private String headline;
    private String description;
    private String newsType;
    private ArrayList<NewsChannel> channelList = new ArrayList<>();
    

    // Method to register a new channel
    public void registerNewsChannel(NewsChannel channel){
        System.out.println("*************************************************************************\n");
        try{
            channelList.add(channel);
            System.out.printf("%s registered to the agency.\n\n",channel.getName());
        }catch(Exception e){
            System.out.println("Something went wrong in the registration process.\nTry again.\n");
        }

    }

    // Method to unregister a new channel
    public void unregisterNewsChannel(NewsChannel channel){
        try{
            channelList.remove(channel);
            System.out.printf("%s unregistered to the agency.\n\n",channel.getName());
        }catch(Exception e){
            System.out.println("Something went wrong in the unregistration process.\nTry again.\n");
        }

    }

    // notify channel when a news received
    public void broadcastNews(String type, String description, String title){
        for (NewsChannel channel: channelList){
            channel.update(newsType, description, headline);
        }
    }

    // function to update news
    public void updateNews(String title, String description, String type){
        this.headline = title;
        this.description = description;
        this.newsType = type;
        broadcastNews(newsType, description, headline);
    }
        
}