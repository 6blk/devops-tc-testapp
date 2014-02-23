package test;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class App 
{
    public static void main( String[] args )
    {
		File jar = new File(App.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		long mySize = FileUtils.sizeOf(jar);
        System.out.println("My size is: " + mySize);
    }
}
