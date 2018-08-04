class ClasseThread1 extends Thread {
    public void run() {
        for(int j=0;j<20;j++) {                  
            System.out.println("Thread -->" + this.getName());
            for (int i=0; i<999999999; i++);
        }
    }
}

class ExempThread1{
    public static void main(String args[]) {      
             ClasseThread1 t1 = new ClasseThread1();
             ClasseThread1 t2 = new ClasseThread1();
             
             t1.start();  
             t2.start(); 
    }
}
