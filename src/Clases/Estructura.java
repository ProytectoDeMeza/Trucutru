
package Clases;

public class Estructura {
    //Variables de la estructura
    //Número de miembros
    private int m;
    //Número de nudos
    private int nj;
    //Número de restricciones de apoyo
    private int nr;
    //Número de nudos restringidos
    private int nrj;
    //Modulo de elasticidad
    private int e;
    //Número de grados de libertad
    private int n;
    //Vectores coordenadas en un plano     Dimensión =nj
    private int x[];
    private int y[];
    //Vectores nudo inicial y final     Dimensión =m
    private int jj[];
    private int jk[];
    //Propiedades de los miembros   Dimensión =m
    private int ax[];
    private int iz[];
    //Dimensión =3*nj
    private int rl[];
    private int crl[];
    //Dimensión =m
    private double l[];
    private double cx[];
    private double cy[];
    
    //Constructores
    public Estructura(){}
    
    
    
    //Métodos
    //Generación Matriz de rigidez
    public void generarMatrizRigidez(){
        double smd[][]=new double[6][6];
        double s[][]=new double[3*nj][3*nj];
        int xcl,ycl;
        int k1,k2,k3,j1,j2,j3;
        double scm1,scm2,scm3,scm4;
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                smd[i][j]=0;
            }
        }
        for(int i=0;i<3*nj;i++){
            for(int j=0;j<3*nj;j++){
                s[i][j]=0;
            }
        }
        for(int i=0;i<m;i++){
            xcl=x[jk[i]]-x[jj[i]];
            ycl=y[jk[i]]-y[jj[i]];
            l[i]=Math.sqrt((xcl*xcl)+(ycl*ycl));
            cx[i]=xcl/l[i];
            cy[i]=ycl/l[i];
        }
        for(int i=0;i<m;i++){
            j1=(3*jj[i])-2;
            j2=(3*jj[i])-1;
            j3=3*jj[i];
            k1=(3*jk[i])-2;
            k2=(3*jk[i])-1;
            k3=3*jk[i];
            scm1=(e*ax[i])/l[i];
            scm2=(4*e*iz[i])/l[i];
            scm3=(1.5*scm2)/l[i];
            scm4=(2*scm3)/l[i];
            if(rl[j1]==0)
                j1=j1-crl[j1];
            else
                j1=n+crl[j1];
            if(rl[j2]==0)
                j2=j2-crl[j2];
            else
                j2=n+crl[j2];
            if(rl[j3]==0)
                j3=j3-crl[j3];
            else
                j3=n+crl[j3];
            if(rl[k1]==0)
                k1=k1-crl[k1];
            else
                k1=n+crl[k1];
            if(rl[k2]==0)
                k2=k2-crl[k2];
            else
                k2=n+crl[k2];
            if(rl[k3]==0)
                k3=k3-crl[k3];
            else
                k3=n+crl[k3];
            smd[0][0]=(scm1*cx[i]*cx[i])+(scm4*cy[i]*cy[i]);
            smd[3][3]=smd[0][0];
            smd[0][3]=smd[0][0];
            smd[3][0]=smd[0][0];
            smd[0][1]=(scm1-scm4)*cx[i]*cy[i];
            smd[1][0]=smd[0][1];
            smd[3][4]=smd[0][1];
            smd[4][3]=smd[0][1];
            smd[4][0]=smd[0][1];
            smd[0][4]=smd[0][1];
            smd[1][3]=smd[0][1];
            smd[3][1]=smd[0][1];
            smd[0][2]=-scm3*cy[i];
            smd[2][0]=smd[0][2];
            smd[0][5]=smd[0][2];
            smd[5][0]=smd[0][2];
            smd[2][3]=smd[0][2];
            smd[3][2]=smd[0][2];
            smd[3][5]=smd[0][2];
            smd[5][3]=smd[0][2];
            smd[1][1]=(scm1*cy[i]*cy[i])+(scm4*cx[i]*cx[i]);
            smd[4][4]=smd[1][1];
            smd[1][4]=smd[1][1];
            smd[4][1]=smd[1][1];
            smd[1][2]=scm3*cx[i];
            smd[2][1]=smd[1][2];
            smd[1][5]=smd[1][2];
            smd[5][1]=smd[1][2];
            smd[2][4]=smd[1][2];
            smd[4][2]=smd[1][2];
            smd[4][5]=smd[1][2];
            smd[5][4]=smd[1][2];
            smd[2][2]=scm2;
            smd[5][5]=scm2;
            smd[2][5]=scm2/2;
            smd[5][2]=smd[2][5];
            //imprimir: "Miembro #"+i
            if(rl[3*jj[i]-2]==0){
                s[j1][j1]=s[j1][j1]+smd[1][1];
                s[j2][j1]=s[j2][j1]+smd[2][1];
                s[j3][j1]=s[j3][j1]+smd[3][1];
                s[k1][j1]=smd[4][1];
                s[k2][j1]=smd[5][1];
                s[k3][j1]=smd[6][1];
            }
            //linea 3140
                
        }
    }
    
    

    
    
    
    
    //Setters y getters

    
}
