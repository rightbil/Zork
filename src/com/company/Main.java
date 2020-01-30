package com.company;

import java.util.*;

public class Main {

    public static final String ANSI_CLS = "\u001b[2J";
    public static final String ANSI_HOME = "\u001b[H";
    public static StringBuilder roomContents = new StringBuilder(" room.\nContents in this castle room : ");
    public static String introPhrase= "Now,you are in the ";
    public static Set<String> nextExit = new LinkedHashSet<>();
    public static Map<String, Set<String>> rooms = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);
    public static String d = null;
    public static String quit = "C";

    public static void Print(Object msgToUser) {
        System.out.println(msgToUser);

        final int roomNumber = 1;
        final int currentRoomNumber;

    }
    //TODO: Foyer #1
    public static void Foyer() {

        Print(introPhrase+ "Foyer" + roomContents + " dead scorpion");
        Print(PossibleDirections("Foyer"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "N":
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
        Print(introPhrase+ "Front" + roomContents + " dead scorpion");
        Print(PossibleDirections("Front"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "S":
                        Foyer();
                        quit = "Q";
                        break;
                    case "E":
                        Kitchen();
                        quit = "Q";
                        break;
                    case "W":
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
        Print(introPhrase+ "Library" + roomContents + " dead scorpion");
        Print(PossibleDirections("Library"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "E":
                        FrontRoom();
                        quit = "Q";
                        break;
                    case "N":
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

        Print(introPhrase+ "Front " + roomContents + " dead scorpion");
        Print(PossibleDirections("Kitchen"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "N":
                        Parlor();
                        quit = "Q";
                        break;
                    case "E":
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
        Print(introPhrase+ "Front " + roomContents + " dead scorpion");
        Print(PossibleDirections("Dining"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "S":
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
        Print(introPhrase+ "Front " + roomContents + " dead scorpion");
        Print(PossibleDirections("Valute"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {

                    case "E":
                        if (new Random(1).nextInt(4) == 1) {
                            SecretRoom();
                        } else {

                            Parlor();
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
//TODO: Parol #7
    public static void Parlor() {
        Print(introPhrase+ "Front " + roomContents + " dead scorpion");
        Print(PossibleDirections("Parol"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "W":
                        Valute();
                        quit = "Q";
                        break;
                    case "S":
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
        Print(introPhrase+ "Front " + roomContents + " dead scorpion");
        Print(PossibleDirections("Secret"));
        while (!quit.equalsIgnoreCase("q")) {
            //System.out.println(ANSI_CLS);
            Print("Enter directions or press Q to quit");
            d = sc.next();
            if (d.equalsIgnoreCase("Q")) {
                // user wanted to quit
                Print("Sorry to see you leave, have a nice day");
                quit="Q";
                break;

            }// end of if
            else {
                switch (d.toUpperCase()) {
                    case "W":
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

    public static void Navigation(int nextroom) {
        boolean validNavigation = true;
        while (true) {

        }
    }

    public static String PossibleDirections(String roomName) {
        String result = null;
        //room 1
        nextExit = new LinkedHashSet<>();
        nextExit.add("N2");

        // map contains possible directions for each room
        rooms = new HashMap<>();
        rooms.put("Foyer", nextExit);

        //room 2
        nextExit = new LinkedHashSet<>(
                Arrays.asList("S1","W3","E4")
        );
//        nextExit.add("S1");
//        nextExit.add("W3");
//        nextExit.add("E4");
        rooms.put("Front", nextExit);

        //room 3
        nextExit = new LinkedHashSet<>(
                Arrays.asList("E2","N5")
        );
        rooms.put("Library", nextExit);

        // room 4
        nextExit = new LinkedHashSet<>(
                Arrays.asList("W2","N7")
        );
        rooms.put("Kitchen", nextExit);

        // room 5
        nextExit = new LinkedHashSet<>(
                Arrays.asList("S3")
        );
        rooms.put("Dining", nextExit);

        // room 6
        nextExit = new LinkedHashSet<>(
                Arrays.asList("E7","E8")  // E8 has 25 % chance to be find.
        );
        rooms.put("Valute", nextExit);

        // room 7
        nextExit = new LinkedHashSet<>(
                Arrays.asList("W3","S4")
        );
        rooms.put("Parlor", nextExit);

        // room 8
        nextExit = new LinkedHashSet<>(
                Arrays.asList("W6")
        );
        rooms.put("Secret", nextExit);

        for (Map.Entry<String, Set<String>> outer : rooms.entrySet()) {
            if (outer.getKey().equalsIgnoreCase(roomName)) {
                result = outer.getValue().toString();
            }

        }

        return "Next,possible room to visit : " + result;
    }

    public static String VisitedRooms(int visited) {

        Set<Integer> visitedRooms = new HashSet<>();
        visitedRooms.add(visited);
        return visitedRooms.toString();
    }

    public static void Summary() {

    }

    public static void main(String[] args) {
        Foyer();
        // write your code here
        //get the input where the user wants to go
        //Show what is in that room and give them what possible direction the can go from there
        //Users can move back and forth
        //You program should allow the user to find the secret room only 25% of the time.
        //However, once they find the secret room they can always find it.
        //When the user exits the house or quits there is a 25% chance they will be followed by a ghost. Let them know when they are being followed.
        //Also let the user know how many rooms they visited after they exit or quit.
       Summary();
    }
}

