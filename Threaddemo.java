package Thread1;
public class Threaddemo extends Thread {  
    // run() method to perform action for thread.   
    public void run()  
    {    int i,fact=1;
         int number=10;
    
    	for(i=1;i<number;i++)
    	{
    		fact=fact*i;
    	}
 
       System.out.println("Factorial of "+number+" is "+fact);  
       
    }  
    public static void main( String args[] )  
    {  
     // Creating instance of the class extend Thread class  
       Threaddemo t1 = new  Threaddemo();  
       //calling start method to execute the run() method of the Thread class  
       t1.start();  
    }  
}  

