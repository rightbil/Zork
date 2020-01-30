package com.company;

import java.util.*;

public class Main {

    public static final String ANSI_CLS = "\u001b[2J";
    public static final String ANSI_HOME = "\u001b[H";
    public static StringBuilder roomContents = new StringBuilder(" room.\nContents in this castle room : ");
    public static String introPhrase = "Now,you are in the ";
    public static Set<String> nextRooms = new LinkedHashSet<>(); // Order is important
    public static Map<String, Set<String>> rooms = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public static String d = null;
    public static String quit = "C";
    public static Set<String> visitedRooms = new LinkedHashSet<>();
    public static String visitorName;
    public static Date vistitDate;
    public static Map<String, Double> rating = new HashMap<>();
    public static boolean isSecretRoomVisited = false;
    public static void Print(Object msgToUser) {
        System.out.println(msgToUser);

        final int roomNumber = 1;
        final int currentRoomNumber;

    }

    //TODO: Foyer #1
    public static void Foyer() {
        Print(introPhrase + "Foyer" + roomContents + " dead scorpion");
        Print(PossibleDirections("Foyer"));
        addToVisitedRoom("Foyer");
        while (!quit.equalsIgnoreCase("Q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;
            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "N":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Foyer", sc.nextDouble());
                        FrontRoom();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        Foyer();

                }// end of switch
            }
        }// end of while loop

    }

    //TODO: FrontRoom #2
    public static void FrontRoom() {
        Print(introPhrase + "Front" + roomContents + " dead scorpion");
        Print(PossibleDirections("Front"));
        addToVisitedRoom("Front Room");
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "S":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Front", sc.nextDouble());
                        Foyer();
                        quit = "Q";
                        break;
                    case "E":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Front", sc.nextDouble());
                        Kitchen();
                        quit = "Q";
                        break;
                    case "W":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Front", sc.nextDouble());
                        Library();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        FrontRoom();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: Library #3
    public static void Library() {
        Print(introPhrase + "Library" + roomContents + " dead scorpion");
        Print(PossibleDirections("Library"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "E":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Library", sc.nextDouble());
                        FrontRoom();
                        quit = "Q";
                        break;
                    case "N":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Library", sc.nextDouble());
                        DiningRoom();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        Library();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: Kitchen #4
    public static void Kitchen() {

        Print(introPhrase + "Kitchen" + roomContents + " bats");
        Print(PossibleDirections("Kitchen"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "N":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Kitchen", sc.nextDouble());
                        Parlor();
                        quit = "Q";
                        break;
                    case "E":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Kitchen", sc.nextDouble());
                        FrontRoom();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        Kitchen();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: Dining Room #5
    public static void DiningRoom() {
        Print(introPhrase + "Dining" + roomContents + " dust empty box");
        Print(PossibleDirections("Dining"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "S":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Dining", sc.nextDouble());
                        Library();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        DiningRoom();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: Valute #6
    public static void Valute() {
        Print(introPhrase + "Valute" + roomContents + " 3 walking skeletorn");
        Print(PossibleDirections("Valute"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {

                    case "E":
                        if (isSecretRoomVisited == false) {
                            if (generateRandom() == 1) { // 25 percent chance
                                System.out.printf("would you rate the room ? ");
                                SetRating("Valute", sc.nextDouble());
                                SecretRoom();
                            } else { // 75 percent chance
                                System.out.printf("would you rate the room ? ");
                                SetRating("Valute", sc.nextDouble());
                                Parlor();
                            }
                        } else {

                            if (generateRandom() % 2 == 0) // 50 / 50 % chance for both
                            { System.out.printf("would you rate the room ? ");
                                SetRating("Valute", sc.nextDouble());
                                SecretRoom();
                            } else {
                                System.out.printf("would you rate the room ? ");
                                SetRating("Valute", sc.nextDouble());

                                Parlor();
                            }
                        }
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        Valute();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: Parlor #7
    public static void Parlor() {

        Print(introPhrase + "Parlor" + roomContents + " treasure chest");
        Print(PossibleDirections("Parlor"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                if (!isSecretRoomVisited) {
                    Print("Sorry to see you leave, have a nice day");
                }
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "W":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Parlor", sc.nextDouble());
                        Valute();
                        quit = "Q";
                        break;
                    case "S":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Parlor", sc.nextDouble());
                        Kitchen();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        Parlor();

                }// end of switch
            }
        }// end of while loop
    }

    //TODO: SecretRoom #8
    public static void SecretRoom() {
        isSecretRoomVisited = true;
        Print(introPhrase + "Secret" + roomContents + " piles of gold");
        Print(PossibleDirections("Secret"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("you have finished visiting the rooms.");
                VisitedRooms();
                quit = "Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "W":
                        System.out.printf("would you rate the room ? ");
                        SetRating("Secret", sc.nextDouble());
                        Valute();
                        quit = "Q";
                        break;
                    default:
                        //TODO: System.out.println(ANSI_CLS + ANSI_HOME);
                        //TODO: System.out.flush();
                        Print("'" + d + "'" + " is not a valid direction , please try again.");
                        SecretRoom();

                }// end of switch
            }
        }// end of while loop
    }

    public static int generateRandom() {

        return new Random().nextInt(4) + 1;
    }

    public static boolean isFollowedByGhost() {

        return generateRandom() < 2 ? true : false;
    }

    public static String PossibleDirections(String roomName) {
        String result = null;
        //room 1
        nextRooms = new LinkedHashSet<>();
        nextRooms.add("N");

        // map contains possible directions for each room
        rooms = new HashMap<>();
        rooms.put("Foyer", nextRooms);

        //room 2
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("S", "W", "E")
        );
        rooms.put("Front", nextRooms);

        //room 3
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("E", "N")
        );
        rooms.put("Library", nextRooms);

        // room 4
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("W", "N")
        );
        rooms.put("Kitchen", nextRooms);

        // room 5
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("S")
        );
        rooms.put("Dining", nextRooms);

        // room 6
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("E")  // E8 has 25 % chance to be find.
        );
        rooms.put("Valute", nextRooms);

        // room 7
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("W", "S")
        );
        rooms.put("Parlor", nextRooms);

        // room 8
        nextRooms = new LinkedHashSet<>(
                Arrays.asList("W")
        );
        rooms.put("Secret", nextRooms);

        for (Map.Entry<String, Set<String>> outer : rooms.entrySet()) {
            if (outer.getKey().equalsIgnoreCase(roomName)) {
                result = outer.getValue().toString();
            }

        }

        return "Next,possible room to visit : " + result;
    }

    public static String addToVisitedRoom(String visited) {
        //visitedRooms = new HashSet<>();
        visitedRooms.add(visited);
        return visitedRooms.toString();
    }

    public static String VisitedRooms() {
        return visitedRooms.toString();
    }

    public static String VisitSummary() {
        String visitSummary = vistitDate + visitorName + " , you visited " + visitedRooms.size() + " rooms : " + VisitedRooms() + " over all rate was " + yourRating();
        if (isFollowedByGhost()) {
            visitSummary += " just reminder a ghost is following you.";
        }

        return visitSummary;
    }

    public static void SetRating(String room, double rate) {
        rating.put(room, rate);
    }

    public static double yourRating() {
        double sum = 0.0;
        double rate;
        for (Map.Entry<String, Double> str : rating.entrySet()) {
            sum = sum + str.getValue();
        }

        rate = sum / rating.size();
        return rate;
    }

    public static void main(String[] args) {
        visitorName = " \n Dear Guest";
        vistitDate = new Date();
        //visitedRooms.size();
        Foyer();
        // write your code here
        //Get the direction input where the user wants to go
        //Show what is in that room and give them what possible direction the can go from there
        //Users can move back and forth
        //You program should allow the user to find the secret room only 25% of the time.
        //However, once they find the secret room they can always find it.
        //When the user exits the house or quits there is a 25% chance they will be followed by a ghost. Let them know when they are being followed.
        //Also let the user know how many rooms they visited after they exit or quit.
        Print(VisitSummary());

    }
}

