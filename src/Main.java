public class Main {
    public static void main(String[] args) {
        //Clase anonima de taza
        boolean estado = true;
        System.out.println("Clase anonima");
        new  Taza(){
            private String estado;
            private void tazaLlena(boolean tazaEstado){
                estado= (tazaEstado) ? "Si":"No";
                System.out.println("La taza esta llena? "+ estado);
            }
        }.tazaLlena(estado);

        //Clase anonima de interface
        System.out.println();
        System.out.println("Clase Anonima Interface");

       new IEjemplo(){
           @Override
           public void saludar() {
               System.out.println("Saludos Compañeros");
           }
           @Override
           public void despedirse() {
               System.out.println("Me despido Compañeros");
           }
       }.saludar();

    }
}
