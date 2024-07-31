import java.util.*;

import javax.sound.midi.Soundbank;
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
                System.out.println("> Represented by the Celestial body of the Sun.");
                System.out.println("> They are mainly determined and commanding in nature which make them the best and natural leaders.");
                System.out.println("> These people are full of confidence and powerful.");
                System.out.println("> People who are represented by the number 1 are also very creative and very perfectionist.");
                System.out.println("> People who are represented by the number 1 have a hard time dealing with big problems because they want their success to flow easily.");   
            }
            if (val==2){
                System.out.println("> Represented by the celestial body of the Moon.");
                System.out.println("> People who are represented by the number 2 are very soft and often weak.");
                System.out.println("> The main strength of people who are represented by the number 2 is that they are good at reading people and understanding people.");
                System.out.println("> Especially men who are represented by the number 2 are afraid to be weak.");
                System.out.println("> It embodies the qualities of sensitivity, diplomacy, and cooperation.");
            }
            if(val==3){
                System.out.println("> Represented by planet Jupiter.");
                System.out.println("> The number 3 is the first number of the Heavenly Triad of 3, 6 and 9.");
                System.out.println("> It’s the number of expansion, growth and the “male winner mentality”.");
                System.out.println("> It’s a number of theories, knowledge, and advancement.");
                System.out.println("> People who are represented by the number 3 want to do everything themselves. Therefore they often appear as a “one-man army”.");
            }
            if (val==4) {
                System.out.println("> Represented by planet Uranus.");
                System.out.println("> People who are represented by the number 4 want to be unique.");
                System.out.println("> They are good at thinking outside the box, and they are natural-born engineers, scientists, and inventors of all kinds.");
                System.out.println("> People who are represented by the number 4 have many enemies.");
                System.out.println("> They almost always suffer psychological problems");                
            }
            if(val==5){
                System.out.println("> Represented by planet Mercury.");
                System.out.println("> People who are represented by the number 5 are natural born speakers.");
                System.out.println("> The number 5 stands for motion, vigor, communication, friends, and business.");
                System.out.println("> People who are represented by the number 5 are good at making friends and making networks.");
                System.out.println("> It embodies the qualities of versatility, curiosity, and a desire for new experiences.");
            }
            if(val==6){
                System.out.println("> Represented by planet Venus.");
                System.out.println("> The number 6 is the second number of the Heavenly Triad of 3, 6 and 9.");
                System.out.println("> Like in electricity, you have a plus and a minus pole. The number 3 is plus and the number 6 is minus.\r\n" + //
                                        "This means that the number 3 is about doing and the number 6 is about receiving.");
                System.out.println("> Number 6 stands for comfort, the homeliness and therefore people who are represented by the number 6 are slow movers and they are very stubborn.");
                System.out.println("> People associated with it are gentle, caring, loving, and beautiful");
            }
            if(val==7){
                System.out.println("> Represented by planet Neptune.");
                System.out.println("> It is often considered to be a symbol of mystery, knowledge and intuition.");
                System.out.println("> Number 7 is regarded as good teacher and spiritual");
                System.out.println("> It is also an unfortunate number, indicating moodiness and anxiety issues.");
                System.out.println("> These people are always anxious to know about the future.");
                System.out.println("> These people are not at all greedy as they are far away from materialistic world");
            }
            if(val==8){
                System.out.println("> Represented by planet Saturn.");
                System.out.println("> People who are represented by the number 8 are born to create a major change in the world and to create something that will last forever.");
                System.out.println("> They are also very practical in their approach to life in general.");
                System.out.println("> Many people who are represented by the number 8 have a very tough life.");
                System.out.println("> They have a good will power and serious nature and their determination makes them very strong to face any challenges in life.");
                System.out.println("> They are religious one's, who always believe in God.");
            }
            if(val==9){
                System.out.println("> Represented by planet Mars.");
                System.out.println("> The number 9 is the final number of the Heavenly Triad of 3, 6 and 9. It’s also considered to be a divine number because it’s the highest number there is.");
                System.out.println("> The number 9 is considered as the number of literally everything.");
                System.out.println("> According to ancient Chaldean philosophy, everything is nothing, and nothing is everything.\r\n" + //
                                        "Therefore people who are represented by the number 9 are meant to be the enforcers of Karma and justice.");
                System.out.println("> People who are represented by the number 9 are focused on justice, integrity, and honor.");
                System.out.println("> Nearly all people who are represented by the number 9 have had a tough childhood.");
            }

        }
    }
