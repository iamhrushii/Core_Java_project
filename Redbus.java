package Redbus;
import java.util.Scanner; 
class Ticket {

	public static void main(String[] args) {
		// REd BUS.java
	
		System.out.println("HEllO NAMASTE WELCOME TO THE RED BUS");
		System.out.println("TO USE THE RED BUS PORTAL U NEED TO LOGIN FIRST");
		System.out.println("ENTER BOARDING POINT");
		System.out.println("ENTER DESTINATION POINT");
		
		    String source="hyd",des;
		    double x,num,tcost=0,num1 = 0,cost=0;
		    double discount=0,fcost=0;
		    Scanner s=new Scanner(System.in);
		    System.out.println("source is" +source);
		    System.out.println("guntur");
		    System.out.println("vij");
		    System.out.println("viz");
		    System.out.println("enter destination");
		    des=s.next();
		    if(des.equals("guntur"))
		    {
		      System.out.println("service number is:1234");
		      System.out.println("bus number is:abc546");
		       cost=250;
		      System.out.println("enter no of persons");
		      num1=s.nextInt();
		    }
		      
		    else if(des.equals("vij"))
		    {
		      System.out.println("service number is:5678");
		      System.out.println("bus number is:abc526");
		      cost=300;
		      System.out.println("enter no of persons");
		      num1=s.nextInt();
		    }
		    else if(des.equals("viz"))
		    {
		      System.out.println("service number is:3498");
		      System.out.println("bus number is:abc986");
		      cost=350;
		      System.out.println("enter no of persons");
		      num1=s.nextInt();
		    }
			switch ((int)num1) {
		      case 1:
		    	  System.out.println("no discount");
		    	  tcost=cost*1;
			      discount=0;
			      fcost=tcost-discount;
			      break;
		      case 2:
		    	  tcost=cost*2;
			      discount=0.2*tcost;
			      fcost=tcost-discount;
			      break;
		      case 3:
		    	  tcost=cost*3;
			      discount=0.3*tcost;
			      fcost=tcost-discount;
			      break;
		      case 4:
		    	  tcost=cost*5;
			      discount=0.5*tcost;
			      fcost=tcost-discount;
			      
			}
			System.out.println("cost of "+num1+" members is " +tcost);
		    System.out.println("discount for "+num1+" is "+discount);
			
		     }  
} 