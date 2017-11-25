/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaire;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Dillon
 */
public class CreateQuestions {
    
    private ArrayList<Questions> question1;
    private ArrayList<Questions> question2;
    private ArrayList<Questions> question3;
    private ArrayList<Questions> question4;
    private ArrayList<Questions> question5;
    private ArrayList<Questions> question6;
    private ArrayList<Questions> question7;
    private ArrayList<Questions> question8;
    private ArrayList<Questions> question9;
    private ArrayList<Questions> question10;
    private ArrayList<Questions> question11;
    private ArrayList<Questions> question12;
    private ArrayList<Questions> question13;
    private ArrayList<Questions> question14;
    private ArrayList<Questions> question15;
    private ArrayList<Questions> questionsPicked;
    Random rand;
    
    public CreateQuestions(){
        question1 = new ArrayList<>();
        question2 = new ArrayList<>();
        question3 = new ArrayList<>();
        question4 = new ArrayList<>();
        question5 = new ArrayList<>();
        question6 = new ArrayList<>();
        question7 = new ArrayList<>();
        question8 = new ArrayList<>();
        question9 = new ArrayList<>();
        question10 = new ArrayList<>();
        question11 = new ArrayList<>();
        question12 = new ArrayList<>();
        question13 = new ArrayList<>();
        question14 = new ArrayList<>();
        question15 = new ArrayList<>();
        questionsPicked = new ArrayList<>();
        rand = new Random();
    }
    
    // Create questions and answers
    public void setupQuestion1(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("What phrase is used to describe the nationwide list of people who don't want to be contacted by telemarketers?");
        possibleQuestion1.setAnswer2("Do-not-fax");
        possibleQuestion1.setAnswer3("Do-not-page");
        possibleQuestion1.setAnswer4("Do-not-tick-me-off");
        possibleQuestion1.setCorrectAnswer("Do-not-call");
        question1.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("According to the popular phrase about love and rejection, \"Hell hath no fury like\" what?");
        possibleQuestion2.setAnswer2("A broken heart");
        possibleQuestion2.setAnswer3("A man's tears");
        possibleQuestion2.setAnswer4("Judge Judy");
        possibleQuestion2.setCorrectAnswer("A woman scorned");
        question1.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("In the U.S., what holiday is celebrated annually to honor working people?");
        possibleQuestion3.setAnswer2("Arbor Day");
        possibleQuestion3.setAnswer3("Memorial Day");
        possibleQuestion3.setAnswer4("Stick-It-to-the-Man Day");
        possibleQuestion3.setCorrectAnswer("Labor Day");
        question1.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("A historic district in New York, Wall Street is the famous site of a famous what?");
        possibleQuestion4.setAnswer2("Symphony hall");
        possibleQuestion4.setAnswer3("Military base");
        possibleQuestion4.setAnswer4("Kinko's");
        possibleQuestion4.setCorrectAnswer("Stock exchange");
        question1.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("What type of songs are traditionally played and sung during the Christmas holidays?");
        possibleQuestion5.setAnswer2("Christmas cheers");
        possibleQuestion5.setAnswer3("Christmas sonnets");
        possibleQuestion5.setAnswer4("Venom");
        possibleQuestion5.setCorrectAnswer("Christmas carols");
        question1.add(possibleQuestion5);
        
    }
    
    public void setupQuestion2(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("Which legal document states a person's wishes regarding the disposal of their property after death?");
        possibleQuestion1.setAnswer2("Shall");
        possibleQuestion1.setAnswer3("Would");
        possibleQuestion1.setAnswer4("Should");
        possibleQuestion1.setCorrectAnswer("Will");
        question2.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Which is the fastest animal on the land?");
        possibleQuestion2.setAnswer2("Squirel");
        possibleQuestion2.setAnswer3("hippopotamus");
        possibleQuestion2.setAnswer4("Lion");
        possibleQuestion2.setCorrectAnswer("Cheetah");
        question2.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("Which is the most sensitive organ in our body? ");
        possibleQuestion3.setAnswer2("Ear");
        possibleQuestion3.setAnswer3("Heart");
        possibleQuestion3.setAnswer4("Lung");
        possibleQuestion3.setCorrectAnswer("Skin");
        question2.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("According to the Population Reference Bureau, about how many people have ever lived on earth?");
        possibleQuestion4.setAnswer2("50 Billion");
        possibleQuestion4.setAnswer3("7 Million");
        possibleQuestion4.setAnswer4("1 Trillion");
        possibleQuestion4.setCorrectAnswer("100 Billion");
        question2.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("The catastrophic 2010 BP oil spill resulted from the explosion of an offshore drilling rig with what name?");
        possibleQuestion5.setAnswer2("New Horizon");
        possibleQuestion5.setAnswer3("The Enterprise");
        possibleQuestion5.setAnswer4("British Horizon");
        possibleQuestion5.setCorrectAnswer("Deepwater Horizon");
        question2.add(possibleQuestion5);
        
    }
    
    public void setupQuestion3(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("In 1835, Charles Darwin spent five weeks observing the indigenous life on what chain of islands?");
        possibleQuestion1.setAnswer2("Hawaiian Islands");
        possibleQuestion1.setAnswer3("Hamilton Islands");
        possibleQuestion1.setAnswer4("Ko Phi Phi Don Islands");
        possibleQuestion1.setCorrectAnswer("The Galapagos Islands");
        question3.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("What is 8 X 47?");
        possibleQuestion2.setAnswer2("443");
        possibleQuestion2.setAnswer3("310");
        possibleQuestion2.setAnswer4("240");
        possibleQuestion2.setCorrectAnswer("376");
        question3.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("At the beginning of a game of chess,what pieces occupy the four corners of the board?");
        possibleQuestion3.setAnswer2("Knights");
        possibleQuestion3.setAnswer3("Pons");
        possibleQuestion3.setAnswer4("Bishops");
        possibleQuestion3.setCorrectAnswer("Rooks");
        question3.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Though it sounds like a movie awards category,which of these is the name of a hotel chain?");
        possibleQuestion4.setAnswer2("Hyatt Place");
        possibleQuestion4.setAnswer3("Embassy Suites");
        possibleQuestion4.setAnswer4("Hilton Hotels");
        possibleQuestion4.setCorrectAnswer("Best Western");
        question3.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("In computer science, what does \"GUI\" stand for?");
        possibleQuestion5.setAnswer2("Gaming user interface ");
        possibleQuestion5.setAnswer3("Geographic user interface");
        possibleQuestion5.setAnswer4("Graphical unix interface");
        possibleQuestion5.setCorrectAnswer("Graphical user interface");
        question3.add(possibleQuestion5);
        
    }
    
    public void setupQuestion4(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("For several seasons, Jillian Michaels and Bob Harper have helped contestants on what reality TV show?");
        possibleQuestion1.setAnswer2("Weight Watchers");
        possibleQuestion1.setAnswer3("Weight Losers");
        possibleQuestion1.setAnswer4("The Biggest Winner");
        possibleQuestion1.setCorrectAnswer("The Biggest Loser");
        question4.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("The moon is roughly how far from the Earth?");
        possibleQuestion2.setAnswer2("82,000 miles");
        possibleQuestion2.setAnswer3("4,000,000 miles");
        possibleQuestion2.setAnswer4("800,000 miles");
        possibleQuestion2.setCorrectAnswer("240,000 miles");
        question4.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("By definition, an analgesic is a type of medication intended primarily to do what?");
        possibleQuestion3.setAnswer2("Reduce Weight");
        possibleQuestion3.setAnswer3("Stop Hallucinations");
        possibleQuestion3.setAnswer4("Relieve Indigestion");
        possibleQuestion3.setCorrectAnswer("Relieve Pain");
        question4.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Which of these is not a piece of jewellery commonly worn to symbolise a relationship between two people?");
        possibleQuestion4.setAnswer2("Engagement ring");
        possibleQuestion4.setAnswer3("Anniversary ring");
        possibleQuestion4.setAnswer4("Wedding ring");
        possibleQuestion4.setCorrectAnswer("Burger ring");
        question4.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Homeowners buy surge protectors to protect their possessions from unexpected surges of what?");
        possibleQuestion5.setAnswer2("Water flow");
        possibleQuestion5.setAnswer3("Air pressure");
        possibleQuestion5.setAnswer4("Buyer's remorse");
        possibleQuestion5.setCorrectAnswer("Electrical current");
        question4.add(possibleQuestion5);
        
    }
    
    public void setupQuestion5(){
        
        // First Question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("According to a well-known piece of advice, \"If you want something done right, you have to\" what?");
        possibleQuestion1.setAnswer2("Use a calculator");
        possibleQuestion1.setAnswer3("Double-check everything");
        possibleQuestion1.setAnswer4("Call MacGyver");
        possibleQuestion1.setCorrectAnswer("Do it yourself");
        question5.add(possibleQuestion1);
        
        // Eighth question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Facts, objects, or signs that make you believe that something exists or is true are called _____.");
        possibleQuestion2.setAnswer2("Hypothesis");
        possibleQuestion2.setAnswer3("Theory");
        possibleQuestion2.setAnswer4("Research");
        possibleQuestion2.setCorrectAnswer("Evidence");
        question5.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("In which of these locations would a redcap most likely work?");
        possibleQuestion3.setAnswer2("Construction site");
        possibleQuestion3.setAnswer3("Manufacturing plant");
        possibleQuestion3.setAnswer4("Airport");
        possibleQuestion3.setCorrectAnswer("Railroad station");
        question5.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Which crop is sown on the largest area in India?");
        possibleQuestion4.setAnswer2("Maize");
        possibleQuestion4.setAnswer3("Wheat");
        possibleQuestion4.setAnswer4("Sugarcane");
        possibleQuestion4.setCorrectAnswer("Rice");
        question5.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Second World war began in ______.");
        possibleQuestion5.setAnswer2("1931");
        possibleQuestion5.setAnswer3("1935");
        possibleQuestion5.setAnswer4("1937");
        possibleQuestion5.setCorrectAnswer("1938");
        question5.add(possibleQuestion5);
        
    }
    
    public void setupQuestion6(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The chemical name of common salt is ______.");
        possibleQuestion1.setAnswer2(" Potassium Chloride");
        possibleQuestion1.setAnswer3("Calcium Carbonate");
        possibleQuestion1.setAnswer4("Sodium Carbonate");
        possibleQuestion1.setCorrectAnswer("Sodium Chloride");
        question6.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("The most populous city in the world is ______.");
        possibleQuestion2.setAnswer2("Paris");
        possibleQuestion2.setAnswer3("London");
        possibleQuestion2.setAnswer4("Peking");
        possibleQuestion2.setCorrectAnswer("Tokyo");
        question6.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("The planet nearest to the sun is ____.");
        possibleQuestion3.setAnswer2("Saturn");
        possibleQuestion3.setAnswer3("Jupiter");
        possibleQuestion3.setAnswer4("Venus");
        possibleQuestion3.setCorrectAnswer("Mercury");
        question6.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("On the surface of the moon the weight of a man ____.");
        possibleQuestion4.setAnswer2("Remain the same");
        possibleQuestion4.setAnswer3("Increases");
        possibleQuestion4.setAnswer4("May or may not increase");
        possibleQuestion4.setCorrectAnswer("Decreases");
        question6.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Pure water freezes at what temperature?");
        possibleQuestion5.setAnswer2("47 F");
        possibleQuestion5.setAnswer3("0 F");
        possibleQuestion5.setAnswer4("19 F");
        possibleQuestion5.setCorrectAnswer("32 F");
        question6.add(possibleQuestion5);
        
    }
    
    public void setupQuestion7(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("What is the main component of biogas and natural gas?");
        possibleQuestion1.setAnswer2("Ethane");
        possibleQuestion1.setAnswer3("Propane");
        possibleQuestion1.setAnswer4("Butane");
        possibleQuestion1.setCorrectAnswer("Methane");
        question7.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Which vitamin is abundant in citrus fruits?");
        possibleQuestion2.setAnswer2("Vitamin A");
        possibleQuestion2.setAnswer3("Vitamin B");
        possibleQuestion2.setAnswer4("Vitamin D");
        possibleQuestion2.setCorrectAnswer("Vitamin C");
        question7.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("The device used for measuring altitudes is ____.");
        possibleQuestion3.setAnswer2("audiometer");
        possibleQuestion3.setAnswer3("ammeter");
        possibleQuestion3.setAnswer4("galvanometer");
        possibleQuestion3.setCorrectAnswer("altimeter");
        question7.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion(" “One People, One State, One leader” was the policy of ___.");
        possibleQuestion4.setAnswer2("Stalin");
        possibleQuestion4.setAnswer3("Lenin");
        possibleQuestion4.setAnswer4("Mussolin");
        possibleQuestion4.setCorrectAnswer("Hitler");
        question7.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("The World Largest desert is ____.");
        possibleQuestion5.setAnswer2("Thar");
        possibleQuestion5.setAnswer3("Kalahari");
        possibleQuestion5.setAnswer4("Sonoran");
        possibleQuestion5.setCorrectAnswer("Sahara");
        question7.add(possibleQuestion5);
        
    }
    
    public void setupQuestion8(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The brain fever which affects young children is ____.");
        possibleQuestion1.setAnswer2("Malaria");
        possibleQuestion1.setAnswer3("Typhoid");
        possibleQuestion1.setAnswer4("Pneumonia");
        possibleQuestion1.setCorrectAnswer("Encephatitis");
        question8.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Deficiency of Iron leads to ____.");
        possibleQuestion2.setAnswer2("Rickets");
        possibleQuestion2.setAnswer3("Malaria");
        possibleQuestion2.setAnswer4("Dental Cavity");
        possibleQuestion2.setCorrectAnswer("Anaemia");
        question8.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("The number of ribs in Human Body is ____.");
        possibleQuestion3.setAnswer2("12");
        possibleQuestion3.setAnswer3("18");
        possibleQuestion3.setAnswer4("20");
        possibleQuestion3.setCorrectAnswer("24");
        question8.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("What is the liquid part of the blood?");
        possibleQuestion4.setAnswer2("WBC");
        possibleQuestion4.setAnswer3("RBC");
        possibleQuestion4.setAnswer4("HB");
        possibleQuestion4.setCorrectAnswer("Plasma");
        question8.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("The longest mountain range in the world is ____.");
        possibleQuestion5.setAnswer2("The Alps");
        possibleQuestion5.setAnswer3("The Himalayas");
        possibleQuestion5.setAnswer4("The Everest");
        possibleQuestion5.setCorrectAnswer("The Andes");
        question8.add(possibleQuestion5);

    }
    
    public void setupQuestion9(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("Which one of the following glasses is used in bullet proof screens?");
        possibleQuestion1.setAnswer2("Soda glass");
        possibleQuestion1.setAnswer3("Pyrex glasss");
        possibleQuestion1.setAnswer4("Jena glass");
        possibleQuestion1.setCorrectAnswer("Reinforced glass");
        question9.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("The metal used in storage batteries is ____.");
        possibleQuestion2.setAnswer2("Iron");
        possibleQuestion2.setAnswer3("Copper");
        possibleQuestion2.setAnswer4("Aluminium");
        possibleQuestion2.setCorrectAnswer("Lead");
        question9.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("In what ocean did the Titanic sink?");
        possibleQuestion3.setAnswer2("Arctic ocean");
        possibleQuestion3.setAnswer3("Indian ocean");
        possibleQuestion3.setAnswer4("Pacific ocean");
        possibleQuestion3.setCorrectAnswer("Atlantic ocean");
        question9.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("The Starry Night is an oil on canvas painted by which post-impressionist painter?");
        possibleQuestion4.setAnswer2("Pablo Picasso");
        possibleQuestion4.setAnswer3("Claude Monet");
        possibleQuestion4.setAnswer4("Leonardo da Vinci");
        possibleQuestion4.setCorrectAnswer("Vincent van Gogh");
        question9.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("In 2011,a Utah KFC controversially donated $1 for every giant soda sold to help cure what sugar-sensitive disease?");
        possibleQuestion5.setAnswer2("Asthma");
        possibleQuestion5.setAnswer3("Lung Disease");
        possibleQuestion5.setAnswer4("Skin Cancer");
        possibleQuestion5.setCorrectAnswer("Diabetes");
        question9.add(possibleQuestion5);
        
    }
    
    public void setupQuestion10(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The instrument useful for measuring curvature of surface is _____.");
        possibleQuestion1.setAnswer2("Odometer");
        possibleQuestion1.setAnswer3("Tachometer");
        possibleQuestion1.setAnswer4("Speedometer");
        possibleQuestion1.setCorrectAnswer("Spherometer");
        question10.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("The smallest cells in the human body are ____.");
        possibleQuestion2.setAnswer2("Muscle cells");
        possibleQuestion2.setAnswer3("Nerve cells");
        possibleQuestion2.setAnswer4("Brain Stem cells");
        possibleQuestion2.setCorrectAnswer("Blood cells");
        question10.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("Stethoscope was invented by ____.");
        possibleQuestion3.setAnswer2("Dunlop");
        possibleQuestion3.setAnswer3("Bessemer");
        possibleQuestion3.setAnswer4("Auenbrugg");
        possibleQuestion3.setCorrectAnswer("Lainnec");
        question10.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Manga are a type of comics from what country?");
        possibleQuestion4.setAnswer2("Germany");
        possibleQuestion4.setAnswer3("China");
        possibleQuestion4.setAnswer4("Singapore");
        possibleQuestion4.setCorrectAnswer("Japan");
        question10.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("How many US Supreme Court justices are there?");
        possibleQuestion5.setAnswer2("2");
        possibleQuestion5.setAnswer3("12");
        possibleQuestion5.setAnswer4("8");
        possibleQuestion5.setCorrectAnswer("9");
        question10.add(possibleQuestion5);
        
    }
    
    public void setupQuestion11(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The largest gland in the human body is _____.");
        possibleQuestion1.setAnswer2("Adrenal");
        possibleQuestion1.setAnswer3("Pituitary");
        possibleQuestion1.setAnswer4("None of the above");
        possibleQuestion1.setCorrectAnswer("Liver");
        question11.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Aviation fuel for Jet aeroplanes consists of purified ____.");
        possibleQuestion2.setAnswer2("Petrol");
        possibleQuestion2.setAnswer3("Gasoline");
        possibleQuestion2.setAnswer4("Diesel");
        possibleQuestion2.setCorrectAnswer("Kerosene");
        question11.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("Mount Everest is located in ____.");
        possibleQuestion3.setAnswer2("India");
        possibleQuestion3.setAnswer3("Tibet");
        possibleQuestion3.setAnswer4("China");
        possibleQuestion3.setCorrectAnswer("Nepal");
        question11.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("What was the name of Seattle grundge band Nirvana's first album, released in 1989?");
        possibleQuestion4.setAnswer2("Beach");
        possibleQuestion4.setAnswer3("Sunrise");
        possibleQuestion4.setAnswer4("Midnight");
        possibleQuestion4.setCorrectAnswer("Bleach");
        question11.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("What is the colloquial term for a rotating tray often often placed on a table to aid in distributing food?");
        possibleQuestion5.setAnswer2("Lazy Megan");
        possibleQuestion5.setAnswer3("Lazy Lisa");
        possibleQuestion5.setAnswer4("Lazy Olivia");
        possibleQuestion5.setCorrectAnswer("Lazy Susan");
        question11.add(possibleQuestion5);
        
    }
    
    public void setupQuestion12(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The country without income tax is ____.");
        possibleQuestion1.setAnswer2("Nepal");
        possibleQuestion1.setAnswer3("Burma");
        possibleQuestion1.setAnswer4("Singapore");
        possibleQuestion1.setCorrectAnswer("Kuwait");
        question12.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Typhoid is a disease of ____.");
        possibleQuestion2.setAnswer2("Liver");
        possibleQuestion2.setAnswer3("Lungs");
        possibleQuestion2.setAnswer4("Stomach");
        possibleQuestion2.setCorrectAnswer("Intestine");
        question12.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("Who was the last professional hockey player to play without a helmet?");
        possibleQuestion3.setAnswer2("Patrick Kane");
        possibleQuestion3.setAnswer3("Jamie Benn");
        possibleQuestion3.setAnswer4("John Tavares");
        possibleQuestion3.setCorrectAnswer("Craig MacTavish");
        question12.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("In what country would you find Mount Kilimanjaro?");
        possibleQuestion4.setAnswer2("China");
        possibleQuestion4.setAnswer3("India");
        possibleQuestion4.setAnswer4("Singapore");
        possibleQuestion4.setCorrectAnswer("Tanzania");
        question12.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Which space craft set off for Jupiter in 1972?");
        possibleQuestion5.setAnswer2("Pioneer 7");
        possibleQuestion5.setAnswer3("Pioneer 8");
        possibleQuestion5.setAnswer4("Pioneer 9");
        possibleQuestion5.setCorrectAnswer("Pioneer 10");
        question12.add(possibleQuestion5);
        
    }
    
    public void setupQuestion13(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("Which one among the following radiations carries maximum energy?");
        possibleQuestion1.setAnswer2("Ultraviolet rays");
        possibleQuestion1.setAnswer3("X-rays");
        possibleQuestion1.setAnswer4("Infra red rays");
        possibleQuestion1.setCorrectAnswer("Gamma rays");
        question13.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("The largest part of the human brain is ____.");
        possibleQuestion2.setAnswer2("Cerebellum");
        possibleQuestion2.setAnswer3("Midbrain");
        possibleQuestion2.setAnswer4("Medulla Oblongata");
        possibleQuestion2.setCorrectAnswer("Cerebrum");
        question13.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("In which US state is John F Kennedy buried?");
        possibleQuestion3.setAnswer2("California");
        possibleQuestion3.setAnswer3("New York");
        possibleQuestion3.setAnswer4("Arkansas");
        possibleQuestion3.setCorrectAnswer("Virginia");
        question13.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Who directed the blockbusting movie Alien?");
        possibleQuestion4.setAnswer2("Michael Bay");
        possibleQuestion4.setAnswer3("Quentin Tarantino");
        possibleQuestion4.setAnswer4("Steven Spielberg");
        possibleQuestion4.setCorrectAnswer("Ridley Scott");
        question13.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Who was Theodore Roosevelt’s Vice President between 1905 and 1909?");
        possibleQuestion5.setAnswer2("Al Gore");
        possibleQuestion5.setAnswer3("Dick Cheney");
        possibleQuestion5.setAnswer4("Spiro Agnew");
        possibleQuestion5.setCorrectAnswer("Charles W. Fairbanks");
        question13.add(possibleQuestion5);
        
    }
    
    public void setupQuestion14(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The head quarters of world trade organisation is in ______.");
        possibleQuestion1.setAnswer2("montreal");
        possibleQuestion1.setAnswer3("seatle");
        possibleQuestion1.setAnswer4("the hague");
        possibleQuestion1.setCorrectAnswer("geneva");
        question14.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("Founder of Boys Scout and Civil Guide was ____.");
        possibleQuestion2.setAnswer2("Charles Andrews");
        possibleQuestion2.setAnswer3("Robert Montgomery");
        possibleQuestion2.setAnswer4("Richard Temple");
        possibleQuestion2.setCorrectAnswer("Baden Powell");
        question14.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("The largest volcano ever discovered in our solar system is located on which planet?");
        possibleQuestion3.setAnswer2("Earth");
        possibleQuestion3.setAnswer3("Venus");
        possibleQuestion3.setAnswer4("Mercury");
        possibleQuestion3.setCorrectAnswer("Mars");
        question14.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("Who directed Back To The Future?");
        possibleQuestion4.setAnswer2("Steven Spielberg");
        possibleQuestion4.setAnswer3("Michael Bay");
        possibleQuestion4.setAnswer4("Quentin Tarantino");
        possibleQuestion4.setCorrectAnswer("Robert Zemeckis");
        question14.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("Rudolf the red nosed reindeer was invented in a comic for who?");
        possibleQuestion5.setAnswer2("Sears");
        possibleQuestion5.setAnswer3("Marvel Comics");
        possibleQuestion5.setAnswer4("Walmart");
        possibleQuestion5.setCorrectAnswer("Montgomery Ward");
        question14.add(possibleQuestion5);
        
    }
    
    public void setupQuestion15(){
        
        // First question
        Questions possibleQuestion1 = new Questions();
        possibleQuestion1.setQuestion("The highest waterfall of the world is ____.");
        possibleQuestion1.setAnswer2("Jog Falls");
        possibleQuestion1.setAnswer3("Ribbon");
        possibleQuestion1.setAnswer4("Gavarine");
        possibleQuestion1.setCorrectAnswer("Angel");
        question15.add(possibleQuestion1);
        
        // Second Question
        Questions possibleQuestion2 = new Questions();
        possibleQuestion2.setQuestion("What company’s first product was an audio oscillator?");
        possibleQuestion2.setAnswer2("Microsoft");
        possibleQuestion2.setAnswer3("Google");
        possibleQuestion2.setAnswer4("General Electric");
        possibleQuestion2.setCorrectAnswer("Hewlett Packard");
        question15.add(possibleQuestion2);
        
        // Third Question
        Questions possibleQuestion3 = new Questions();
        possibleQuestion3.setQuestion("In the U.S., what was the first TV test symbol?");
        possibleQuestion3.setAnswer2("#");
        possibleQuestion3.setAnswer3("&");
        possibleQuestion3.setAnswer4("@");
        possibleQuestion3.setCorrectAnswer("$");
        question15.add(possibleQuestion3);
        
        // Fourth question
        Questions possibleQuestion4 = new Questions();
        possibleQuestion4.setQuestion("What was Elvis’s last No 1 in his own lifetime?");
        possibleQuestion4.setAnswer2("Happy Days");
        possibleQuestion4.setAnswer3("Lazy Minds");
        possibleQuestion4.setAnswer4("Not Suspicious Minds");
        possibleQuestion4.setCorrectAnswer("Suspicious Minds");
        question15.add(possibleQuestion4);
        
        // Fifth question
        Questions possibleQuestion5 = new Questions();
        possibleQuestion5.setQuestion("What was the most common name given to girls in, 1995, in the U.S.?");
        possibleQuestion5.setAnswer2("Lisa");
        possibleQuestion5.setAnswer3("Becky");
        possibleQuestion5.setAnswer4("Lindsey");
        possibleQuestion5.setCorrectAnswer("Ashley");
        question15.add(possibleQuestion5);
        
    }
    // End of setting up possible questions and answers
    
    // Select questions and answers
    public ArrayList<Questions> selectingTheQuestions(){
        
        Questions pickingQuestion1 = new Questions();
        Questions pickingQuestion2 = new Questions();
        Questions pickingQuestion3 = new Questions();
        Questions pickingQuestion4 = new Questions();
        Questions pickingQuestion5 = new Questions();
        Questions pickingQuestion6 = new Questions();
        Questions pickingQuestion7 = new Questions();
        Questions pickingQuestion8 = new Questions();
        Questions pickingQuestion9 = new Questions();
        Questions pickingQuestion10 = new Questions();
        Questions pickingQuestion11 = new Questions();
        Questions pickingQuestion12 = new Questions();
        Questions pickingQuestion13 = new Questions();
        Questions pickingQuestion14 = new Questions();
        Questions pickingQuestion15 = new Questions();
        
        // Randomly select each question and the answers that go along with it.
        int question1Index = rand.nextInt(5);
        int question2Index = rand.nextInt(5);
        int question3Index = rand.nextInt(5);
        int question4Index = rand.nextInt(5);
        int question5Index = rand.nextInt(5);
        int question6Index = rand.nextInt(5);
        int question7Index = rand.nextInt(5);
        int question8Index = rand.nextInt(5);
        int question9Index = rand.nextInt(5);
        int question10Index = rand.nextInt(5);
        int question11Index = rand.nextInt(5);
        int question12Index = rand.nextInt(5);
        int question13Index = rand.nextInt(5);
        int question14Index = rand.nextInt(5);
        int question15Index = rand.nextInt(5);
        
        // Selecting Question 1
        pickingQuestion1.setQuestion(question1.get(question1Index).getQuestion());
        pickingQuestion1.setAnswer2(question1.get(question1Index).getAnswer2());
        pickingQuestion1.setAnswer3(question1.get(question1Index).getAnswer3());
        pickingQuestion1.setAnswer4(question1.get(question1Index).getAnswer4());
        pickingQuestion1.setCorrectAnswer(question1.get(question1Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion1);
        
        // Selecting Question 2
        pickingQuestion2.setQuestion(question2.get(question2Index).getQuestion());
        pickingQuestion2.setAnswer2(question2.get(question2Index).getAnswer2());
        pickingQuestion2.setAnswer3(question2.get(question2Index).getAnswer3());
        pickingQuestion2.setAnswer4(question2.get(question2Index).getAnswer4());
        pickingQuestion2.setCorrectAnswer(question2.get(question2Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion2);
        
        // Selecting Question 3
        pickingQuestion3.setQuestion(question3.get(question3Index).getQuestion());
        pickingQuestion3.setAnswer2(question3.get(question3Index).getAnswer2());
        pickingQuestion3.setAnswer3(question3.get(question3Index).getAnswer3());
        pickingQuestion3.setAnswer4(question3.get(question3Index).getAnswer4());
        pickingQuestion3.setCorrectAnswer(question3.get(question3Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion3);
        
        // Selecting Question 4
        pickingQuestion4.setQuestion(question4.get(question4Index).getQuestion());
        pickingQuestion4.setAnswer2(question4.get(question4Index).getAnswer2());
        pickingQuestion4.setAnswer3(question4.get(question4Index).getAnswer3());
        pickingQuestion4.setAnswer4(question4.get(question4Index).getAnswer4());
        pickingQuestion4.setCorrectAnswer(question4.get(question4Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion4);
        
        // Selecting Question 5
        pickingQuestion5.setQuestion(question5.get(question5Index).getQuestion());
        pickingQuestion5.setAnswer2(question5.get(question5Index).getAnswer2());
        pickingQuestion5.setAnswer3(question5.get(question5Index).getAnswer3());
        pickingQuestion5.setAnswer4(question5.get(question5Index).getAnswer4());
        pickingQuestion5.setCorrectAnswer(question5.get(question5Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion5);
        
        // Selecting Question 6
        pickingQuestion6.setQuestion(question6.get(question6Index).getQuestion());
        pickingQuestion6.setAnswer2(question6.get(question6Index).getAnswer2());
        pickingQuestion6.setAnswer3(question6.get(question6Index).getAnswer3());
        pickingQuestion6.setAnswer4(question6.get(question6Index).getAnswer4());
        pickingQuestion6.setCorrectAnswer(question6.get(question6Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion6);
        
        // Selecting Question 7
        pickingQuestion7.setQuestion(question7.get(question7Index).getQuestion());
        pickingQuestion7.setAnswer2(question7.get(question7Index).getAnswer2());
        pickingQuestion7.setAnswer3(question7.get(question7Index).getAnswer3());
        pickingQuestion7.setAnswer4(question7.get(question7Index).getAnswer4());
        pickingQuestion7.setCorrectAnswer(question7.get(question7Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion7);
        
        // Selecting Question 8
        pickingQuestion8.setQuestion(question8.get(question8Index).getQuestion());
        pickingQuestion8.setAnswer2(question8.get(question8Index).getAnswer2());
        pickingQuestion8.setAnswer3(question8.get(question8Index).getAnswer3());
        pickingQuestion8.setAnswer4(question8.get(question8Index).getAnswer4());
        pickingQuestion8.setCorrectAnswer(question8.get(question8Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion8);
        
        // Selecting Question 9
        pickingQuestion9.setQuestion(question9.get(question9Index).getQuestion());
        pickingQuestion9.setAnswer2(question9.get(question9Index).getAnswer2());
        pickingQuestion9.setAnswer3(question9.get(question9Index).getAnswer3());
        pickingQuestion9.setAnswer4(question9.get(question9Index).getAnswer4());
        pickingQuestion9.setCorrectAnswer(question9.get(question9Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion9);
        
        // Selecting Question 10
        pickingQuestion10.setQuestion(question10.get(question10Index).getQuestion());
        pickingQuestion10.setAnswer2(question10.get(question10Index).getAnswer2());
        pickingQuestion10.setAnswer3(question10.get(question10Index).getAnswer3());
        pickingQuestion10.setAnswer4(question10.get(question10Index).getAnswer4());
        pickingQuestion10.setCorrectAnswer(question10.get(question10Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion10);
        
        // Selecting Question 11
        pickingQuestion11.setQuestion(question11.get(question11Index).getQuestion());
        pickingQuestion11.setAnswer2(question11.get(question11Index).getAnswer2());
        pickingQuestion11.setAnswer3(question11.get(question11Index).getAnswer3());
        pickingQuestion11.setAnswer4(question11.get(question11Index).getAnswer4());
        pickingQuestion11.setCorrectAnswer(question11.get(question11Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion11);
        
        // Selecting Question 12
        pickingQuestion12.setQuestion(question12.get(question12Index).getQuestion());
        pickingQuestion12.setAnswer2(question12.get(question12Index).getAnswer2());
        pickingQuestion12.setAnswer3(question12.get(question12Index).getAnswer3());
        pickingQuestion12.setAnswer4(question12.get(question12Index).getAnswer4());
        pickingQuestion12.setCorrectAnswer(question12.get(question12Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion12);
        
        // Selecting Question 13
        pickingQuestion13.setQuestion(question13.get(question13Index).getQuestion());
        pickingQuestion13.setAnswer2(question13.get(question13Index).getAnswer2());
        pickingQuestion13.setAnswer3(question13.get(question13Index).getAnswer3());
        pickingQuestion13.setAnswer4(question13.get(question13Index).getAnswer4());
        pickingQuestion13.setCorrectAnswer(question13.get(question13Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion13);
        
        // Selecting Question 14
        pickingQuestion14.setQuestion(question14.get(question14Index).getQuestion());
        pickingQuestion14.setAnswer2(question14.get(question14Index).getAnswer2());
        pickingQuestion14.setAnswer3(question14.get(question14Index).getAnswer3());
        pickingQuestion14.setAnswer4(question14.get(question14Index).getAnswer4());
        pickingQuestion14.setCorrectAnswer(question14.get(question14Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion14);
        
        // Selecting Question 15
        pickingQuestion15.setQuestion(question15.get(question15Index).getQuestion());
        pickingQuestion15.setAnswer2(question15.get(question15Index).getAnswer2());
        pickingQuestion15.setAnswer3(question15.get(question15Index).getAnswer3());
        pickingQuestion15.setAnswer4(question15.get(question15Index).getAnswer4());
        pickingQuestion15.setCorrectAnswer(question15.get(question15Index).getCorrectAnswer());
        questionsPicked.add(pickingQuestion15);
        
        return questionsPicked;
        
    }
    
}
