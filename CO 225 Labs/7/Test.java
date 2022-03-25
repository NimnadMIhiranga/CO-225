/*
    E-18-180
    CO 225 - Lab 07 
    Kodituwakku M.K.N.M.
    
*/

//Main test code to check the observer pattern 
public class Test{
    public static void main(String args[]){

        // creating a new news agency
        NewsAgency agency = new NewsAgency();

        // creating channels to add news
        NewsChannel c1 = new NewsChannel("Sirasa");
        NewsChannel c2 = new NewsChannel("Charana");
        NewsChannel c3 = new NewsChannel("BBC");

        // register channels under agency
        agency.registerNewsChannel(c1);
        agency.registerNewsChannel(c2);
        agency.registerNewsChannel(c3);

        // adding news types for the Sirasa channel
        c1.addTypes("Sport");
        c1.addTypes("Local");
        c1.addTypes("Foreign");

        // adding news types for the Charana channel
        c2.addTypes("Local");
        c2.addTypes("Foreign");

        // adding news types for the BBC channel
        c3.addTypes("Foreign");

        // let channel now registered agency
        c1.registeredAgency(agency);
        c2.registeredAgency(agency);
        c3.registeredAgency(agency);


        // news updates
        agency.updateNews("India vs Sri Lanka", "Kuldeep Yadav has not been dropped but released due to bubble fatigue, says Jasprit Bumrah", "Sport"); //Sport Update
        agency.updateNews("Lanka IOC hikes fuel prices again","Lanka IOC announced that it will increase the price of diesel and petrol with effect from midnight today (10), due to the significant depreciation of the rupee.","Local");   //Local Update
        agency.updateNews("War in Ukraine: Facebook to allow calls for violence against Putin","The owner of Facebook and Instagram will allow users in some countries to call for violence against Vladimir Putin and Russian soldiers.","Foreign"); //Foriegn Update

        // unregister BBC channel from the agency
        agency.registerNewsChannel(c3);
        
        //Foriegn news update
        agency.updateNews("Leonardo DiCaprio donates $10 mn in aid to Ukraine","Hollywood actor Leonardo DiCaprio has donated $10 million to aid Ukraine in its fight against Russia.","Foreign");


        // remove local type form a Charana channel
        c2.removeTypes("Local");
        
        // Local news update to check weather to check charana still gets the news update
        agency.updateNews("All students to be allowed to attend school from March 14","A circular has been issued by the Secretary to the Ministry of Education Prof. Kapila Prera to allow students to attend classes from Monday (March 14) as per usual.","Local");
    
    }
}