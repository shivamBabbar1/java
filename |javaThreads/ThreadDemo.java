
public class ThreadDemo implements Runnable{

    public static void main(String[] args){
        
        ThreadDemo obj = new ThreadDemo();
        Thread thread = new Thread(obj);
        int i =0;
        thread.start();
        //  System.out.println(Thread.currentThread());//
       try{
        while(i<4){ 
         Thread.sleep(1000);
         System.out.println("hello");
         i++;
         thread.join();
         
       }
    }catch(Exception e){
         System.out.println("error accurs");
    }
    System.out.println("finished");
    }

    public void run(){
        int[] a = {20,22,23,55,77};
    
        try{
        for(int i = 0;i<5;i++){
           
            Thread.sleep(1000);
            System.out.println(a[i]);
            
        }
    }catch( Exception e ){
         System.out.println("error in thread");
    };
    }  
}
