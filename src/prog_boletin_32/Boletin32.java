package prog_boletin_32;

public class Boletin32 {

    public static void main(String[] args) {


        Alumno obx= new Alumno("Jose Manuel",3);
        
        Alumno.Enderezo obx2 = obx.new Enderezo("Calle Caracas", 52);
        
        System.out.println(obx.toString());
        
        obx.cambiarNota(8);
 
        System.out.println(obx.toString());

    }

}
