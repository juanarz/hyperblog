public class Executable 
{
    /**
     *
     */
  

    public static void main(String[] args) 
    {
        //Declaración de Variables
        Double r, z, y, s;
        
        //Entrada de datos
        r= 10;
        
        //Proceso
        z = ((Math.PI * Math.pow(r,2))/2) - (Math.pow(r/2, 2)/(2) * Math.PI);
        y = (((2*r) * r)/2);
        s = z + y;
        
         //Salida
        JOptionPane.showMessageDialog(null, "El Area Sombreada del circulo con radio " +  r + " es " + s);
        
        //Fin
        System.exit(0);
     
        
    }
}