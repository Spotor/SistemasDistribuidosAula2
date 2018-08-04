class ClasseSemThread {
    String nome;
    public ClasseSemThread(String nome) {
            this.nome = nome;
    }    

    public void executar() {
        for(int j=0;j<20;j++) {
            System.out.println(nome);
            for (int i=0; i<999999999; i++);
        }
    }    
}

class Principal{
    public static void main(String args[]) {      
             ClasseSemThread st1 = new ClasseSemThread("Primeira!");
             ClasseSemThread st2 = new ClasseSemThread("Segunda!");
             
             st1.executar();
             st2.executar();
    }
}
