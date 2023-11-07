
import java.io.*;
import java.util.*;
class ecom
{

public double total = 0.0, amt=0.0, change=0.0;
public int serial[] = new int[46];
public String items [] = new String[46];
public String sel[] = new String[46];
public double cost[] = new double [46];
public double price[] = new double [46];
public double quantity[] = new double [46];
public int c=0,z=0,p=0,j=0,y,w,i,d, del=0, a;
public String g= " ";
public void item()
{
items[0] = "                ";
items[1] = "    HP 15  G002AX";
items[2] = "    DELL INSPIRON 15 3542";
items[3] = "ACER ASPIRE E1 - 572";
items[4] = "HP PAVILION 15 poo1tx   ";
items[5] = "APPLE MACBOOK AIR";
items[6] = "NIKON COOLPIX S6400";
items[7] = "SONY CYBERSHOT H400 ";
items[8] = "CANON POWER SHOT Sx410";
items[9] = "SAMSUNG GC100 GALAXY";
items[10] = "KODAK PIXPRO FZ 151";
items[11] = "SAMSUNG GALAXY S6 ";
items[12] = "IPHONE 6 PLUS ";
items[13] = "NOKIA LUMIA 930";
items[14] = "SAMSUNG GALAXY A7";
items[15] = "SONY XPERIA Z ULTRA";
items[16] = "WOODSWORTH THREE SEATER SOFA SET";
items[17] = "CASACRAFT TWO SEATER SOFA SET";
items[18] = "MINTWUD SINGLE SEATER SOFA";
items[19] = "WOODSWORTH FOUR SEATER DINING TABLE";
items[20] = "MINTWUD ROUND TABLE";
items[21] = "CASACRAFT EIGHT SEATER DINING TABLE";
items[22] = "WOODSWORTH KING SIZE BED WITH STORAGE";
items[23] = "MINTWUD SINGLE BED WITH STORAGE"; 
items[24] = "CASACRAFT QUEEN SIZE BED WITH BOX STORAGE";
items[25] = "OPAL WARDROBES";
items[26] = "STANLEY BOUTIQUE RECLINERS";
items[27] = "STANLEY BOUTIQUE STUDY TABLE";
items[28] = "STANLEY BOUTIQUE TV CABINETS ";
items[29] = "@ HOME COMPUTER TABLE"; 
items[30] = "ARCHIE  THE ADVENTURES OF LITTLE ARCHIE VOLUME 2";
items[31] = "TINTIN  ADVENTURES OF TINTIN VOLUME 4 IN 1 SERIES";
items[32] = "DAIRY OF WIMPY KID BOX OF BOOKS";
items[33] = "SUPERMAN FOR ALL SEASONS";
items[34] = "THE DA VINCI CODE";
items[35] = "FAULT IN OUR STARS";
items[36] = "50 SHADES OF GREY";
items[37] = "TWILIGHT";
items[38] = "UNBREAKABLE-AN AUTOBIOGRAPHY MARY KOM";
items[39] = "LONG WALK TO FREDDOM-NELSON MANDELA";
items[40] = "A POLITICAL BIOGRAPHY NARENDRA MODI";
items[41] = "A BELIEF HISTORY OF TIME-STEPHEN HAWKING";
items[42] = "SWARAJ";
items[43] = "INDIA SINCE INDEPENDENCE";
items[44] = "THE DISCOVERY OF INDIA";
items[45] = "NON STOP INDIA";

cost[1] = 45580;
cost[2] =42490;
cost[3] =35100;
cost[4] =43949;
cost[5] =72900;
cost[6] =9500;
cost[7] =18114;
cost[8] =15386;
cost[9] =22900;
cost[10] =11499;
cost[11] =18880;
cost[12] =51408;
cost[13] =28990;
cost[14] =29100;
cost[15] =18299;
cost[16] =14774;
cost[17] =17600;
cost[18] =10000;
cost[19] =7000;
cost[20] =5700;
cost[21] =12680;
cost[22] =32000;
cost[23] =8400;
cost[24] =27000;
cost[25] =34499;
cost[26] =20000;
cost[27] =5899;
cost[28] =25499;
cost[29] =5899;
cost[30] =280;
cost[31] =899;
cost[32] =1099;
cost[33] =1500;
cost[34] =500;
cost[35] =799;
cost[36] =499;
cost[37] =699;
cost[38] =899;
cost[39] =1221;
cost[40] =599;
cost[41] =1045;
cost[42] =107;
cost[43] =455;
cost[44] =633;
cost[45] =456;
}
public void info()throws IOException
{
	int feat;
     Scanner s=new Scanner(System.in);
System.out.println("THE PRODUCTS AVAILABLE IN OUR WEBSITE\n\n ");
System.out.println("                            LAPTOPS\n");
System.out.println("                    1. HP 15  G002AX ");
System.out.println("                    2. DELL INSPIRON 15 3542");
System.out.println("                    3. ACER ASPIRE E1 - 572");
System.out.println("                    4. HP PAVILION 15 poo1tx");
System.out.println("                    5. APPLE MACBOOK AIR\n\n");
System.out.println("                            CAMERAS\n");
System.out.println("                    6. NIKON COOLPIX S6400");
System.out.println("                    7. SONY CYBERSHOT H400");
System.out.println("                    8.CANON POWER SHOT Sx410");
System.out.println("                    9.SAMSUNG GC100 GALAXY");
System.out.println("                    10.KODAK PIXPRO FZ 151\n\n");
System.out.println("                            MOBILES\n");
System.out.println("                    11.SAMSUNG GALAXY S6");
System.out.println("                    12.IPHONE 6 PLUS");
System.out.println("                    13.NOKIA LUMIA 930");
System.out.println("                    14.SAMSUNG GALAXY A7");
System.out.println("                    15.SONY XPERIA Z ULTRA\n\n"); 
System.out.println("                        FURNITURE\n");
System.out.println("                    16.WOODSWORTH THREE SEATER SOFA SET");
System.out.println("                    17. CASACRAFT TWO SEATER SOFA SET");
System.out.println("                    18. MINTWUD SINGLE SEATER SOFA");
System.out.println("                    19. WOODSWORTH FOUR SEATER DINING TABLE");
System.out.println("                    20. MINTWUD ROUND TABLE");
System.out.println("                    21. CASACRAFT EIGHT SEATER DINING TABLE");
System.out.println("                    22. WOODSWORTH KING SIZE BED WITH STORAGE");
System.out.println("                    23. MINTWUD SINGLE BED WITH STORAGE");
System.out.println("                    24. CASACRAFT QUEEN SIZE BED WITH BOX STORAGE");
System.out.println("                    25. OPAL WARDROBES");
System.out.println("                    26.STANLEY BOUTIQUE RECLINERS");
System.out.println("                    27. STANLEY BOUTIQUE STUDY TABLE");
System.out.println("                    28. STANLEY BOUTIQUE TV CABINET");
System.out.println("                    29. @ HOME COMPUTER TABLE\n\n");
 System.out.println("                            BOOKS\n");
System.out.println("                            COMICS\n");
System.out.println("                    30.ARCHIE  THE ADVENTURES OF LITTLE ARCHIE VOL 2");
System.out.println("                    31.TINTIN  THE ADVENTURES OF TINTIN VOL 4 IN 1 SERIES");
System.out.println("                    32.DAIRY OF THE WIMPY KID");
System.out.println("                    33.SUPERMAN FOR ALL SEASONS\n");
System.out.println("                            BESTSELLERS\n");
System.out.println("                    34.THE DA VINCI CODE");
System.out.println("                    35.FAULT IN OUR STARS");
System.out.println("                    36.FIFTY SHADES OF GREY");
 System.out.println("                   37.TWILIGHT\n");
System.out.println("                            AUTOBIOGRAPHY\n"); 
System.out.println("                    38.UNBREAKABLE  AN AUTOBIOGRAPHY OF MARY KOM");
System.out.println("                    39.LONG WALK TO FREEDOM  NELSON MANDELA");
System.out.println("                    40.A POLITICAL BIOGRAPHY  NARENDRA MODI");
System.out.println("                    41.A BRIEF HISTORY OF TIME  STEPHEN HAWKING\n");
System.out.println("                            HISTORY AND POLITICS\n");
System.out.println("                    42.SWARAJ");
System.out.println("                    43.INDIA SINCE INDEPENDENCE ");
System.out.println("                    44. THE DISCOVERY OF INDIA");
System.out.println("                    45.NON STOP INDIA\n");

System.out.println("Enter the serial number from 1 to 45 to see the features of the products you desire to buy:");
feat = s.nextInt();
switch(feat)
{
case 1 : System.out.println("\nHP 15  G002AX: ");
     System.out.println("AMD Quad  Core A8 APU ");
         System.out.println("4GB DDR3 RAM");
         System.out.println("1 TB HDD");
         System.out.println("Windows 8.1 OS");
         System.out.println("Cost - Rs45580\n");
check();
break;
case 2 : System.out.println("\nDELL INSPIRON 15 3542");
         System.out.println("Intel Core i5 Processor");
         System.out.println("4 GB RAM");
         System.out.println("1 TB Hard Disk");
         System.out.println("Windows 8 Operating System");
         System.out.println("Cost - Rs 42490\n");
check();
break;
case 3 : System.out.println("\nACER ASPIRE E1 - 572");
         System.out.println("Intel  Core i3  4010U, Dual Core 1.70 GHz");
          System.out.println("4 GB, DDR3L SDRAM");
          System.out.println("Intel HD 4400 with shared memory");
          System.out.println("500 GB HDD");
          System.out.println("Cost - Rs 35100\n");
check();
break;
case 4 : System.out.println("\nHP PAVILION 15 poo1tx");
         System.out.println("1.7 GHz Intel Core i5 4210U PROCESSOR");
         System.out.println("4 GB SDRAM");
         System.out.println("1 TB Serial ATA Hard drive");
         System.out.println("Windows 8.1 Operating System");
         System.out.println("cost - Rs 43949\n");
check();
break; 
case 5 : System.out.println("\nAPPLE MACBOOK AIR");
     System.out.println("4 GB DDR3 RAM");
          System.out.println("Intel Core i5, Dual Core 1.4 GHz");
         System.out.println("X Yosemite Operating System");
         System.out.println("cost - Rs 72900\n");
check();
break;
case 6 : System.out.println("\nNIKON COOLPIX S6400");
         System.out.println("16 Megapixels");
         System.out.println("12x Optical and 4x Digital Zoom");
         System.out.println("3 inch TFT LCD Touch Panel");
         System.out.println("CMOS Image Sensor");
         System.out.println("Cost - Rs 9500\n");
check();
break;
case 7:  System.out.println("\nSONY CYBER SHOT H400");
         System.out.println("20.1 Megapixels");
         System.out.println("63x Optical Zoom");
         System.out.println("3 inch TFT LCD Touch Panel");
         System.out.println("Super HAD CCD Image Sensor");
         System.out.println("Cost - Rs 18114\n");
check();
break; 
case 8 : System.out.println("\nCANON POWER SHOT Sx410");
         System.out.println("20 MP CCD Sensor");
         System.out.println("3.0 inch LCD  screen");
         System.out.println("40x Optical Zoom Lens");
         System.out.println("Cost - Rs 15386\n");
check();
break;
case 9 : System.out.println("\nSAMSUNG GC100 GALAXY");
         System.out.println("16.3 Megapixels");
         System.out.println("20.9x Optical  Zoom");
         System.out.println("BSI CMOS Image Sensor ");
         System.out.println("4.77 inch LCD");
         System.out.println("Cost - Rs 22900\n");
check();
break;
case 10 : System.out.println("\nKODAK PIX PRO FZ151");
           System.out.println("16 Megapixels");
           System.out.println("15x Optical Zoom");
           System.out.println("CCD Image Sensor");
           System.out.println("3 inch LCD");
           System.out.println("Cost - Rs 11499\n");
check();
break;
case 11 : System.out.println("\nSAMSUNG GALAXY S6");
           System.out.println("OS  Android 4.22 [Jelly bean] ");
           System.out.println("32/64 GB  Memory + microSD slot, 2 GB RAM  ");
           System.out.println("1.6 GHz Octa  Core Processor");
           System.out.println("Cost - Rs 18880\n");
check();
break;
case 12 : System.out.println("\nIPHONE 6 PLUS");
          System.out.println("2 GB RAM ");
          System.out.println("i OS 8.0 ");
          System.out.println("Processor make  Apple A8");
          System.out.println("Cost - Rs 51408\n");
 check();
 break; 
case 13 : System.out.println("\nNOKIA LUMIA 930");
          System.out.println("Quad Core 2.2GHz ");
          System.out.println("Window Phone 8.1 OS");
          System.out.println("2 GB RAM");
          System.out.println("Cost - Rs 28990\n");
 check();
break;
case 14 : System.out.println("\nSAMSUNG GALAXY A7");
           System.out.println("Octa Core 1 GHz");
           System.out.println("2 GB RAM");
           System.out.println("Android 4.4 OS"); 
           System.out.println("Cost - Rs 29100\n");
check();
break; 
case 15 : System.out.println("\nSONY XPERIA Z ULTRA");
           System.out.println("Quad Core 2.2 GHz");
           System.out.println("2 GB RAM");
           System.out.println("Android 4.2 OS");
           System.out.println("Cost - Rs 18299\n");
check();
break;

case 16: System.out.println("\nWOODSWORTH  THREE SEATER SOFA SET IN MAPLE WOOD");
         System.out.println("Colour : Black");
         System.out.println("Fabric : Leatherette");
         System.out.println("Made of : Maple wood ");
         System.out.println("Cost - Rs 14774\n");
check();
break;
case 17: System.out.println("\nCASACRAFT TWO SEATER SOFA IN MANGO WOOD ");
         System.out.println("Colour : Black, Brown, White ");
         System.out.println("Fabric : Buffalo Leather");
         System.out.println("Made of : Mango Wood ");
         System.out.println("Cost - Rs 17600\n");
check();
break;
case 18: System.out.println("\nMINTWUD SINGLE SEATER SOFA SET IN TEAK WOOD ");
         System.out.println("Colour: Black And Red");
         System.out.println("Fabric : Semi Leather");
         System.out.println("Made of : Teak Wood"); 
         System.out.println("Cost - Rs 10000\n");
check();
break;
case 19: System.out.println("\nWOODSWORTH BASIL MANGO WOOD FOUR SEATER TABLE");
         System.out.println("Colour : Brown");
         System.out.println("Measurement :1800cm*750cm*750cm");
         System.out.println("Material: Tough Fibre Glass");
         System.out.println("Made of Mango Basil Wood"); 
         System.out.println("Cost - Rs 7000\n");
check();
break;
case 20: System.out.println("\nMINTWUD ROUND TABLE IN WENGE WOOD");
         System.out.println("Colour : Dark Brown and Black");
         System.out.println("Measurement :   132 Inch");
         System.out.println("Material : Clear Water Glass");
         System.out.println("Made of : Wenge Wood [AFRICAN WOOD]");
         System.out.println("Cost - Rs 5700\n");
check();
break;
case 21: System.out.println("\nCASACRAFT EIGHT SEATER IN AXLE WOOD");
         System.out.println("Colour : Grey ,Black,Brown");
         System.out.println("Measurement:3600cm*1500cm*1500cm");
         System.out.println("Cost - Rs 12680\n");
check();
break;
case 22: System.out.println("\nWOODSWORTH ROBINSON WOOD KING SIZED BED WITH STORAGE");
         System.out.println("Colour : White and Beige");
         System.out.println("Measurement : 183cm*213cm");
         System.out.println("Storage : 2 Small Box Storage");
         System.out.println("Made of : Robison Wood");
         System.out.println("Cost - Rs 32000\n");
check();
break;
case 23: System.out.println("\nMINTWUD SINGLE BED WITH STORAGE IN WALNUT WOOD");
      System.out.println("Colour : Dark Brown");
      System.out.println("Measurement : 72cm*84cm");
          System.out.println("Storage : 1 Single Box Storage");
      System.out.println("Made of : Walnut Wood");
      System.out.println("Cost - Rs 8400\n");
check();
break;
case 24: System.out.println("\nCASACRAFT QUEEN SIZED BED WITH BOX STORAGE");
         System.out.println("Colour : Brown,White and Beige");
	 System.out.println("Measurement : 12inch*36inch*4inch");
	 System.out.println("Storage : Under Bed Single Box Storage");
	 System.out.println("Made of : Dark Green Oak Wood");
	 System.out.println("Cost - Rs 27000\n");
	 check();
	 break;
case 25: System.out.println("\nOPAL WARDROBES");
 	 System.out.println("Made of : Teakwood");
 	 System.out.println("Storage : Extra Storage Space");
 	 System.out.println("Measurement : 800mm*400mm*750mm");
	 System.out.println("Colours : Black, Brown, White");
	 System.out.println("Cost - Rs 34499\n");
	 check();
break;

case 26: System.out.println("\nSTANLEY BOUTIQUE RECLINEARS");
	 System.out.println("Colour : Jet Black, Olive Green Teak Brown");   
	 System.out.println("Manual Tilt Mechanism");
	 System.out.println("Cushion Arm Rest for Comfort"); 
	 System.out.println("Comfort Seating System"); 
	 System.out.println("Cost - Rs 20000\n");
	 check();                                      
         break;

case 27: System.out.println("\nSTANLEY BOUTIQUE-STUDY TABLE");
	 System.out.println("Made of : Rosewood");
	 System.out.println("Tough, Durable and Strong");
	 System.out.println("Extra Storage Space");
	 System.out.println("Prelaminated board top with postform"); 
	 System.out.println("Cost - Rs 5899\n");
	 check();
	 break;

case 28 :System.out.println("\nSTANLEY BOUTIQUE TV CABINET");
	System.out.println("Durable and Strong");
	System.out.println("Made of : Axlewood"); 
	System.out.println("Storage : Extra Storage Space"); 
	System.out.println("Colour : Grey, Black and Brown");
	System.out.println("Cost - Rs 25499\n");
	 check();
	break;

case 29 :System.out.println("\n@HOME COMPUTER TABLE");
	System.out.println("Made of : 18mm prelaminated particle boards");
	System.out.println("Chair with Manual Tilt Mechanism"); 
	System.out.println("Storage : Extra Storage Space");
	System.out.println("Measurement:1200mm*150mm*700mm"); 
	System.out.println("Cost - Rs 5899\n");
	check();
	break;
case 30 : System.out.println("\nCOMIC SERIES");        
          System.out.println(" ARCHIE - THE ADVENTURES OF LITTLE ARCHIE");
          System.out.println("Archie is filled with stories of fun and mystery by the legendary Bob Balling and Dexter Taylor "); 
          System.out.println("Cost - Rs.280\n"); 
          check();
          break;
case 31:  System.out.println("\nCOMIC SERIES"); 
          System.out.println("TINTIN - ADVENTURES OF TINTIN 4 VOL 1 SERIES "); 
          System.out.println("Tintin has volumes which contain three classic Tintin stories . the protagonist of this book is Tintin a young investigative reporter who travel the world in search of adventure "); 
          System.out.println("Cost - Rs.899\n"); 
          check();
          break;

case 32 : System.out.println("\nCOMIC SERIES");           
          System.out.println(" DAIRY OF WIMPY KID"); 
          System.out.println(" It contains books such as dairy of wimpy kid , Rodrick rules , the last straw and dog days"); 
          System.out.println("Cost = Rs.1099\n"); 
          check();
          break;  

case 33 : System.out.println("\nCOMIC SERIES");          
          System.out.println("SUPERMAN FOR ALL SEASONS");
          System.out.println("In this coming of age tale witnesses the experiences and adventures that transform a simple country boy into the worlds greatest hero"); 
          System.out.println("Cost = Rs.1500\n"); 
          check();
          break;


case 34: System.out.println("\nBEST SELLERS"); 
         System.out.println(" The Da Vinci code - Dan brown"); 
         System.out.println("Mystery and detective type of a novel published in the year 2003");
         System.out.println("Cost - Rs.500\n");
         check();
         break;

case 35: System.out.println("\nBEST SELLERS");           
         System.out.println("THE FAULT IN OUR STARS"); 
         System.out.println("It is the sixth novel written by one of the greatest author, John green . This book was published on 2012.It is a young adult fictional romance novel");
         System.out.println("Cost - Rs.799\n");
         check();
         break;

case 36: System.out.println("\nBEST SELLERS");
         System.out.println("50 SHADES OF GREY"); 
         System.out.println("It is written by E. L. James it is a erotic romance novel featuring mr grey and Anastasia steel and more");                   
         System.out.println("Cost -Rs.499\n");
         check();
         break;

case 37 : System.out.println("\nBEST SELLERS");
          System.out.println(" Twilight ");                 
          System.out.println("It is a series of four vampire themed fantasy romance novel by american author Stephanie mayer"); 
          System.out.println("Cost - Rs.699\n"); 
          check();
           break;

case 38 : System.out.println("\nAUTOBIOGRAPHY ");                                                                 
          System.out.println("UNBREAKABLE - MARYKOM     ");
          System.out.println("Indias best know boxer , five times worlds champion and an olympic medallist , Mary mom tells the moving and most inspiring story of her life through her book unbreakable "); 
          System.out.println("Cost - Rs 1045\n"); 
          check();
          break;

case 39: System.out.println("\nAUTOBIOGRAPHY");        
         System.out.println("A LONG WALK TO FREEDOM - Nelson Mandela" );
         System.out.println("The riveting memories of the outstanding moral and political leader of our time ,  A LONG WALK TO FREEDOM brilliantly recreate the drama of the experiences that helped shape nelson Mandelas destiny "); 
         System.out.println(" Cost - Rs 1221\n"); 
         check();
         break;

case 40 : System.out.println("\nAUTOBIOGRAPHY");
          System.out.println("A POLITICAL BIOGRAPHY - Narendra modi"); 
          System.out.println( "Narendra Modi, the BJP's prime ministerial candidate, is powerful, popular and controversial. With the general elections due to conclude in May 2014");
          System.out.println("Cost - Rs 599\n"); 
          check();
          break;

case 41:System.out.println(" \nAUTOBIOGRAPHY");
        System.out.println("A BRIEF HISTORY OF TIME - Stephen hawking"); 
        System.out.println("A Brief History of Time: From the Big Bang to Black Holes is a 1988 popular-science book by British physicist Stephen Hawking.It became a bestseller and sold more than 10 million copies in 20 years. It was also on the London Sunday Times bestseller list for more than four years and was translated into 35 languages by 2001"); 
System.out.println("Cost - Rs 899\n"); 
check();
break ;

case 42:
System.out.println("\nHISTORY AND POLITICS");
System.out.println("SWARAJ");
System.out.println("Author: Arvind Kejriwal Released: 2012 Publisher: HarperCollins");
System.out.println("Cost - Rs 107\n"); 
check();
break ;

case 43:
System.out.println("\nHISTORY AND POLITICS");
System.out.println("INDIA SINCE INDEPENDENCE ");
System.out.println("Author: Bipan Chandra Released: 2008 Publisher: PENGUIN INDIA");
System.out.println("Cost - Rs.455\n"); 
check();
break ;

case 44 :
System.out.println("\nHISTORY AND POLITICS");
System.out.println("THE DISCOVERY OF INDIA ");
System.out.println("Author: Nehru, Jawaharlal Released: 2004 Publisher: Penguin Books");
System.out.println("Cost - 633\n"); 
check();
break;

case 45 :
System.out.println("\nHISTORY AND POLITICS ");
System.out.println("NON STOP INDIA "); 
System.out.println("Author: Mark Tully Released: 2011 Publisher: Allen Lane") ;
System.out.println("Cost - 456\n");
 check();
break;
default: System.out.println("Please enter a valid serial number\n");
	  check();
}

}
public void check()throws IOException
{
Scanner s=new Scanner(System.in);
int o;
System.out.println(" Press \n 1- To continue to see the features you desire to buy \n 2-to start buying ");
         o = s.nextInt();
        if(o==1)
            info();
        else
            input();
        } 
// display the items available in the website
public void display()
{

System.out.println("\n\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ WELCOME TO eBAY.COM $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n");

System.out.println("^ HURRY!!! FESTIVE OFFER OF 15% DISCOUNT ON EVERY PURCHASE^");
System.out.println(" OFFER VALID FOR LIMITED PERIOD ONLY. *conditions apply.\n\n");

}

//the items purchased

public void choice()
{
System.out.println("These are the items you have already purchased");
for(int i=0;i<c;i++)
{
sel[i]=items[serial[i]];
price[i]=cost[serial[i]];
System.out.println((i+1)+". "+sel[i]+" \n\tQuantity: "+quantity[i]);
}
}
//Enter the purchase items and their quantities
public void input()throws IOException
{
for(int i=0;i<46;i++)
{

     Scanner s=new Scanner(System.in);
System.out.println();
System.out.println("We request you to keep checking your cart after buying each item so that you make sure of the items you have purchased");
System.out.println();
System.out.println("Enter choice of item you wish to purchase");
serial[i]=s.nextInt();
System.out.println("\nEnter the quantity of the item you wish to purchase");
quantity[i]=s.nextDouble();
c++;
System.out.println("\nWould you like to purchase another one\n Yes-1\n No-2");
int m=s.nextInt();

if(m==1)
change();
else
change();
break;
}
}
//Options to the list of items already bought
public void change()throws IOException
{

     Scanner s=new Scanner(System.in);
int d=0,cnt=1;
do
{
System.out.println();
System.out.println("Press");
System.out.println("1.To add item");
System.out.println("2.To delete item");
System.out.println("3.To confirm bill");
System.out.println("4.To see the items in your cart");
int n=s.nextInt();
switch(n)
{
case 1:for(int i=c;i<45;i++)
                    {
                            
                        System.out.println("Enter choice of item");
                        serial[i]=s.nextInt();
                        System.out.println("Enter quantity");
                        quantity[c]=s.nextDouble();
                        sel[c]=items[serial[i]];
                        price[c]=cost[serial[i]];
                        c++;
                        System.out.println("Would you like to Enter again \nYes-1\nNo-2");
                        int m =s.nextInt();
                if(m==1)
                    item();
                else 
                break;
   
   
                    }
                        break;
case 2:System.out.println("Enter the serial number of item to be deleted");
	del=s.nextInt();
	for(i=0; i<c; i++)
	{
	if(serial[i]==del)
	{
		System.out.println("The item of the serial number "+serial[i]+" has been deleted");
		for(a=i; i<=c; a++)
		{
			serial[a]=serial[a+1];
			quantity[a]=quantity[a+1];
			break;
		}
	}
	}
	
		c--;
		break;
	
	
case 3: System.out.println("\nBill confirmed\n");
	p=1;z=1;membership();
	break;
case 4:
	choice();
	break;
default: System.out.println("Try again");
}
}
while(z==0);
}
public void membership() throws IOException
{

     Scanner s=new Scanner(System.in);
System.out.println("Are you a member of our website?\n Yes-1 \n No-2\n");
int n=s.nextInt();
if(n==1)
{
System.out.println("Please enter you membership number: ");
long mn=s.nextLong();
System.out.println("\nWould you like this amount to be debited to your account? \n  Yes-1 \n No-2");
int r = s.nextInt();
if (r==1)
{
System.out.println("\nThis amount has been successfully debited to your account");
g="debited";
System.out.println("\nWould like to pay by \n1-Cash \n 2-Credit card\n");
int b= s.nextInt();
if (b==1)
{
g="cash"; bill();
}
if  (b==2)
{
g="credit card"; bill();
}
}
if (r==2)
{
System.out.println("\nWould like to pay by \n1-Cash \n 2-Credit card\n");
int b= s.nextInt();
if (b==1)
{
g="cash";
bill();
}
if (b==2)
{
g="credit card";
bill();
}
}
//bill();
}
else
{
if(n==2)
{
System.out.println("\nWould like to pay by \n1-Cash \n 2-Credit card\n");
int b= s.nextInt();
if(b==1)
{
g="cash";
bill();
}
if(b==2)
{
g= "credit card";
bill();
}
}//options if the customer is not a member
}
}
public void delivery() throws IOException
{

     Scanner s=new Scanner(System.in);
	System.out.println();
	System.out.println();
	System.out.println("Please enter your name:");
	String name = s.next();
	System.out.println("Please enter your city name:");
	String city = s.next();
	System.out.println("Please enter your mobile no:");
	long phone =s.nextLong();
	System.out.println(" Please enter your residing address: ");
	String add=s.next();
	System.out.println("MR or MRS " +name+" living in "+city+ " your items will be delivered in 2 to 3 days we hope you will shop again @ eBAY");
}
public  void bill()throws IOException
             {
                if(c!=0)
                {

     Scanner s=new Scanner(System.in);
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    
                    System.out.println("---------------------------------------------------------------");
                    System.out.println("*   Bill No.157392\tCASH BILL                                 *");
                                                                  
                    System.out.println("*     eBAY                                   *");
                    
                    System.out.println("*Sl     Particulars          				 Qty       Price      Amount          *");
                    for(int i=0;i<c;i++)
                    {
                    System.out.println("*"+(i+1)+"   "+sel[i]+"     				 "+quantity[i]+"       "+price[i]+"      "+(quantity[i]*price[i])+"\t"+"         "+"*");
                        total=total+(quantity[i]*price[i]);
                    }
                    if (g.compareTo("cash")==0)
                    {
                        System.out.println("*    status"+g                                                 +"*");
                    System.out.println("*\tTotal:\t\t\t\t"+total                                           +"*");
                     System.out.println("*Enter the amount paid:                                              *");
                    amt=s.nextFloat();
		    if(amt<total)
		    {
			System.out.println("Insufficient amount, enter again");
			System.out.println("*Enter the amount paid:                                              *");
                    amt=s.nextFloat();
		    }
			else
		 change=amt-total;
			
                   
                    System.out.println("*\tAmount:\t\t\t\t"+amt                                            +"*");
                    System.out.println("*\tChange:\t\t\t"+change                                         			+"*");
                    System.out.println("*\tThank You!Come again.                                             *");
                    delivery();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------");
                    over();
                }
            
              else if(g.compareTo("credit card")==0)
              {
                System.out.println("*\tTotal:\t\t\t\t"+total                                           +"*");   
                System.out.println("*\tThank You!Come again.                                             *");
                    delivery();
                    System.out.println("----------------------------------------------------------------------");
                    System.out.println("----------------------------------------------------------------------");
                    over();
             }
          }
        }
        public void over()throws IOException
        {
            int u;
            for(u=0;u<=2;u++)
            break;
        }
          }
class Ecommerce_Demo
{
public static void main(String args[])throws IOException
          { 
            int check=0;
            ecom ob=new ecom();
           ob.display();
            ob.item();
            ob.info();
            ob.check();
            ob.input();
            ob.choice();
            ob.change();
 		}           
            
          }