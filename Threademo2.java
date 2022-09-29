package Thread1;

public class Threademo2 implements Runnable {  
	  
    @Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
    	Threademo2 ex = new Threademo2();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("WELCOME TO SUBEX");  
    }  
}  
