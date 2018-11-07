package Clases;
import java.io.*;

public class EscribirFichero extends Estructura{
    
    public EscribirFichero(int m,int nj,int nr,int nrj,int e){
        super(m,nj,nr,nrj,e);
    }

    public void escribir(){
        try{
            FileWriter fichero = new FileWriter("Ruta");
            fichero.write("Número de miembros:\r\n");
            fichero.write(m + "\r\n");
            fichero.write("Número de nudos:\r\n");
            fichero.write(nj + "\r\n");
            fichero.write("Número de restricciones de apoyo:\r\n");
            fichero.write(nr + "\r\n");
            fichero.write("Número de nudos restringidos:\r\n");
            fichero.write(nrj + "\r\n");
            fichero.write("Módulo de elasticidad:\r\n");
            fichero.write(e + "\r\n");
            fichero.write("Número grados de libertad:\r\n");
            fichero.write(n + "\r\n");
            fichero.write("Vectores coordenadas en un plano:\r\n");
            fichero.write("X: ");
            for(int i=0;i<nj;i++){
                fichero.write(x[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Y: ");
            for(int i=0;i<nj;i++){
                fichero.write(y[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Vectores nudo inicial y final:\r\n");
            fichero.write("jj: ");
            for(int i=0;i<m;i++){
                fichero.write(jj[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("jk: ");
            for(int i=0;i<m;i++){
                fichero.write(jk[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("Propiedades de los miembros:\r\n");
            fichero.write("ax: ");
            for(int i=0;i<m;i++){
                fichero.write(ax[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("iz: ");
            for(int i=0;i<m;i++){
                fichero.write(iz[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("rl: ");
            for(int i=0;i<3*(nj);i++){
                fichero.write(rl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("crl: ");
            for(int i=0;i<3*(nj);i++){
                fichero.write(crl[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("l: ");
            for(int i=0;i<m;i++){
                fichero.write(l[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cx: ");
            for(int i=0;i<m;i++){
                fichero.write(cx[i] + " ");
            }
            fichero.write("\r\n");
            fichero.write("cy: ");
            for(int i=0;i<m;i++){
                fichero.write(cy[i] + " ");
            }
            fichero.write("\r\n");
        }catch(IOException e){
            //Mensaje de error
        }
        
    }
}

