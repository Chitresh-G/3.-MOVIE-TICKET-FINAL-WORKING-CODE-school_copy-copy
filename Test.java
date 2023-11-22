import java.util.*;
import java.io.*;
class Test{

    public static void main(){
        try{
            Scanner sc=new Scanner(System.in);
            FileWriter fw=new FileWriter("Data_store.txt",true);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);

            for(int i=0;i<5;i++)
            {//System.out.println("Enter name");
                //String s=sc.next();
                //System.out.println("Enter show time");
                //String t=sc.next();
                System.out.println("Enter seat number");
                String seatno=""+sc.nextInt();
                //pw.println(s+" "+t+" "+seatno);
                pw.print("A B "+seatno);
                pw.println();
            }
            String seat[][]=new String[5][5];

            for(int i=0;i<seat.length;i++)
                for(int j=0;j<seat[i].length;j++)
                    seat[i][j]=""+i+j;
            FileReader fr=new FileReader("Data_store.txt");
            BufferedReader br=new BufferedReader(fr);
            String reader=br.readLine();

            while(reader!=null)
            {System.out.println("line "+reader);
                String b[]=reader.split(" ");
                int row=Integer.parseInt(""+b[2].charAt(0)); System.out.println("rOW "+row);
                int col=Integer.parseInt(""+b[2].charAt(1)); System.out.println("col "+col);
                seat[row][col]="Occupied";
                reader=br.readLine();
            }

            for(int i=0;i<seat.length;i++)
            {
                for(int j=0;j<seat[i].length;j++)
                    System.out.print(seat[i][j]+"\t");
                System.out.println();
            }
            pw.close();
            bw.close();
            fw.close();
            br.close();
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);}
    }

    void input(){

    }

}