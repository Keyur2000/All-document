import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

class Board
{
  BufferedReader br;
  Random ra=new Random();

 synchronized int throwDice(String pna)throws Exception
 {
  br=new BufferedReader(new InputStreamReader(System.in));
  try
  {
   Thread.sleep(3000);
  }
  catch(Exception e)
  {}
  System.out.println("THROW DICE FOR PLAYER  "+pna+":");
  br.read();
  
  int dice=ra.nextInt(6);
  dice++;
  
  System.out.println("DICE NO   :  "+dice+"FOR PLAYER :"+pna);
  return dice;
 }
}


class Player implements Runnable
{
  Thread th;
  String pna;
  Board b;
  int dice=0,score=0;

  Player(String pna,Board b)
  {
   th=new Thread(this);
   this.pna=pna;
   this.b=b;
   dice=0;score=0;
   th.start();
  }
 public void run()
 {
   while(score<=50)
  {
try{
   dice=b.throwDice(pna);
}
catch(Exception e){}
   System.out.println("\n PREVIOUS SCORE FOR PLAYER  :  "+pna+" IS --->  "+score);
   score=score+dice;

    if(score==50)
     {
       System.out.println("\n\n  "+pna+"HAS WON THE GAME");
       System.exit(0);
     }
    else if(score>50)
     {
      score=score-dice;
     }
    else if(score==3||score==16||score==30||score==39)
     {
      System.out.println("\n"+pna+"  HAS GOT THE LADDER  :");
      score+=5;
     }
    else if(score==9||score==15||score==29||score==36||score==41||score==49)
    {
     System.out.println("\n"+pna+"  HAS BEEN BEATEN BY SNAKE");
     score-=8;
    }
  System.out.println("\n UPDATED SCORE FOR  :  "+pna+" IS  ----->>"+score);
} }}
public class Game
{
         public static void main(String st[])
   {
       Board b=new Board();
       Player q =new Player("MUMMY",b);
       Player p2 = new Player("PAPPA", b);
   }
}
 
