package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

public class ticket {

    Date f = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
    String fecha = formato.format(new Date());
    
    int hora = LocalTime.now().getHour();
    int minute = LocalTime.now().getMinute();
    
    public void creaTicket(){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        
        try {
            f = new File("ticket.txt");
            w = new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            
            wr.write("*****************************************");
            wr.append("\n           CONSULTA DE MULTAS");
            wr.append("\n*****************************************\n");
            wr.append("\nFECHA:"+fecha);
            wr.append("\nHORA: "+hora+":"+minute);
            wr.append("\nFOLIO: 12345");
            wr.append("\n-----------------------------------------\n");
            wr.append("\nHECHO DENUNCUADO:");
            wr.append("\nEstacionarce con autorizacion no valida");
            wr.append("\n");
            wr.append("\nIMPORTE:  $1082.12\n");
            wr.append("\n-----------------------------------------");
            wr.append("\n              DevSolutions");
            wr.append("\n-----------------------------------------");
            wr.close();
            bw.close();
            
            
        } catch (Exception e) {
        }

    }
    
    
    
}