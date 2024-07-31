import java.util.*;
public class Main {

    public static HashMap<Character, Integer> CreateMap()
     {
        HashMap<Character ,Integer> map=new HashMap<>();                       // creating hashmap

        map.put('A',1);
        map.put('B',2);
        map.put('C',3);
        map.put('D',4);
        map.put('E',5);
        map.put('F',8);
        map.put('G',3);
        map.put('H',5);
        map.put('I',1);
        map.put('J',1);
        map.put('K',2);
        map.put('L',3);
        map.put('M',4);
        map.put('N',5);
        map.put('O',7);
        map.put('P',8);
        map.put('Q',1);
        map.put('R',2);
        map.put('S',3);
        map.put('T',4);
        map.put('U',6);
        map.put('V',6);
        map.put('W',6);
        map.put('X',5);
        map.put('Y',1);
        map.put('Z',7);

        map.put('a',1);
        map.put('b',2);
        map.put('c',3);
        map.put('d',4);
        map.put('e',5);
        map.put('f',8);
        map.put('g',3);
        map.put('h',5);
        map.put('i',1);
        map.put('j',1);
        map.put('k',2);
        map.put('l',3);
        map.put('m',4);
        map.put('n',5);
        map.put('o',7);
        map.put('p',8);
        map.put('q',1);
        map.put('r',2);
        map.put('s',3);
        map.put('t',4);
        map.put('u',6);
        map.put('v',6);
        map.put('w',6);
        map.put('x',5);
        map.put('y',1);
        map.put('z',7);

        return map;
        }

        
        public static int SumOfDigit(int number){                                   //function to make sum of digit of 2 digit no.
            int first=number/10;
            int second=number%10;
            int a=first+second;
            return(a);
        }
        
        
        public static int calnum(String name, HashMap<Character,Integer>map)        // calculating sum of values of characters
        {
            int sum=0;
            // for(int i=0;i<name.length();i++){
            //     if(map.containsKey(i)){
            //         sum=sum+map.get(i);
            //     }
            for(char Character:name.toCharArray()){
                if(map.containsKey(Character)){
                    sum+=map.get(Character);
                }
            }
            return sum;
        }
        
        public static void main(String[] args)                                         
         {
            HashMap<Character,Integer> map=CreateMap();

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Your Full Name");
            String name=sc.nextLine();

            int sum=calnum(name,map);                                                     // function calling
            int val=SumOfDigit(sum);                                                      // function calling
            if(val>9){
                System.out.println("Your Numerology Number is -->"+" "+ SumOfDigit(val));
            }
            else{
                System.out.println("Your Numerology Number is -->"+" "+ val);
            }
            if (val==1){
                
                
            }

        }
    }
