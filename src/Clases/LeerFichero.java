package Clases;
import java.io.*;
import java.util.Scanner;
public class LeerFichero extends Estructura{
    
    public LeerFichero(int m,int nj,int nr,int nrj,int e){
        super(m,nj,nr,nrj,e);
    }
    
    public void leer(){
        int vec[]=new int[100];
        Scanner scanner=null;
        try{
            scanner=new Scanner(new FileReader("Nombre.txt"));
            int i=0;
            while(scanner.hasNext()){
                String palabra = scanner.next();
                while(scanner.hasNextInt()){
                    int temp = scanner.nextInt();
                    vec[i]=temp;
                    i++;
                }
            }
            m=vec[0];
            nj=vec[1];
            nr=vec[2];
            nrj=vec[3];
            e=vec[4];
            n=vec[5];
            for(int j=0;j<nj;j++){
                x[j]=vec[6+j];
            }
            for(int j=0;j<nj;j++){
                y[j]=vec[6+nj+j];
            }
            for(int j=0;j<m;j++){
                jj[j]=vec[6+2*nj+j];
            }
            for(int j=0;j<m;j++){
                jk[j]=vec[6+2*nj+m+j];
            }
            for(int j=0;j<m;j++){
                ax[j]=vec[6+2*nj+2*m+j];
            }
            for(int j=0;j<m;j++){
                iz[j]=vec[6+2*nj+3*m+j];
            }
            for(int j=0;j<3*nj;j++){
                rl[j]=vec[6+2*nj+4*m+j];
            }
            for(int j=0;j<3*nj;j++){
                crl[j]=vec[6+5*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                l[j]=vec[6+8*nj+4*m+j];
            }
            for(int j=0;j<m;j++){
                cx[j]=vec[6+8*nj+5*m+j];
            }
            for(int j=0;j<m;j++){
                cy[j]=vec[6+8*nj+6*m+j];
            }
        }catch(FileNotFoundException e){
            System.out.println("Error.");//Mensaje de error
        }finally{
            if(scanner!=null){
                scanner.close();
            }
        }
    }
}
