class UmaThread extends Thread {
        private int tempo;
        private String identificacao;

        public UmaThread(String identificacao, int tempo) {
               this.tempo = tempo;
               this.identificacao = identificacao;
        }

        public void run() {              
            for (int i=0; i<10; i++){
                try {
                       sleep(tempo);
               }
               catch(InterruptedException e) {
                       System.out.println("Thread: " + identificacao + " foi interrompida");
               }

               System.out.println(">>" + identificacao + " " + tempo);
            }
        }
}

 
class MultiThread {

        public static void main(String[] args) {
               UmaThread t1,t2,t3;

               t1 = new UmaThread("Primeira", (int)(Math.random()*3000));
               t2 = new UmaThread("Segunda", (int)(Math.random()*3000));
               t3 = new UmaThread("Terceira", (int)(Math.random()*3000));
 

               t1.start();
               t2.start();
               t3.start();
        }

}
