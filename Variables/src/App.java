public class Local {
    public static void public static void main(String[] args) {
        String h;
        h = "Variables locales";
        System.out.println(h);

        Local v1 = new Local();
        v1.saludo(nombre: "Hugo");
        
    }

    public void saludo(String nombre){
        System.out.println(nombre.length());
        System.out.println("Hola"+nombre);
    }
}
