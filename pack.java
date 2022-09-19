package  pp;
abstract class  ADI
{
    abstract public void getcount();
}
public class packah extends ADI {

    public void getdata()
    {
        System.out.println("The Names Of Student ARE:");
        String[] names=new String[7];
        names[0]="aditya";
        names[1]="raj";
        names[2]="sharma";
        names[3]="sharmila";
        names[4]="adi";
        names[5]="mehaku";
        names[6]="addd";


        for(int i=0;i<7;i++)
        {
            System.out.print("|| "+ names[i] +" || ");
        }
        System.out.println("\n");
        System.out.println("!--------------------------------!");
    }
    public static void main(String[] args) {

        packah obj=new packah();
        obj.getcount();
        obj.getdata();

    }

    @Override
    public void getcount() {

        System.out.println("The Total No. Of Students In The Class Are:" + 7);
        System.out.println("!--------------------------------!");
    }
}
