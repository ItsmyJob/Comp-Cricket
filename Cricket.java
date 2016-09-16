import java.io.*;
class Cricket
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Welcome to the CompCricket");
        System.out.println("Enter the Name of the First Team=");
        String f=br.readLine();
        System.out.println("Our second team is our toughest competitor--Computer!!!!");
        System.out.println("Toss");
        System.out.println("For the First Team:-Enter any number between 0 and 1");
        double ft=Double.parseDouble(br.readLine());
        System.out.println("For Computer:-Enter any number between 0 and 1");
        double st=Math.random();
        System.out.println("Computer's choice="+st);
        double l=Math.random();
        double fft=2+l-ft;
        double sst=2+l-st;
        double k=Math.random();
            double j=Math.random();
        if (fft>sst)
        {
            System.out.println( f+" "+"has won the toss");
            System.out.println("Enter 1 or any other number except 2 to Bat");
            System.out.println("Enter 2 To Bowl");
            int i=Integer.parseInt(br.readLine());
            switch (i)
            {
                case 1: System.out.println(f+" "+"has won the toss and has elected to bat first");
                          break;
                case 2: System.out.println(f+" "+"has won the toss and has elected to bowl first");
                          break;
                   default:  System.out.println(f+" "+"has won the toss and has elected to bat first");
                }
            }
            if (sst>fft&&k>j)
            {
                 System.out.println( "Computer"+" "+"has won the toss");
            System.out.println("1 and any other number except 2:Bat");
            System.out.println("2:Bowl");
        
            
            
            System.out.println("Computer has won the toss and has elected to bat first");
        }
           else if(sst>fft&&j<k)
            {
                System.out.println( "Computer"+" "+"has won the toss");
            System.out.println("1 and any other number except 2:Bat");
            System.out.println("2:Bowl");
            System.out.println("Computer has won the toss and has elected to bowl first");
        }
            
        
        
        
    }
}

