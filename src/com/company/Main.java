package com.company;

import java.awt.print.PrinterGraphics;
import java.util.*;

        public class Main {

            public static StringBuilder defaultString = new StringBuilder("Contents in this castle room : ");
            public static Set<String> nextExit = new LinkedHashSet<>();
            public static Map<Integer, Set<String>> rooms = new HashMap<>();
            public static Scanner sc = new Scanner(System.in);

            public static void Print(Object msgToUser) {
                System.out.println(msgToUser);

            }

            public static void Foyer() {
                System.out.println(defaultString + " dead scorpion");
                System.out.println("Next possible navigation : " + PossibleDirections(1));
                //
                String q="C";
                while (!q.equalsIgnoreCase("Q")){
                switch (direction)
            }
            }

            public static void FrontRoom() {
                System.out.println("Contents in this room : dead scorpion");
                System.out.println("your possible rooms to visit: " + PossibleDirections(1));
            }

            public static void Navigation(int nextroom) {
                boolean validNavigation = true;
                while (true) {

                }
            }

            public static String PossibleDirections(int currentRoom) {

                String result = null;
                // set contains possible directions
                Set<String> nextExit = new LinkedHashSet<>();
                nextExit.add("N2");

                // map contains possible directions for each room
                Map<Integer, Set<String>> rooms = new HashMap<>();
                rooms.put(1, nextExit);

                nextExit = new LinkedHashSet<>();
                nextExit.add("S1");
                nextExit.add("W3");
                nextExit.add("E4");

                rooms.put(2, nextExit);

                for (Map.Entry<Integer, Set<String>> outer : rooms.entrySet()) {
                    if (outer.getKey() == currentRoom) {
                        result = outer.getValue().toString();
                    }

                }

                return result;
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
                Scanner sc = new Scanner(System.in);
          /*      int roomNumber = 1;
                int currentRoomNumber;
                char continueVisiting = 'Y';
                while (continueVisiting != 'N') {
                    Print("What direction you want to move? press 0 to Exit");
                    roomNumber = sc.nextInt();

                    switch (roomNumber) {
                        case 'N':
                            Foyer();
                            VisitedRooms(roomNumber);
                            break;
                        case 'S':
                            Print("R2");
                            break;
                        case 'E':
                            Print("R3");
                            break;
                        case 'W':
                            Print("R4");
                            break;
                        *//*case 5:
                            Print("R5");
                            break;
                        case 6:
                            Print("R6");
                            break;
                        case 7:
                            Print("R7");
                            break;
                        case 8:
                            Print("R8");
                            break;
*//*
                        default:
                            Print("Sorry , to see you quit visiting.Look the following summaries.visitSummary()");
                            Print(VisitedRooms(roomNumber));
                            continueVisiting = 'N';
                            break;
                    }
                }*/

            }
        }

