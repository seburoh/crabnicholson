/*
@author seburoh
 */

import java.io.File;
import java.util.Scanner;

public class Main {

    public static String[] playerStatus = new String[5]; // tokens of user input [0room, 1action, 2object, 3useobect]

    //create room objects
    public static Room bedroom = new Room("hall lair","bed nightstand rubberbands dresser poster");
    public static Room hall = new Room("bedroom livingroom office","vase cat popcorn");
    public static Room office = new Room("hall","desk computer dvd");
    public static Room livingroom = new Room("hall kitchen","tv dvdplayer sofa cdplayer");
    public static Room kitchen = new Room("livingroom","microwave toast fridge");
    public static Room lair = new Room("bedroom","secret");

    //default file path
    public static String absPath = "file:///F:/programming-projects/CS141/final-cs1-seburoh/files/";

    // key items: 0rubberbands, 1popcorn, 2dvd, 3catfed, 4popcornmade, 5wingame ,6sacklunch
    public static boolean[] keyItems = new boolean[7];
    public static boolean doorOpen = false; //is secret open
    public static boolean winCondition = false; //can we call crab nicholson

    //enumerated list of actions
    enum Actions {
        move, take, use, look
    }


    public static void main(String[] args) {

        //Check if given valid argument for absolute path to files
        if (args.length > 0){
            try{
                absPath = args[0];
                File test = new File(absPath + "1crab.mp3");
                if(!test.exists()){
                    throw new IllegalArgumentException();
                }
            }
            catch (Exception e){
                //do nothing
            }
        }


        // initialize vars
        String rawInput; // raw user input
        boolean quit = false; // logic check for main loop
        playerStatus[0] = "outside"; // set default start location
        Scanner console = new Scanner(System.in); //input method
        String playerName = ""; //set default player name
        roomSetup(); //additional setup for room objects


        //menu

        Browser.launch(absPath + "1crab.mp3"); //start music

        Clear.clearScreen(); // clear screen for menu
        System.out.println("""
                                   ___.            .__       .__           .__                      \s
                  ________________ \\_ |__     ____ |__| ____ |  |__   ____ |  |   __________   ____ \s
                _/ ___\\_  __ \\__  \\ | __ \\   /    \\|  |/ ___\\|  |  \\ /  _ \\|  |  /  ___/  _ \\ /    \\\s
                \\  \\___|  | \\// __ \\| \\_\\ \\ |   |  \\  \\  \\___|   Y  (  <_> )  |__\\___ (  <_> )   |  \\
                 \\___  >__|  (____  /___  / |___|  /__|\\___  >___|  /\\____/|____/____  >____/|___|  /
                     \\/           \\/    \\/       \\/        \\/     \\/                 \\/           \\/\s
                                               __                                                   \s
                                ____ ___  ____/  |________   ____   _____   ____                    \s
                              _/ __ \\\\  \\/  /\\   __\\_  __ \\_/ __ \\ /     \\_/ __ \\                   \s
                              \\  ___/ >    <  |  |  |  | \\/\\  ___/|  Y Y  \\  ___/                   \s
                               \\___  >__/\\_ \\ |__|  |__|    \\___  >__|_|  /\\___  >                  \s
                                   \\/      \\/                   \\/      \\/     \\/                   \s
                                   .__                                                              \s
                              _____|  |   ____   ____ ______   _______  __ ___________              \s
                             /  ___/  | _/ __ \\_/ __ \\\\____ \\ /  _ \\  \\/ // __ \\_  __ \\             \s
                             \\___ \\|  |_\\  ___/\\  ___/|  |_> >  <_> )   /\\  ___/|  | \\/             \s
                            /____  >____/\\___  >\\___  >   __/ \\____/ \\_/  \\___  >__|                \s
                                 \\/          \\/     \\/|__|                    \\/   \s
                                              ~~text adventure~~
                                              WITH CRAB NICHOLSON
                                  FEATURING: CRAB NICHOLSON AS CRAB NICHOLSON
                                THIS MESSAGE WILL SELF DESTRUCT IN FIVE SECONDS
                """);
        Clear.sleep(5);
        int menuCounter = 0; //for tracking bad answers
        Clear.clearScreen();



        //menu 1: acknowledge you want to have a good time
        while (!quit){

            System.out.println("""
                CRAB NICHOLSON has invited you over to his rad bachelor pad to enjoy some snacks
                and watch a video together! Are you prepared to party?
                
                [yes/no/help]
                """);
            rawInput = console.nextLine().toLowerCase(); //take input
            if (rawInput.equals("yes")){ //lets party
                quit = true;
            }
            if (rawInput.equals("no")){ //go home, or not
                rollCredits();
                Clear.clearScreen();
                Clear.sleep(5);
                System.out.print("Haha");
                Clear.sleep(1);
                System.out.print(", just kidding. ");
                Clear.sleep(1);
                System.out.print("This isn't FarCry, there is no escape from CRAB NICHOLSON.\n");
            }
            if (rawInput.equals("help")){ //call customer service
                System.out.println("For customer service visit www.nintendo.com");
            }
            if (!rawInput.equals("yes") && !rawInput.equals("no") && !rawInput.equals("help")){ //bad answer
                System.out.println("Now now, don't make me choose for you");
                menuCounter++;
            }
            if (menuCounter > 2){ //to many bad answer
                Clear.clearScreen();
                System.out.println("That's it, from now on, your name is Cookie Wookiee.");
                System.out.println("I hope you're proud of yourself.");
                playerName = "Cookie Wookiee";
                quit = true;
                Clear.sleep(3);
            }
        }
        Clear.clearScreen();
        quit = false;

        //choose name
        System.out.println("What is your name?");
        while (playerName.equals("")){
            System.out.print("\nName: ");
            playerName = console.nextLine();
        }

        //deal with cookie name
        if (playerName.equals("Cookie Wookiee")){
            System.out.print("\nName: ");

            for (int i = 0; i < 3; i++) { //print Coo
                Clear.sleep(1);
                System.out.print(playerName.charAt(i));
            }
            System.out.print("ok"); //ok
            Clear.sleep(1);
            for (int i = 0; i < 2; i++) { //delete ok
                Clear.clearLine(1);
                Clear.sleep(1);

            }
            for (int i = 3; i < playerName.length(); i++) { //kie Wookiee
                System.out.print(playerName.charAt(i));
                Clear.sleep(1);
            }
            System.out.print("\n");
            Clear.sleep(3);
        }



        // get to house
        Clear.clearScreen();
        System.out.print("""
                Your mom drives you up to CRAB NICHOLSON'S house and gives you a sacklunch and a kiss on the cheek.
                
                "Now don't you boys get into too much trouble!" she says with a smile.
                """);
        System.out.println("I don't want to see a headline tomorrow featuring Crab Nicholson and " + playerName +
                "\nfound committing a horrible crime, like using Java to crash your professor's network again!");

        keyItems[6] = true;
        Clear.sleep(10);

        System.out.println("""

                Oh and don't forget, we live in a video game made for a school project!
                So if you want to do any ACTION with a NOUN, you better think it through as just those two words!""");

        Clear.sleep(10);

        Clear.clearScreen();

        //moat problem
        boolean running = false; //checker for if player is running properly
        while (!quit) {
            //run
            System.out.println("You see CRAB NICHOLSON'S house is surrounded by a MOAT. Maybe if you RAN at it\n" +
                    "before trying to JUMP across you could make it?");
            parseInput(console.nextLine().toLowerCase());
            Clear.clearScreen();
            if (playerStatus[1].equals("run") && playerStatus[2].equals("moat")){ //good input?
                System.out.println("You begin running at the moat, unless you're Jesus, probably time to jump soon.");
                running = true;
            }
            else{ //bad input
                System.out.println("Nah that won't work Lt Dan, gotta use those legs of yours.");
            }
            //Clear.clearScreen();
            //jump
            if (running){
                if (playerName.equalsIgnoreCase("jesus")){ //lucky name choice
                    System.out.println("You make it across the moat, gracefully striding across the water! Rad move Jesus!");
                    quit = true;
                }
                else{
                    parseInput(console.nextLine());
                    if (playerStatus[1].equals("jump") && playerStatus[2].equals("moat")){ //good input?
                        System.out.println("You leap across and faceplant into the dirt, but you make it!");
                        quit = true;
                    }
                    else{ //bad input
                        System.out.println("You land in the water, barely making it back. If only you knew\n" +
                                "how to swim.");
                        running = false;
                    }
                }
            }


        }

        Clear.sleep(6);
        Clear.clearScreen();
        quit = false;



        //door problem
        while(!quit) {
            System.out.println("Well that's just great, the door is on fire. There's a SIGN on the wall near it\n" +
                    "which is probably worth LOOKing at.");
            parseInput(console.nextLine());
            Clear.clearScreen();
            if (playerStatus[1].equals("look") && playerStatus[2].equals("sign")){ //good input?
                System.out.println("Yo dude, the fire's just an art project in progress. Find a window ok?");
                quit = true;
            }
            else{ //bad input
                System.out.println("The door is definitely on fire. Hopefully the sign helps.");
            }
        }

        quit = false;
        Clear.sleep(6);
        Clear.clearScreen();



        //bedroom window
        while(!quit){
            System.out.println("The bedroom window seems unlocked, bet we could CLIMB through it.");
            parseInput(console.nextLine());
            if (playerStatus[1].equals("climb") && playerStatus[2].equals("window")){ //good input?
                quit = true;
                System.out.println("Climbing through the window is difficult, but you make it!\n");
            }
            else{ //bad input
                System.out.println("Man this looked way easier on TV.");
            }
        }



        quit = false;
        System.out.println("Better get our bearings for exactly two seconds");
        Clear.sleep(2);

        Browser.launch(absPath + "7mission.mp3"); //start music

        //surprise text
        System.out.println("YOU ARE IN THE BEDROOM.");
        Clear.sleep(1);
        System.out.println("YOU SEE CRAB NICHOLSON.");
        Clear.sleep(1);
        System.out.println("HE HAS NO MITTENS.");
        Clear.sleep(1);
        System.out.println("HIS CLAWS ARE MENACING.");
        Clear.sleep(1);
        System.out.println("ESCAPE IS FUTILE AND UNDESIRABLE.");
        Clear.sleep(1);
        System.out.println("IT'S TIME FOR A WORLD OF MYSTERY AND FUN WITH CRAB NICHOLSON!");
        Clear.sleep(8);

        Clear.clearScreen();

        System.out.println("""
                Welcome my dude, I'm going to go make some toast with English Toasting Bread, if
                you could do me a solid and make the popcorn, and ready the DVD? I don't remember where I put it.
                """);
        Clear.sleep(3);

        playerStatus[0] = "bedroom"; //set new location


        //main loop
        while(!quit){

            //print location information
            System.out.println("\nACTIONS: move PLACE, look OBJECT, take OBJECT, use OBJECT on OBJECT\n" +
                    "LOCATION: " + playerStatus[0]);
            System.out.println(getInven() + "\n");
            System.out.println(roomDesc() + "\n");
            System.out.print("What do: ");

            rawInput = console.nextLine(); //take line of input
            parseInput(rawInput);
            Clear.clearScreen();

            /*//move
            if (playerStatus[1].equals("move")){
                attemptMove();
                badInput = false;
            }

            //look
            if (playerStatus[1].equals("look")){
                attemptLook();
                badInput = false;
            }

            //take
            if (playerStatus[1].equals("take")){
                attemptTake();
                badInput = false;
            }

            //use
            if (playerStatus[1].equals("use")){
                attemptUse();
                badInput = false;
            }*/

            //are we clear to win?
            if (rawInput.equalsIgnoreCase("call crab nicholson") && winCondition){
                quit = true;
            }

            //do a valid action
            switch (playerStatus[1]){
                case "move" -> attemptMove();
                case "look" -> attemptLook();
                case "take" -> attemptTake();
                case "use" -> attemptUse();
            }

            //we didn't receive a valid action
            if (!checkAction(playerStatus[1]) && !quit){
                System.out.println("That's not a valid action!");
            }
        }




        //winrar is you!
        System.out.println("Thanks for finding the popcorn, dvd, and feeding the cat " + playerName + "!\n" +
                "Are you ready to watch the show?");
        Clear.sleep(5);
        Browser.launch("https://www.youtube.com/watch?v=bS5P_LAqiVg"); //start music
        Clear.sleep(1860); //wait 31 minutes
        rollCredits();

    }
    /* 0location / 1action / 2target / 3usetarget
    key items: 0rubberbands, 1popcorn, 2dvd, 3catfed, 4popcornmade, 5wingame, 6sacklunch*/

    /*
    is action valid?
     */
    public static boolean checkAction(String str){
        Actions[] allActions = Actions.values();
        for (Actions act : allActions){
            if (act.toString().equals(str)){
                return true;
            }
        }
        return false;
    }

    /*
    use action
     */
    public static void attemptUse(){
        String thing = playerStatus[2];
        String target = playerStatus[3];

        if (playerStatus[0].equals("bedroom") && keyItems[0]){ //what room and flag are we looking at
            if (bedroom.isItem(target)){ //does object exist for us to interact with
                System.out.println(Items.itemUse(thing,target)); //print interaction
                if (thing.equals("rubberbands") && target.equals("poster")){
                    Browser.launch(absPath + "4secret.mp3"); //start music
                    doorOpen = true; //door flag
                    keyItems[0] = false;
                }
                return;
            }
        }

        if (playerStatus[0].equals("hall") && keyItems[4]){
            if (hall.isItem(target)) {
                System.out.println(Items.itemUse(thing, target));
                if (thing.equals("popcorn") && target.equals("cat")) {
                    keyItems[3] = true; //cat flag
                }
                return;
            }
        }

        if (playerStatus[0].equals("office") && keyItems[6]){
            if (office.isItem(target)) {
                System.out.println(Items.itemUse(thing, target));
                if (thing.equals("sacklunch") && target.equals("desk")) {
                    keyItems[6] = false; //sack lunch flag
                }
                return;
            }
        }

        if (playerStatus[0].equals("kitchen") && keyItems[1]){
            if (kitchen.isItem(target)) {
                System.out.println(Items.itemUse(thing, target));
                if (thing.equals("popcorn") && target.equals("microwave")) {
                    keyItems[4] = true; //popcornmade flag
                    keyItems[1] = false;
                }
                return;
            }
        }

        if (playerStatus[0].equals("livingroom") && keyItems[4] && keyItems[3] && keyItems[2]){
            if (livingroom.isItem(target)) {
                if (thing.equals("dvd") && target.equals("dvdplayer")) {
                    winCondition = true; //win flag
                    System.out.println(Items.itemUse(thing, target));
                }
                return;
            }
        }

        if (playerStatus[0].equals("livingroom") && keyItems[2]){
            if (livingroom.isItem(target)) {
                if (thing.equals("dvd") && target.equals("cdplayer")) {
                    System.out.println(Items.itemUse(thing, target));
                    Browser.launch(absPath + "3lahee.ogg"); //start music
                }
                if (thing.equals("dvd") && target.equals("dvdplayer")) {
                    System.out.println("You have the DVD, but have you got the popcorn and ensured your safety yet?");
                }
                return;
            }
        }

        //we didn't print anything yet, garbage in garbage out
        System.out.println(Items.itemUse("RAEJDUK","RAEJDUK"));
    }

    /*
    take action
     */
    public static void attemptTake(){
        if (playerStatus[0].equals("bedroom")){ //what room are we in
            if (bedroom.isItem(playerStatus[2])){ //is given string a valid item?
                System.out.println(Items.itemTake(playerStatus[2])); //print take text
                if (playerStatus[2].equals("rubberbands")){
                    bedroom.delItem("rubberbands"); //remove rubberbands from dresser
                    keyItems[0] = true; //set that we have rubberbands
                }
            }
            else{ //not a valid item
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("hall")){
            if (hall.isItem(playerStatus[2])){
                System.out.println(Items.itemTake(playerStatus[2]));
                if (playerStatus[2].equals("popcorn")){
                    hall.delItem("popcorn");
                    keyItems[1] = true;
                }
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("office")){
            if (office.isItem(playerStatus[2])){
                System.out.println(Items.itemTake(playerStatus[2]));
                if (playerStatus[2].equals("dvd")) {
                    office.delItem("dvd");
                    keyItems[2] = true;
                }
                if (playerStatus[2].equals("computer")){
                    Browser.launch(absPath + "5soken.mp3"); //start music
                }
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("livingroom")){
            if (livingroom.isItem(playerStatus[2])){
                System.out.println(Items.itemTake(playerStatus[2]));
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("kitchen")){
            if (kitchen.isItem(playerStatus[2])){
                System.out.println(Items.itemTake(playerStatus[2]));
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("lair")){
            if (lair.isItem(playerStatus[2])){
                System.out.println(Items.itemTake(playerStatus[2]));
                winCondition = true;
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
    }

    /*
    look action
     */
    public static void attemptLook(){
        if (playerStatus[0].equals("bedroom")){ //what room are we in
            if (bedroom.isItem(playerStatus[2])){ //is given string a valid item?
                System.out.println(Items.itemLook(playerStatus[2])); //print item description
            }
            else{ //not a valid item
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("hall")){
            if (hall.isItem(playerStatus[2])){
                System.out.println(Items.itemLook(playerStatus[2]));
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("office")){
            if (office.isItem(playerStatus[2])){
                System.out.println(Items.itemLook(playerStatus[2]));
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("livingroom")){
            if (livingroom.isItem(playerStatus[2])){
                System.out.println(Items.itemLook(playerStatus[2]));
                if (playerStatus[2].equals("tv")){
                    Browser.launch(absPath + "2persona.mp3"); //start music
                }
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("kitchen")){
            if (kitchen.isItem(playerStatus[2])){
                System.out.println(Items.itemLook(playerStatus[2]));
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
        if (playerStatus[0].equals("lair")){
            if (lair.isItem(playerStatus[2])){
                System.out.println(Items.itemLook(playerStatus[2]));
                Browser.launch("https://www.youtube.com/watch?v=zTTtd6bnhFs"); //start music
            }
            else{
                System.out.println("That's not a valid item!");
            }
        }
    }

    /*
    move action
     */
    public static void attemptMove(){
        if (playerStatus[0].equals("bedroom")){ //what room are we in
            if (bedroom.isExit(playerStatus[2])){ //is given string a valid exit?
                if (playerStatus[2].equals("lair") && doorOpen){ //check secret door
                    playerStatus[0] = playerStatus[2]; //move us there
                }
                if (playerStatus[2].equals("lair") && !doorOpen){
                    System.out.println("Hmmmm...seems like this is a hint brought about by weird code...");
                }
                if (playerStatus[2].equals("hall")){
                    playerStatus[0] = playerStatus[2];
                }
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("hall")){
            if (hall.isExit(playerStatus[2])){ //is given string a valid exit?
                playerStatus[0] = playerStatus[2]; //move us there
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("office")){
            if (office.isExit(playerStatus[2])){ //is given string a valid exit?
                playerStatus[0] = playerStatus[2]; //move us there
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("livingroom")){
            if (livingroom.isExit(playerStatus[2])){ //is given string a valid exit?
                playerStatus[0] = playerStatus[2]; //move us there
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("kitchen")){
            if (kitchen.isExit(playerStatus[2])){ //is given string a valid exit?
                playerStatus[0] = playerStatus[2]; //move us there
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("lair")){
            if (lair.isExit(playerStatus[2])){ //is given string a valid exit?
                playerStatus[0] = playerStatus[2]; //move us there
                return;
            }
            else{ //not a valid exit
                System.out.println("That's not a valid exit!");
            }
        }
        if (playerStatus[0].equals("narnia")){
            System.out.println("GPS Malfunction.");
        }
    }

    /*
    room descriptions
     */
    public static String roomDesc(){

        /*if (playerStatus[0].equals("bedroom")){
            return bedroom.getDesc();
        }
        if (playerStatus[0].equals("hall")){
            return hall.getDesc();
        }
        if (playerStatus[0].equals("office")){
            return office.getDesc();
        }
        if (playerStatus[0].equals("livingroom")){
            return livingroom.getDesc();
        }
        if (playerStatus[0].equals("kitchen")){
            return kitchen.getDesc();
        }
        if (playerStatus[0].equals("lair")){
            return lair.getDesc();
        }*/

        return switch(playerStatus[0]){
            case "bedroom" -> bedroom.getDesc();
            case "hall" -> hall.getDesc();
            case "office" -> office.getDesc();
            case "livingroom" -> livingroom.getDesc();
            case "kitchen" -> kitchen.getDesc();
            case "lair" -> lair.getDesc();
            default -> "we're in narnia captain";
        };
    }

    /*
    prints current inventory
    key items: 0rubberbands, 1popcorn, 2dvd, 3catfed, 4popcornmade, 5wingame, 6sacklunch
     */
    public static String getInven(){

        StringBuilder str = new StringBuilder();

        str.append("Items: ");

        for (int i = 0; i < keyItems.length; i++) {
            if (keyItems[i]){
                switch (i){
                    case 0 -> str.append("rubberbands,");
                    case 1 -> str.append("popcorn,");
                    case 2 -> str.append("dvd,");
                    case 4 -> str.append("popcorn,");
                    case 6 -> str.append("sacklunch,");
                }
            }
        }

        str.deleteCharAt(str.length()-1);

        return str.toString();
    }

    /*
    additional setup for room objects
     */
    public static void roomSetup(){
        bedroom.setDesc("A nice looking bedroom complete with aquatic themed wallpaper, you\n" +
                "see a"); // + bedroom.itemsToString()
        hall.setDesc("A plain looking hall, it's rather narrow you wonder how CRAB NICHOLSON even gets\n" +
                "through it. You see a");
        office.setDesc("The lights seem dimmer here, CRAB NICHOLSON is probably going for that instagram\n" +
                "'gamer' look, there's RGB everywhere. The RGB lights illuminate a");
        livingroom.setDesc("Now *this* is a living room. All of this expensive stuff! Stuff like a");
        kitchen.setDesc("""
                CRAB NICHOLSON is busy working away at making toast with English Toasting Bread, you
                see there's space a plenty if you need to use the appliances too. You see
                a""");
        lair.setDesc("404:");
    }

    /*
    parse inputs given
     */
    public static void parseInput(String input){

        if (input == null){
            return;
        }

        //break input into chunks [action, object, "", target]
        String[] output = input.split("\\s+");

        //clear previous action
        playerStatus[1] = "";
        playerStatus[2] = "";
        playerStatus[3] = "";

        //store action and target
        if (output.length > 0){
            playerStatus[1] = output[0].toLowerCase();
        }
        if (output.length > 1)
        {
            playerStatus[2] = output[1].toLowerCase();
        }

        //if use, store additional target
        if (output.length > 3){
            if (playerStatus[1].equals("use") && output[2].equals("on")){
                playerStatus[3] = output[3].toLowerCase();
            }
        }

        //did we win?
        /*if (input.equalsIgnoreCase("call crab nicholson")){
            winCondition = true;
        }*/
    }

    /*
    Credits roll in it's own method for easy calling
     */
    public static void rollCredits(){
        Browser.launch(absPath + "6credit.flac"); //start music
        Clear.clearScreen();
        Clear.sleep(2);
        System.out.println("Created by seb\n");
        Clear.sleep(2);
        System.out.println("Original Theme Song by LAPFOX\n");
        Clear.sleep(2);
        System.out.println("Cover art by anonymous person\n");
        Clear.sleep(2);
        System.out.println("Emf02_Edit#070705 by Shiro Sagisu\n");
        Clear.sleep(2);
        System.out.println("LAHEE by Masayoshi Soken\n");
        Clear.sleep(2);
        System.out.println("Dance Hymn of the Soul (Disco In Velvet Room) by Ryouta Kozuka and Shoji Meguro\n");
        Clear.sleep(2);
        System.out.println("Zelda Secret Opening Sound Effect by Koji Kondo\n");
        Clear.sleep(2);
        System.out.println("Welcome Back Soken by Husky the Geek\n");
        Clear.sleep(2);
        System.out.println("Mission Complete by Jake Kaufman\n");
        Clear.sleep(2);
        System.out.println("Dedicated to Neko, the best cat to ever cat\n");
        Clear.sleep(2);
        System.out.println("This production brought to you by the power of Java\n");
        Clear.sleep(2);
        System.out.println("(both kinds of Java)\n");
        Clear.sleep(2);
        System.out.println("Thank you Professor!\n");
        Clear.sleep(2);
        System.out.println("Thank you all for playing/watching!\n");
        Clear.sleep(4);
    }

}