package application.config.system;

import application_consumer_1.Consumer_1;
import java.util.logging.Logger;

/**
 * @author Buelent Bal <your.name at your.org>
 * @since jdk 1.7
 *
 */
public class ConfigSystem {
    
    private static final Logger LOG = Logger.getLogger(ConfigSystem.class.getName());
    //test local
    
    /**
     *  java.version Java Runtime Environment version
        java.vendor Java Runtime Environment vendor
        java.vendor.url Java vendor URL
        java.home   Java installation directory
        java.vm.specification.version   Java Virtual Machine specification version
        java.vm.specification.vendor    Java Virtual Machine specification vendor
        java.vm.specification.name  Java Virtual Machine specification name
        java.vm.version Java Virtual Machine implementation version
        java.vm.vendor  Java Virtual Machine implementation vendor
        java.vm.name    Java Virtual Machine implementation name
        java.specification.version  Java Runtime Environment specification version
        java.specification.vendor   Java Runtime Environment specification vendor
        java.specification.name Java Runtime Environment specification name
        
        java.class.version  Java class format version number
        java.class.path Java class path
        java.library.path   List of paths to search when loading libraries / no
        java.io.tmpdir  Default temp file path / no
        java.compiler   Name of JIT compiler to use /no
        java.ext.dirs   Path of extension directory or directories /no
        os.name Operating system name
        os.arch Operating system architecture
        os.version  Operating system version
        file.separator  File separator ("/" on UNIX)
        path.separator  Path separator (":" on UNIX)
        line.separator  Line separator ("\n" on UNIX)
        user.name   User's account name
        user.home   User's home directory
        user.dir    User's current working directory
     * 
     * 
     * 
     * 
     * 
     */
    
     public void setup() {
       //java.version Java Runtime Environment version
       // System.out.println();
       //   System.out.println("user.name  "+System.getProperty("user.name "));
       // LOG.setUseParentHandlers(false);
        LOG.finest("user.home "+System.getProperty("user.home"));
        LOG.finest("user.dir  "+System.getProperty("user.dir"));
        System.out.println("java.version   "+System.getProperty("java.version"));
        LOG.finest("java.vendor    "+System.getProperty("java.vendor"));
        LOG.finest("java.vendor.url "+System.getProperty("java.vendor.url"));
        LOG.finest("java.home "+System.getProperty("java.home"));
        LOG.finest("vm spec version "+System.getProperty("java.vm.specification.version "));
        LOG.finest("vm spec vendor "+System.getProperty("java.vm.specification.vendor"));
        LOG.finest("vm spec name  "+System.getProperty("java.vm.specification.name"));
        LOG.finest("vm version  "+System.getProperty("java.vm.version"));
        LOG.finest("vm vendor  "+System.getProperty("java.vm.vendor"));
        LOG.finest("vm name  "+System.getProperty("java.vm.name"));
        LOG.finest("spec version  "+System.getProperty("java.specification.version"));
        LOG.finest("spec vendor  "+System.getProperty("java.specification.vendor"));
      
        LOG.finest("spec name  "+System.getProperty("java.specification.name"));
        LOG.finest("java.class.version  "+System.getProperty("java.class.version "));
        
        LOG.finest("classpath "+System.getProperty("java.class.path"));
        LOG.finest("os.name "+System.getProperty("os.name"));
        LOG.finest("os.arch "+System.getProperty("os.arch"));
        LOG.finest("os.version "+System.getProperty("os.version"));
        LOG.finest("spec vendor "+System.getProperty("java.specification.vendor"));
        LOG.finest("spec vendor "+System.getProperty("java.specification.vendor"));
        LOG.finest("spec vendor "+System.getProperty("java.specification.vendor"));
        
     
    
    }
    public static void main(String arg[]){
       ConfigSystem test = new ConfigSystem();
       //System.out.println("hello ");
       test.setup();
        Consumer_1 myConsumer = new Consumer_1();
        myConsumer.whoIam();
        
        
    }


}
