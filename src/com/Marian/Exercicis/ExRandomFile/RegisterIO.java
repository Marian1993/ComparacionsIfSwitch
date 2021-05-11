package com.Marian.Exercicis.ExRandomFile;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
add(ultima posicio)
read(int position) pot donar una excepcio outOfBounds
update(int position, boolean ins)
update(int position, int id)
add(ecriure posicio buida (boolean == false) o última posicio)
display(nomes boolean == true)
-------------------------------
Tot lo anteriro afegint String de 20
 */
public class RegisterIO {

    RandomAccessFile f;
    private final int ALUMNE = 5;// 1 byte boolean + 4 byte int
    private final int QUAN_ALUM = (int) (f.length()/ALUMNE);

    public RegisterIO(File file, String mode) throws IOException {

        f = new RandomAccessFile(file,mode);

    }

    public void afegir(Register register) throws IOException {

        f.seek(f.length()-1);
        f.writeBoolean(register.isInscrit());
        f.writeInt(register.getId());
    }
    public Register llegir(int posicio) throws IOException{
        Register reg = new Register();

        f.seek(posicio * ALUMNE);
        reg.setInscrit(f.readBoolean());
        reg.setId(f.readInt());

        return reg;
    }

    public void modificarInscripcio(int posicio, boolean inscripcio) throws IOException {

        f.seek( posicio * ALUMNE);
        f.writeBoolean(inscripcio);
    }
    public void modificarId(int posicio, int id) throws IOException {

        f.seek( posicio * ALUMNE);
        f.seek(f.getFilePointer()+1);
        f.writeInt(id);
    }

    private int tornaId() throws IOException {

        if(f.getFilePointer() % ALUMNE == 0){

            f.seek();
        }
    }


}
