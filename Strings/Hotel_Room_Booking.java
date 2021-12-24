// Given a hotel which has 10 floors [0-9] and each floor has 26 rooms [A-Z]. You are given a sequence of rooms, where + suggests room is booked, - room is freed. You have to find which room is booked maximum number of times.

// You may assume that the list describe a correct sequence of bookings in chronological order; that is, only free rooms can be booked and only booked rooms can be freeed. All rooms are initially free. Note that this does not mean that all rooms have to be free at the end. In case, 2 rooms have been booked the same number of times, return the lexographically smaller room.

// You may assume:

// N (length of input) is an integer within the range [1, 600]
// each element of array A is a string consisting of three characters: "+" or "-"; a digit "0"-"9"; and uppercase English letter "A" - "Z"
// the sequence is correct. That is every booked room was previously free and every freed room was previously booked.
// Example:

// Input: ["+1A", "+3E", "-1A", "+4F", "+1A", "-3E"]
// Output: "1A"
// Explanation: 1A as it has been booked 2 times.


// "static void main" must be defined in a public class.
public class Main {
    
    public static String maxBooked(String[] bookingHistories){
        
        Map<Character, HashMap<Character, Integer>> booking = new HashMap();
        
        for(String bookingHistory: bookingHistories){
          char floor = bookingHistory.charAt(1);
          char room = bookingHistory.charAt(2);
          boolean book = bookingHistory.charAt(0) == '+' ? true : false;
          System.out.println("floor = " + floor + " Room = " + room + " booking = " + book);
        
         if(!booking.containsKey(floor)){
             HashMap<Character, Integer> temp = new HashMap();
             temp.put(room,1);
             booking.put(floor,temp);
         }else if(book == true){
              HashMap<Character,Integer> temp = null;
             if(booking.get(floor).containsKey(room)){
                    temp = booking.get(floor);
                    temp.put(room,temp.get(room)+1);
             }else{
                 temp = booking.get(floor);
                 temp.put(room,1);
             }
             booking.put(floor,temp);
         }
            
        }
        
        int count = Integer.MIN_VALUE;
        String output = null;
        
        for(Character f:booking.keySet()){
            for(Character r:booking.get(f).keySet()){
                if(booking.get(f).get(r) > count){
                    count = booking.get(f).get(r);
                    output = ""+f+r;
                }
            }
        }
        
        System.out.println(booking);
    return output;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputList = input.split(" ");
        System.out.println(Main.maxBooked(inputList));
        
    }
}
