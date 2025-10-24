package com.directi.training.dip.exercise.solution;

import java.io.IOException;

import com.directi.training.dip.exercise.MyDatabase;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();


        IWriter fileWriter = new FileWriterImpl("afterEncryption.txt");
        encodingModule.encodeFile(fileWriter, "beforeEncryption.txt");

        MyDatabase db = new MyDatabase();
        IWriter dbWriter = new DatabaseWriter(db);
        encodingModule.encodeFile(dbWriter, "beforeEncryption.txt");
    }
}
