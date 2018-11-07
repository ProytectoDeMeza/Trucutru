package Clases;
import java.io.*;

public class EscribirFichero extends Estructura{
    
    public EscribirFichero(int m,int nj,int nr,int nrj,int e){
        super(m,nj,nr,nrj,e);
    }

    public void escribir(Estructura Est){
        try{
            FileWriter fichero = new FileWriter("Ruta");
            fichero.write("Número de miembros:\r\n");
            fichero.write(super.m + "\r\n");
            fichero.write("Número de nudos:\r\n");
            fichero.write(super.nj + "\r\n");
            fichero.write("Número de restricciones de apoyo:\r\n");
            fichero.write(super.nr + "\r\n");
            fichero.write("Número de nudos restringidos:\r\n");
            fichero.write(super.nrj + "\r\n");
            fichero.write("Módulo de elasticidad:\r\n");
            fichero.write(super.e + "\r\n");
            fichero.write("Número grados de libertad:\r\n");
            fichero.write(super.n + "\r\n");
            fichero.write("Vectores coordenadas en un plano:\r\n");
            fichero.write("X: ");
            for(int i=0;i<super.nj;i++){
                fichero.write(super.x[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Y: ");
            for(int i=0;i<super.nj;i++){
                fichero.write(super.y[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Vectores nudo inicial y final:\r\n");
            fichero.write("jj: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.jj[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("jk: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.jk[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Propiedades de los miembros:\r\n");
            fichero.write("ax: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.ax[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("iz: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.iz[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("rl: ");
            for(int i=0;i<3*(super.nj);i++){
                fichero.write(super.rl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("crl: ");
            for(int i=0;i<3*(super.nj);i++){
                fichero.write(super.crl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("l: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.l[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cx: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.cx[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cy: ");
            for(int i=0;i<super.m;i++){
                fichero.write(super.cy[i] + " ");
            }
            fichero.write("\r\n");
        }catch(IOException e){
            //Mensaje de error
        }
        
    }
}

