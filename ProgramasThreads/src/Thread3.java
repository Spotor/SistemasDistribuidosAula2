class Classe1 extends Thread {
    public void run() {
        for(int j=0;j<30;j++) {                  
            System.out.println("Primeira!" + this.getName());
            for (int i=0; i<1999999999; i++);
                for (int k=0; k<1999999999; k++);
                    for (int l=0; l<1999999999; l++);
                        for (int m=0; m<1999999999; m++);
        }
    }
}

class Classe2 extends Thread {
    public void run() {        
        for(int j=0;j<30;j++) {                  
            System.out.println("Segunda!");
        }
    }
}

class Exemplo3{
    public static void main(String args[]) {      
            Classe1 t1 = new Classe1();
            t1.start();  

            Classe1 t2 = new Classe1();
            t2.start(); 
             
            Classe2 t3 = new Classe2();
            t3.start(); 

             
    }
}
